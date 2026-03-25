import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); 
        }
        queue.add(item);
        System.out.println("Produced " + item);
        notify(); 
    }

    
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); 
        }
        int item = queue.poll();
        System.out.println("Consumed " + item);
        notify(); 
        return item;
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 1;
        try {
            while (true) {
                buffer.produce(item++);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(800); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread p = new Thread(new Producer(buffer));
        Thread c = new Thread(new Consumer(buffer));

        p.start();
        c.start();   

    }
}

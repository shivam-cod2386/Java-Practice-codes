public class Book {
    int pages;
    Book(int pages){
        this.pages = pages;
    }
    Book(Book b){
        System.out.println("Copy constructor created");
        pages = b.pages;
    }
    public void ShowPages(){
        System.out.println("This book has "+pages+" pages");
    }
    
}

class Main{
    public static void main(String[] args) {
        Book b1 = new Book(250);
        b1.ShowPages();
        Book b2 = new Book(b1);
        b2.ShowPages();
    }
}

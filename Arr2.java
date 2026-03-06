
import java.util.Arrays;

class Main {

   
    public static int remove(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        
        Arrays.sort(a);

        
        int j = 0;

        for (int i = 1; i < a.length; i++) {
            
            
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i]; 
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 4, 2, 1, 5};
        int n = remove(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
import java.util.Scanner;
class ForIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, count = 0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(i = 1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Yes, it is a Prime Number");
        }
        else{
            System.out.print("No, it is not a Prime Number");
        }
    }
}
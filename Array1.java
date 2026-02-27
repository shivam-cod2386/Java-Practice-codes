public class Array1 {
    public static void main(String[] args) {
        int[] arr1  = {10,20,30,40,50};
        int[] arr2 = {2,5,0,4,0};
        for(int i = 0; i<arr1.length;i++){
            try {
                int res =  arr1[i]/arr2[i];
                System.out.println(res);
            } catch (Exception e) {
                System.out.println("Code is wrong");
            }
            finally{
            System.out.println("Used try catch");
        }
        }
        
    }
    

}

public class productOfN {
    
    public static void main(String[] args) {
       int x = printProduct(5);
       System.out.println(x);
    }

    public static int printProduct(int n){
        if(n==0) return 1;
        return n * printProduct(n-1);
    }
}

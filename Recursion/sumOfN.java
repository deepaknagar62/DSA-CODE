public class sumOfN{

    public static void main(String[] args){
       int x = printSum(5);
       System.out.println(x);
    }

    public static int printSum(int n){
        if(n==0) return 0;
        return n + printSum(n-1);
    }
}
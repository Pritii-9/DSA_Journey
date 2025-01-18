package DSA_Journey.Basics;

public class fact_num {

    public static int fact(int n){

        int f = 1;
        for(int i = 1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        System.out.println("Factorial of number is = "+fact(5));;
    }
}

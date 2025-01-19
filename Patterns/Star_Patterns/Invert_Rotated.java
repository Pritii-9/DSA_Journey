package DSA_Journey.Patterns.Star_Patterns;

public class Invert_Rotated{

    public static void starFun(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starFun(5);

    }
}
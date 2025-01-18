package DSA_Journey.Basics;

public class Bino_Coeffi {

    public int fact(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public int binCoeff(int n,int r){
        int n_f = fact(n);
        int r_f = fact(r);
        int n_r_f = fact(n-r);
        return n_f/(r_f*n_r_f);
    }
    public static void main(String[] args) {
        Bino_Coeffi b = new Bino_Coeffi();
        System.out.println(b.binCoeff(5, 2));
        
    }
}
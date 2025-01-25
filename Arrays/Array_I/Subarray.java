package Arrays.Array_I;

public class Subarray {
    public static void subP(int num[]){
        int totalSubarr=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                totalSubarr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(totalSubarr);

    }
    public static void main(String[] args) {
        int num[] ={30,4,567,7643,2,122,3};
        subP(num);
    }
}

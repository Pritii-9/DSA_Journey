package Arrays.Array_I;

public class largestA {
    public static int findLarge(int num[]){
        int max = Integer.MIN_VALUE; // - infinity
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int num[] = {2,442,6,4,88};
        System.out.println("Largest number in array is: "+findLarge(num));
    }
}

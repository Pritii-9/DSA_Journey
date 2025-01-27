package Arrays.Array_I;


public class maxSubArraySum
{

    public static void sumOfArrayPrint(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currentSum=0;
                for(int k =start;k<=end;k++){
                    currentSum+=num[k];
                }
                System.out.println(currentSum);
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    }
            }
        }
    }

    public static void PrefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];
        
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }        
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum= start==0? prefix[end] : prefix[end]-prefix[start-1];
            }
            System.out.println(currentSum);
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    }
        }
    }
    public static void main(String[] args) {
        int num [] ={2,4,6,8,10};
        System.out.println("Bruit Force");
        sumOfArrayPrint(num);
        System.out.println("Prefix sum");
        int arr[]={4,5,7,4,2};
        PrefixSum(arr);

}
}
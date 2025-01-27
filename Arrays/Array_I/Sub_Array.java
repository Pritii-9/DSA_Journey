package Arrays.Array_I;

public class Sub_Array {
    public static void printSubarrays(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println("}");
            }
        }
    }
  
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printSubarrays(num);
    }
    }
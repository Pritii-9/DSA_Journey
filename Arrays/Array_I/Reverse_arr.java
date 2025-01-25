package Arrays.Array_I;
public class Reverse_arr {
    public static void RevArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++; // Move first pointer forward
            last--; // Move last pointer backward
        }
    }

    public static void main(String[] args) {
        System.out.println("hey");
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8};
        RevArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

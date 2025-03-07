package Strings.Basics;

public class ReverseStr {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original String: " + java.util.Arrays.toString(s));
        rs.reverseString(s);
        System.out.println("Reversed String: " + java.util.Arrays.toString(s));
    }
}

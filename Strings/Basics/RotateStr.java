package Strings.Basics;

public class RotateStr {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        RotateStr rs = new RotateStr();
        System.out.println(rs.rotateString("abcde", "cdeab"));  // Output: true
        System.out.println(rs.rotateString("abcde", "abced"));  // Output: false
    }

}

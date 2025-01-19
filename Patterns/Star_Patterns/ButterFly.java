public class ButterFly {
        public static void main(String[] args) {
            int n = 5;  // You can change this value to make the pattern larger or smaller
    
            // Upper half of the butterfly
            for (int i = 1; i <= n; i++) {
                // Left wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Spaces in the middle
                int spaces = 2 * (n - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                }
                // Right wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    
            // Lower half of the butterfly
            for (int i = n; i >= 1; i--) {
                // Left wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Spaces in the middle
                int spaces = 2 * (n - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                }
                // Right wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    

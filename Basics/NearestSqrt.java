package Basics;

public class NearestSqrt {
    public int mySqrt(int x) {
        int i = 0;
        while ((long) i * i <= x) {
            i++;
        }
        return i - 1;
    }

    

        public static void main(String[] args) {
            NearestSqrt obj = new NearestSqrt();
            System.out.println(obj.mySqrt(16)); // 2
        }
    }
    
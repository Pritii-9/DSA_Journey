public class RowSum {
    public static int sumSecondRow(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums[1].length; i++) {
            sum += nums[1][i];
        }
        return sum;
    }

    public static void sumRowWise(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public static int sum2DArray(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = sumSecondRow(nums);   //Sum of second row: 18
        System.out.println("Sum of second row: " + sum);

        sumRowWise(nums);
        //Sum of row 1: 14
        // Sum of row 2: 18
        // Sum of row 3: 7

        int summ = sum2DArray(nums);
        System.out.println("Sum of 2D array: " + summ); //Sum of 2D array: 39


    }

}

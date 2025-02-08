public class CountNums {
  

    public static int countSevens(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] array = {{4,7,7, 8}, {8, 8, 7}};  //Number of 7's: 3
        int count = countSevens(array);
        System.out.println("Number of 7's: " + count);
    }

}

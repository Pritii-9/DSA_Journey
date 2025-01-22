import java.util.Scanner;

public class Right_Pascal {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, rows;
		
		System.out.print("Enter Right Pascals Number Triangle Pattern Rows = ");
		rows = sc.nextInt();
				
		for (i = 1 ; i <= rows; i++ ) 
		{
			printItems(rows, i);
		}
		
		for (i = rows - 1; i >= 1; i-- ) 
		{
			printItems(rows, i);
		}
	}
	public static void printItems(int rows, int i) {
		for (int j = 1 ; j <= i; j++ ) 
		{
			System.out.print(j + " ");
		}
		System.out.println();
		
	}
}
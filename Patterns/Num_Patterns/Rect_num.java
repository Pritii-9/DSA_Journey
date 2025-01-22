import java.util.Scanner;

public class Rect_num {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.print("Enter Numbers of Rows & Columns = ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		for (int i = 1; i <= rows; i++) 
		{
			for (int j = i; j < i + columns; j++) 
			{
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}
}

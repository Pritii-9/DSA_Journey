
import java.util.Scanner;

public class Pascal_num  {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		System.out.print("Enter Pascal Triangle Number Pattern Rows = ");
		int rows = sc.nextInt();
				
		for (int i = 0 ; i < rows; i++ ) 
		{
			int number = 1;
			System.out.printf("%" + (rows - i) * 2 + "s", "");
			
			for (int j = 0 ; j <= i; j++ ) 	
			{
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
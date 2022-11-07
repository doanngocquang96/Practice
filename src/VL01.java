import java.util.Scanner;

public class VL01 {
	
	public static void vl01(){
		Scanner scan = new Scanner(System.in);
		int a = -2000, b = 2000;
		
		while (a < -1000 || a > b || b > 1000) {
			System.out.print("Enter a and b: ");
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		//System.out.println("a and b: " + a + " " + b);
		
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
			
		}
		
	}
}

import java.util.Scanner;

public class DK10 {
	
	public static void dk10() {
		int month ,year;
		Scanner scan = new Scanner(System.in); 
		System.out.printf("Enter month and year: ");
		month = scan.nextInt();
		year = scan.nextInt();
		
		if (month <= 0 || month > 100 || year <= 0 || year > 10000) {
			System.out.printf("Invalid !");
		} else {
			switch (month) {
			
			case 1: {
				System.out.printf("31");
				break;
			}
			
			case 2: {
				System.out.printf("29");
				break;
			}
			
			case 3: {
				System.out.printf("31");
				break;
			}
			
			case 4: {
				System.out.printf("30");
				break;
			}
			
			case 5: {
				System.out.printf("31");
				break;
			}
			
			case 6: {
				System.out.printf("30");
				break;
			}
			
			case 7: {
				System.out.printf("31");
				break;
			}
			
			case 8: {
				System.out.printf("31");
				break;
			}
			
			case 9: {
				System.out.printf("30");
				break;
			}
			
			case 10: {
				System.out.printf("31");
				break;
			}
			
			case 11: {
				System.out.printf("30");
				break;
			}
			
			case 12: {
				System.out.printf("31");
				break;
			}
			
			
			default: {
				System.out.printf("can't calculate !");
				break;
			}
			
			}
		}
	}
	
}

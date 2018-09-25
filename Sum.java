import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n <= 100) {
			System.out.println("Enter a number");
			int x = sc.nextInt();
			n = n + x;
			System.out.println("This is your actual number: " + n);
		}
	}
}
import java.util.Scanner;

public class Code06 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] array = new int[n];
		
		array[0] = 100;
		array[1] = 76;
		array[2] = 92;
		array[3] = 95;
		array[4] = 14;
		
		System.out.println(array[4]);
		
		keyboard.close();

	}

}

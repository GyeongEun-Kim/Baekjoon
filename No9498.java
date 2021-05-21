package baekjunalgorithm;
import java.util.Scanner;

public class No9498 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int Score=scanner.nextInt();
		if (Score>=90 && Score<=100)
			System.out.print("A");
		else if (Score>=80)
			System.out.print("B");
		else if (Score>=70)
			System.out.print("C");
		else if (Score>=60)
			System.out.print("D");
		else
			System.out.print("F");
		scanner.close();
		// TODO Auto-generated method stub

	}

}

package baekjunalgorithm;
import java.util.Scanner;

public class No10817 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int C=scanner.nextInt();
		if ((A>=B && B>=C) || (C>=B && B>=A))
			System.out.print(B);
		else if ((B>=A && A>=C) || (C>=A && A>=B))
			System.out.print(A);
		else
			System.out.print(C);
		scanner.close();
		
		// TODO Auto-generated method stub

	}

}

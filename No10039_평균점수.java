package baekjunalgorithm;
import java.util.Scanner;

public class No10039 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int student[]=new int[5];
		int sum=0;
		for (int i=0;i<5;i++) {
			student[i]=scanner.nextInt();
			if (student[i]<40)
				student[i]=40;
		}
		
		for (int i=0;i<5;i++)
			sum=sum+student[i];
		sum=sum/5;
		System.out.println(sum);
		// TODO Auto-generated method stub
		
	}

}

package baekjunalgorithm;
import java.util.Scanner;
public class No5543 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ���=scanner.nextInt();
		int �ߴ�=scanner.nextInt();
		int �ϴ�=scanner.nextInt();
		int �ݶ�=scanner.nextInt();
		int ���̴�=scanner.nextInt();
		
		int min1=0;
		int min2=0;
		
		if (���>=�ߴ�) {
			if(�ߴ�>=�ϴ�) {
				min1=�ϴ�;
			}
			else
				min1=�ߴ�;
		}
		
		else if(�ߴ�>=���) {
			if(���>=�ϴ�) {
				min1=�ϴ�;
			}
			else
				min1=���;
		}
		else {
			if(���>=�ߴ�) {
				min1=�ߴ�;
			}
			else
				min1=���;
		}
		
		if(�ݶ�>=���̴�)
			min2=���̴�;
		else
			min2=�ݶ�;
		
		System.out.println(min1+min2-50);
		
		
		// TODO Auto-generated method stub

	}

}

package baekjunalgorithm;
import java.util.Scanner;
public class No5543 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int »ó´ö=scanner.nextInt();
		int Áß´ö=scanner.nextInt();
		int ÇÏ´ö=scanner.nextInt();
		int ÄÝ¶ó=scanner.nextInt();
		int »çÀÌ´Ù=scanner.nextInt();
		
		int min1=0;
		int min2=0;
		
		if (»ó´ö>=Áß´ö) {
			if(Áß´ö>=ÇÏ´ö) {
				min1=ÇÏ´ö;
			}
			else
				min1=Áß´ö;
		}
		
		else if(Áß´ö>=»ó´ö) {
			if(»ó´ö>=ÇÏ´ö) {
				min1=ÇÏ´ö;
			}
			else
				min1=»ó´ö;
		}
		else {
			if(»ó´ö>=Áß´ö) {
				min1=Áß´ö;
			}
			else
				min1=»ó´ö;
		}
		
		if(ÄÝ¶ó>=»çÀÌ´Ù)
			min2=»çÀÌ´Ù;
		else
			min2=ÄÝ¶ó;
		
		System.out.println(min1+min2-50);
		
		
		// TODO Auto-generated method stub

	}

}


import java.util.Scanner;

public class No1110_더하기사이클 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int length=0;
		int num=scanner.nextInt();
		int compare=num;
		do {
			num=(num%10*10)+(num%10+num/10)%10;
			length++;
		}while (compare!=num);
		System.out.println(length);
		// TODO Auto-generated method stub

	}

}

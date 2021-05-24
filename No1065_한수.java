
import java.util.Scanner;
public class No1065_한수 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int count=0;
		if (num<100)
			count=num;
		else if (num<=1000) {
				for (int j=100;j<=num;j++) {
					int a=j/100;
					int b=(j/10)%10;
					int c=j%10;
					if (a-b==b-c)
						count++;
				}
		count=count+99;
			}
		
		System.out.println(count);
		}
		// TODO Auto-generated method stub

	}



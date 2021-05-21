package baekjunalgorithm;
import java.util.Scanner;
class ch {
	static int change (int num) {
		int temp=num;
		num=temp/100+((temp/10)%10)*10+(temp%10)*100;
		return num;
	}
}
public class No2908 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		num1=ch.change(num1);
		num2=ch.change(num2);
		if (num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		// TODO Auto-generated method stub

	}

}


import java.util.Scanner;
public class No5622_다이얼 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String v=scanner.next();
		int result=0;
		int temp=0;
		for (int i=0;i<v.length();i++) {
			
			if (v.charAt(i)=='Z')
					result=result+10;
			else if (v.charAt(i)=='S')
				result+=8;
			else if (v.charAt(i)<'S'){
				temp=(int)v.charAt(i)-65;
				result=result+3+temp/3;
			}
			else {
				temp=(int)v.charAt(i)-84;
				result+=temp/3+9;
			}
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

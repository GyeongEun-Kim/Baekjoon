
import java.util.Scanner;

public class No2577_숫자의개수 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int result=a*b*c;
		int length=0;
		
		int temp_result=result;
		while (temp_result>0) {
			
			temp_result/=10;
			length++;
		} //곱셈 결과의 길이
		
		//17037300
		int arr[]=new int[length];
		int x=10;
		
		for (int i=0;i<length;i++) {
			arr[i]=result%x;
			result=result/10;
		}
		
		int count[]=new int[10];
		
		for (int i=0;i<length;i++) {
			for (int j=0;j<10;j++) {
					if (arr[i]==j)
						count[j]++;
			}
		}
					
		for (int i=0;i<10;i++)
			System.out.println(count[i]);
		}
	}



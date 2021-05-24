
import java.util.Scanner;
public class No3052_나머지 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[10];
		int divide[]=new int[10];
		int repeat[]=new int[42];
		int cnt=0;
		
		for (int i=0;i<10;i++) {
			arr[i]=scanner.nextInt();// TODO Auto-generated method stub
		}

		for (int i=0;i<10;i++) {
			divide[i]=arr[i]%42;
		}
		
		for (int i=0;i<42;i++) {
			for (int j=0;j<10;j++) {
				if (divide[j]==i)
					repeat[i]++;
			}
		}
		for (int i=0;i<42;i++) {
			if (repeat[i]>0)
				cnt++;
			
		}
		
	System.out.println(cnt);
	
	}
}


import java.util.Scanner;

public class No10818_�ּ��ִ� {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int arr[]=new int[num];
		int max=-1999999, min=1999999;
		
		for (int i=0;i<num;i++)
			arr[i]=scanner.nextInt();
		
		for (int i=0;i<num;i++) {
			if (arr[i]>max)
				max=arr[i];//�ִ�
			if (arr[i]<min)
				min=arr[i];//�ּڰ�
		}
		
		System.out.println(min+" "+max);
		// TODO Auto-generated method stub

	}

}

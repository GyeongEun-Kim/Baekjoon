package baekjunalgorithm;
import java.util.Scanner;
public class No1152 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		
		st=sc.nextLine();
		int arr[]=new int[st.length()];
		for (int i=0;i<st.length();i++) {
			arr[i]=st.charAt(i);
		}
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]!=' ') {
				;}
			else
				count++;
		}
		if (arr[0]==' ')
			count--;
		if (arr[st.length()-1]==' ')
			count--;
		System.out.println(count+1);
	}
}		// TODO Auto-generated method stub

	



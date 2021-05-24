
import java.util.Scanner;
public class No1157_단어공부 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vocab=sc.next();
		int arr[]=new int[26];
		for (int i=0;i<vocab.length();i++) {
			if ((int)vocab.charAt(i)>=97) { //A=65, a=97
				arr[(int)vocab.charAt(i)-97]++;
			}//�ҹ��ڸ�
			else
				arr[(int)vocab.charAt(i)-65]++;
		}
		int max=0;
		int count=0;
		int maxidx=0;
		for (int j=0;j<26;j++) {
			if (arr[j]>=max) {
				max=arr[j];
				maxidx=j;
			}
		} //�ִ� '��'
		for (int k=0;k<26;k++) {
			if (arr[k]==max)
				count++;
			}
		if (count>=2)
			System.out.println("?");
		else
			System.out.println((char)(65+maxidx));
		
		// TODO Auto-generated method stub

	}

}

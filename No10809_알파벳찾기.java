
import java.util.Scanner;

public class No10809_���ĺ�ã�� {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String S=scanner.next();
		int al[]=new int[26];//�ҹ��� ���ĺ��� ����
		int s[]=new int[S.length()]; //��Ʈ���� ������ ������ �迭
		
		for (int i=0;i<al.length;i++)
			al[i]=-1; //-1�� �ʱ�ȭ
		
		for (int i=0;i<S.length();i++) {
			s[i]=S.charAt(i);
			if (al[(int)s[i]-(int)'a']==-1) {
				al[(int)s[i]-(int)'a']=i;
			}
			
			} //���ڿ��� ���ڷ� ���� ���� �и�
		
		for (int i=0;i<al.length;i++)
			System.out.print(al[i]+" ");
		
		// TODO Auto-generated method stub

	}

}

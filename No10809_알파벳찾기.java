import java.util.Scanner;

public class No10809_알파벳찾기 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String S=scanner.next();
		int al[]=new int[26];//소문자 알파벳의 갯수
		int s[]=new int[S.length()]; //스트링을 개별로 저장할 배열

		for (int i=0;i<al.length;i++)
			al[i]=-1; //-1로 초기화

		for (int i=0;i<S.length();i++) {
			s[i]=S.charAt(i);
			if (al[(int)s[i]-(int)'a']==-1) {
				al[(int)s[i]-(int)'a']=i;
			}

		} //문자열을 문자로 따로 따로 분리

		for (int i=0;i<al.length;i++)
			System.out.print(al[i]+" ");

		// TODO Auto-generated method stub

	}

}


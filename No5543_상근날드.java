
import java.util.Scanner;
public class No5543_상근날드 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int 상덕=scanner.nextInt();
		int 중덕=scanner.nextInt();
		int 하덕=scanner.nextInt();
		int 콜라=scanner.nextInt();
		int 사이다=scanner.nextInt();

		int min1=0;
		int min2=0;

		if (상덕>=중덕) {
			if(중덕>=하덕) {
				min1=하덕;
			}
			else
				min1=중덕;
		}

		else if(중덕>=상덕) {
			if(상덕>=하덕) {
				min1=하덕;
			}
			else
				min1=상덕;
		}
		else {
			if(상덕>=중덕) {
				min1=중덕;
			}
			else
				min1=상덕;
		}

		if(콜라>=사이다)
			min2=사이다;
		else
			min2=콜라;

		System.out.println(min1+min2-50);


		// TODO Auto-generated method stub

	}

}

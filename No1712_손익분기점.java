
import java.util.Scanner;

public class No1712_손익분기점 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int fixed=scanner.nextInt(); // 고정으로 나가는 비용
		int var=scanner.nextInt(); //노트북 한대 생성하는데 드는 가변적인 비용
		
		int price=scanner.nextInt(); //노트북 한대의 가격
		int breakEvenPoint=0; //몇대를 팔아야 손익분기점을 넘는지

		if (var>=price)
			System.out.println("-1");
		else
			System.out.println(fixed/(price-var)+1);
		// TODO Auto-generated method stub
		
	}
}


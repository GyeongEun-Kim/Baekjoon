
import java.util.Scanner;

public class No1712_���ͺб��� {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int fixed=scanner.nextInt(); // �������� ������ ���
		int var=scanner.nextInt(); //��Ʈ�� �Ѵ� �����ϴµ� ��� �������� ���
		
		int price=scanner.nextInt(); //��Ʈ�� �Ѵ��� ����
		int breakEvenPoint=0; //��븦 �Ⱦƾ� ���ͺб����� �Ѵ���

		if (var>=price)
			System.out.println("-1");
		else
			System.out.println(fixed/(price-var)+1);
		// TODO Auto-generated method stub
		
	}
}


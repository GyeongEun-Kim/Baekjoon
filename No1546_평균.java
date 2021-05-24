
import java.util.Scanner;
public class No1546_평균 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		double ori_score[]=new double[num];
		double new_score[]=new double[num];
		double max=0;
		double sum=0;
	
		for (int i=0;i<num;i++)
			ori_score[i]=scanner.nextDouble();
		
		for (int i=0;i<num;i++) {
			if (max<ori_score[i])
				max=ori_score[i];
		}
	
		for (int i=0;i<num;i++) {
			new_score[i]=(ori_score[i])/max*100;
			sum=sum+new_score[i];
		}
		System.out.println((sum/num));
		// TODO Auto-generated method stub

	}

}

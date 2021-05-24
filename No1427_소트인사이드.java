
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No1427_소트인사이드{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int size=0;
		int temp=n;
		while (temp>0) {
			temp/=10;
			size++;
		}
		
		ArrayList<Integer> parse=new ArrayList<Integer>();
		
		for (int i=0;i<size;i++) {
			if  (size-i==1) 
				parse.add(n);
			else
				parse.add(n%10);
			
			n=n/10;
		
		}
		Collections.sort(parse,Collections.reverseOrder());
		
		for (int i =0;i<size;i++)
			System.out.print(parse.get(i));
		// TODO Auto-generated method stub

	}

}


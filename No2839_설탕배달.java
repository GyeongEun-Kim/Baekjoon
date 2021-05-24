
import java.io.*;

public class No2839_설탕배달 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sugar = Integer.parseInt(br.readLine());
	
		int memo[] = new int[2];
		int bag=0;
		boolean  b=false;
		
		if (sugar%5==0) {
			bag=sugar/5;
			b=true;
		}
		
		else {
			int i=sugar/5;
			
			while (i>=0) {
				if ((sugar-(5*i))%3==0) {
					bag=i+(sugar-(5*i))/3;
					b=true;
					break;
					}
				i--;
				}
		}

		if (b==false)
			bag=-1;

		System.out.println(bag);
	}
}


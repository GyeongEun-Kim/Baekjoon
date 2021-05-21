package baekjunalgorithm;
import java.io.*;

public class No13305_주유소 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cityNum = Integer.parseInt(br.readLine());
		long cityDistance[] = new long[cityNum-1];
		long oilPrice[] = new long[cityNum]; 
		long totalPrice=0;
		
		String temp[] = br.readLine().split(" ");
		
		for (int i=0;i<cityDistance.length;i++) {
			cityDistance[i]=Integer.parseInt(temp[i]);
		}
		
		temp = br.readLine().split(" ");
		
		for (int i=0;i<oilPrice.length;i++) {
			oilPrice[i]=Integer.parseInt(temp[i]);
		}
		
		long minPrice=oilPrice[0];
		
		for (int i=0;i<oilPrice.length-1;i++) {
			if (minPrice<=oilPrice[i+1]) { //주유
				totalPrice+= minPrice*cityDistance[i];
			}
			else {
				totalPrice+= minPrice*cityDistance[i];
				minPrice=oilPrice[i+1];
				
			}
		}
		
		System.out.println(totalPrice);
		}

	}






import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class DecToBin {
	ArrayList<Long> arr = new ArrayList<Long>();
	int toBinary (long d) {
		if (d==1) {
			arr.add((long) 1);
			return 0;
		}
		else {
			arr.add(d%2);
			d=d/2;
			return toBinary(d);
		}
			
	}
}

public class No10829_이진수변환{
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long decimal = Long.parseLong((br.readLine()));
		DecToBin decToBin = new DecToBin();
		decToBin.toBinary(decimal);
		
		for (int i=decToBin.arr.size()-1;i>=0;i--) {
			System.out.print(decToBin.arr.get(i));
		}
	
		// TODO Auto-generated method stub

	}

}

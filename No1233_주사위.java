
import java.io.*;
public class No1233_주사위 {
	public static int findMax (int arr[]) {
		int max=0;
		int index=0;
		for (int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
				index=i;
			}
		}
			return index+1;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dice=br.readLine();
		int first = Integer.parseInt(dice.split(" ")[0]);
		int second = Integer.parseInt(dice.split(" ")[1]);
		int third = Integer.parseInt(dice.split(" ")[2]);
		
		int max=first+second+third;
		int arr[]= new int[max];
		
		
		for (int i=1;i<=first;i++) {
			for (int j=1;j<=second;j++) {
				for (int k=1;k<=third;k++) {
					arr[i+j+k-1]++;
				}
			}
		}
		
		System.out.println(findMax(arr));
		// TODO Auto-generated method stub

	}

}


import java.io.*;
public class No1032_명령프롬프트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		String arr[] = new String[testcase];
		for (int i=0;i<testcase;i++) {
			arr[i]=br.readLine();
		}//string을 배열에 넣음
		
			
		for (int i=0;i<arr[0].length();i++) {
			boolean same=true;
			for (int j=0;j<testcase-1;j++) {
				if (arr[j].charAt(i)!=arr[j+1].charAt(i)) {
					System.out.print("?");
					same=false;
					break;}
			}
			if (same==true)
				System.out.print(arr[0].charAt(i));
		}

	}
}

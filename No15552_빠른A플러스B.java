
import java.io.*;
public class No15552_빠른A플러스B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i=0;i<tc;i++) {
			String temp[]=br.readLine().split(" ");
		
			bw.write(String.valueOf(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])));
			bw.write("\n");
		}
		
		bw.flush();
		// TODO Auto-generated method stub

	}

}

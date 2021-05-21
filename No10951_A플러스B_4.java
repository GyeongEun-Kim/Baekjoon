package baekjunalgorithm;
import java.io.*;
public class No10951_A플러스B_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String s="";
		String temp[];
		while ((s=br.readLine())!=null) {
			temp=s.split(" ");
			System.out.println(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]));
		}
		// TODO Auto-generated method stub

	}

}

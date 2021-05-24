
import java.util.*;
import java.io.*;

public class No1181_단어정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		String arr [] = new String[tc];
		
		
		for (int i=0;i<tc;i++) {
			arr[i]=br.readLine();
		}
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length()<s2.length()) {
					return -1; //Don't swap
				}
				else if (s1.length()==s2.length()) { //길이가 같을때
					return s1.compareTo(s2);
				}
				else 		
					return 1;		// swap
			}
			
		};
		
		Arrays.sort(arr,comparator); //길이순 정렬
		
		
		
		
		for (int i=0;i<tc-1;i++) {
			if (arr[i].equals(arr[i+1]))
				continue;
			else
				System.out.println(arr[i]); 
		}
		System.out.println(arr[tc-1]);
		// TODO Auto-generated method stub

	}

}

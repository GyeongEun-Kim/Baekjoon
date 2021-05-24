
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Collections;
	
	public class No2751_수_정렬하기2 {
	
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int tc = Integer.parseInt(br.readLine());
			String s="";
		
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i=0;i<tc;i++) {
				arr.add(Integer.parseInt(br.readLine()));
			}
			
			Collections.sort(arr);
			
			for (int i=0;i<tc;i++)
				bw.write(arr.get(i)+"\n");
			// TODO Auto-generated method stub
			
			bw.flush();
			bw.close();
			br.close();
			}
		}

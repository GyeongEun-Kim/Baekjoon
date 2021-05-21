package baekjunalgorithm;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class Time {
	int start;
	int end;
	public Time (int start, int end) {
		this.start=start;
		this.end=end;
	}
}


public class No1931_회의실배정 {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] temp= new String[2];
		Time[] timeTable = new Time[num];
		int cnt=1;
		
		for (int i=0;i<num;i++) {
			temp=br.readLine().split(" ");
			Time time = new Time(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
			timeTable[i]=time;
		}
		
		Comparator<Time> comparator = new Comparator<Time>() {

			@Override
			public int compare(Time o1, Time o2) {
				if (o1.end>o2.end) 
					return 1; //swap
				else if (o1.end==o2.end) {
					return o1.start - o2.start;
					//o1.start>o2.start이면 swap 
				}
				else
					return -1;
				// TODO Auto-generated method stub
			}
			
		};
		
		Arrays.sort(timeTable,comparator); //y오름차순,x오름차순으로 정렬
		

		int end=timeTable[0].end;
		
			for (int i=1;i<timeTable.length;i++) {
				
				if (end<=timeTable[i].start) {
					
					end=timeTable[i].end;
					cnt++;
					
				}
			
				
			}
			
		
		
		System.out.println(cnt);
		
	}
}

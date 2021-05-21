package baekjunalgorithm;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Point {
	int x,y;

	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}

public class No11651_좌표정렬하기_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Point pointArr[] = new Point[tc]; //point 객체 배열
		
		for (int i=0;i<tc;i++) {
			String temp[] = br.readLine().split(" ");
			Point point = new Point(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
			pointArr[i]=point;
		} //객체 배열에 저장
		
		Comparator<Point> comparator = new Comparator<Point>() {
			@Override
			public int compare (Point p1, Point p2) {
				if (p1.y>p2.y) 
					return 1;
				else if ((p1.y==p2.y) && (p1.x>p2.x)) 
					return 1;
				else
					return -1;
				}
			};
			
		Arrays.sort(pointArr,comparator);
		
		for (int i=0;i<tc;i++) {
			System.out.println(pointArr[i].x+" "+pointArr[i].y);
		}
		
		
		// TODO Auto-generated method stub

	}

}

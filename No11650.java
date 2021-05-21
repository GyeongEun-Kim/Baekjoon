package baekjunalgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Point {
	int x,y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
}


public class No11650 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt(); //몇개의 좌표를 입력 받을건지
		
		List<Point> Points = new ArrayList<>(); //point객체를 저장할 리스트
		
		for (int i=0;i<num;i++) {
			Points.add(new Point(scanner.nextInt(),scanner.nextInt()));
		} //좌표를 입력받아 point객체를 만들고 points에 저장
		
		Collections.sort(Points,new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				if (p1.x>p2.x)
					return 	1;
				else if (p1.x==p2.x) {
					if (p1.y>p2.y) {
						return 1;
					}
				}
				return -1;
			}
		});
		
		for (int i=0;i<num;i++ ) {
			System.out.println(Points.get(i).x +" "+Points.get(i).y);
		}
		// TODO Auto-generated method stub

	}

}

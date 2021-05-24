
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


public class No11650_좌표정렬하기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt(); //��� ��ǥ�� �Է� ��������
		
		List<Point> Points = new ArrayList<>(); //point��ü�� ������ ����Ʈ
		
		for (int i=0;i<num;i++) {
			Points.add(new Point(scanner.nextInt(),scanner.nextInt()));
		} //��ǥ�� �Է¹޾� point��ü�� ����� points�� ����
		
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

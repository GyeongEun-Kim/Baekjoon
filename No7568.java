package baekjunalgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class HeightWeight implements Comparable<HeightWeight>{
	int height, weight, biggerD=0;;
	public HeightWeight (int h, int w) {
		this.height=h;
		this.weight=w;
	}
	@Override
	public int compareTo(HeightWeight o) {
		if (this.height-o.height<0) {
			if (this.weight-o.weight<0)
				return 1;
		}
		return 0;
		// TODO Auto-generated method stub
	}
	
}

public class No7568 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num= scanner.nextInt();
		ArrayList<HeightWeight> DungChi = new ArrayList <HeightWeight>();
		for (int i=0;i<num;i++) {
			DungChi.add(new HeightWeight(scanner.nextInt(),scanner.nextInt()));
		}
		
		for (int i=0;i<num;i++) {
			for (int j=0;j<num;j++) {
				if (DungChi.get(i).compareTo(DungChi.get(j))==1) {
				DungChi.get(i).biggerD++;
				}
			}
			System.out.print(DungChi.get(i).biggerD+1);
			if (i<num-1)
				System.out.print(" ");
		}
		

	}

}


import java.util.Scanner;

	class Info {
		int a;
		int b;
		int c;
	public Info(int a,int b) {
		this.a=a;
		this.b=b;
		this.c=a+b;
		}
	}
	
public class No11022_A더하기B_8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		Info[] info=new Info[t];
		for (int i=0;i<t;i++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			info[i]=new Info(a,b);
			// TODO Auto-generated method stub
		}
		
		for (int i=0;i<t;i++)
			System.out.println("Case #"+(i+1)+": "+info[i].a+" + "+info[i].b+" = "+info[i].c);

		// TODO Auto-generated method stub

	}
}

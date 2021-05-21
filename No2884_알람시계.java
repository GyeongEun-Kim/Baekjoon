package baekjunalgorithm;
import java.util.Scanner;
public class No2884_알람시계 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if (minute<45) {
			if (hour==0)
				hour=23;
			else
				hour-=1;
			minute=minute+15;
		}
		else if (minute==45)
			minute=0;
		
		else {
			minute=minute-45;
			
		}
		// TODO Auto-generated method stub
		System.out.println(hour+" "+minute);
	}

}
//만약1시 20분이면 12시 35분에 맞춰야함 

package holloword_project;


import java.util.*;


public class TeatGame369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(1~99):");
		
		int num = scanner.nextInt();
		
		if((num > 0) && (num < 100)) {
			
			int a,b;
			a = num / 10;
			b = num % 10;
			
			if((a % 3 == 0) && (b % 3 == 0) && (a != 0) && (b != 0)) {
				System.out.print("박수 짝짝");
			}
			else if(((a != 0) && (b != 0)) || ((a % 3 == 0) && (b % 3 == 0))) {
				System.out.print("박수 짝");
			}
			else {
				System.out.print("해당없음.");
			}
		}
		else {
			System.out.print("잘못된 입력입니다.");
		}
		scanner.close();
	}
}

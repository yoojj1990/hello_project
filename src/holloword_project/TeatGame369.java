package holloword_project;


import java.util.*;


public class TeatGame369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(1~99):");
		
		int num = scanner.nextInt();
		
		if((num > 0) && (num < 100)) {
			
			int a,b;
			a = num / 10;
			b = num % 10;
			
			if((a % 3 == 0) && (b % 3 == 0) && (a != 0) && (b != 0)) {
				System.out.print("�ڼ� ¦¦");
			}
			else if(((a != 0) && (b != 0)) || ((a % 3 == 0) && (b % 3 == 0))) {
				System.out.print("�ڼ� ¦");
			}
			else {
				System.out.print("�ش����.");
			}
		}
		else {
			System.out.print("�߸��� �Է��Դϴ�.");
		}
		scanner.close();
	}
}

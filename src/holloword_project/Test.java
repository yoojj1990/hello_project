package holloword_project;


import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("2�ڸ��� ���� �Է�(10~99):");
		
		int num = scanner.nextInt();
		
		if((num > 10) && (num < 100)) {
			
			int a,b;
			a = num / 10;
			b = num % 10;
			
			if(a==b) {
				System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
			else {
				System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
			}
			
		}
		else {
			System.out.print("�߸��� �Է��Դϴ�.");
		}
		
		scanner.close();
// ���� 10~99 ���̸� �Է¹ް� ���ڸ����� ���ڸ����� ������ �Ǻ�		

	}

}

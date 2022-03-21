package holloword_project;


import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("2자리수 정수 입력(10~99):");
		
		int num = scanner.nextInt();
		
		if((num > 10) && (num < 100)) {
			
			int a,b;
			a = num / 10;
			b = num % 10;
			
			if(a==b) {
				System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else {
				System.out.print("No! 10의 자리와 1의 자리가 같지않습니다.");
			}
			
		}
		else {
			System.out.print("잘못된 입력입니다.");
		}
		
		scanner.close();
// 정수 10~99 사이를 입력받고 십자리수와 일자리수가 같은지 판별		

	}

}

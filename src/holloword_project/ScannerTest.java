package holloword_project;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요:");
		String name = scanner.next();
		System.out.println("내 이름은 "+ name + "입니다.");
		
		System.out.println("당신의 직업을 입력하세요:");
		String jab = scanner.next();
		System.out.println("내 직업은 "+ jab + "입니다.");
		
		System.out.println("당신의 나이를 입력하세요:");
		int age = scanner.nextInt();
		System.out.println("내 나이는 "+ age + "입니다.");
		
		System.out.println("당신의 신장을 입력하세요:");
		double height = scanner.nextDouble();
		System.out.println("내 키는 "+ height + "입니다.");
		
		scanner.close();
		
	}
//
}

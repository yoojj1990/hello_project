package holloword_project;

public class Helloword {
	
	public static int sum(int a, int b){
		int sum;
		sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=10, j=20;
		int s;
		String str = "Korea";
		
		s = sum(i,j);
		
		System.out.println("S값은 " + s + "입니다.");
		System.out.println("Hello world!!");
		System.out.println(str);
		
		
	}
//
}

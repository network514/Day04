
public class J02_Quiz {

	public static void main(String[] args) {
		
//		문제 :
//		1. name 변수에 이름을 저장
//		2. age 변수에 나이을 저장
//		3. height 변수에 키를 저장(일반형 실수)
//			 (예 :185.9cm)

//		위에서 작성된 프로그램을 다음과 같이
//		출력하세요
//		=> 나의 이름은 ***입니다.
//			나이는 **살이고, 키는 ***.*cm 입니다.
		
		String name;
//		=> 이름을 저장할 수 있도록
//			문자열 저장 공간을 만들고(String),
//			공간의 이름을 name으로 결정
		name = "둘리";
		
		int age;
//		=> 나이를 저장할 수 있도록
//			정수 저장 공간을 만들고(int),
//			공간의 이름을 age로 결정
		age = 10;
		
		double height;
//		=> 키를 저장할 수 있도록
//			일반형 실수 저장 공간을 만들고(double)
//			공간의 이름을 double로 결정
		height = 187.9;
		
		System.out.println("나의 이름은 "
				+ name + "입니다.");
		System.out.println("나의 나이는 "
				+ age + "살이고, 키는 "
				+ height + "cm 입니다.");
		
				
				
				
		
	}
}













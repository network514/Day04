
public class J04_Oper05 {
	public static void main(String[] args) {
		
//		대입연산자 : =
//		- 데이터를 메모리에 준비된 변수에 저장
//		- 변수에 데이터가 있는 상황일 때에는
//			기존의 데이터 값을 무시하고 
//			덮어쓰기 한다.
//		- 저장하려는 데이터의 형태와
//			저장 공간의 형태가 같아야 한다.
		
		int a;
		
		a = 10;
		System.out.println("a : " + a);
		
		a = 20;
		System.out.println("a : " + a);
//		=> 기존에 있던 값을 무시하고
//			새로 저장함
		
		
//		복합 대입 연산자
//		: +=  -=  *=  /=  %=
		int b = 10;
		
//		b의 값에 5를 더해서 다시 저장하는 경우,
		
//		1. 방법
//		b = b + 5;
		
//		2. 방법
//		b += 5;
//		=> 방법1과 같은 의미이다.
		
	}
}


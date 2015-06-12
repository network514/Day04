
public class J04_Oper04 {
	public static void main(String[] args) {
		
//		관계연산자 : 대소비교 등.
//		=>  ==(같다)  !=(다르다)
//		=> 관계연산자의 결과는 맞다/틀리다 형태의
//			정보로 제공된다.
//		=> 결과 값을 boolean 자료형으로 
//			저장할 수 있다.
		
		int n1, n2;
		n1 = 4;		n2 = 2;
		
		boolean b1 = n1 > n2;
//		=> "n1이 n2보다 크다"에 대한
//			결과가 무엇인지, b1에 저장해라 라는 의미
		System.out.println("b1 : " + b1);
		
		boolean b2 = n1 >= n2;
//		=> "n1이 n2보다 크거나 같다"에 대한
//			결과를 b2에 저장하라는 의미.
		System.out.println("b2 : " + b2);
		
		
		boolean b3 = n1 == n2;
//		=> "n1의 값이 n2의 값과 같다"에 대한 
//			결과를 b3에 저장하라는 의미.
		System.out.println("b3 : " + b3);
		
		
		boolean b4 = n1 != n2;
//		=> "n1의 값이 n2의 값과 다르다"에 대한
//			결과를 b4에 저장하라는 의미
		System.out.println("b4 : " + b4);
		
		
//		논리연산자
//		- 양 쪽의 참/거짓 정보를 바탕으로
//			약속된 규칙에 따라 결과 값을 제공
//		- && : 논리곱 연산자, AND 연산자
//			모든 경우가 true => 결과값 true
//		- || : 논리합 연산자, OR 연산자
//			모든 경우가 false => 결과값 false
//			(하나라도 true => 결과값 true)
//		- ! : 부정연산자, NOT 연산자
//			뒤의 논리 상황(참/거짓)을 부정
		
		boolean res1 = true && true;
		System.out.println("res1 : " + res1);
		
		boolean res2 = false || true;
		System.out.println("res2 : " + res2);
		
		boolean res3 = true;
		boolean res4 = !res3;
		System.out.println("res4 : " + res4);
		
		
		
	}
}













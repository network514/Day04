
public class J04_Oper02 {
	public static void main(String[] args) {
		
//		문자열 String의 경우,
//		+ 연산자는 각 문자열을 결합하는 기능이 있다.
		
		String st = "가나";
		System.out.println("st : " + st);
		
		st = st + "다라";
		System.out.println("st : " + st);
		
//		에러 : st = st - "다라";
//		=> 문자열은 + 연산자만 사용 가능
		
		System.out.println();	// 줄바꿈
		
		String str1 = "가나";
		int str2 = 12;
		String str3 = str1 + str2;
//		=> String은 모든 타입의 데이터들에 대하여
//			+ 기호를 이용해서 결합을 진행할 수
//			있는데, 이 때의 결과값의 형태는
//			String이다.
		System.out.println("str3 : " + str3);
		
		String str4 = "10";
		int str5 = 10;
		String str6 = str4 + str5;
		System.out.println("str6 : " + str6);
		
	}
}

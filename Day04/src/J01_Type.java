
public class J01_Type {
	
//	1. 이클립스에서의 컴파일 방법
//		- 저장 : Ctrl + shift + s
//	2. 실행 방법
//		1. 좌측 상단 Run 아이콘
//		2. 단축키 : Ctrl + F11

	public static void main(String[] args) {
		
//		자료형 : 변수를 만들 때 사용되는 키워드
//		- "약속된 내용대로 공간을 만들어라"라는
//			의미.
//		- 약속 내용 : 
//			1. 저장 데이터의 형태(예:정수, 실수..)
//			2. 공간 크기(예:4byte, 8byte..)
		
		
//		1. int : 일반형 정수
		int i;
//		=> 일반형 정수를 저장할 수 있는 공간을 만듦.
		
		i = 10;	
//		=> 10이라는 정수 값을 i 공간에 저장해라.
		System.out.println("i : " + i);
		
//		에러 : i = 2200000000;
//		=> 22억은 일반형 정수가 아니므로
//			i 공간에 저장 불가능
		
		
//		2. long : 확장형 정수
		long l;
//		=> 확장형 정수를 저장할 수 있는 공간 만듦
		l = 2200000000L;
		System.out.println("l : " + l);
		
		
//		3. double : 일반형 실수
		double d;
//		=> 일반형 실수를 저장할 수 있는 공간 만듦
		d = 12.34;
		System.out.println("d : " + d);
		
		
//		4. float : 약식형 실수
		float f;
//		=> 약식형 실수를 저장하는 공간 만듦
		f = 12.34f;
		System.out.println("f : " + f);
		
		
//		5. char : 단일문자 
		char c;
//		=> 단일문자형 데이터 저장 공간 만듦
//		=> 캐릭터라고 읽는다.
		c = 'A';	// 알파벳 한글자
		System.out.println("c : " + c);
		
		c = '한';	// 한글 한글자
		System.out.println("c : " + c);
		
		c = '*';	// 기호 한글자
		System.out.println("c : " + c);
		
		
//		6. String : 문자열
		String s;
//		=> 문자열(일반적인 문장) 저장 공간을 만듦
//		=> 스트링이라고 읽는다.
//		=> 쌍따옴표 표기로 저장한다.
		s = "안녕.";
		System.out.println("s : " + s);
		
		s = "둘리가 길동이를 만났다.";
		System.out.println("s : " + s);
		
		
//		7. boolean
		boolean b;
//		=> 참/거짓 데이터 저장 공간을 만듦
//		=> 불린이라고 읽는다.
		
		b = true;	// 맞다라는 의미를 저장
		System.out.println("b : " + b);
		
		b = false;	// 틀리다라는 의미 저장
		System.out.println("b : " + b);
		
		
		
		
		
		
		
		
		
	}
}

















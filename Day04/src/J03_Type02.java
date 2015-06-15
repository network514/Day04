
public class J03_Type02 {
	public static void main(String[] args) {
		
		int i;
//		=> int는 일반형 정수만 저장 가능
		i = 10;		// 가능
		
//		에러 : i = 10L;	
//		=> 확장형 정수 값이므로 불가능
		
		
		long l;
//		=> 확장형 정수를 저장할 수 있음
		l = 30L;	// 가능
		l = 30;		// 가능
//		=> 저장을 할 때에는 무조건 기본적으로
//			저장하려는 값(= 기호 오른쪽)과
//			저장 공간(= 기호 왼쪽)의
//			형태가 같아야만 하지만
//			다음과 같은 경우에는 
//			서로 자동으로 값의 저장을 허용한다.
//		=> 관계도 : 
//			int < long < float < double
//		=> 관계도에서 오른쪽에 있는 자료형은
//			왼쪽 형태의 데이터를 자동으로
//			저장 가능할 수 있다.
			
			long p;
			p = 10;	// 일반형 정수 저장 가능
			System.out.println("p : " + p);
			
			float pp;
			pp = 10L; // 확장형 정수 저장 가능
			System.out.println("pp : " + pp);
			
			double ppp;
			ppp = 12.34f; // 약식형 실수 저장 가능
			System.out.println("ppp : " + ppp);
//			=> 약식형 실수가 가지고 있는 
//				오차가 그대로 저장되고 출력됨
		
		
		
	}
}
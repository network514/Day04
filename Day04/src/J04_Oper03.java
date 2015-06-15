
public class J04_Oper03 {
	public static void main(String[] args) {
		
//		증감연산자 : ++ --
//		=> 각 대상에 대하여 1의 값을 증가/감소
//			한 후, "다시 저장"!!!!! 한다.
		
		int a = 5;
		a++;	
//		=> 현재 a의 값에 1을 더한 후 다시 저장
		System.out.println("a : " + a);
		
		int b = 10;
		b--;
//		=> 현재 b의 값에 1을 뺀 후 다시 저장
		System.out.println("b : " + b);
		
		
		double c = 12.34;
		c++;
		System.out.println("c : " + c);
	}
}

public class J04_Oper04 {
	public static void main(String[] args) {
		
//		���迬���� : ��Һ� ��.
//		=>  ==(����)  !=(�ٸ���)
//		=> ���迬������ ����� �´�/Ʋ���� ������
//			������ �����ȴ�.
//		=> ��� ���� boolean �ڷ������� 
//			������ �� �ִ�.
		
		int n1, n2;
		n1 = 4;		n2 = 2;
		
		boolean b1 = n1 > n2;
//		=> "n1�� n2���� ũ��"�� ����
//			����� ��������, b1�� �����ض� ��� �ǹ�
		System.out.println("b1 : " + b1);
		
		boolean b2 = n1 >= n2;
//		=> "n1�� n2���� ũ�ų� ����"�� ����
//			����� b2�� �����϶�� �ǹ�.
		System.out.println("b2 : " + b2);
		
		
		boolean b3 = n1 == n2;
//		=> "n1�� ���� n2�� ���� ����"�� ���� 
//			����� b3�� �����϶�� �ǹ�.
		System.out.println("b3 : " + b3);
		
		
		boolean b4 = n1 != n2;
//		=> "n1�� ���� n2�� ���� �ٸ���"�� ����
//			����� b4�� �����϶�� �ǹ�
		System.out.println("b4 : " + b4);
		
		
//		��������
//		- �� ���� ��/���� ������ ��������
//			��ӵ� ��Ģ�� ���� ��� ���� ����
//		- && : ���� ������, AND ������
//			��� ��찡 true => ����� true
//		- || : ���� ������, OR ������
//			��� ��찡 false => ����� false
//			(�ϳ��� true => ����� true)
//		- ! : ����������, NOT ������
//			���� �� ��Ȳ(��/����)�� ����
		
		boolean res1 = true && true;
		System.out.println("res1 : " + res1);
		
		boolean res2 = false || true;
		System.out.println("res2 : " + res2);
		
		boolean res3 = true;
		boolean res4 = !res3;
		System.out.println("res4 : " + res4);
		
		
		
	}
}













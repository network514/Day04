
public class J04_Oper02 {
	public static void main(String[] args) {
		
//		���ڿ� String�� ���,
//		+ �����ڴ� �� ���ڿ��� �����ϴ� ����� �ִ�.
		
		String st = "����";
		System.out.println("st : " + st);
		
		st = st + "�ٶ�";
		System.out.println("st : " + st);
		
//		���� : st = st - "�ٶ�";
//		=> ���ڿ��� + �����ڸ� ��� ����
		
		System.out.println();	// �ٹٲ�
		
		String str1 = "����";
		int str2 = 12;
		String str3 = str1 + str2;
//		=> String�� ��� Ÿ���� �����͵鿡 ���Ͽ�
//			+ ��ȣ�� �̿��ؼ� ������ ������ ��
//			�ִµ�, �� ���� ������� ���´�
//			String�̴�.
		System.out.println("str3 : " + str3);
		
		String str4 = "10";
		int str5 = 10;
		String str6 = str4 + str5;
		System.out.println("str6 : " + str6);
		
	}
}











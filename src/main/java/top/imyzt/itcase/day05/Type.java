package top.imyzt.itcase.day05;

/**
 * �����������ͶԱ�������������
 * 
 * �����������͵�ֵ����,���ı�ԭֵ,��Ϊ���ú�ᵯջ,�ֲ�����(change�еı���)��֮��ʧ
 * �����������͵�ֵ����,�ı�ԭֵ,��Ϊ��ʹ������ջ,���Ƕ��ڴ��еĶ�����,����ͨ����ַ��������
 * @author 01
 * 
 * java�е�����ֵ���ݻ���ַ����
 * 1.���Ǵ�ֵ,Ҳ�Ǵ�ַ,�����������ʹ��ݵ�ֵ,�����������ʹ��ݵ�ַ
 * 2.java��ֻ�д�ֵ,��Ϊ��ֵַҲ��ֵ.(java֮��֧��)
 *
 */
public class Type {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20
		change(a,b);	//���ݵ�ֵ
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20,Ϊʲô����˿�ʼ��10,20?
		
		System.out.println(" ------------------------ ");
		
		int c[] = {1,2,3,4,5};
		System.out.println(c[1]);						//2
		change(c);	//���ݵĵ�ַ
		System.out.println(c[1]);						//4,Ϊʲô�����4
		
	}

	private static void change(int[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
				c[i] = c[i] * 2;	//���ڴ��ݵĵ�ַ,�޸ĺ������ʵ�ı���
			}
		}
	}

	private static void change(int a, int b) {
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20
		a = 30;											//���ڴ��ݵ�ֵ,ջ�����¿���һ��ռ�洢�˷����еı���.�ȴ˷�������(��ջ),a=30, b=40�ͻ���ڴ�����ʧ
		b = 40;
		System.out.println("a=" + a + ", b=" + b);		//a=30, b=40
	}
	
}

import java.util.Scanner;
import java.util.Vector;

 class Input {
	private Vector<Friend> vector;
	private Scanner scan;

	 Input(Vector<Friend> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}

	 void input() {
		System.out.println("<<ģ�� �߰� â>>");
		System.out.print("�̸� : "); String name = this.scan.next();
		System.out.print("��ȭ��ȣ : "); String tel = this.scan.next();
		System.out.print("���� : "); String relation = this.scan.next();
		Friend f = new Friend(name, tel, relation);
		this.vector.addElement(f);
	}
	
	

}
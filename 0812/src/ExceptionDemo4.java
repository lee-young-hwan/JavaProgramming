

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Parent p = new Parent();
		//p.print();
	}
}

class Parent{
	public void print() throws Exception{
		System.out.println("나는 부모의 메소드");
	}
}

class Child extends Parent{
	@Override
	public void print() throws RuntimeException{
		System.out.println("나는 자식의 메소드");
	}
}

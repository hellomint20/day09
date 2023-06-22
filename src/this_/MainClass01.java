package this_;
/*
this
- 메소드의 0번째 매개변수로 자동으로 만들어진다.
- 클래스 자기자신의 정보를 가지고 있는 변수
 */
class TestClass01{
	public int num = 12345;
	public void test() {
		int num = 789897;
		System.out.println("this : "+this);
		System.out.println("test : "+num);
		System.out.println("test this : "+this.num);
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		System.out.println("t : "+t);
		System.out.println("main : "+t.num);
		t.test();
	}
}

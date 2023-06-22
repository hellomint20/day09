package variable;

class TestClass03{
	public int var;		//인스턴스(객체) 변수
	public void test1() {
		var = 100;
	}
	public void test2() {
		System.out.println(var);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test1();
		t.test2();
	}
}

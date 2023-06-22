package overloading;

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc(10, 20);
		t.sumFunc("aaa", "bbb");
	}
}

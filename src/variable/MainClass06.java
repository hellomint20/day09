package variable;

class TestClass06{
	public static int su;
	public static void test() {
		su = 100;	//아직 su가 안 만들어져서 오류가 남
					//su는 객체가 만들어질 때 만들어지기 때문에 
					//같이 static 를 써줘야 함
	}
}

public class MainClass06 {
	public static int num;
	public static void test() {
		num = 100;
	}
	public static void main(String[] args) {
		num = 100;
		TestClass06 t = new TestClass06();
	}
}

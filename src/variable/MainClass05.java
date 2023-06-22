package variable;
/*
	static : 클래스 변수로 만들겠다라는 의미
 */

class TestClass05{
	public static String msg="연습";	//클래스 변수 (미리 만들어짐)
	public int num;					//인스턴스 변수 (객체 만들어질 때 만들어짐)
}

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass05.msg);
		TestClass05 t = new TestClass05();
		System.out.println(t.msg);		
	}
}

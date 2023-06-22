package variable;

class TestClass07{
	public final String KOREA = "대한민국";
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		//t.KOREA = "미국";	//final 이기 때문에 값 변경 불가능
		System.out.println(t.KOREA);
	}
}

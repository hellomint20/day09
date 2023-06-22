package variable;

class Test04{
	//여러 곳에서 사용하려고 할 때 인스턴스 변수 사용
	String name;
	public void inputData() {
		name = "홍길동";
	}
	public void printData() {
		System.out.println(name);
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		t.inputData();
		t.printData();
	}
}

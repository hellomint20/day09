package this_;

class TestClas03{
	private int num, age;	//은닉화
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
	public void display() {
		System.out.println("출력 담당");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClas03 t = new TestClas03();
		t.setNum(12345);
		int re = t.getNum();
		System.out.println("결과 : "+re);
	}
}

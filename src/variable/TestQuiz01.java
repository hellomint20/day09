package variable;

import java.util.Scanner;

public class TestQuiz01 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double  avg;

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
	}
	public void opData() {
		sum = kor+math+eng;
		avg = sum/3.0;
		switch((int)avg/10) {
		case 10:
			grade = "A";
		case 9:
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		default:
			grade = "C";
			break;
		}
	}
	public void printData() {
		System.out.println("--------------------------");
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+String.format("%.2f",avg));
		System.out.println("등금 : "+grade);
	}
}

package Exp2;
import Exp2.Course;
import Exp2.Teacher;
import Exp2.Student;
import java.util.Scanner;
public class Test {
	public static void main(String[] arg){
		Course a = new Course("1", "离散数学","教300","13:30","魏薇");
		Course b = new Course("2","线性代数","教104","7:50","陈爽");
		Course c = new Course("3","马克思主义基本原理概论","图602","9:40","陈运辉");
		Teacher p = new Teacher(1,"魏薇","女",a);
		Teacher q = new Teacher(2,"陈爽","女",b);
		Teacher r = new Teacher(3,"陈运辉","男",c);
		Student t = new Student(1,"王颖","女","无");
		System.out.println(a + "\n" + p + "\n");
		System.out.println(b + "\n" + q + "\n");
		System.out.println(c + "\n" + r + "\n");
		
		System.out.println("选课请输入1");
		Scanner i = new Scanner(System.in);
		String n = i.nextLine();
		switch (n){
		case "1":
			System.out.println("请输入课程编号");
			Scanner d = new Scanner(System.in);
			int e = d.nextInt();
			switch (e){
			case 1:
				t.setCourse(a.courseName);
				break;
			case 2:
				t.setCourse(b.courseName);
				break;
			case 3:
				t.setCourse(c.courseName);
				break;
			default:
				System.out.println("输入错误");
				System.exit(-1);
			}
			break;
		default:
			System.out.println("操作错误");
			System.exit(-1);
		}
		System.out.println("是否退课？（退输入1，否则0）");
		Scanner l = new Scanner(System.in);
		int f = l.nextInt();
		switch (f){
		case 1:
			t.setCourse("未选课");
			System.out.println(q);
			break;
		case 0:
			System.out.println("选课成功" + "\n" + t);
			break;
		default:
			System.out.println("输入错误");
			System.exit(-1);
		}
	}

	
}

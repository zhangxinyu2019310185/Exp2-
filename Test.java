package Exp2;
import Exp2.Course;
import Exp2.Teacher;
import Exp2.Student;
import java.util.Scanner;
public class Test {
	public static void main(String[] arg){
		Course a = new Course("1", "��ɢ��ѧ","��300","13:30","κޱ");
		Course b = new Course("2","���Դ���","��104","7:50","��ˬ");
		Course c = new Course("3","���˼�������ԭ�����","ͼ602","9:40","���˻�");
		Teacher p = new Teacher(1,"κޱ","Ů",a);
		Teacher q = new Teacher(2,"��ˬ","Ů",b);
		Teacher r = new Teacher(3,"���˻�","��",c);
		Student t = new Student(1,"��ӱ","Ů","��");
		System.out.println(a + "\n" + p + "\n");
		System.out.println(b + "\n" + q + "\n");
		System.out.println(c + "\n" + r + "\n");
		
		System.out.println("ѡ��������1");
		Scanner i = new Scanner(System.in);
		String n = i.nextLine();
		switch (n){
		case "1":
			System.out.println("������γ̱��");
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
				System.out.println("�������");
				System.exit(-1);
			}
			break;
		default:
			System.out.println("��������");
			System.exit(-1);
		}
		System.out.println("�Ƿ��˿Σ���������1������0��");
		Scanner l = new Scanner(System.in);
		int f = l.nextInt();
		switch (f){
		case 1:
			t.setCourse("δѡ��");
			System.out.println(q);
			break;
		case 0:
			System.out.println("ѡ�γɹ�" + "\n" + t);
			break;
		default:
			System.out.println("�������");
			System.exit(-1);
		}
	}

	
}

package Exp2;

public class Student extends People{
	private String Course;
	public Student(int num,String name,String sex,String Course){
		super(num,name,sex);
		this.Course = Course;
	}
	public void setCourse(String Course){
		this.Course = Course;
	}
	public String toString(){
		return"ѧ�ţ�" + getNum() + "������" + getName() + "�Ա�" + getSex() + "��ѡ�γ̣�" + Course;
	}
}

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
		return"学号：" + getNum() + "姓名：" + getName() + "性别：" + getSex() + "所选课程：" + Course;
	}
}

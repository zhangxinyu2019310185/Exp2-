package Exp2;

public class Teacher extends People{
	Course a;
	Teacher(int num, String name, String sex, Course a){
		super(num, name, sex);
		this.a = a;
	}
	public String toString(){
		return"编号：" + getNum() + "姓名：" + getName() + "性别：" + getSex() + "课程名称：" + a.courseName;
	}
}

package Exp2;

public class Teacher extends People{
	Course a;
	Teacher(int num, String name, String sex, Course a){
		super(num, name, sex);
		this.a = a;
	}
	public String toString(){
		return"��ţ�" + getNum() + "������" + getName() + "�Ա�" + getSex() + "�γ����ƣ�" + a.courseName;
	}
}

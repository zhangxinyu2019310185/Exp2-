package Exp2;

public class People {
	private int num;
	private String name;
	private String sex;
	
	public People(int num,String name, String sex){
		this.num = num;
		this.name = name;
		this.sex = sex;
	}
	public People(int num,String name, String sex,Course a){
		
	}
	public int getNum(){return num;}
	public void setNum(int num){this.num = num;}
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	public String getSex(){return sex;}
	public void setSex(String sex){this.sex = sex;}
}
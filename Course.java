package Exp2;

public class Course{
	String number;
	String courseName;
	String place;
	String time;
	String teacherName;
	
	Course(String number,String courseName,String place,String time,String teacherName){
		setnumber(number);
		setCoursename(courseName);
		setPlace(place);
		setTime(time);
		setTeachername(teacherName);
	}
	
	public void setnumber(String number){
		this.number = number;
	}
	public void setCoursename(String Coursename){
		this.courseName = Coursename;
	}
	public void setPlace(String Place){
		this.place = Place;
	}
	public void setTime(String Time){
		this.time = Time;
	}
	public void setTeachername(String Teachername){
		this.teacherName = Teachername;
	}
	
	public String toString(){
		return "课程编号：" + number + "课程名称：" + courseName + "上课地点：" + place + "上课时间："+ time +"授课教师："+ teacherName;
	}
}
	
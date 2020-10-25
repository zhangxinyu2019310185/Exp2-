# Exp2-学生选课模拟系统  
## 实验目的  
1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2、掌握面向对象的类设计方法（属性、方法）；  
3、掌握类的继承用法，通过构造方法实例化对象；  
4、学会使用super()，用于实例化子类；  
5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 要求  
1、业务要求：  
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
2、实验要求：  
a.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
b.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
c.编写实验报告。
## 过程 
首先是Course类，由于该部分与People父类的关联度不高，故先创建，用于储存课程信息，之后创建People父类，用于储存全部人员，并实行调用，在分别编写Student与Teacher的子类，并用super()实例化子类，应用toString进行程序的复写，规定各个变量输出的位置，在test类中提前输入好部分课程信息，用Scanner对用户的操作进行捕捉，并判断，进而输出对应的信息。
## 流程图  
![流程图.png](https://i.loli.net/2020/10/25/q4M76tm5G3usiPJ.png)
## 核心代码与注释
### 利用scanner实现与用户的交互
```
System.out.println("选课请输入1");
		Scanner i = new Scanner(System.in);  // 扫描输入文本赋给i
		String n = i.nextLine();    //扫描到一行内容并作为一个字符串而被获取到,赋给n
		switch (n){
		case "1":
			System.out.println("请输入课程编号");
			Scanner d = new Scanner(System.in);
			int e = d.nextInt();
			switch (e){
			case 1:                     
        t.setCourse(a.courseName);  //扫描到用户输入1，则输出编号为1的课程信息
				break;
			case 2:
				t.setCourse(b.courseName);  //扫描到用户输入2，则输出编号为1的课程信息
				break;
			case 3:
				t.setCourse(c.courseName);  //扫描到用户输入3，则输出编号为1的课程信息
				break;
			default:
				System.out.println("输入错误");  //输入不存在的编号时为错误输入
				System.exit(-1);    //所有程序（方法，类等）停止，系统停止运行
			}
			break;
		default:
			System.out.println("操作错误");
			System.exit(-1);
		}
```
## 系统运行截图  
![结果截图.png](https://i.loli.net/2020/10/25/U6TyCo27QJpXeDq.png)
## 编程感想

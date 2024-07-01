package package1;
//Assigment1
public class Astudent 
{
int age,roll_no;
public void display1()
{
	System.out.println("Welcome all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[] args) {
	Astudent abc=new Astudent();
	abc.display1();
	abc.display2();
	abc.age=34;
	System.out.println(abc.age);
	abc.roll_no=06;
	System.out.println(abc.roll_no);
}
}

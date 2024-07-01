package package1;
//Class 2
public class Automation 
{
int rishu;
public void display()
{
	System.out.println("Welcome to Class second ");
}
public static void main(String[] args) {
	Automation ob=new Automation();
			ob.display();
	ob.rishu=12;
	System.out.println(ob.rishu);
	ob.rishu=234;
	System.out.println(ob.rishu);
}
}

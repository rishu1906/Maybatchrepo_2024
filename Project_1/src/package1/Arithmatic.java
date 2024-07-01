package package1;
//(10+2)(10-2)
public class Arithmatic 
{
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
}
public int sub(int a1,int b2)
{
	int d;
	d=a1-b2;
	System.out.println("sub result is "+d);
	return d;
}
public void mul(int e,int f)
{
	int k;
	k=e*f;
	System.out.println("final result is "+k);
}
public static void main(String[] args) {
	Arithmatic b=new Arithmatic();
	int sumresult=b.sum(10,2);
	int subresult=b.sub(10,2);
	b.mul(sumresult, subresult);
	
}
}

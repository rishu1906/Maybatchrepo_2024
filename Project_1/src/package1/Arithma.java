package package1;
//((((10+2)+2)-2)*2)/2)
public class Arithma 
{
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
}
public int sub(int c,int d)
{
	int e;
	e=c-d;
	System.out.println("sub result is "+e);
	return e;
}
public int mul(int x,int y)
{
	int z;
	z=x*y;
	System.out.println("mul result is "+z);
	return z;
}
public void div(int p,int q)
{
	int r;
	r=p/q;
	System.out.println("div result is "+r);
}
public static void main(String[] args) {
	Arithma a=new Arithma();
	int sumresult=a.sum(10,2);
	int sumresult1=a.sum(sumresult, 2);
	int subresult=a.sub(sumresult1, 2);
	int mulresult=a.mul(subresult, 2);
	a.div(mulresult, 2);
}
}

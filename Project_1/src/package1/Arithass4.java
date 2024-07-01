package package1;
//((((10*2)-2)+2)-2)/2)
public class Arithass4 
{
public int mul(int a,int b)
{
	int c;
	c=a*b;
	System.out.println("mul result is "+c);
	return c;
}
public int sub(int a1,int a2)
{
	int c2;
	c2=a1-a2;
	System.out.println("sub result is "+c2);
	return c2;
}
public int sum(int x,int y)
{
	int z;
	z=x+y;
	System.out.println("sum reuslt is "+z);
	return z;
}
public void div(int k,int l)
{
	int m;
	m=k/l;
	System.out.println("div result is "+m);
	
}
public static void main(String[] args) {
	Arithass4 b=new Arithass4();
	int mulresult=b.mul(10, 2);
	int subresult=b.sub(mulresult, 2);
	int sumresult=b.sum(subresult, 2);
	int subresult1=b.sub(sumresult, 2);
	b.div(subresult, 2);
}
}

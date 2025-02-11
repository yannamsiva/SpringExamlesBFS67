package methodwithparameters;

public class Calculate {

	void add(int x,int y)
	{
		int result=x+y;
		System.out.println("Adding of two numbers"+result);
	}
static	int sub(int x,int y)
	{
		int result=x-y;
		return result;
	}

static String display()
{
	return new String("shiva");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		c.add(100, 200);
		System.out.println(sub(500,100));
		int result=sub(60, 10);
	
	System.out.println("Sub Tracting of two numbers : "+result);
	System.out.println(display());
	}

}

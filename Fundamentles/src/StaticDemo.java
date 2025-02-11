
public class StaticDemo {

	//static varible/class varibles
	static int i=100;
	
	static void display()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Directly : "+i);
		display();
		System.out.println("using ClassName : "+StaticDemo.i);
		
		StaticDemo.display();
		
		StaticDemo demo=new StaticDemo();
		System.out.println("RefereceVarible : "+demo.i);
		
		demo.display();
		StaticDemo demo1=null;
		System.out.println("RefereceVarible : "+demo1.i);
		demo1.display();
		

	}

}

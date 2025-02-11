
public class B {

	void display()
	{
		System.out.println("display methods");
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B();
		b.display();
	}

}

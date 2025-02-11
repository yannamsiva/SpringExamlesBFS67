
public class SwapWithOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration&intialization
		//	int fno=100;int sno=200;
	int fno=100,sno=200;

	System.out.println("Before Swapping");
	System.out.println("Fno : "+fno +" Sno : "+sno);
	//swapping logic
	fno=fno+sno;// 100+200=300
	sno=fno-sno;//300-200=100
	fno=fno-sno;//300-100=200

	System.out.println("After Swapping");
	System.out.println("Fno : "+fno +" Sno : "+sno);

	}

}

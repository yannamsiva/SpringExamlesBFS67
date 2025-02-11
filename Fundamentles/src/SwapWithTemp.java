
public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaration&intialization
	//	int fno=100;int sno=200;
int fno=100,sno=200;

System.out.println("Before Swapping");
System.out.println("Fno : "+fno +" Sno : "+sno);
//swapping logic
int temp;
temp=fno;
fno=sno;
sno=temp;

System.out.println("After Swapping");
System.out.println("Fno : "+fno +" Sno : "+sno);


	}

}

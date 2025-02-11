
public class Emp {

	//non-static varibles/instance varibles
		int eno;
		String ename;
		double sal;
		float avg;

		void displayEmpDetails()
		{
			System.out.println(eno+"\t"+ename+"\t"+sal+"\t"+avg);

		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Emp emp=	new Emp();
		emp.displayEmpDetails();
	System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.avg);
	emp.eno=100;
	emp.ename="sirisha";
	emp.sal=25000;
	emp.avg=365.25f;
	emp.displayEmpDetails();

	System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.avg);


		}

	}


public class Employee {
	
	//non-static varibles/instance varibles
	int eno;
	String ename;
	double sal;
	float avg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee emp=	new Employee();
		
System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.avg);
emp.eno=100;
emp.ename="sirisha";
emp.sal=25000;
emp.avg=365.25f;
System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.avg);


	}

	

}

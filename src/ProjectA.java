import java.util.Scanner;
public class ProjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double salary;
		double sales;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input your name : ");		//รับค่าชื่อพนักงาน
		name = in.nextLine();						
		System.out.print("Input your salary : ");	//รับค่าเงินเดือนพนักงาน
		salary = in.nextDouble();					
		System.out.print("Input your sales : ");	//รับค่ายอดขายพนักงาน
		sales = in.nextDouble();
		
		CalCom cc = new CalCom(salary,sales);
		OutCom oc = new OutCom(name, cc.getCom());

	}

}

import java.util.Scanner;
public class ProjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double salary;
		double sales;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input your name : ");		//�Ѻ��Ҫ��;�ѡ�ҹ
		name = in.nextLine();						
		System.out.print("Input your salary : ");	//�Ѻ����Թ��͹��ѡ�ҹ
		salary = in.nextDouble();					
		System.out.print("Input your sales : ");	//�Ѻ����ʹ��¾�ѡ�ҹ
		sales = in.nextDouble();
		
		CalCom cc = new CalCom(salary,sales);
		OutCom oc = new OutCom(name, cc.getCom());
		oc.getOutCom();
	}

}

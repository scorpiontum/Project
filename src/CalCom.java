
public class CalCom {
	String name;
	double salary;
	double sales;
	double Commission;
	double compensation;
	
	public CalCom(double s,double sa) {
		this.salary = s;
		this.sales = sa;
	}
	
	public double getCom(){
		if(sales > 100000){
			Commission = sales*0.03;
		}else if(sales > 50000){
			Commission = sales*0.02;
		}else{
			Commission = sales*0.01;
		}
		compensation = salary+Commission;
		return compensation;
	}
}

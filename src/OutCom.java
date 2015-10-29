
public class OutCom {
	String name;
	double compensation;
	
	public OutCom(String n,double com) {
		this.name = n;
		this.compensation = com;
	}
	
	public void getOutCom(){
		System.out.println("\nname : "+name);
		System.out.println("Commpensation : "+compensation);
	}
	
}

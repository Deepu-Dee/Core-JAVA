
public class Sbi extends Rbi {
	int Slno;
	static String Branchname="SBI Tumkur";
	public String Managername;
	String Location;
	public int PinCode;
	long Contactnumber;
	boolean Provideshouseloan;
	static final float ROI=15.5f;
	
	public void Rbi() {
		System.out.println("Slno= "+Slno);
		System.out.println("BranchName= "+Branchname);
		System.out.println("ManagerNmae= "+Managername);
		System.out.println("Location= "+Location);
		System.out.println("PincCode= "+PinCode);
		System.out.println("Contactnumber= "+Contactnumber);
		System.out.println("Provides House Loan="+Provideshouseloan);
		System.out.println("Sbi ROI= "+ROI);

}
}


public class Tester {
	public static void main(String[] args) {
		Rbi rbi=new Rbi();
		rbi.Slno=01;
		rbi.Managername="Kumar";
		rbi.Location="Tumkur";
		rbi.PinCode=572106;
		rbi.Contactnumber=9606643321L;
		rbi.Provideshouseloan=true;
		rbi.Rbi();
		
		System.out.println("************");
	
		Sbi sbi=new Sbi();
		sbi.Slno=02;
		sbi.Managername="Ram";
		sbi.Location="Tumkur";
		sbi.PinCode=572106;
		sbi.Contactnumber=9980369438L;
		sbi.Provideshouseloan=true;
		sbi.Rbi();
		
		System.out.println("************");
		
		Rbi rbi1=new Sbi();
		rbi1.Slno=01;
		rbi1.Managername="Kumar";
		rbi1.Location="Tumkur";
		rbi1.PinCode=572106;
		rbi1.Contactnumber=9606643321L;
		rbi1.Provideshouseloan=true;
		rbi1.Rbi();
		
	}

}

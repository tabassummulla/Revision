package exp;

public class Accounts {

	public float calculateNetSalary(int salary, int absents) throws AbsentException {
		
		float net = 0;
		
		if (absents>=4) {
			
			AbsentException a = new AbsentException();
			throw a;
		
		}
		else {
			
			net = salary * 15/100;
		}
		
	return absents;
	
	
}

}
package exp;

public class SalesReport {
		
  public static void main(String args[]) {
	  
	  
			 float n;
			 
			 Accounts a = new Accounts();
			 
	try {
				n = a.calculateNetSalary(1000, 5);
		
			} catch(AbsentException e) {
		
					System.out.print("No more than 4 absents");
		
				}
		}  
		  
		  
		  
		  
		  
	  }
		
	
	


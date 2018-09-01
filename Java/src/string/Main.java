package string;

public class Main {

	public static void main(String args[]) {
		
		print("Hello my friend");
		System.out.println(" ");
		printReverse("Hello my friend");
		
		
	}
	
	
	public static void print(String s) {
		
		for(int i =0; i< s.length(); i++) {
		
			String sub = s.substring(i, i+1);
			
			if(sub.equals(" ")) {
				System.out.println();
			}
			else {
				System.out.print(sub);
			}
		
	}
	}
		
	public static void printReverse(String y) {
	
		String temp = "";
		String word ="";
	
		for(int i = y.length()-1; i>=0; i--) {
			
			String sub2 = y.substring(i, i+1);
			
			if(sub2.equals(" ")) {
				
				System.out.println(word);
				word = "";
			}
			
			else {
			
				word = sub2 + word;
			}
			
		}
		System.out.println(word);
	} 
}
		
	
	
	
	
		
	
	


	
	
		
		
		
		


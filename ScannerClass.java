import java.util.Scanner;  

class ScannerClass{    
	public static void main(String args[]){ 
		/* Scanner is a class of java.util package */  
		Scanner sc = new Scanner(System.in);    
		System.out.println("Enter Hobbies "); 

		/*next() is a method of scanner class 
		which takes input from keyboard */   
		
		String hobbies = sc.next();    
		System.out.println("Your Hobbies are " +hobbies);    
	}  
}
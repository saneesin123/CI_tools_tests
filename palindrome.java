import java.util.Scanner;

class CheckNumberPalindromeOrNotPalindromeClass{
	public static void main(String[] args){
		//rev variable is used to store reverse of actual_num
		//actual_num contains number accepted from user
		//temp_num variable is used for temporary purpose due to inconsistency
		int rev = 0, rem,actual_num,temp_num;

		//create Scanner class object
		Scanner sc = new Scanner(System.in);

		//Display input for user
		System.out.println("Enter any number :");

		//Accept input from keyboard
		actual_num = sc.nextInt();
		temp_num = actual_num;

		while(temp_num > 0){
			//Store remainder
			rem = temp_num % 10;
			// Store number in reverse form
			rev = rev*10+rem;
			//Truncate last digit from number
			temp_num = temp_num/10;
		}

		//actual_num value and rev value matches it means 
		//number palindrome otherwise not palindrome
		if(rev == actual_num)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}
}

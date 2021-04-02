public class Principal
{
	public static void main(String[]args)
    {
	
		if ( args.length == 1 )
		{
			String motAverifier = args[0] ; // args[0] correspond a l'argument 2 de la commande java
		
			boolean isPalindrome = Palindrome.is_palindrome(motAverifier) ;
		
			System.out.println("----------------------------------------------------");
			System.out.println("Input : " + motAverifier + " >>> Output : " + isPalindrome );		
			System.out.println("----------------------------------------------------");		
		}

}

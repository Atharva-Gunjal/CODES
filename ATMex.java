import java.util.Scanner;

public class ATMex
{
    public static void main(String[] args) 
    {
        String ATMPin = "1234";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your ATM PIN: ");
        String enteredPin = scanner.nextLine();
        
        if (enteredPin.equals(ATMPin)) 
        {
            System.out.println("PIN is valid");
        } 
        else 
        {
            System.out.println("Invalid PIN ");
        }
        
    }
}

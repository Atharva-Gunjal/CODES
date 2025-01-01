import java.util.Scanner;

public class AGBankEx 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String accountHolderName = "Atharav Gunjal";
        double balance = 10000; 
        
        System.out.println("******Welcome to AG Bank******");
        System.out.println("Account Holder:- " + accountHolderName);
        System.out.println("Initial Balance:-" + balance);
        
        int choice = 0;
        
        while (choice != 4) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited: " + deposit);
                    break;
                    
                case 2: 
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrew: " + withdraw);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                    
                case 4: 
                    System.out.println("Thank you ");
                    break;
                    
                default:
                    System.out.println("Invalid option!!!! Try again.");
            }
        }
    }
}
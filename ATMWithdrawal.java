import java.util.Scanner;
class InsufficientFundsException extends Exception
{
    InsufficientFundsException(String message)
    {
        super(message);
    }
}

class ATM
{
    private double balance = 5000;
    public ATM()
    {
        System.out.println("Your current balance is:" +balance);
    }




    void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance)
        {
            throw new InsufficientFundsException("Insufficient balance: Your Balance is: $" +balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful:");
        System.out.println("Your new balance is :" +balance);
    }

}

public class ATMWithdrawal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        try{
            System.out.println("Enter withdrawl amount");
            double amount = sc.nextDouble();
            atm.withdraw(amount);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Transaction Failed" +e.getMessage());
        }
        catch (RuntimeException e)
        {
            System.out.println("Invalid input: Please enter a valid number" +e.getMessage());
        }
        finally
        {
            sc.close();
        }

    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        try
        {
        //inputs from user below
        System.out.println("Please enter loan amount");
        int loanAmount = scanner.nextInt();
        System.out.println("Please enter rate ");
        int rate = scanner.nextInt();
        System.out.println("Please enter years ");
        int years = scanner.nextInt();

        //calculation below
        double repayment;

        int interest = loanAmount * (rate/100);
        repayment = (loanAmount + interest) / years / 12;
        System.out.println(repayment);
        }
        catch (ArithmeticException arthex)
        {
            System.out.println("Error: "+ arthex.getMessage());
        }
        catch (InputMismatchException exMismatch)
        {
            System.out.println("Please enter number only: ");
        }
        catch (Exception ex)
        {
            System.out.println("Err " + ex.getMessage());
        }
        finally {
            scanner.close();
        }

    }
}
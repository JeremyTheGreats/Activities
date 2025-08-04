
package Activities;

import java.util.Scanner;
import Verify.bankapp;

public class BankingApplication {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        bankapp bank = new bankapp();
        int attemp = 0;
        
        System.out.println("WELCOME TO MY SYSTEM! ");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter your choice : ");
        int choice = in.nextInt();
        
            switch( choice ){
                case 1:
                    while( attemp != 3 ){
                        
                        System.out.print("Enter Account No : ");
                        int acc = in.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = in.nextInt();

                            if (bank.verify_account(acc, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                System.out.println("Invalid Account No or Pin!");
                                attemp++;
                            }
                            
                            if ( attemp == 3 ){
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                
            }
    }
}

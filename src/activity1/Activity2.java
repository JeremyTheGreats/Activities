
package activity1;

import java.util.Scanner;

public class Activity2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float totalhour;
        float contribution;
        
        System.out.print("Enter employee name: ");
            String name = in.nextLine();
        
        System.out.print("Enter  hourly rate : ");
            float hour = in.nextInt();
        
        System.out.print("Enter total hour worked this week : ");
            float week = in.nextInt();
        
        totalhour = hour * week;
        contribution = (float) (totalhour * 0.1);
        
        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee : " + name );
        System.out.printf("Hourly Rate : ₱%.2f\n", hour );
        System.out.printf("Hours Worked : %.0f", week );
        System.out.printf("Gross Weekly : ₱%.2f\n", totalhour);
        System.out.printf("SSS Contribution (10%%) : ₱%.2f\n", contribution );
        System.out.println("-----------------------------------------------");
        System.out.printf("Net Weekly Wage : ₱%.2f\n", totalhour - contribution );
        
    }
}

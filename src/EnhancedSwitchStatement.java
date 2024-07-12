package src;

import java.util.Scanner;

public class EnhancedSwitchStatement {
    public void enhancedSwitchCase(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Old switch statement
        switch (input){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
        //Enhanced switch statement
        switch(input){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            // rest of the days
            default -> System.out.println("Wrong input");
        }

    }
}

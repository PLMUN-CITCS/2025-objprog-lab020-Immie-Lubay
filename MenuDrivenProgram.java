import java.util.Scanner;

public class MenuDrivenProgram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int displayMenu;
        
        System.out.println("Enter your choice (1-3): ");
        displayMenu = input.nextInt();
        
       while (displayMenu < 1 || displayMenu > 3) {
           System.out.println("Error! Try another number between 1-3");
           displayMenu = input.nextInt();
       }  
    } 
    public static void handleMenuChoice(int displayMenu, Scanner input); {
        if (displayMenu == 1) {
            greetUser();
        } else if (displayMenu == 2) {
            checkEvenOdd();
        } else
            System.out.println("Exiting the program, goodbye!");
            System.exit(0);
    }
    
    public static void greetUser() {
            System.out.println("Hello! Welcome!");
    }
        
    public static void checkEvenOrOdd() {
            System.out.println("Enter an integer");
                if (displayMenu % 2 == 0){
                    System.out.println(displayMenu + "is an Even number.");
                } else {
                    System.out.println(displayMenu + "is an Odd number.");
                }  
        }
    }

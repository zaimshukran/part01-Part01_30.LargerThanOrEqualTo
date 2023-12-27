
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int input = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number: ");
        int input2 = Integer.parseInt(scan.nextLine());
        
        if(input > input2){
            System.out.println("Greater number is: " + input);
        }else if(input2 > input){
            System.out.println("Greater number is: " + input2);
        }else if(input == input2){
            System.out.println("The numbers are equal!");
        }
        
    }
}

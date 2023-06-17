import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;


/**
 *Reads a list of integer numbers from the input and saves them into a 
 *Stack sorted from smallest to largest.
 * @author kmacr
 */
public class Stacks {

    /**
     * @param args the command line arguments
     * Reads a list of integer numbers from the input and saves them into a 
     * Stack then sorts the list from smallest to largest.
     */

    
    public static void main(String[] args) {
        /**
         * Create a scanner 
         * Instantiate a Stack 
         * Iterate 10x pushing each integer to the stack
         * Sort the stack then print it out. 
         */

        Scanner intIn = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Enter 10 numbers please: ");
    
        for (int i = 0; i<10; i++){
            int newInt = intIn.nextInt();
            integerStack.push(newInt);        
        }
        intIn.close();
        System.out.println("This is the original list: " + integerStack);
        
        Collections.sort(integerStack);
        
        System.out.println("Here is the sorted list: " + integerStack);

    }
 
}


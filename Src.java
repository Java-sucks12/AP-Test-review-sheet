//this is going to be the main part of the program and I will be writing notes behind each example

//imports all from the util library so you do not have to import anything else.
import java.util.*;


//class name must be equal to the file name
public class Src
{

    //don't worry about this too much but you must put it in the main file.
    public static void main(String[] args){
        
        //basic print
        System.out.println("Hello world");
        //or
        System.out.print("Hello");
        
        //getting user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String str = input.nextLine();
        double dbl = input.nextDouble();
        
    }
    
    
    
    //example of having functions in the main class
    //You must declare it as static!
    //always declare variable type before passing it as a argument.
    
    public static void print(String a)
    {
        System.out.println(a);
    }
    
}

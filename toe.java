import java.util.Scanner;
import java.util.Random;
public class toe{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     Random random = new Random();
        int ticket1 = random.nextInt(24) +1;
    int ticket2 = random.nextInt(24) +1;
    int ticket3 = random.nextInt(24) +1;
    //tickets are generated, with a limit between 1 and 24. +1 at the end so no zeroes are generated
    int matchCounter = 0;
    //matchCounter is a function that will be used to determine how many times the tickets match the user input
    System.out.println("The ticket values are: " +ticket1+", " +ticket2+ ", " +ticket3+ "."); 
    //print the prized tickets
    System.out.println("Please insert your first number:");
    int firstNumber = scanner.nextInt();
    while (firstNumber<1 || firstNumber>24)  {
         
        System.out.println("Please insert a valid first number:");
         firstNumber = scanner.nextInt();
    //while loop to prevent the user input to be less than 1 and bigger than 24  
    }
    if (firstNumber == ticket1 || firstNumber == ticket2 || firstNumber == ticket3) {matchCounter++;
    /* if function to compare if the input matches any of the prize number. Add +1 to the counter if that
     is the case.*/
    }
 
     
    System.out.println("Please insert your second number:");
    int secondNumber = scanner.nextInt();
    while (secondNumber<1 || secondNumber>24 || secondNumber == firstNumber)   {
    /*This while loop does the same as the first one but also won't let the second input be the same as the
      first one. Rinse and repeat with the third input*/
        System.out.println("Please insert a valid second number:");
        secondNumber = scanner.nextInt();
         
    }
    if (secondNumber == ticket1 || secondNumber == ticket2 || secondNumber == ticket3) {matchCounter++;
     
    }
     
     
     
     
    System.out.println("Please insert your third number:");
    int thirdNumber = scanner.nextInt();
    while (thirdNumber<1 || thirdNumber>24 || thirdNumber == firstNumber || thirdNumber == secondNumber)  {
        System.out.println("Please insert a valid third number:");
        thirdNumber = scanner.nextInt();}
    if (thirdNumber == ticket1 || thirdNumber == ticket2 || thirdNumber == ticket3 ) {matchCounter++;}
    
    switch(matchCounter) { 
    case(0):System.out.println("You didn't win anything");
    break;
    case(1):System.out.println("You won one prize");
    break;
    case(2):System.out.println("You won two prizes");
    break;
    case(3):System.out.println("You won three prizes");
    break;
    /*This is a switch function for the matchCounter integer, depending on how many times the user input matched 
      the prized ticket*/
        }
    }
}

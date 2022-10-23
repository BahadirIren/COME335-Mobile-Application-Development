/*
Write program that generate 10 random number between 0-20 and calculated the sum of these numbers.
*/

import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		sumOfNumbers();
	}
	
	static void sumOfNumbers(){
        int sum= 0, upperBound = 21;
        Random random = new Random();
        
        System.out.print("Random numbers [0-20]: ");
        for(int i = 0; i < 10; i++){
            Integer randomNumber = random.nextInt(upperBound);
            String message = i == 9 ? randomNumber.toString() : randomNumber +", ";
            System.out.print(message);
            
            sum += randomNumber;
        }
    
        System.out.println("\nSum of the these numbers: " + sum);
    }
}

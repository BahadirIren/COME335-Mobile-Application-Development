/*
Write a program that uses this array => int[] array = {6, -9, 2, 0, -4, 1, 7}. 
    - The Program calculates that average of only the first and last number and find that
        this average is less than or greater than the middle element. 
*/

public class Main{
    
	public static void main(String[] args){
        int[] array1 = {6, -9, 2, 0, -4, 1, 7};
        
        solve(array1);
    }
    
    static void solve(int[] array){
        int firstElement = array[0], lastElement = array[array.length -1];
        float middleElementOfArray = findMiddleElementOfArray(array);
        float averageOfFirstAndLast = (float) (firstElement + lastElement) / 2;
        
        String message;
        if(averageOfFirstAndLast > middleElementOfArray){
            message = "Average of first and last is greater than middle element of array";
        }else if(middleElementOfArray == averageOfFirstAndLast){
            message = "Average of first and last is equal to middle element of array";
        }else{
            message = "Average of first and last is less than middle element of array";
        }
        
        System.out.println("Average of first and last: "+ averageOfFirstAndLast);
        System.out.println("Middle element of array: "+ middleElementOfArray);
        System.out.println(message);
    }
    
    static float findMiddleElementOfArray(int[] array){
        int lengthOfArray = array.length;
        float middleElement;
        
        if(lengthOfArray % 2 == 0){
            
            middleElement = (float) (array[((lengthOfArray / 2) - 1)] + array[(lengthOfArray /2)]) / 2;
        }
        else{
            middleElement = (float) array[(int) (lengthOfArray / 2)];
        }
        return middleElement;
    }
}

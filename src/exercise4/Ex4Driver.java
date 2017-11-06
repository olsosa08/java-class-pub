package exercise4;
/**
 * @author Sam Olson
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Ex4Driver {
  /*
  Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task1(Integer);
Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task2(String);
Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task3(Character);
Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
public Character task4(String);
Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task5(Integer, Integer);
Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
public Character task6(String, Integer);
Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task7(Integer[]);
Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
public Boolean task8(Integer[], Integer);
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task9(ArrayList<String>);
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task10(HashMap<>);
  */
    // Adds one to the given number
    public static int task1(int i){
        return i+1;
    }
    // Checks to see if the number is even
    public static boolean task1isEven(int i){
        return i % 2 == 0;
    }
    // Checks to see if the number is divisible by 5
    public static boolean tastk1Div5(int i){
        return i % 5 == 0;
    }
    // Gives the length of the given string
    public static int task2(String aString){
        int length = aString.length();
        return length;
    }
    // Checks to see if the string is shorter than 5 characters
    public static boolean task2ShortWord(int i){
        return i < 5;
    }
    //Checks to see if the length of the string is odd
    public static boolean task2isOdd(int i){
        return i % 2 != 0;
    }
    // Assigns a numerical value to the character that is given
    public static int task3(char letter){
        int lettInt = Character.getNumericValue(letter);
        return lettInt;
    }
    //Checks to see if the characters values is prime
    public static boolean task3IsPrime(int i){
        for(int j = 2; 2*j < i; j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
    //Checks to see if the characters value is 7
    public static boolean task3Is7(int i){
        return i == 7;
    }
    //Returns the first letter of the given string
    public static char task4(String astring){
        char firstLetter = astring.charAt(0);
        return firstLetter;
    }
    //Checks if the character is a letter
    public static boolean task4IsChar(char c){
        return Character.isLetter(c);
    }
    //Checks if the values of the character is greater than 20
    public static boolean task4BigValue(char c){
        int cVal = Character.getNumericValue(c);
        return cVal > 20;
    }
    //Multiplies the two integers together
    public static int task5(int i, int j){
        return i * j;
    }
    //Checks if the result of the two numbers is a perfect square square
    public static boolean task5IsPower(int i){
        int sqrt = (int) Math.sqrt(i);
        if(sqrt*sqrt == i){
            return true;
        }
        else{
            return false;
        }
    }
    //Checks if it is divisible by three
    public static boolean task5IsDiv3(int i){
        return i % 3 == 0;
    }
    //Takes the legnth of the string and adds the int and turns the resulting value into a char
    public static char task6(String astring, int i){
        int legnth = astring.length();
        legnth += i;
        return (char) legnth;
    }
    // Checks if character value of the character is equal to the character.
    public static boolean task6CharCheck(char c, int len){
        int cVal = Character.getNumericValue(c);
        boolean result = false;
        if(cVal == len){
            result = true;
        }
        return result;
    }
    //Checks if the character is a letter
    public static boolean task6isLetter(char c){
        return Character.isLetter(c);
    }
    //Sums all of the values in the array
    public static int task7(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    //Checks if the value is an integer
    public static boolean task7IsInt(int i){
        boolean result = false;
        if (i == (int)i){
            result = true;
        }
        return result;
    }
    //Tests if the result is divisble by 7
    public static boolean task7Div7(int i){
        return i % 7 == 0;
    }
    //Checks if the number given is in the array
    public static boolean task8(int[] arr, int i){
        boolean result = false;
        for(int z = 0; z < arr.length; z++){
            if(arr[z] == i){
                result = true;
            }
        }
        return result;
    }
    //Checks to the result of the function
    public static boolean task8IsIn(boolean b){
        boolean ans = false;
        if(b == true){
            ans = true;
        }
        return ans;
    }
    // Returns the size of the arraylist
    public static int task9(ArrayList<String> aList){
        int aListSize = aList.size();
        return aListSize;
    }
    //Checks if the size is correct from the output
    public static boolean task9IsRightSize(int i, ArrayList<String> aList){
        boolean result = false;
        if (i == aList.size()){
            result = true;
        }
        return result;
    }
    //
    public static boolean task9IsInt(int i){
        boolean result = false;
        if (i == (int)i){
            result = true;
        }
        return result;
    }
    public static int task10(HashMap<Integer,String> hm){
        hm.put(10, "foo");
        hm.put(40, "shoo");
        return hm.size();
    }
    public static boolean task10IsRightSize(int i, HashMap<Integer,String> hm){
        boolean result = false;
        if (i == hm.size()){
            result = true;
        }
        return result;
    }
    public static boolean task10Contains(HashMap<Integer,String> hm){
        return hm.containsKey(10);
    }
}

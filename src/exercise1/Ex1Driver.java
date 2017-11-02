package exercise1;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;
import java.util.Arrays;
/**
 * @author Sam Olson
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.print("---Task 1---\n");
    System.out.print("Hello World\n\n");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
      System.out.print("---Task 2---\n");
    for (int i=1; i<=100; i++){
        int mod_3 = i % 3;
        int mod_5 = i % 5;
        String num = Integer.toString(i);
        int mod_3_and_5 = mod_3 + mod_5;
        if(mod_3 == 0) {
        System.out.print("foo\n");
        }else if (mod_5 == 0) {
            System.out.print("bar\n");
        }else if (mod_3_and_5 == 0){
            System.out.print("huh\n");
        }else {
            System.out.print(num+"\n");
        }
    }
    }   
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
      System.out.print("---Task 3---\n");
      int counter = 0;
    for (int i=1; i<=100; i++){
        int mod_7 = i % 7;
        if(mod_7 == 0){
            counter = counter + i;  
    }
    }
    System.out.print("The sum of all multiples of 7 between 1 and 100 is "+ counter);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.print("\n---Task 4---\n");
    int sum = 0;
    BigInteger product_sum = new BigInteger("1");
    for(int i=1; i<=20; i++){
       sum = sum + i;
    }
   System.out.print("The sum of all numbers between 1 and 20 is "+ sum);
   for(int i=1; i<=20; i++){
       product_sum = product_sum.multiply(new BigInteger(i + ""));
   }
    System.out.print("\nThe product of all numbers between 1 and 20 is " + product_sum);
    }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.print("\n---Task 5---");
    Scanner input = new Scanner(System.in);
    System.out.print("\nPlease enter your full name\n");
    String name = input.nextLine();
    System.out.println("Your initials are " +name.replaceAll("(?<=\\w)\\w+(?<=\\w)", ""));
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.print("---Task 6---\n");
    int[] square ={0,1,2,3,4,5,6,7,8,9};
    for (int i = 0; i < square.length; i++){
        square[i] = (int) Math.pow(square[i], 3);
    }
    for (int z = 0; z < square.length; z++){
        System.out.print(square[z] + " ");
    }
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.print("\n---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    Scanner num = new Scanner(System.in);
    System.out.println("\nEnter a number");
    int input = num.nextInt();
    int[] temp = new int[100];
    for(int i = 0; i < temp.length; i++){
        temp[i] = (int) (Math.random() * 100);
    }
    boolean result = false;
    for (int i : temp){
        if(i == input){
            result = true;
        }
    }
    if(result == true){
        System.out.println(input+" was found in the array");
    }
    else if(result == false){
      System.out.println(input+" was NOT found in the array");
  }
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println("---Task 8---");
    int sum = 0;
    for(int i = 0; i < numbers.length; i++){
        sum = sum + numbers[i];
    }
    String array = Arrays.toString(numbers);
    System.out.printf("The sum of all items in %s is %d",array, sum);
    return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.print("\n---Task 9---");
    boolean answer = true;
    Scanner inputword = new Scanner(System.in);
    System.out.println("\nPlease enter a word");
    String word = inputword.nextLine();
    for(int i =0; i < word.length()-1; i++){
        if(word.charAt(i) >= word.charAt(i+1)){
            answer = false;
            break;
        }
    }
    if(answer == true){
        System.out.printf("Letters of %s are in order", word);
    }
    else if(answer == false){
        System.out.printf("Letters of %s are NOT in order", word);
    }
    return answer;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println("\n---Tast 10---");
    System.out.println("Prime numbers between 1 and 100");
    boolean[] primes = new boolean[100 + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > 100) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < 100 + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.printf("%d ",i);
           }
       }
   }

  }

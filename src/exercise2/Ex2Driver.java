package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("---Task 1---");
      Random randNum = new Random();
      int headCount = 0;
    while(headCount != n){
        int result = randNum.nextInt(2);
        if(result == 0){
            headCount = headCount + 1;
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
            headCount = 0;
        }
  }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    System.out.println("---Task 2---");
    boolean test = true;
    while(test == true){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > n){
                test = true;
            }
            else if(arr[i] < n){
                test = false;
            }
        }
    }
    return test;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    System.out.println("---Task 3---");
    int threshcount = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < threshold){
            threshcount++;
        }
    }
    return threshcount;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println("---Task 4---");
    Arrays.sort(arr);
    int max = arr[arr.length - 1];
    int diff = 100 - max;
    for(int i = 0; i < arr.length; i++){
        arr[i] = arr[i] + diff;
    }
    System.out.print(Arrays.toString(arr));
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    System.out.println("\n---Task 5---");
    int aCounter = 0;
    int bCounter = 0;
    int cCounter = 0;
    int dCounter = 0;
    int fCounter = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] >= 90){
            aCounter ++;
        }
        else if(arr[i] >= 80){
            bCounter ++;
        }
        else if(arr[i] >= 70){
            cCounter ++;
        }
        else if(arr[i] >= 60){
            dCounter ++;
        }
        else if(arr[i] >= 50){
            fCounter ++;
        }
    }
    System.out.printf("A: %d, B: %d, C: %d, D: %d, F: %d", aCounter, bCounter, cCounter, dCounter, fCounter);
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    System.out.println("\n---Task 6---");
    ArrayList<Double> arr = new ArrayList();
    Scanner input = new Scanner(System.in);
    while(true){
        System.out.println("Enter a number:");
        double adder = input.nextDouble();
        if(adder == 0){
            arr.add(adder);
            break;
        }
        else{
            arr.add(adder);
        }
    }
    System.out.print(Arrays.toString(arr.toArray()));
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    System.out.println("\n---Task 7---");
    ArrayList<Integer> arr = new ArrayList<Integer>(10);
    Random rn = new Random();
    for(int i = 0; i < 10; i++){
        arr.add(rn.nextInt(100-50)+50);
    }
    System.out.println(Arrays.toString(arr.toArray()));
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println("---Task 8---");
    int counter = 0;
    for(int i = 0; i < arrLst.size(); i++){
        if(arrLst.get(i) < threshold){
            counter++;
        }
    }
    return counter;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    int [][] multi = new int[10][10];
    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            multi[i][j] = (i+1) * (j+1);
        }
    }
    return multi;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    System.out.println("---Task 10---");
    int rowCount = 0;
    int columnCount = 0;
    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            rowCount += matrix[i][j];
            columnCount += matrix[j][i];
        }
    }
    System.out.printf("Row sum: %d Column sum: %d", rowCount, columnCount);
  }

}

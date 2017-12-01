package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    private ArrayList<Book> catalogue = new ArrayList<>();

  public BookShop() {
      this.catalogue = catalogue;
  }
  
  public BookShop(String filename) throws FileNotFoundException {
     String line = "";
     String splitBy = ",";
     
     try{
         File file = new File(filename);
         BufferedReader br = new BufferedReader(new FileReader(file));
         while ((line = br.readLine()) != null){
             String[] book = line.split(splitBy);
             catalogue.add(new Book(book[0], book[1], Double.parseDouble(book[2]), Integer.parseInt(book[3])));
         }
         
     }
     catch(FileNotFoundException e1){
         throw new FileNotFoundException();
     }
     
     catch(IOException e2){
     }
  }
  
  public BookShop(BookShop anotherBookShop) {
      ArrayList<Book> newCata = new ArrayList<>();
      for(int i = 0; i < anotherBookShop.size(); i++){
          Book temp = anotherBookShop.getCatalog().get(i);
          Book bookCopy = new Book(temp);
          newCata.add(bookCopy);
      }
      this.catalogue = newCata;
  }
  
  public void addNewTitle(Book book) {
      catalogue.add(book);
  }
  
  public int size() {
      return catalogue.size();
  }
  
  public void discountAll(Double discountPercent) {
      for(int i = 0; i<catalogue.size(); i++){
          double oldPrice = catalogue.get(i).getPrice();
          catalogue.get(i).setPrice(oldPrice - (oldPrice * (discountPercent/100)));
  }
  }
  
  public void printCatalog() {
      for(int i = 0; i<catalogue.size(); i++){
          String output = catalogue.get(i).toString();
          System.out.print(output + "\n");
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalogue, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalogue;
  }

}

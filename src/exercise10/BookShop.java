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

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    private ArrayList<Book> catalogue = new ArrayList<Book>();

  public BookShop() {
      this.catalogue = catalogue;
  }
  
  public BookShop(String filename) throws FileNotFoundException {
     
  }
  
  public BookShop(BookShop anotherBookShop) {
      this.catalogue = anotherBookShop.catalogue;
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
          catalogue.get(i).setPrice(oldPrice * discountPercent);
  }
  }
  
  public void printCatalog() {
      for(int i = 0; i<catalogue.size(); i++){
          String output = catalogue.get(i).toString();
          System.out.println(output);
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalogue, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalogue;
  }

}

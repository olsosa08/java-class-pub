package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author yasiro01
 */
public class Chart {
    private HashMap<Integer, Song> theMap = new HashMap<Integer, Song>();
    
    public Chart(String fileName){
        String line = "";
        String splitBy = ",";
        
        try{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null){
            String[] songPar = line.split(splitBy);
            Song temp = new Song(songPar[1], songPar[2]);
            theMap.put(Integer.parseInt(songPar[0]), temp);
            
        }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public Song getSong(int i) {
        return theMap.get(i);
    }
    
}

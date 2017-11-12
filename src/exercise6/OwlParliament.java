package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private HashSet h = new HashSet();
    
   public OwlParliament(String fileName){
       String line = "";
        String splitBy = ",";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                String[] crw = line.split(splitBy);
                if(crw[2].equals("Owl")){
                    h.add(new Owl(crw[0],Integer.parseInt(crw[1])));
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
   }
   public int size(){
       return h.size();
   }
   public Owl getChief(){
        int[] age = new int[h.size()];
        Iterator<Owl> itr = h.iterator();
        Owl[] array = new Owl[h.size()];
        int counter = 0;
        while(itr.hasNext()){
            Owl temp = itr.next();
            age[counter] = temp.getAge();
            array[counter] = temp;
            counter ++;
        }
        Arrays.sort(age);
        int maxAge = age[age.length-1];
        Owl ans = null;
        for(int i = 0; i < array.length; i++){
            Owl k = array[i];
            int num = k.getAge();
            if(maxAge == num){
            ans = array[i];
            }
        }
        return ans;
    }
}

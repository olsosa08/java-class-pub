package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private HashSet h = new HashSet();
    
   public LemurConspiracy(String fileName){
       String line = "";
        String splitBy = ",";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                String[] crw = line.split(splitBy);
                if(crw[2].equals("Lemur")){
                    h.add(new Lemur(crw[0],Integer.parseInt(crw[1])));
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
   public Lemur getChief(){
        int[] age = new int[h.size()];
        Iterator<Lemur> itr = h.iterator();
        Lemur[] array = new Lemur[h.size()];
        int counter = 0;
        while(itr.hasNext()){
            Lemur temp = itr.next();
            age[counter] = temp.getAge();
            array[counter] = temp;
            counter ++;
        }
        Arrays.sort(age);
        int maxAge = age[age.length-1];
        Lemur ans = null;
        for(int i = 0; i < array.length; i++){
            Lemur k = array[i];
            int num = k.getAge();
            if(maxAge == num){
            ans = array[i];
            }
        }
        return ans;
    }
}

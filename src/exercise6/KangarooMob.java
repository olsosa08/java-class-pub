package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private HashSet h = new HashSet();
    
    public KangarooMob(String fileName){
        String line = "";
        String splitBy = ",";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                String[] crw = line.split(splitBy);
                if(crw[2].equals("Kangaroo")){
                    h.add(new Kangaroo(crw[0],Integer.parseInt(crw[1])));
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
    
    public Kangaroo getChief(){
        int[] age = new int[h.size()];
        Iterator<Kangaroo> itr = h.iterator();
        Kangaroo[] array = new Kangaroo[h.size()];
        int counter = 0;
        while(itr.hasNext()){
            Kangaroo temp = itr.next();
            age[counter] = temp.getAge();
            array[counter] = temp;
            counter ++;
        }
        Arrays.sort(age);
        int maxAge = age[age.length-1];
        Kangaroo ans = null;
        for(int i = 0; i < array.length; i++){
            Kangaroo k = array[i];
            int num = k.getAge();
            if(maxAge == num){
            ans = array[i];
            }
        }
        return ans;
    }
}

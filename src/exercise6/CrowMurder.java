package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private ArrayList<Crow> crowList = new ArrayList();
    
    public CrowMurder(String fileName){
        String line = "";
        String splitBy = ",";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                String[] crw = line.split(splitBy);
                if(crw[2].equals("Crow")){
                    crowList.add(new Crow(crw[0],Integer.parseInt(crw[1])));
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
        return crowList.size();
    }
    
    public Crow getChief(){
        int[] age = new int[crowList.size()];
        for(int i = 0; i < crowList.size(); i++){
            age[i] = crowList.get(i).getAge();
        }
        Arrays.sort(age);
        int maxAge = age[age.length-1];
        Crow ans = null;
        for (int j = 0; j < crowList.size(); j++){
            int temp = crowList.get(j).getAge();
            if(temp == maxAge){
                ans = crowList.get(j);
            }
        }
        return ans;
    }
}

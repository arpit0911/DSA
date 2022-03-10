package maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();  
        map.put(1,"Arpit"); //* to add key-value paries in the map
        map.put(2,"prateek");
        map.put(4,"akhil");
        map.put(5,"shivangi");
        map.put(3,"rajat");

        System.out.println(map); // * to print the complete map
        System.out.println(map.get(4)); //* to get the value of a specific key
        System.out.println(map.size()); //*to get the size or the number of key-value pairs
        System.out.println(map.values());// * to print all the values in map
        System.out.println(map.keySet()); //* to print all the keys in the map
        System.out.println(map.entrySet());//* to print all the entries in the map
        System.out.println(map.remove(5));//* tp remove a key value pair ate specific key
        System.out.println(map);

        

        


    }
}

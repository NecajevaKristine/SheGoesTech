package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String,Integer>salaryMap=new HashMap<>();

        //add values to map
        salaryMap.put("Bob", 900);
        salaryMap.put("John", 920);
        //salaryMap.put("John", 1000);//key should be always unique

        System.out.println(salaryMap);

        //get value from key
        System.out.println("John's salary: " + salaryMap.get("John"));

        //get all key values
        System.out.println(salaryMap.keySet());

        //size
        System.out.println(salaryMap.size());

        //check if map contains key
        System.out.println(salaryMap.containsKey("Bob"));
        System.out.println(salaryMap.containsKey("Tony"));

        //check if map contains value
        System.out.println(salaryMap.containsValue(920));//values can be the same

        //remove key/value pair
        salaryMap.remove("Bob");
        System.out.println(salaryMap);

        //example
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put ("Estonia", "Tallin");
        capitalCity.put ("Latvia", "Riga");
        capitalCity.put ("Finland", "Helsinki");

        System.out.println(capitalCity.get ("Finland"));

        for (Map.Entry<String, String>entry: capitalCity.entrySet()){
            System.out.println(entry.getValue() + " is a capital city of " + entry.getKey());

        }

    }
}

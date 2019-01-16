package lecture3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");
        strings.add("String 1");

        int size = strings.size();
        System.out.println(size);

        for (String i : strings) {
            System.out.println(i);
        }


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Student 1", "Vitalii");
        hashMap.put("Student 2", "Natalia");
        hashMap.put("Student 3", "Serhii");

        String s = hashMap.get("Student 1");
        System.out.println(s);
    }

}

package lesson43.classWork43.map_introduction;

import java.util.HashMap;
import java.util.Map;

public class ManAndWomen {
    public static void main(String[] args) {

        System.out.println("List of group with gender:");
        Map<String, String> groupGender = new HashMap<>();
        groupGender.put("Leonid", "Male");
        groupGender.put("Paul", "Male");
        groupGender.put("Alexander", "Male");
        groupGender.put("Roman", "Male");
        groupGender.put("Victoria D", "Female");
        groupGender.put("Victoria K", "Female");
        groupGender.put("Julia", "Female");
        groupGender.put("Lina", "Female");
        groupGender.put("Helen", "Female");
        System.out.println(groupGender.size());

        // 1st approach
        int woman = 0;
        for (String name : groupGender.keySet()) {
            if (groupGender.get(name).equals("Female")) {
                woman ++;
            }
        }
        System.out.println("Woman = "+ woman);

        // 2nd approach
        int man = 0;
        for (String gender : groupGender.values()) {
            if (gender.equals("Male")) {
                man++;
            }
        }
        System.out.println("Man = " + man);
    }
}

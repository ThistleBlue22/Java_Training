package com.sparta.clara;

import java.util.*;

public class DupeLocator {
    public static void main(String[] args) {
        String name = "Nishant Mandal"; // input String
        DupeLocator dp = new DupeLocator();

        System.out.println(dp.dupeValueFinder(name));
    }


    public List<String> dupeValueFinder(String passedName) {
        // Search a String and return an array of duplicate values
        List<String> duplicateValues = new ArrayList<>();
        String name = passedName.toLowerCase();
        String[] dupeStringValues = name.split("");
        List<String> dupeListValues = new LinkedList<>(Arrays.asList(dupeStringValues));

        while (dupeListValues.size() > 0){
            String val = dupeListValues.get(0);
            dupeListValues.remove(0);

            for (int j = 0; j < dupeListValues.size(); j++) {
                if (dupeListValues.get(j).equals(" ")){
                    dupeListValues.remove(j);
                }
                if (val.equals(dupeListValues.get(j))){
                    duplicateValues.add(val);
                }
            }
        }
        Set<String> set = new HashSet<>(duplicateValues);
        duplicateValues.clear();
        duplicateValues.addAll(set);


        return duplicateValues;
    }
}

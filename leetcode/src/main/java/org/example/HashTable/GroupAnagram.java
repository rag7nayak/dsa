package org.example.HashTable;


import java.util.*;

public class GroupAnagram {
    private static List<List<String>> isAnagram(String[] strArr){
        Map<String,List<String>> anagramMap= new HashMap<>();
        for (String str:strArr) {
            char[] chStr= str.toCharArray();
            Arrays.sort(chStr);
            String sortedArray=String.valueOf(chStr);
            if(!anagramMap.containsKey(sortedArray)){
                anagramMap.put(sortedArray,new ArrayList<>());
            }
            anagramMap.get(sortedArray).add(str);
        }
       List<List<String>> result= new ArrayList<>();
        for (String key:anagramMap.keySet()) {
               result.add(anagramMap.get(key));
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> grouped = isAnagram(words);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }

}

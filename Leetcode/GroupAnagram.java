package Leetcode;
import java.util.*;

class GroupAnagram {
    public static void main(String args[])
    {
        GroupAnagram obj=new GroupAnagram();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=obj.Anagrams(strs);

        System.out.println("Output: "+result);
    }
    public List<List<String>> Anagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for(String i: strs)
        {
            char arr[]=i.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(map.containsKey(sorted)==false)
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(i);
        }
        result.addAll(map.values());
        return result;
    }
}

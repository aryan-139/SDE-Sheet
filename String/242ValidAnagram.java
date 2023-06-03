//brute force first, 2 arrays used, store the characters, sort the array, if both equal, return true else false

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return(false);
        int m[]= new int[s.length()];
        int n[]=new int[t.length()];
        for(int i=0;i<m.length;i++){
            m[i]=(int)s.charAt(i); n[i]=(int)t.charAt(i);
        }
        Arrays.sort(m); Arrays.sort(n);
        if(Arrays.equals(m,n))
            return(true);
        else
            return(false);
        
    }
}

//approach 2, using hashmap to put the character count and the character in the map;
//then compare and reduce the count in the map in eveery iteration when the character is found in the second string; 

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement character count for string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}




//Using HashMap---------------------------------------------

import java.util.HashMap;

public class FirstUniqueCharacter_Optimise {

    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+ 1);
        }

        for(int i =0; i<s.length(); i++){
            if(map.get(s.charAt(i))== 1){
                return i;
            }
        }

         return -1;
  
    }

    public static void main(String[] args) {
        String s = "leetcodel";
        int result = firstUniqueChar(s);
        System.out.println("The first unique character is: " + result);
    }
}
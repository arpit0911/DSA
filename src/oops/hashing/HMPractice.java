package oops.hashing;

import java.util.*;

public class HMPractice {
    public static void main(String[] args) {
        String s1 = "abbbaa";
        String s2 = "aabbab";
        int[] arr={1,1,2,3,3,4};
        // ! "abbbaa";
        // ! "acccbb";
        // stringToMP(s1);
        // similarString(s1, s2);
        findUniqueElement(arr);
    }

    private static void findUniqueElement(int[] arr) {
        int n=arr.length;

        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(arr[i])){
                Integer temp= mp.get(arr[i]);
                temp++;
                mp.put(arr[i], temp);
            }else{
                mp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey()+ " ");
                break;
            }
        }
        
    }

    // * to check is strings are of similar pattern
    private static void similarString(String s1, String s2) {
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        if (s1.length() != s2.length()) {
            System.out.println("not Similar");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (mp1.containsKey(c1) || mp2.containsKey(c2)) {
                Integer temp1 = mp1.get(c1);
                Integer temp2 = mp2.get(c2);
                if (temp1 != temp2) {
                    System.out.println("not similar");
                    return;
                } else {
                    temp1++;
                    temp2++;
                    mp1.put(c1, temp1);
                    mp2.put(c2, temp2);
                }
            } else {
                mp1.put(c1, 1);
                mp2.put(c2, 1);
            }
        }
        System.out.println("similar");
    }

    // *String to hashmap
    public static void stringToMP(String s) {
        int n = s.length();

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(s.charAt(i))) {
                Integer temp = mp.get(s.charAt(i));
                temp++;
                mp.put(s.charAt(i), temp);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }
        System.out.println(mp);
    }
}
// subarray
// given 2 string can do three opration add, delete, replace have to convert s1
// to s2
// isomorfic
// s1="aabc"
// s2= "ppqq"
// k v
// a 2

// for(int i= 0; i < n; i++) {
// if (countChars1[str1.charAt(i) ]
// != countChars2[str2.charAt(i) ]) {
// return false;
// }
// }

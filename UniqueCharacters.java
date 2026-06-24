// Print Unique characters in String java

import java.util.*;

class Main {
    public static void main(String[] args) {
        String str="Aasthanna";
        int count = 0;
        HashSet<Character> l1=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
            if(str.charAt(i)==str.charAt(j))
            {
                l1.add(str.charAt(i));
                break;
            }
            }
        }
        System.out.println(l1);
    }
}

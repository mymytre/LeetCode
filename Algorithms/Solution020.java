package Algorithms;
public class Solution020 {

    public boolean isValid(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);
        boolean flagReturn = false;
        int counter = 0;
        
        System.out.println(stringBuilder);

        for (int k = 1; k < stringBuilder.length(); k++) {

            char x = stringBuilder.charAt(k - 1);
            char y = ' ';
            char z = stringBuilder.charAt(k);


            if (x == '(') {
                y = ')';
            } else if (x == '{') {
                y = '}';
            } else if (x == '[') {
                y = ']';
            }
            

            if (z == y) {
                counter++;
                stringBuilder.deleteCharAt(k);
                stringBuilder.deleteCharAt(k - 1);
                k = 0;
            }
    
        }

        if (s.length() / 2 == counter && s.length() % 2 == 0) {
            flagReturn = true;
        }

        return flagReturn;
    }

}

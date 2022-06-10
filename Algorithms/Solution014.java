package Algorithms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> characterSet;
        char tmp = '\0';
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            integerList.add(strs[i].length());
        }
        List<Integer> sorted = integerList
                .stream()
                .sorted()
                .toList();

        for (int j = 0; j < sorted.get(0); j++) {
            characterSet = new HashSet<>();
            for (int i = 0; i < strs.length; i++) {
                characterSet.add(strs[i].charAt(j));
                tmp = strs[i].charAt(j);
            }
            if (characterSet.size() == 1) {
                stringBuilder.append(Character.valueOf(tmp));
            } else {
                if (stringBuilder.isEmpty()) {
                    stringBuilder = new StringBuilder("");
                }
                break;
            }
        }
        return String.valueOf(stringBuilder);
    }
}
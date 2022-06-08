import java.util.ArrayList;
import java.util.List;

public class Solution020 {

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";

        Solution020 solution020 = new Solution020();

        List<String> testString = new ArrayList<>();
        testString.addAll(List.of(test1, test2, test3));
        for (int i = 0; i < testString.size(); i++) {
            System.out.print("Test number " + i + ": ");
            System.out.println(solution020.isValid(testString.get(i)));
        }

    }

    public boolean isValid(String s) {
        boolean flagReturn = true;

        


        return flagReturn;
    }

}
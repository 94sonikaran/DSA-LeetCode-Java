
//BRUTE FORCE---------------------------------------------
public class FirstUniqueCharacter1 {

    public static char firstUniqueChar(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < chars.length; j++) {

                if (i != j && chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return chars[i];
            }
        }

        return 'N';
    }

    public static void main(String[] args) {
        String s = "leetcodel";
        char result = firstUniqueChar(s);
        System.out.println("The first unique character is: " + result);
    }
}
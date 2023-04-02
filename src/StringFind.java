/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class StringFind {
    public static boolean solution1(String str, String ending) {
        if (ending.length()>str.length()) return false;
        StringBuilder strEnding = new StringBuilder();
        for (int i = 1; i <= ending.length(); i++) {
            strEnding.append(Character.toString(str.charAt(str.length() - i)));
        }
        strEnding.reverse();
        return strEnding.toString().equals(ending);
    }

}

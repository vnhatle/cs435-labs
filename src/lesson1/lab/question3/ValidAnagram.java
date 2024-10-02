package lesson1.lab.question3;

public class ValidAnagram {

    public static void main(String [] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }

        int [] frequents = new int[26];
        for (char c : s.toCharArray()) {
            frequents[c % 26]++;
        }

        for (char c : t.toCharArray()) {
            frequents[c % 26]--;
            if (frequents[c % 26] < 0) {
                return false;
            }
        }
        return true;
    }
}

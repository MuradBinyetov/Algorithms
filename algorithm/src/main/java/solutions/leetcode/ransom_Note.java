package solutions.leetcode;

public class ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            String ch = ransomNote.substring(i, i + 1);
            if (magazine.contains(ch)) {
                magazine = magazine.replaceFirst(ch, " ");
            } else {
                return false;
            }
        }
        return true;
    }
}

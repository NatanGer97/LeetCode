import java.util.*;

public class  RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        Map<Character, Integer> magazineLettersMap =  new HashMap<>();

        char[] magazineAsChar = magazine.toCharArray();
        // init map
        for (char currentMagazineLetter : magazineAsChar) {
            if (!magazineLettersMap.containsKey(currentMagazineLetter))
            {
                magazineLettersMap.put(currentMagazineLetter,1);
            }
            else // currentMagazineLetter (the key)  already exist
            {
                int prevLetterAmount = magazineLettersMap.get(currentMagazineLetter);
                magazineLettersMap.replace(currentMagazineLetter,++prevLetterAmount);
            }
        }

        char[] noteAsChars = ransomNote.toCharArray();
        for (Character currentLetterInNote : noteAsChars )
        {
            if (!magazineLettersMap.containsKey(currentLetterInNote)
                    || magazineLettersMap.get(currentLetterInNote) == 0)
            {
                return false;
            }
            else {
                Integer integer = magazineLettersMap.get(currentLetterInNote);
                magazineLettersMap.replace(currentLetterInNote,--integer);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String note = "aa"; String magazine = "aab";
        System.out.println(RansomNote.canConstruct(note,magazine));
    }
}

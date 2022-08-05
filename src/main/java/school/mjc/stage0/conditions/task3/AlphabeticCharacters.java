package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (((int) character >= 65 && (int) character <= 90) || ((int) character >= 97 && (int) character <= 122)) {
            if ((int) character == 97 || (int) character == 101 || (int) character == 105 || (int) character == 111 || (int) character == 117) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}

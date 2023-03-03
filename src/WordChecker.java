import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordChecker {

    private String text;
    private Set<String> words;

    WordChecker(String text) {
        this.text = text;
        this.words = new HashSet<>();
        words.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }

}

import java.util.Arrays;
public class cb6 {
    private String [] words;
    private String ending;
    private String resultWords;

    public cb6() {
        words = new String[] {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        ending = "ing";
    }

    public void Unit6StringSelect(String[] w, String e) {
        words = w;
        ending = e;
    }

    public String selectWords() {
        System.out.println(Arrays.toString(words));
        resultWords = "Selected List:";
        for(String endWord : words)
        {
            if (endWord.endsWith(ending)) {
                resultWords += " " + endWord + ",";
            }
        }
        resultWords = resultWords.substring(0, resultWords.length() -1);
        return resultWords;
    }

}

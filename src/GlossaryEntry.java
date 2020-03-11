import java.util.ArrayList;

public class GlossaryEntry {

    private String word;
    private ArrayList<Integer> numsList;

    public GlossaryEntry(String w) {

        word = w.toUpperCase();
        numsList = new ArrayList<Integer>();
    }

    public void add(int num) {
        if (numsList.contains(num) == false) {
            numsList.add(num);
        }
    }

    public String getWord() {
        return word;
    }

    public String toString() {
        String nums = word + " ";
        for (int i = 0; i < numsList.size(); i++) {
            nums += numsList.get(i) + " ";
        }
        return nums;
    }
    public static void main(String[] args) {
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(12);
        System.out.println(ge);
    }

}

import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {

    public DocumentGlossary() {
        super();
    }

    public DocumentGlossary(int a) {
        super(a);
    }

    public void addWord(String word, int num) {
        if (!super.contains(word)) {
            GlossaryEntry a = new GlossaryEntry(word);

        }
        super.add(num);
    }

    private int foundOrInserted(String word) {
        GlossaryEntry a = new GlossaryEntry(word);
        if (isEmpty()) {
            add(a);
            return 0;
        }
        else {
            for (int i = 0; i < this.size(); i++) {
                GlossaryEntry b = this.get(i);
                String c = b.getWord();
                if (word.compareTo(c) <= 0) {
                    this.add(i, b);
                    return i;
                }
            }

    }




















}

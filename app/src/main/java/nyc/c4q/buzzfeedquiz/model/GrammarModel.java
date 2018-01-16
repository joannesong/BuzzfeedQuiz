package nyc.c4q.buzzfeedquiz.model;

/**
 * Created by joannesong on one/16/18.
 */

public class GrammarModel {
    private int question;
    private String top_check_text;
    private String bottom_check_text;

    public GrammarModel(int question, String top_check_text, String bottom_check_text) {
        this.question = question;
        this.top_check_text = top_check_text;
        this.bottom_check_text = bottom_check_text;
    }

    public int getQuestion() {
        return question;
    }

    public String getTop_check_text() {
        return top_check_text;
    }

    public String getBottom_check_text() {
        return bottom_check_text;
    }
}

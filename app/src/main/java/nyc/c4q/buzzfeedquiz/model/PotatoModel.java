package nyc.c4q.buzzfeedquiz.model;

/**
 * Created by joannesong on 12/29/17.
 */

public class PotatoModel {
    private int question;
    private String leftTopButton;
    private String leftBottomButton;
    private String rightTopButton;
    private String rightBottomButton;

    public PotatoModel(int question, String leftTopButton, String leftBottomButton, String rightTopButton, String rightBottomButton) {
        this.question = question;
        this.leftTopButton = leftTopButton;
        this.leftBottomButton = leftBottomButton;
        this.rightTopButton = rightTopButton;
        this.rightBottomButton = rightBottomButton;
    }

    public int getQuestion() {
        return question;
    }

    public String getLeftTopButton() {
        return leftTopButton;
    }

    public String getLeftBottomButton() {
        return leftBottomButton;
    }

    public String getRightTopButton() {
        return rightTopButton;
    }

    public String getRightBottomButton() {
        return rightBottomButton;
    }
}

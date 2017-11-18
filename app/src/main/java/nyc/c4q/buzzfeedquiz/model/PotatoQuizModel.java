package nyc.c4q.buzzfeedquiz.model;

import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by joannesong on 11/18/17.
 */

public class PotatoQuizModel {
    ImageView potatoImage;
    Button potatoButton1;
    Button potatoButton2;
    Button potatoButton3;
    Button potatoButton4;

    public PotatoQuizModel(ImageView potatoImage, Button potatoButton1, Button potatoButton2, Button potatoButton3, Button potatoButton4) {
        this.potatoImage = potatoImage;
        this.potatoButton1 = potatoButton1;
        this.potatoButton2 = potatoButton2;
        this.potatoButton3 = potatoButton3;
        this.potatoButton4 = potatoButton4;
    }

    public ImageView getPotatoImage() {
        return potatoImage;
    }

    public Button getPotatoButton1() {
        return potatoButton1;
    }

    public Button getPotatoButton2() {
        return potatoButton2;
    }

    public Button getPotatoButton3() {
        return potatoButton3;
    }

    public Button getPotatoButton4() {
        return potatoButton4;
    }
}


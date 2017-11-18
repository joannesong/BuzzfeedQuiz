package nyc.c4q.buzzfeedquiz.model;

import android.widget.Button;

/**
 * Created by joannesong on 11/16/17.
 */

public class Quiz {
    String title;
    String url;
    //int image;


    //Button button;


    public Quiz(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}

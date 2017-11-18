package nyc.c4q.buzzfeedquiz;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by joannesong on 11/18/17.
 */

public class PotatoQuiz extends AppCompatActivity implements View.OnClickListener{
    ImageView potatoImage;
    Button potatoButton1;
    Button potatoButton2;
    Button potatoButton3;
    Button potatoButton4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potato_layout);

        potatoImage = (ImageView) findViewById(R.id.potatoImage);
        potatoButton1 = (Button) findViewById(R.id.potatoButton1);
        potatoButton2 = (Button) findViewById(R.id.potatoButton2);
        potatoButton3 = (Button) findViewById(R.id.potatoButton3);
        potatoButton4 = (Button) findViewById(R.id.potatoButton4);
    }

    @Override
    public void onClick(View v) {

    }
}

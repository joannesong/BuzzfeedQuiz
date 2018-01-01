package nyc.c4q.buzzfeedquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView potatoQuiz;
    private ImageView hipsterFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        potatoQuiz = findViewById(R.id.potatoQuizImage);
        hipsterFood = findViewById(R.id.hipsterFoodQuizImage);

    }
}
















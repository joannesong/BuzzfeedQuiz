package nyc.c4q.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView potatoQuiz;
    private TextView grammarQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        potatoQuiz = findViewById(R.id.potatoQuizImage);
        grammarQuiz = findViewById(R.id.grammarQuizText);

        potatoQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PotatoActivity.class);
                startActivity(intent);
            }
        });
        grammarQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GrammarActivity.class);
                startActivity(intent);
            }
        });

    }
}



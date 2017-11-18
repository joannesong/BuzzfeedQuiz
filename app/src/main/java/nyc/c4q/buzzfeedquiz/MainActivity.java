package nyc.c4q.buzzfeedquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.buzzfeedquiz.controller.BuzzfeedAdapter;
import nyc.c4q.buzzfeedquiz.model.Quiz;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView buzzfeedRecyclerView = (RecyclerView) findViewById(R.id.recycle);
        buzzfeedRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false));


        List<Quiz> quiz = new ArrayList<>();
        quiz.add(new Quiz("Make Mashed Potatoes And We'll Reveal If You're An Extrovert of Introvert", "https://www.almanac.com/sites/default/files/styles/primary_image_in_article/public/image_nodes/potatoes.jpg?itok=d3eNaCzk"));
        quiz.add(new Quiz("Which famous poet are you?", "http://www.expertontime.com/wp-content/uploads/2013/12/Sarah-Kaye.jpg"));

        BuzzfeedAdapter buzzfeedAdapter = new BuzzfeedAdapter(quiz);
        buzzfeedRecyclerView.setAdapter(buzzfeedAdapter);

        Log.d("url?", quiz.get(0).getUrl());

    }
}

package nyc.c4q.buzzfeedquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.buzzfeedquiz.controller.PotatoAdapter;
import nyc.c4q.buzzfeedquiz.model.PotatoModel;

public class PotatoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);

        recyclerView = findViewById(R.id.buzzfeedRV);

        List<PotatoModel> potatoBuzzfeedQuiz = new ArrayList<>();
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.firstquestion,"Red Potatoes","Yukon Gold Potatoes", "Russett Potatoes", "Sweet Potatoes"));
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.secondquestion,"Yep, peel them", "Nope, keep the skin on", "Who cares?","Both" ));
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.thirdquestion,"Lumpy","Smooth", "Who cares?", "Both"));
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.fourthquestion,"Whole milk","Half and half", "Heavy cream", "Almond milk"));
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.fifthquestion,"Just a few tablespoons","One stick", "Two sticks", "Every stick at the store!"));
        potatoBuzzfeedQuiz.add(new PotatoModel(R.drawable.sixthquestion,"Cheddar cheese","Green onions", "Bacon", "Sour cream"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        PotatoAdapter potatoAdapter = new PotatoAdapter(potatoBuzzfeedQuiz);
        recyclerView.setAdapter(potatoAdapter);

    }
}

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

public class GrammarActivity extends AppCompatActivity {

    private RecyclerView recyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        recyclerView = findViewById(R.id.grammarRV);

    }
}

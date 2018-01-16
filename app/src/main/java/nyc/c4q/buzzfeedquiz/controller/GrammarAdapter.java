package nyc.c4q.buzzfeedquiz.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.buzzfeedquiz.R;
import nyc.c4q.buzzfeedquiz.model.GrammarModel;
import nyc.c4q.buzzfeedquiz.view.GrammarVH;

/**
 * Created by joannesong on one/16/18.
 */

public class GrammarAdapter extends RecyclerView.Adapter<GrammarVH>{
    List<GrammarModel> grammarModelList = new ArrayList<>();

    public GrammarAdapter(List<GrammarModel> grammarModelList) {
        this.grammarModelList = grammarModelList;
    }

    @Override
    public GrammarVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grammar_itemview, parent, false);
        return new GrammarVH(childView);
    }

    @Override
    public void onBindViewHolder(GrammarVH holder, int position) {
        holder.onBind(grammarModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return grammarModelList.size();
    }
}

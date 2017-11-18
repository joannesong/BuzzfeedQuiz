package nyc.c4q.buzzfeedquiz.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.buzzfeedquiz.model.Quiz;
import nyc.c4q.buzzfeedquiz.views.BuzzfeedViewHolder;
import nyc.c4q.buzzfeedquiz.R;

/**
 * Created by joannesong on 11/16/17.
 */

public class BuzzfeedAdapter extends RecyclerView.Adapter<BuzzfeedViewHolder>{

    private List<Quiz> buzzfeedList;
//    private BuzzfeedViewHolder viewHolder;
//    private Quiz quiz;

    public BuzzfeedAdapter(List<Quiz> buzzfeedList){
        this.buzzfeedList = buzzfeedList;
    }

    @Override
    public BuzzfeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.re_view, parent, false);
        return new BuzzfeedViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BuzzfeedViewHolder holder, int position) {
        Quiz quiz = buzzfeedList.get(position);
        holder.onBind(quiz);
    }

    @Override
    public int getItemCount() {
        return buzzfeedList.size();
    }
}














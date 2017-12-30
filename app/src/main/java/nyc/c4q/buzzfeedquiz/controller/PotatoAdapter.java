package nyc.c4q.buzzfeedquiz.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.buzzfeedquiz.R;
import nyc.c4q.buzzfeedquiz.model.PotatoModel;
import nyc.c4q.buzzfeedquiz.view.PotatoViewHolder;

/**
 * Created by joannesong on 12/29/17.
 */

public class PotatoAdapter extends RecyclerView.Adapter<PotatoViewHolder> {
    List<PotatoModel> potatoModelList = new ArrayList<>();

    public PotatoAdapter(List<PotatoModel> potatoModelList) {
        this.potatoModelList = potatoModelList;
    }

    @Override
    public PotatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.potato_itemview, parent, false);
        return new PotatoViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(PotatoViewHolder holder, int position) {
        holder.onBind(potatoModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return potatoModelList.size();
    }
}









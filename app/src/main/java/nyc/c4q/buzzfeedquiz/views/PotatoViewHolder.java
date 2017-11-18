package nyc.c4q.buzzfeedquiz.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.buzzfeedquiz.R;

/**
 * Created by joannesong on 11/18/17.
 */

public class PotatoViewHolder extends RecyclerView.ViewHolder {
    ImageView potatoImage;
    Button potatoButton1;
    Button potatoButton2;
    Button potatoButton3;
    Button potatoButton4;

    public PotatoViewHolder(View itemView) {
        super(itemView);
        potatoImage = (ImageView) itemView.findViewById(R.id.potatoImage);
        potatoButton1 = (Button) itemView.findViewById(R.id.potatoButton1);
        potatoButton2 = (Button) itemView.findViewById(R.id.potatoButton2);
        potatoButton3 = (Button) itemView.findViewById(R.id.potatoButton3);
        potatoButton4 = (Button) itemView.findViewById(R.id.potatoButton4);
    }
}

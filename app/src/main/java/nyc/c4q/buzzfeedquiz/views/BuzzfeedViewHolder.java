package nyc.c4q.buzzfeedquiz.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import nyc.c4q.buzzfeedquiz.R;
import nyc.c4q.buzzfeedquiz.model.Quiz;

/**
 * Created by joannesong on 11/16/17.
 */

public class BuzzfeedViewHolder extends RecyclerView.ViewHolder{
    private TextView quizTitle;
    private ImageView quizImage;
   // private String url;
    private Context context;

    public BuzzfeedViewHolder(View itemView) {
        super(itemView);
        quizTitle = (TextView) itemView.findViewById(R.id.title1);
        quizImage = (ImageView) itemView.findViewById(R.id.image1);
        context = itemView.getContext();
    }
    public void onBind(Quiz quiz){
        quizTitle.setText(quiz.getTitle());
        Picasso.with(context).load(quiz.getUrl()).resize(100, 100).into(quizImage);

    }

}

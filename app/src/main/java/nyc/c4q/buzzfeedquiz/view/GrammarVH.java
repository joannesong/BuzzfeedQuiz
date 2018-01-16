package nyc.c4q.buzzfeedquiz.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;

import nyc.c4q.buzzfeedquiz.R;
import nyc.c4q.buzzfeedquiz.model.GrammarModel;

/**
 * Created by joannesong on one/16/18.
 */

public class GrammarVH extends RecyclerView.ViewHolder {
    private ImageView question;
    private CheckedTextView top_checked;
    private CheckedTextView bottom_checked;

    public GrammarVH(View itemView) {
        super(itemView);

        question = itemView.findViewById(R.id.grammar_image_iv);
        top_checked = itemView.findViewById(R.id.grammar_top_checked_textview);
        bottom_checked = itemView.findViewById(R.id.grammar_bottom_checked_textview);
    }

    public void onBind(GrammarModel grammarModel){
        question.setImageResource(grammarModel.getQuestion());
        top_checked.setText(grammarModel.getTop_check_text());
        bottom_checked.setText(grammarModel.getBottom_check_text());

    }
}

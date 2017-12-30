package nyc.c4q.buzzfeedquiz.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.buzzfeedquiz.R;
import nyc.c4q.buzzfeedquiz.model.PotatoModel;

/**
 * Created by joannesong on 12/29/17.
 */

public class PotatoViewHolder extends RecyclerView.ViewHolder {
    private ImageView questionImage;
    private Button topLeftButton;
    private Button topRightButton;
    private Button bottomLeftButton;
    private Button bottomRightButton;

    public PotatoViewHolder(View itemView) {
        super(itemView);

        questionImage = itemView.findViewById(R.id.image_iv);
        topLeftButton = itemView.findViewById(R.id.top_left_button);
        topRightButton= itemView.findViewById(R.id.top_right_button);
        bottomLeftButton = itemView.findViewById(R.id.bottom_left_button);
        bottomRightButton = itemView.findViewById(R.id.bottom_right_button);
    }

    public void onBind(PotatoModel potatoModel){
        questionImage.setImageResource(potatoModel.getQuestion());
        topLeftButton.setText(potatoModel.getLeftTopButton());
        topRightButton.setText(potatoModel.getRightTopButton());
        bottomRightButton.setText(potatoModel.getRightBottomButton());
        bottomLeftButton.setText(potatoModel.getLeftBottomButton());
    }
}

















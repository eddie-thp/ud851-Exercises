package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eduardo_thp on 1/20/2018.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView mListItemTextView;

    public NumberViewHolder(View itemView) {
        super(itemView);

        mListItemTextView = (TextView) itemView.findViewById(R.id.tv_item_number);
    }

    void bind(int listIndex) {
        mListItemTextView.setText(String.valueOf(listIndex));
    }
}

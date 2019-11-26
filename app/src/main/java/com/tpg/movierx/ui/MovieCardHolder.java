package com.tpg.movierx.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.tpg.movierx.R;
import com.tpg.movierx.db.model.MovieItem;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by karoly.szanto on 07/11/15.
 */
public class MovieCardHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.poster)
    ImageView posterView;

    @BindView(R.id.title)
    TextView titleView;

    @BindView(R.id.actors)
    TextView actorsView;

    public MovieCardHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void map(final MovieItem item, final int position) {
        titleView.setText(item.title());
        actorsView.setText(item.actors());

        Glide.with(itemView.getContext())
                .load(item.poster())
                .into(posterView);
    }
}

package com.kozinthet.listingproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kozinthet.listingproject.R;

import java.util.List;

/**
 * Created by kozinthet on 28/5/16.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    List<String> mStates;
    Context mContext;

    public MainAdapter(List<String> mStates, Context mContext) {
        this.mStates = mStates;
        this.mContext = mContext;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(v);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.mTextView.setText(mStates.get(position));
    }

    @Override
    public int getItemCount() {
        return mStates.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;
        public MainViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.txt_ard);
        }
    }

}

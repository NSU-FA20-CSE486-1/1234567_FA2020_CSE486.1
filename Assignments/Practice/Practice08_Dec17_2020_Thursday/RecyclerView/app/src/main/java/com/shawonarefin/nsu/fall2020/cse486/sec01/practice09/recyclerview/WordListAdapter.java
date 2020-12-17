package com.shawonarefin.nsu.fall2020.cse486.sec01.practice09.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {

        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        
        public WordViewHolder(@NonNull View itemView,  WordListAdapter mAdapter) {
            super(itemView);
            this.wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = mAdapter;
        }
    }
}


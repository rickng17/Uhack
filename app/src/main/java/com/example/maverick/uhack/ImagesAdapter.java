package com.example.maverick.uhack;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.sql.Blob;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>{
    @Override
    public ImagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO edit inflate beloew
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null, false);
        return null;
    }

    @Override
    public void onBindViewHolder(ImagesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ImagesViewHolder extends RecyclerView.ViewHolder {
        public ImagesViewHolder(View itemView) {
            super(itemView);
        }
    }
}

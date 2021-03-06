package com.example.maverick.uhack.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.maverick.uhack.R;
import com.example.maverick.uhack.beans.Post;

import java.util.List;

public class RecyclerViewAdapter_HomePage extends RecyclerView.Adapter<RecyclerViewAdapter_HomePage.PostCard> {

    private Context mContext;
    private List<Post> postData;

    public RecyclerViewAdapter_HomePage(Context mContext, List<Post> postData) {
        this.mContext = mContext;
        this.postData = postData;
    }

    @Override
    public PostCard onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_post_item,parent,false);

        return new PostCard(view);
    }

    @Override
    public void onBindViewHolder(PostCard holder, int position) {
        holder.tvAccountName.setText(postData.get(position).getAccountName());
        holder.tvAccountType.setText(postData.get(position).getAccountType());
        holder.tvCapital.setText("P" + Double.toString(postData.get(position).getCapital()));
        holder.tvBalance.setText("P" + Double.toString(postData.get(position).getBalance()));
        holder.tvReturnRate.setText(Double.toString(postData.get(position).getReturnRate()) + "%");
        holder.tvReturnDate.setText(postData.get(position).getReturnDate());

        if (postData.get(position).getAccountType().equals("FARMER")){
            holder.lblCapital.setText("needs");
            holder.lblBalance.setText("raised");
            holder.lblReturnRate.setText("gives back");
            holder.lblReturnDate.setText("payment on");
        }

        if (postData.get(position).getAccountType().equals("INVESTOR")){
            holder.lblCapital.setText("has");
            holder.lblBalance.setText("invested");
            holder.lblReturnRate.setText("return rate");
            holder.lblReturnDate.setText("member since");
        }
    }

    @Override
    public int getItemCount() {
        return postData.size();
    }

    public static class PostCard extends RecyclerView.ViewHolder{
        TextView tvAccountName,
                 tvAccountType,
                 tvCapital,
                 tvBalance,
                 tvReturnRate,
                 tvReturnDate;
        TextView lblCapital,
                 lblBalance,
                 lblReturnRate,
                 lblReturnDate;

        public PostCard(View itemView){
            super(itemView);

            tvAccountName = (TextView) itemView.findViewById(R.id.txtAccountName);
            tvAccountType = (TextView) itemView.findViewById(R.id.txtAccountType);
            tvCapital = (TextView) itemView.findViewById(R.id.txtCapital);
            tvBalance = (TextView) itemView.findViewById(R.id.txtBalance);
            tvReturnRate = (TextView) itemView.findViewById(R.id.txtReturnRate);
            tvReturnDate = (TextView) itemView.findViewById(R.id.txtReturnDate);

            lblCapital = (TextView) itemView.findViewById(R.id.lblCapital);
            lblBalance = (TextView) itemView.findViewById(R.id.lblBalance);
            lblReturnRate = (TextView) itemView.findViewById(R.id.lblReturnRate);
            lblReturnDate = (TextView) itemView.findViewById(R.id.lblReturnDate);
        }


    }
}

package com.infobee.woodmart;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class DealsOrdersListAdapter extends RecyclerView.Adapter<DealsOrdersListAdapter.ViewHolder>{

    private Context mContext;
    private List<Category> deals;

    public DealsOrdersListAdapter(List<Category> deals) {
        this.deals = deals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        mContext = parent.getContext();
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_great_deals,
                parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.textview1.setText(deals.get(position).title);
        viewHolder.textview2.setText(deals.get(position).category);
        viewHolder.textview3.setText(deals.get(position).price);
        viewHolder.textview5.setText("10% OFF");
        viewHolder.imageView.setImageResource(deals.get(position).image);



    }

    @Override
    public int getItemCount() {
        return deals.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        protected ImageView imageView;
        protected AppCompatTextView textview1;
        protected AppCompatTextView textview2;
        protected AppCompatTextView textview3;
        protected AppCompatTextView textview5;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textview1 = itemView.findViewById(R.id.textview1);
            textview2 = itemView.findViewById(R.id.textview2);
            textview3 = itemView.findViewById(R.id.textview3);
            textview5 = itemView.findViewById(R.id.textview5);
        }
    }

    public void notifyData(List<Category> items) {
        this.deals = items;
        notifyDataSetChanged();
    }
}

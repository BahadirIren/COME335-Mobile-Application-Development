package com.bahadir.hairmodels.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bahadir.hairmodels.R;
import com.bahadir.hairmodels.models.HairModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HairModelAdapter extends RecyclerView.Adapter<HairModelAdapter.ViewHolder> {
    ArrayList<HairModel> hairModelArrayList;
    Context context;

    public HairModelAdapter(ArrayList<HairModel> hairModelArrayList, Context context){
        this.hairModelArrayList = hairModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.hair_model_list_item, parent, false);

        return new ViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(hairModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return hairModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView hairTextView;
        ImageView hairImageView;
        LinearLayout linearLayout;
        Context context;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.context = context;
            this.hairTextView = itemView.findViewById(R.id.hairNameTextView);
            this.hairImageView = itemView.findViewById(R.id.hairImageView);
            this.linearLayout = itemView.findViewById(R.id.hairLinearLayout);
        }

        public void bind(HairModel hairModel){
            this.hairTextView.setText(hairModel.getName());
            this.linearLayout.setBackgroundColor(hairModel.getColor());
            Glide.with(context).load(hairModel.getImageUrl()).into(this.hairImageView);
        }
    }
}

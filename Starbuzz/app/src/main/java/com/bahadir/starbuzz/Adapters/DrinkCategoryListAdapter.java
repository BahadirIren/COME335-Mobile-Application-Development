package com.bahadir.starbuzz.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bahadir.starbuzz.Models.Drink;
import com.bahadir.starbuzz.R;

import java.util.ArrayList;

public class DrinkCategoryListAdapter extends BaseAdapter {
    ArrayList<Drink> items;
    Context context;

    public DrinkCategoryListAdapter(ArrayList<Drink> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Drink getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.drink_list_item, viewGroup, false);
        }

        TextView drinkNameTextView = view.findViewById(R.id.drinkNameTextView);
        ImageView drinkImageView = view.findViewById(R.id.drinkImageView);

        drinkNameTextView.setText(items.get(i).getName());
        drinkImageView.setImageDrawable(context.getDrawable(items.get(i).getImageResourceID()));
        return view;
    }
}

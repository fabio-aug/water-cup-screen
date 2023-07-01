package com.ifmg.watercup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CupAdapter extends RecyclerView.Adapter<CupViewHolder> {
    private List<CupModel> items;

    public CupAdapter(List<CupModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cup_layout, parent, false);
        return new CupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CupViewHolder holder, int position) {
        CupModel item = items.get(position);
        holder.config(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

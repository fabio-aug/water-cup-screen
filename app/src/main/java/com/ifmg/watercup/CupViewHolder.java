package com.ifmg.watercup;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

public class CupViewHolder extends RecyclerView.ViewHolder {
    private MutableLiveData<Double> milliliters = new MutableLiveData<>();
    private MutableLiveData<Boolean> marked = new MutableLiveData<>();
    private MutableLiveData<Integer> image = new MutableLiveData<>();

    public CupViewHolder(@NonNull View itemView) {
        super(itemView);
        this.milliliters.setValue(0.0);
        this.marked.setValue(false);
        this.image.setValue(R.drawable.cup_empty);
    }

    public void config(CupModel item) {
        this.milliliters.setValue(item.getMilliliters());
        this.marked.setValue(item.isMarked());
        this.image.setValue(item.getImage());
    }
}
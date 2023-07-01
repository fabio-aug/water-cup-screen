package com.ifmg.watercup;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ScreenViewModel extends ViewModel {
    private MutableLiveData<Double> lack = new MutableLiveData<>();
    private MutableLiveData<Double> drank = new MutableLiveData<>();
    private MutableLiveData<Integer> weight = new MutableLiveData<>();
    private List<CupModel> items;

    public ScreenViewModel() {
        this.lack.setValue(0.0);
        this.drank.setValue(0.0);
        this.weight.setValue(0);
        this.items = new ArrayList<>();
    }

    public MutableLiveData<Double> getLack() {
        return lack;
    }

    public void setLack(MutableLiveData<Double> lack) {
        this.lack = lack;
    }

    public MutableLiveData<Double> getDrank() {
        return drank;
    }

    public void setDrank(MutableLiveData<Double> drank) {
        this.drank = drank;
    }

    public MutableLiveData<Integer> getWeight() {
        return weight;
    }

    public void setWeight(CharSequence text) {
        int value = Integer.parseInt(text.toString());
        this.weight.setValue(value);
    }

    public List<CupModel> getItems() {
        return items;
    }

    public void calculate() {
        double total = (double) (this.weight.getValue() * 35);
        this.lack.setValue(total);

        while (total >= 150) {
            this.items.add(new CupModel(150.0, false, R.drawable.cup_full));
            total -= 150;
        }

        if (total > 0) {
            this.items.add(new CupModel(total, false, R.drawable.cup_full));
        }
    }
}

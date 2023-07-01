package com.ifmg.watercup;

public class CupModel {
    private Double milliliters;
    private boolean marked;
    private int image;

    public CupModel(Double milliliters, boolean marked, int image) {
        this.milliliters = milliliters;
        this.marked = marked;
        this.image = image;
    }

    public Double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(Double milliliters) {
        this.milliliters = milliliters;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

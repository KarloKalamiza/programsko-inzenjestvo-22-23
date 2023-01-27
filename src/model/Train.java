package model;

import constants.Constants;

public class Train {

    public enum Size {SMALL, LARGE};
    public Size size;
    private int capacity = Constants.ZERO;

    public Train(Size size) {
        this.size = size;

        if (size == Size.SMALL){
            capacity = Constants.SMALL_TRAIN_SIZE;
        } else if(size == Size.LARGE){
            capacity = Constants.LARGE_TRAIN_SIZE;
        }
    }

    public int getCapacity() {
        return capacity--;
    }

    public void setCapacity() {
        capacity--;
    }
}

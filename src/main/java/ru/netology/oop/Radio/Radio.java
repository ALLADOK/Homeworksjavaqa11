package ru.netology.oop.Radio;

public class Radio {

    private int minRadiostation = 0;
    private int maxRadiostation = 9;
    private int numberCurrentRadiostation = minRadiostation;
    private int minVolume = 0;
    private int maxVolume = 99;
    private int currentVolume = minVolume;

    public Radio(int minRadiostation, int maxRadiostation) {
        this.minRadiostation = minRadiostation;
        this.maxRadiostation = maxRadiostation;
        this.numberCurrentRadiostation = minRadiostation;
    }

    public Radio(int size) {
        maxVolume = minVolume + size;
        this.currentVolume = minVolume + size;
    }

    public void nextNumberRadiostation() {
        if (numberCurrentRadiostation > 0) {
            numberCurrentRadiostation = numberCurrentRadiostation + 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevNumberRadiostation() {
        if (numberCurrentRadiostation < 9) {
            numberCurrentRadiostation -= 1;
        }
    }

    public int getMinRadiostation() {
        return minRadiostation;
    }

    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public int getNumberCurrentRadiostation() {
        return numberCurrentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxRadiostation() {
        numberCurrentRadiostation = 9;
    }

    public void setMinRadiostation() {
        numberCurrentRadiostation = 0;
    }

    public void setNumberCurrentRadiostation(int newNumberCurrentRadiostation) {
        if (newNumberCurrentRadiostation < 0) {
            newNumberCurrentRadiostation = 9;
        }
        if (newNumberCurrentRadiostation > 9) {
            newNumberCurrentRadiostation = 0;
        }

        numberCurrentRadiostation = newNumberCurrentRadiostation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int setPrevNumberCurrentRadiostation() {
        if (numberCurrentRadiostation == minRadiostation) {
            numberCurrentRadiostation = maxRadiostation;
        }
        {
            return maxRadiostation;
        }
    }
}
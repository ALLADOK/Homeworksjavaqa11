package ru.netology.oop.Radio;

public class Radio {

    private int numbercurrentRadiostation;

    private int currentVolume;

    int minRadiostation;

    int maxRadiostation;


    public void nextnumberRadiostation() {
        if (numbercurrentRadiostation < 9) {
            numbercurrentRadiostation = numbercurrentRadiostation + 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevnumberRadiostation() {
        if (numbercurrentRadiostation < 9) {
            numbercurrentRadiostation -= 1;
        }
    }

    public int getMinRadiostation() {
        return numbercurrentRadiostation = 0;
    }

    public int getMaxRadiostation() {
        return numbercurrentRadiostation = 9;
    }

    public int getNumbercurrentRadiostation() {
        return numbercurrentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxRadiostation() {
        numbercurrentRadiostation = 9;
    }

    public void setMinRadiostation() {
        numbercurrentRadiostation = 0;
    }

    public void setNumbercurrentRadiostation(int newNumberCurrentRadiostation) {
        if (newNumberCurrentRadiostation < 0) {
            newNumberCurrentRadiostation = 9;
        }
        if (newNumberCurrentRadiostation > 9) {
            newNumberCurrentRadiostation = 0;
        }

        numbercurrentRadiostation = newNumberCurrentRadiostation;
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

    public void setNextNumberCurrentRadiostation() {
        if (numbercurrentRadiostation == maxRadiostation) {
            numbercurrentRadiostation = minRadiostation;
        }

    }

    public int setPrevNumberCurrentRadiostation() {
        if (numbercurrentRadiostation == minRadiostation) {
            numbercurrentRadiostation = maxRadiostation;
        }
        {
            return maxRadiostation;
        }
    }
}
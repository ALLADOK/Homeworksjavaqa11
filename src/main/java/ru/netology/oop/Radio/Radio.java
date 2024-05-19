package ru.netology.oop.Radio;

public class Radio {

    public int getNumbercurrentRadiostation() {
        return numbercurrentRadiostation;
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

    public int numbercurrentRadiostation;

    public void increasenumberRadiostation() {
        if (numbercurrentRadiostation < 9) {
            numbercurrentRadiostation = numbercurrentRadiostation + 1;
        }
    }

    public void setToMaxRadiostation() {
        numbercurrentRadiostation = 9;
    }

    public void setToMinRadiostation() {
        numbercurrentRadiostation = 0;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
}
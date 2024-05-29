package ru.netology.oop.Radio;

public class Radio {

    private int maxRadiostation = 9;
    private int minRadiostation = 0;
    private int numberCurrentRadiostation = minRadiostation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public Radio(){
        this.maxRadiostation = 9;
    }

    public Radio(int radiostationsCount){
        this.maxRadiostation = radiostationsCount - 1;
    }

    public void next() {
        if (numberCurrentRadiostation != maxRadiostation) {
            this.numberCurrentRadiostation++;
        } else {

            this.numberCurrentRadiostation = minRadiostation;
        }
    }

    public void prev() {
        if (numberCurrentRadiostation != minRadiostation) {
           this.numberCurrentRadiostation--;
        } else {
           this.numberCurrentRadiostation = maxRadiostation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            this.currentVolume++;
        }

    }

    public int getNumberCurrentRadiostation() {
        return numberCurrentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberCurrentRadiostation(int numberCurrentRadiostation) {
        if (numberCurrentRadiostation < minRadiostation) {
            return;
        }
        if (numberCurrentRadiostation > maxRadiostation) {
            return;
        }
        this.numberCurrentRadiostation = numberCurrentRadiostation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
       this.currentVolume = currentVolume;
    }

}
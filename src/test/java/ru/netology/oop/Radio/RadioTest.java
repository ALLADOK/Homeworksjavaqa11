package ru.netology.oop.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation3() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(0);

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation6() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation1() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMaxRadiostation() {
        Radio radio = new Radio();

        radio.setMaxRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadiostation() {
        Radio radio = new Radio();

        radio.setMinRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextNumberCurrentRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextNumberCurrentRadiostation1() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(0);


        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation2() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(9);

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation3() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(10);

        radio.next();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(10);


        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.next();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation3() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void prevNumberCurrentRadiostation6() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);


        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);

    }

}
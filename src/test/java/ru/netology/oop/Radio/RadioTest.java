package ru.netology.oop.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(5);

        int expected = 5;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.nextNumberRadiostation();

        int expected = 2;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.nextNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.prevNumberRadiostation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(2);

        radio.prevNumberRadiostation();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation3() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.prevNumberRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.prevNumberRadiostation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

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
    public void shouldSetRadiostation2() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(-1);

        int expected = 9;
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

        radio.nextNumberRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(0);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

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
    public void prevNumberCurrentRadiostation1() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(-1);

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.nextNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation2() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadiostation(0);

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation3() {
        Radio radio = new Radio();

        radio.setNextNumberCurrentRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation3() {
        Radio radio = new Radio();

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(10);

        radio.nextNumberRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(10);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation5() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.nextNumberRadiostation();
        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation5() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation6() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(0);

        radio.nextNumberRadiostation();
        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation6() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation7() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(9);

        radio.setNextNumberCurrentRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation7() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(0);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation8() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(8);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation9() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadiostation(1);

        radio.prevNumberRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
}
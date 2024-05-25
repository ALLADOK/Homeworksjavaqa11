package ru.netology.oop.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(0, 10);

        Assertions.assertEquals(0, radio.getMinRadiostation());
        Assertions.assertEquals(10, radio.getMaxRadiostation());
        Assertions.assertEquals(0, radio.getNumberCurrentRadiostation());
    }

    @Test
    public void test1() {
        Radio radio = new Radio(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());

    }

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio(0, 5);

        Assertions.assertEquals(0, radio.getMinRadiostation());
        Assertions.assertEquals(5, radio.getMaxRadiostation());
        Assertions.assertEquals(0, radio.getNumberCurrentRadiostation());
    }

    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio(0, 2);

        Assertions.assertEquals(0, radio.getMinRadiostation());
        Assertions.assertEquals(2, radio.getMaxRadiostation());
        Assertions.assertEquals(0, radio.getNumberCurrentRadiostation());
    }

    @Test
    public void shouldSetNextRadiostation1() {
        Radio radio = new Radio(0, 9);

        Assertions.assertEquals(0, radio.getMinRadiostation());
        Assertions.assertEquals(9, radio.getMaxRadiostation());
        Assertions.assertEquals(0, radio.getNumberCurrentRadiostation());
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(8);

        radio.prevNumberRadiostation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation1() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(2);

        radio.prevNumberRadiostation();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation2() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(1);

        radio.prevNumberRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation3() {
        Radio radio = new Radio(0, 9);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation4() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(10);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation5() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation6() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(0);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation7() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadiostation1() {
        Radio radio = new Radio(0, 10);

        radio.setNumberCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation2() {
        Radio radio = new Radio(0, 10);

        radio.setNumberCurrentRadiostation(9);

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadiostation() {
        Radio radio = new Radio(0, 10);

        radio.setMaxRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadiostation() {
        Radio radio = new Radio(0, 10);

        radio.setMinRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNoSetVolumeAboveMax() {
        Radio radio = new Radio(1);

        radio.setCurrentVolume(101);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeBelowMin() {
        Radio radio = new Radio(0);

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio(100);

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio(0);

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextNumberCurrentRadiostation() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(9);

        radio.nextNumberRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextNumberCurrentRadiostation1() {
        Radio radio = new Radio(0, 10);

        radio.setNumberCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(0);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation2() {
        Radio radio = new Radio(0, 10);

        radio.setNumberCurrentRadiostation(9);

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation3() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(10);

        radio.nextNumberRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation1() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(10);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation4() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(-1);

        radio.nextNumberRadiostation();

        int expected = 0;
        int actual = radio.getMinRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation2() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation3() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(1);

        radio.prevNumberRadiostation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation4() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(8);

        radio.prevNumberRadiostation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation5() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(8);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberCurrentRadiostation6() {
        Radio radio = new Radio(0, 9);
        radio.setNumberCurrentRadiostation(-1);

        radio.setPrevNumberCurrentRadiostation();

        int expected = 9;
        int actual = radio.getMaxRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberCurrentRadiostation7() {
        Radio radio = new Radio(0, 10);
        radio.setNumberCurrentRadiostation(-1);

        radio.prevNumberRadiostation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }
}
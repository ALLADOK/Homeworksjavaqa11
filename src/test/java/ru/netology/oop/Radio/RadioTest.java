package ru.netology.oop.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio(20);

        radio.setNumberCurrentRadiostation(15);

        int expected = 15;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation1() {
        Radio radio = new Radio(10);

        radio.setNumberCurrentRadiostation(1);

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation2() {
        Radio radio = new Radio(9);

        radio.setNumberCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation3() {
        Radio radio = new Radio(10);

        radio.setNumberCurrentRadiostation(9);

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation4() {
        Radio radio = new Radio(9);
        radio.setNumberCurrentRadiostation(0);


        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation5() {
        Radio radio = new Radio(9);
        radio.setNumberCurrentRadiostation(1);


        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation1() {
        Radio radio = new Radio(1);

        radio.setNumberCurrentRadiostation(1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation2() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(10);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation3() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation4() {
        Radio radio = new Radio(9);
        radio.setNumberCurrentRadiostation(0);

        radio.prev();

        int expected = 8;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation7() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadiostation() {
        Radio radio = new Radio(9);


        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadiostation() {
        Radio radio = new Radio(0);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadiostation1() {
        Radio radio = new Radio(0);
        radio.setNumberCurrentRadiostation(0);

        radio.prev();

        int expected = -1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadiostation2() {
        Radio radio = new Radio(0);
        radio.setNumberCurrentRadiostation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextNumberCurrentRadiostation() {
        Radio radio = new Radio(9);
        radio.setNumberCurrentRadiostation(9);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nextNumberCurrentRadiostation3() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(10);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation4() {
        Radio radio = new Radio(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumberCurrentRadiostation5() {
        Radio radio = new Radio(9);
        radio.setNumberCurrentRadiostation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumberCurrentRadiostation6() {
        Radio radio = new Radio(1);
        radio.setNumberCurrentRadiostation(0);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumberCurrentRadiostation7() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentRadiostation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberCurrentRadiostation8() {
        Radio radio = new Radio(9);

        int expected = 0;
        int actual = radio.getNumberCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(10);
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
        Radio radio = new Radio(0);
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume3() {
        Radio radio = new Radio(-1);
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume4() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume5() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume6() {
        Radio radio = new Radio(-10);
        radio.setCurrentVolume(-10);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume7() {
        Radio radio = new Radio(-2);
        radio.setCurrentVolume(-2);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume8() {
        Radio radio = new Radio(1);
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolum9() {
        Radio radio = new Radio(1);
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(8);


        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseToNextVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(6);

        radio.increaseToNextVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(10);

        radio.increaseToNextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNewIncreaseToNextVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(11);

        radio.increaseToNextVolume();
        int expected = 1;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldLowIncreaseToNextVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(-1);

        radio.increaseToNextVolume();
        int expected = 1;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseToPrevVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(5);

        radio.increaseToPrevVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNewIncreaseToPrevVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(-1);

        radio.increaseToPrevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void needNextStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotNeedNewNextStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void needPrevStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotNeedNewPrevStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

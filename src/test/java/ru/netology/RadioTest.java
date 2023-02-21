package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetUnderMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume();
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseToNextVolume();
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void shouldNewIncreaseToNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseToNextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldLowIncreaseToNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseToNextVolume();
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseToPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseToPrevVolume();

        Assertions.assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    public void shouldNewIncreaseToPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseToPrevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        Assertions.assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        Assertions.assertEquals(11, radio.getCurrentVolume());
    }
    @Test
    public void Station() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(10);

        radio.setMaxStation();
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio(10);

        radio.setMinStation();
        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void needNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        radio.nextStation();

        Assertions.assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void ShouldNotNeedNewNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void needPrevStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        radio.prevStation();

        Assertions.assertEquals(4, radio.getCurrentStation());
    }
    @Test
    public void ShouldNotNeedNewPrevStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }
}
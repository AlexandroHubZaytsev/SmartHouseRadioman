package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio toshiba = new Radio();

    @Test
    public void checkGetAndSetField() {
        Radio toshiba = new Radio();
        String expected = "smart";
        assertNull(toshiba.getName());
        toshiba.setName(expected);
        assertEquals(expected, toshiba.getName());
    }

    @Test
    public void getCurrentStation() {
        assertEquals(0, toshiba.getCurrentStation());
    }

    @Test
    public void setCurrentStation() {
        toshiba.setCurrentStation(8);
        assertEquals(8, toshiba.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        int currentStation = 9;
        toshiba.setCurrentStation(currentStation);
        toshiba.nextRadioStation();
        assertEquals(0, toshiba.getCurrentStation());
    }

    @Test
    public void shouldNextStation6() {
        int currentStation = 5;
        toshiba.setCurrentStation(currentStation);
        toshiba.nextRadioStation();
        assertEquals(6, toshiba.getCurrentStation());
    }

    @Test
    public void shouldNextStation1() {
        int currentStation = 10;
        toshiba.setCurrentStation(currentStation);
        toshiba.nextRadioStation();
        assertEquals(1, toshiba.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        int currentStation = 0;
        toshiba.setCurrentStation(currentStation);
        toshiba.prevRadioStation();
        assertEquals(9, toshiba.getCurrentStation());
    }

    @Test
    public void shouldPrevStation1() {
        int currentStation = -1;
        toshiba.setCurrentStation(currentStation);
        toshiba.prevRadioStation();
        assertEquals(9, toshiba.getCurrentStation());
    }

    @Test
    public void shouldPrevStation4() {
        int currentStation = 5;
        toshiba.setCurrentStation(currentStation);
        toshiba.prevRadioStation();
        assertEquals(4, toshiba.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation() {
        int RadioStation = 8;
        int currentStation = 1;
        toshiba.setCurrentStation(currentStation);
        toshiba.inputRadioStation(RadioStation);
        assertEquals(8, toshiba.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation3() {
        int RadioStation = 10;
        int currentStation = 3;
        toshiba.setCurrentStation(currentStation);
        toshiba.inputRadioStation(RadioStation);
        assertEquals(3, toshiba.getCurrentStation());
    }

    @Test
    public void shouldSoundVolumePlus() {
        int currentVolume = 10;
        toshiba.setCurrentSoundVolume(currentVolume);
        toshiba.soundVolumePlus();
        assertEquals(10, toshiba.getCurrentSoundVolume());
    }

    @Test
    public void shouldVolumePlus6() {
        int currentVolume = 4;
        toshiba.setCurrentSoundVolume(currentVolume);
        toshiba.soundVolumePlus();
        assertEquals(5, toshiba.getCurrentSoundVolume());
    }

    @Test
    public void shouldVolumePlus11() {
        int currentVolume = 11;
        toshiba.setCurrentSoundVolume(currentVolume);
        toshiba.soundVolumePlus();
        assertEquals(1, toshiba.getCurrentSoundVolume());
    }

    @Test
    public void shouldSoundVolumeMinus5() {
        int currentSoundVolume = (6);
        toshiba.setCurrentSoundVolume(currentSoundVolume);
        toshiba.soundVolumeMinus();
        assertEquals(5, toshiba.getCurrentSoundVolume());
    }

    @Test
    public void shouldSoundVolumeMinus0() {
        int currentSoundVolume = (0);
        toshiba.setCurrentSoundVolume(currentSoundVolume);
        toshiba.soundVolumeMinus();
        assertEquals(0, toshiba.getCurrentSoundVolume());
    }

    @Test
    public void shouldSoundVolumeMinus1() {
        int currentSoundVolume = (-1);
        toshiba.setCurrentSoundVolume(currentSoundVolume);
        toshiba.soundVolumeMinus();
        assertEquals(0, toshiba.getCurrentSoundVolume());
    }
}
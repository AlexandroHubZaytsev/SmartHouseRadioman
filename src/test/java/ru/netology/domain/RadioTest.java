package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldCreateRadio() {
        Radio Toshiba = new Radio();
        assertEquals(0, Toshiba.maxStation);
        assertEquals(0,Toshiba.minStation);
        assertEquals(0, Toshiba.currentStation);
        assertEquals(0, Toshiba.currentSoundVolume);
        assertEquals( 0, Toshiba.minSoundVolume);
        assertEquals(0,Toshiba.maxSoundVolume);
        assertNull(Toshiba.name);
        assertFalse(Toshiba.on);
    }
}

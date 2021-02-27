package ru.netology.domain;

public class Radio {
    private String name;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
            if (currentStation < minStation) {
                return;
        }
        this.currentStation = currentStation;
    }
    public void nextRadioStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }
    public void prevRadioStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }
    public void inputRadioStation(int RadioStation) {
        if (RadioStation > maxStation) {
            return;
        }
        if (RadioStation < minStation) {
            return;
        }
        this.currentStation = RadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
    public void soundVolumePlus () {
        int currentSoundVolume = this.getCurrentSoundVolume();
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        this.currentSoundVolume++;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }
    public void soundVolumeMinos () {
        int currentSoundVolume = this.getCurrentSoundVolume();
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        this.currentSoundVolume--;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


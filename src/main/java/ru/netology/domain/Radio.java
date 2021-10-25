package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void setNextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else {
            // increaseStation();
            currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextVolume() {
        if (currentVolume == 10) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void setPrevVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

}

package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation;
    private int maxStation = 9;
    private int minVolume;
    private int maxVolume = 100;
    private int numberStation;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        maxStation = numberStation-1;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            // increaseStation();
            currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
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
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void setPrevVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

}

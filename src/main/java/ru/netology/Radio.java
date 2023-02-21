package ru.netology;
public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentStation;


    public int getCurrentVolume() {
        return currentVolume;
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
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume() {
        this.maxVolume = maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        this.minVolume = minVolume;
    }

    public void increaseToNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }
    public void increaseToPrevVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

    public Radio() {

    }
    public Radio (int size) {
        size = size -1;
        maxStation = minStation + size;
    }


    public int getCurrentStation() {

        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public void setMaxStation() {

        currentStation = maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public void setMinStation() {

        currentStation = minStation;
    }
    public int nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }
    public int prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;

        } else {
            currentStation = maxStation;
        }
        return currentStation;
    }

}
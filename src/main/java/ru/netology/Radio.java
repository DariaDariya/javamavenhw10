package ru.netology;
public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }
    public void setMaxVolume() {
        currentVolume = 10;
    }
    public void setMinVolume() {
        currentVolume = 0;
    }

    public void increaseToNextVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }
    public void increaseToPrevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

    public int getCurrentStation() {

        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setMaxStation() {

        currentStation = 9;
    }
    public void setMinStation() {

        currentStation = 0;
    }
    public int nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }
    public int prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;

        } else {
            currentStation = 9;
        }
        return currentStation;
    }

}

package ru.netology;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int qantityOfStation = 10;

    public Radio(int qantityOfStation) {
        this.qantityOfStation = qantityOfStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setQantityOfStations(int quantityOfStation) {
        if (quantityOfStation > 999) {
            setQantityOfStations(999);
            return quantityOfStation;
        }
        if (quantityOfStation < 1) {
            setQantityOfStations(1);
            return quantityOfStation;
        }
        this.qantityOfStation = quantityOfStation;
        return quantityOfStation;

    }

    public int getQantityOfStation() {
        return qantityOfStation;
    }

    public int setVolume(int volume) {
        if (volume > 100) {
            return currentVolume;
        }
        if (volume < 0) {
            return currentVolume;
        }
        this.currentVolume = volume;

        return volume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int setStation(int station) {
        if (station > qantityOfStation - 1) {
            return currentStation;
        }
        if (station < 0) {
            return currentStation;
        }
        this.currentStation = station;

        return station;
    }

    public void next() {
        if (currentStation == qantityOfStation - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = qantityOfStation - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        {
            currentVolume = currentVolume - 1;
        }
    }


}



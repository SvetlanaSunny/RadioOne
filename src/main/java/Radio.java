public class Radio {

  private int soundVolume = 0;
  private int radioStationNumber = 0;

  private void setSoundVolume(int volume) {
    soundVolume = volume;
    if (soundVolume > 10) {
      soundVolume = 10;
    }
    if (soundVolume < 0) {
      soundVolume = 0;
    }
  }

  public int getSoundVolume() {
    return soundVolume;
  }

  public void increaseVolume() {
    setSoundVolume(soundVolume + 1);
  }

  public void decreaseVolume() {
    setSoundVolume(soundVolume - 1);
  }

  private void setRadioStationNumber(int radioNumber) {
    radioStationNumber = radioNumber;
    if (radioStationNumber > 9) {
      radioStationNumber = 0;
    }
    if (radioStationNumber < 0) {
      radioStationNumber = 9;
    }
  }

  public void setStationNumberDirect(int value) {
    setRadioStationNumber(value);
  }

  public int getRadioStationNumber() {
    return radioStationNumber;
  }

  public void increaseRadioStationNumber() {
    setRadioStationNumber(radioStationNumber + 1);
  }

  public void decreaseRadioStationNumber() {
    setRadioStationNumber(radioStationNumber - 1);
  }

  public void setVolumeDirect(int value) {
    setSoundVolume(value);
  }
}


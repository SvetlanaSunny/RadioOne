public class Radio {

  private int soundVolume;
  private int radioStationNumber;

    public void setSoundVolume(int volume) {
    soundVolume = volume;
    if (soundVolume > 10) {
      soundVolume = 10;
    }
    if (soundVolume < 0) {
      soundVolume = 0;
    }
  }

  public int getSoundVolume(){
      return soundVolume;
  }


}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
  @Test
  public void increaseVolume() {
    Radio radioVolume = new Radio();
    radioVolume.increaseVolume();
    int expected = 1;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void decreaseVolume() {
    Radio radioVolume = new Radio();
    radioVolume.decreaseVolume();
    int expected = 0;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void decreaseVolumeDirect() {
    Radio radioVolume = new Radio();
    radioVolume.setVolumeDirect(-1);
    int expected = 0;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void decreaseStationNumberDirect() {
    Radio radioVolume = new Radio();
    radioVolume.setStationNumberDirect(-1);
    int expected = 9;
    int actual = radioVolume.getRadioStationNumber();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void increaseVolumeDirect() {
    Radio radioVolume = new Radio();
    radioVolume.setVolumeDirect(11);
    int expected = 10;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void increaseStationNumberDirect() {
    Radio radioVolume = new Radio();
    radioVolume.setStationNumberDirect(10);
    int expected = 0;
    int actual = radioVolume.getRadioStationNumber();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void increaseVolumeRadioStation(){
    Radio radioStation = new Radio();
    radioStation.increaseRadioStationNumber();
    int expected = 1;
    int actual = radioStation.getRadioStationNumber();
    Assertions.assertEquals(expected,actual);
  }

    @Test
  public void decreaseRadioStationNumber(){
    Radio radioStation = new Radio();
    radioStation.decreaseRadioStationNumber();
    int expected = 9;
    int actual = radioStation.getRadioStationNumber();
    Assertions.assertEquals(expected,actual);
  }

}

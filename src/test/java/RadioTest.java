import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
  @Test
  public void setRadioStationNumber() {
    Radio radioVolume = new Radio();
    radioVolume.setSoundVolume(11);
    int expected = 10;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }
  @Test
  public void setRadioStationNumberMin() {
    Radio radioVolume = new Radio();
    radioVolume.setSoundVolume(-1);
    int expected = 0;
    int actual = radioVolume.getSoundVolume();
    Assertions.assertEquals(expected, actual);
  }


}

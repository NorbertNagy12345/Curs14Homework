import org.assertj.core.api.Assertions;
import org.example.TemperatureMeter;
import org.junit.Test;

public class TemperatureMeterTest {
    @Test
    public void instantiateClass(){
        TemperatureMeter temperatureMeter = new TemperatureMeter();
    }

    @Test
    public void callMethods(){
        TemperatureMeter temperatureMeter = new TemperatureMeter();

        Assertions.assertThat(temperatureMeter.fahrenheitToCelsius(50)).isEqualTo(10);
        Assertions.assertThat(temperatureMeter.celsiusToFahrenheit(10)).isEqualTo(50);
    }

}

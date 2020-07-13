import com.bridgelabz.quantitymeasurement.service.Measurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MeasurementTest {
    Measurement measurement = null;

    @Before
    public void init() {
        measurement = new Measurement();
    }

    @Test
    public void givenLengthInFeet_ConvertItIntoInch_ReturnLengthInInch() {
        float inInch = measurement.convertFeetToInch(1);
        Assert.assertEquals(12,inInch,0.0);
    }
}

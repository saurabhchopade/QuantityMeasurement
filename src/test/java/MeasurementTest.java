import com.bridgelabz.quantitymeasurement.service.Measurement;
import com.bridgelabz.quantitymeasurement.service.QuantityConversion;
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
    public void givenLengthInFeet_CheckWithGivenInch_ReturnBooleanValue() {
        boolean result = measurement.quantityConverter(1, 12, QuantityConversion.FEET_TO_INCH);
        Assert.assertTrue(result);
    }
}

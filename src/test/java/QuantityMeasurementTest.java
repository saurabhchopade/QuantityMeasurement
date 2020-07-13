import com.bridgelabz.quantitymeasurement.service.QuantityConversion;
import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenLengthInFeet_CheckWithGivenInch_ReturnBooleanValue() {
        boolean result = quantityMeasurement.quantityCompare(1, 12, QuantityConversion.FEET_TO_INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBothDimensionInFeet_IfEquals_ShouldReturnTrue() {
        boolean result = quantityMeasurement.quantityCompare(0, 0, QuantityConversion.FEET_TO_FEET);
        Assert.assertTrue(result);
    }
}

import com.bridgelabz.quantitymeasurement.exception.QuantityException;
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
    public void givenLengthInFeet_CheckWithGivenInch_ReturnBooleanValue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(1, 12, QuantityConversion.FEET_TO_INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBothDimensionInFeet_IfEquals_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(0, 0, QuantityConversion.FEET_TO_FEET);
        Assert.assertTrue(result);
    }


    @Test
    public void givenLengthInInch_IfEqualsThen_ShouldReturnBooleanValue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(12, 1, QuantityConversion.INCH_TO_FEET);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBothLengthsInInch_IfEqualsThen_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(12, 12, QuantityConversion.INCH_TO_INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthInFeet_IfEqualsToYard_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(3, 1, QuantityConversion.FEET_TO_YARD);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthInOneFeet_CheckEqualToOneYard_ShouldReturnFalse() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(1, 1, QuantityConversion.FEET_TO_YARD);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthInOneInch_CheckEqualToOneYard_ShouldReturnFalse() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(1, 1, QuantityConversion.INCH_TO_YARD);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthInYard_CheckEqualToInchIfEquals_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(1, 36, QuantityConversion.YARD_TO_INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthInInch_CheckEqualToYardIfEquals_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(36, 1, QuantityConversion.INCH_TO_YARD);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthInYard_CheckEqualToFeetIfEquals_ShouldReturnTrue() throws QuantityException {
        boolean result = quantityMeasurement.quantityCompare(1, 3, QuantityConversion.YARD_TO_FEET);
        Assert.assertTrue(result);
    }
}

import com.bridgelabz.quantitymeasurement.service.LengthConverter;
import com.bridgelabz.quantitymeasurement.util.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(0.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(0.0, Units.FEET);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        LengthConverter length1 = new LengthConverter(0.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(0.1, Units.FEET);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnFalse() {
        LengthConverter length1 = null;
        LengthConverter length2 = new LengthConverter(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Feet_ShouldReturnFalse() {
        double length1 = 0.1;
        LengthConverter length2 = new LengthConverter(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(1.0, Units.INCH);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given1InchAnd2Inch_ShouldReturnFalse() {
        LengthConverter length1 = new LengthConverter(1.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(2.0, Units.INCH);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldReturnFalse() {
        LengthConverter length1 = null;
        LengthConverter length2 = new LengthConverter(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Inch_ShouldReturnFalse() {
        double length1 = 0.1;
        LengthConverter length2 = new LengthConverter(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given3FeetEqualTo1Yard_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(3.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetNotEqualTo1Yard_ShouldReturnFalse() {
        LengthConverter length1 = new LengthConverter(1.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchNotEqualTo1Yard_ShouldReturnFalse() {
        LengthConverter length1 = new LengthConverter(1.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1YardEqualTo36inch_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.YARD);
        LengthConverter length2 = new LengthConverter(36.0, Units.INCH);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given36InchIfEqualTo1Yard_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(36.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardIfEqualTo3Feet_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.YARD);
        LengthConverter length2 = new LengthConverter(3.0, Units.FEET);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchIfEqualTo2Point5Cm_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(2.54, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchIfEqualTo5Cm_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(2.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(5.08, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengthsAfterAdding_IsEqualToProvidedLength_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(2.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(2.0, Units.INCH);
        LengthConverter length3 = new LengthConverter(4.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd2InchAfterMergingBothQuantity_IsEqualToProvidedThirdQuantity_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(2.0, Units.INCH);
        LengthConverter length3 = new LengthConverter(14.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1FeetAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(1.0, Units.FEET);
        LengthConverter length2 = new LengthConverter(1.0, Units.FEET);
        LengthConverter length3 = new LengthConverter(24.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchAnd2point5CmAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() {
        LengthConverter length1 = new LengthConverter(2.0, Units.INCH);
        LengthConverter length2 = new LengthConverter(2.5, Units.CM);
        LengthConverter length3 = new LengthConverter(3.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }
}

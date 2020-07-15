import com.bridgelabz.quantitymeasurement.service.UnitsConverter;
import com.bridgelabz.quantitymeasurement.util.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(0.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(0.0, Units.FEET);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        UnitsConverter length1 = new UnitsConverter(0.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(0.1, Units.FEET);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnFalse() {
        UnitsConverter length1 = null;
        UnitsConverter length2 = new UnitsConverter(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Feet_ShouldReturnFalse() {
        double length1 = 0.1;
        UnitsConverter length2 = new UnitsConverter(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.INCH);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given1InchAnd2Inch_ShouldReturnFalse() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(2.0, Units.INCH);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldReturnFalse() {
        UnitsConverter length1 = null;
        UnitsConverter length2 = new UnitsConverter(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Inch_ShouldReturnFalse() {
        double length1 = 0.1;
        UnitsConverter length2 = new UnitsConverter(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given3FeetEqualTo1Yard_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(3.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetNotEqualTo1Yard_ShouldReturnFalse() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchNotEqualTo1Yard_ShouldReturnFalse() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1YardEqualTo36inch_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.YARD);
        UnitsConverter length2 = new UnitsConverter(36.0, Units.INCH);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given36InchIfEqualTo1Yard_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(36.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardIfEqualTo3Feet_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.YARD);
        UnitsConverter length2 = new UnitsConverter(3.0, Units.FEET);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchIfEqualTo2Point5Cm_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(2.54, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchIfEqualTo5Cm_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(2.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(5.08, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengthsAfterAdding_IsEqualToProvidedLength_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(2.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(2.0, Units.INCH);
        UnitsConverter length3 = new UnitsConverter(4.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd2InchAfterMergingBothQuantity_IsEqualToProvidedThirdQuantity_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(2.0, Units.INCH);
        UnitsConverter length3 = new UnitsConverter(14.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1FeetAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(1.0, Units.FEET);
        UnitsConverter length2 = new UnitsConverter(1.0, Units.FEET);
        UnitsConverter length3 = new UnitsConverter(24.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchAnd2point5CmAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() {
        UnitsConverter length1 = new UnitsConverter(2.0, Units.INCH);
        UnitsConverter length2 = new UnitsConverter(2.5, Units.CM);
        UnitsConverter length3 = new UnitsConverter(3.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1KGAnd1000gm_CheckIfEqual_ShouldReturnTrue() {
        UnitsConverter weight1 = new UnitsConverter(1.0, Units.KG);
        UnitsConverter weight2 = new UnitsConverter(1000.0, Units.GRAM);
        boolean result = weight1.compare(weight2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Kg_CheckIFEquals_ShouldReturnTrue() {
        UnitsConverter weight1 = new UnitsConverter(1.0, Units.TONNE);
        UnitsConverter weight2 = new UnitsConverter(1000.0, Units.KG);
        boolean result = weight1.compare(weight2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000GmAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityCheckIfEqual_ShouldReturnTrue() {
        UnitsConverter weight1 = new UnitsConverter(1.0, Units.TONNE);
        UnitsConverter weight2 = new UnitsConverter(1000.0, Units.GRAM);
        UnitsConverter weight3 = new UnitsConverter(1001.0, Units.KG);
        boolean result = weight3.compare(weight1, weight2);
        Assert.assertTrue(result);
    }
}

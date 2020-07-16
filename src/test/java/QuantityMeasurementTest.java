import com.bridgelabz.quantitymeasurement.enums.Units;
import com.bridgelabz.quantitymeasurement.exception.QuantityException;
import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenFeetAndFeet_IfBothAreEqual_ShouldReturnTrue() {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(0.0, Units.FEET);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenFeetAndFeet_IfBothAreNotEqual_ShouldReturnFalse() {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(0.1, Units.FEET);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullFeetAndFeet_IfBothTypeNotEqual_ShouldReturnFalse() {
        QuantityMeasurement length1 = null;
        QuantityMeasurement length2 = new QuantityMeasurement(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertFalse(result);
    }

    @Test
    public void givenDoubleAndFeet_IfBothTypeNotEqual_ShouldReturnFalse() {
        double length1 = 0.1;
        QuantityMeasurement length2 = new QuantityMeasurement(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchAndInch_IfBothAreEqual_ShouldReturnTrue() {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.INCH);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenInchAndInch_IfBothAreNotEqual_ShouldReturnFalse() {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(2.0, Units.INCH);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullInchAndInch_IfBothNotMatch_ShouldReturnFalse() {
        QuantityMeasurement length1 = null;
        QuantityMeasurement length2 = new QuantityMeasurement(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertFalse(result);
    }

    @Test
    public void givenDoubleAndInch_IfBothTypeNotEqual_ShouldReturnFalse() {
        double length1 = 0.1;
        QuantityMeasurement length2 = new QuantityMeasurement(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetAndYard_BothAreEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(3.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetAndYard_IfBothAreNotEqual_ShouldReturnFalse() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchAndYard_IfBothNotEqual_ShouldReturnFalse() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenYardAndInch_IfBothAreEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.YARD);
        QuantityMeasurement length2 = new QuantityMeasurement(36.0, Units.INCH);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchAndYard_IfBothAreEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(36.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenYardAndFeet_IfBothAreEqual__ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.YARD);
        QuantityMeasurement length2 = new QuantityMeasurement(3.0, Units.FEET);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchAndCm_IfBothAreEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(2.54, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchAndCm_IfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(-2.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(5.08, Units.CM);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsAfterMerging_IsEqualToProvidedLength_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(2.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(2.0, Units.INCH);
        QuantityMeasurement length3 = new QuantityMeasurement(4.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetAndInchAfterMergingBothQuantity_IsEqualToProvidedThirdQuantity_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(2.0, Units.INCH);
        QuantityMeasurement length3 = new QuantityMeasurement(14.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetAndFeetAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(1.0, Units.FEET);
        QuantityMeasurement length3 = new QuantityMeasurement(24.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchAndCmAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement length1 = new QuantityMeasurement(2.0, Units.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(2.5, Units.CM);
        QuantityMeasurement length3 = new QuantityMeasurement(3.0, Units.INCH);
        boolean result = length3.compare(length1, length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenKGAndGm_CheckIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement weight1 = new QuantityMeasurement(1.0, Units.KG);
        QuantityMeasurement weight2 = new QuantityMeasurement(1000.0, Units.GRAM);
        boolean result = weight1.compare(weight2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTonneAndKg_CheckIFEquals_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement weight1 = new QuantityMeasurement(1.0, Units.TONNE);
        QuantityMeasurement weight2 = new QuantityMeasurement(1000.0, Units.KG);
        boolean result = weight1.compare(weight2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTonneAndGmAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityCheckIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement weight1 = new QuantityMeasurement(1.0, Units.TONNE);
        QuantityMeasurement weight2 = new QuantityMeasurement(1000.0, Units.GRAM);
        QuantityMeasurement weight3 = new QuantityMeasurement(1001.0, Units.KG);
        boolean result = weight3.compare(weight1, weight2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenGallonAndPoint78Litre_CheckIFEquals_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement volume1 = new QuantityMeasurement(1.0, Units.GALLON);
        QuantityMeasurement volume2 = new QuantityMeasurement(3.785, Units.LITRE);
        boolean result = volume1.compare(volume2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLitreAndMl_CheckIFEquals_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement volume1 = new QuantityMeasurement(1.0, Units.LITRE);
        QuantityMeasurement volume2 = new QuantityMeasurement(1000.0, Units.ML);
        boolean result = volume1.compare(volume2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenGallonAndLitreAfterMergingBothQuantity_IsEqualToThirdQuantityCheckIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement volume1 = new QuantityMeasurement(1.0, Units.GALLON);
        QuantityMeasurement volume2 = new QuantityMeasurement(3.785, Units.LITRE);
        QuantityMeasurement volume3 = new QuantityMeasurement(7.57, Units.LITRE);
        boolean result = volume3.compare(volume1, volume2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLitreAndMlAfterMergingBothQuantity_IsEqualToProvidedThirdQuantityCheckIfEqual_ShouldReturnTrue() throws QuantityException {
        QuantityMeasurement volume1 = new QuantityMeasurement(1.0, Units.LITRE);
        QuantityMeasurement volume2 = new QuantityMeasurement(1000.0, Units.ML);
        QuantityMeasurement volume3 = new QuantityMeasurement(2.0, Units.LITRE);
        boolean result = volume3.compare(volume1, volume2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValues_ShouldHandleException() {
        QuantityMeasurement volume1 = null;
        QuantityMeasurement volume2 = new QuantityMeasurement(5.0, Units.ML);
        QuantityMeasurement volume3 = new QuantityMeasurement(5.0, Units.LITRE);
        try {
            boolean result = volume3.compare(volume1, volume2);
            Assert.assertTrue(result);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.GIVENNULLVALUE, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLitreAndInch_IfDifferentTypeQuantity_ShouldReturnFalse() throws QuantityException {
        try {
            QuantityMeasurement length1 = new QuantityMeasurement(1.0, Units.LITRE);
            QuantityMeasurement length2 = new QuantityMeasurement(36.0, Units.INCH);
            boolean result = length1.compare(length2);
            Assert.assertFalse(result);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.ILLEGALTYPE, e.type);
            System.out.println(e.getMessage());
        }
    }
}

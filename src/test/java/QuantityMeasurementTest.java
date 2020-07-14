import com.bridgelabz.quantitymeasurement.service.Length;
import com.bridgelabz.quantitymeasurement.util.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length length1 = new Length(0.0, Units.FEET);
        Length length2 = new Length(0.0, Units.FEET);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        Length length1 = new Length(0.0, Units.FEET);
        Length length2 = new Length(0.1, Units.FEET);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnFalse() {
        Length length1 = null;
        Length length2 = new Length(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Feet_ShouldReturnFalse() {
        double length1 = 0.1;
        Length length2 = new Length(0.1, Units.FEET);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length length1 = new Length(1.0, Units.INCH);
        Length length2 = new Length(1.0, Units.INCH);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given1InchAnd2Inch_ShouldReturnFalse() {
        Length length1 = new Length(1.0, Units.INCH);
        Length length2 = new Length(2.0, Units.INCH);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldReturnFalse() {
        Length length1 = null;
        Length length2 = new Length(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Inch_ShouldReturnFalse() {
        double length1 = 0.1;
        Length length2 = new Length(0.1, Units.INCH);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given3FeetEqualTo1Yard_ShouldReturnTrue() {
        Length length1 = new Length(3.0, Units.FEET);
        Length length2 = new Length(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetNotEqualTo1Yard_ShouldReturnFalse() {
        Length length1 = new Length(1.0, Units.FEET);
        Length length2 = new Length(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchNotEqualTo1Yard_ShouldReturnFalse() {
        Length length1 = new Length(1.0, Units.INCH);
        Length length2 = new Length(1.0, Units.YARD);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }
}

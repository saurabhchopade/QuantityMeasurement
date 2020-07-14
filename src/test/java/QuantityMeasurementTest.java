import com.bridgelabz.quantitymeasurement.service.Length;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length length1 = new Length(0.0);
        Length length2 = new Length(0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        Length length1 = new Length(0.0);
        Length length2 = new Length(0.1);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnFalse() {
        Length length1 = null;
        Length length2 = new Length(0.1);
        boolean result = length2.equals(length1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Feet_ShouldReturnFalse() {
        double feet1 = 0.1;
        Length length2 = new Length(0.1);
        boolean result = length2.equals(feet1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length length1 = new Length(1.0);
        Length length2 = new Length(1.0);
        Assert.assertEquals(length1, length2);
    }
}

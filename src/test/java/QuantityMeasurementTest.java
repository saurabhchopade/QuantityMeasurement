import com.bridgelabz.quantitymeasurement.service.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldReturnFalse() {
        Feet feet1 = null;
        Feet feet2 = new Feet(0.1);
        boolean result = feet2.equals(feet1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenDoubleAnd1Feet_ShouldReturnFalse() {
        double feet1 = 0.1;
        Feet feet2 = new Feet(0.1);
        boolean result = feet2.equals(feet1);
        Assert.assertEquals(false, result);
    }
}

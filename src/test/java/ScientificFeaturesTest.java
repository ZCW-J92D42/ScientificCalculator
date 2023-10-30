import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.internal.runners.statements.Fail;

public class ScientificFeaturesTest {

    @Test
    public void testApplyDisplayModeBinary() {
        ScientificFeatures calculator = new ScientificFeatures();
        calculator.applyDisplayMode(1, 42);

        double result = calculator.applyDisplayMode(1, 42);

        Assert.assertEquals(101010, String.valueOf(result));
    }
    @Test
    public void testApplyDisplayModeOctal() {
        ScientificFeatures calculator = new ScientificFeatures();
        calculator.applyDisplayMode(2, 42);

        double result = calculator.applyDisplayMode(2, 42);

        Assert.assertEquals(52, String.valueOf(result));
    }
    @Test
    public void testApplyDisplayModeDecimal() {
        ScientificFeatures calculator = new ScientificFeatures();
        calculator.applyDisplayMode(3, 42);

        double result = calculator.applyDisplayMode(3, 42);

        Assert.assertEquals(42, String.valueOf(result));
    }
    @Test
    public void testApplyDisplayModeHexadecimal() {
        ScientificFeatures calculator = new ScientificFeatures();
        calculator.applyDisplayMode(4, 42);

        double result = calculator.applyDisplayMode(4, 42);

        Assert.assertEquals(9, String.valueOf(result));
    }
}

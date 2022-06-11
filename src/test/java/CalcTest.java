import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.lang.Integer;
import java.util.Arrays;

public class CalcTest {
    private Calculator calculator;
    public int []arrayToCheck1 = new int[]{5, 3, 6};
    public int []arrayToCheck2 = new int[]{1, 7};
    public int []arrayToCheck3 = new int[]{3};
    public int []arrayToCheck4 = new int[]{5, 3, 2};
    public int []arrayToCheck5 = new int[]{7, 2, 5, 8, 9, 10};
    public int []arrayToCheck6 = new int[]{};
    public int arr1[] = new int[]{1, 3, 2, 4, 5, 3, 6};
    public int arr2[] = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
    public int arr3[] = new int[]{1, 4, 4, 1, 1, 4, 3};
    public int arr4[] = new int[]{7, 5, 12, 4, 5, 3, 2};
    public int arr5[] = new int[]{12, 12, 24, 4 , 7, 2, 5, 8, 9, 10};
    public int arr6[] = new int[]{1, 3, 2, 4, 5, 3, 6, 4};
    public int arr[] = {3, 2, 1, 3, 6};
    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Disabled
    public void testAdd() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void testEqual1() {
        Assertions.assertArrayEquals(arrayToCheck1, calculator.arrTest(arr1) );

    }@Test
    public void testEqual2() {
        Assertions.assertArrayEquals(arrayToCheck2, calculator.arrTest(arr2) );

    }@Test
    public void testEqual3() {
        Assertions.assertArrayEquals(arrayToCheck3, calculator.arrTest(arr3) );

    }@Test
    public void testEqual4() {
        Assertions.assertArrayEquals(arrayToCheck6, calculator.arrTest(arr6) );
    }
    @Test
    public void containsNumbersTest1() {
        Assertions.assertEquals(true, calculator.containsNumbers(arr));
    }
    @Test
    public void containsNumbersTest2() {
        Assertions.assertEquals(false, calculator.containsNumbers(arrayToCheck6));
    }
    @Test
    public void containsNumbersTest3() {
        Assertions.assertEquals(false, calculator.containsNumbers(arrayToCheck5));
    }
    @Test
    public void containsNumbersTest4() {
        Assertions.assertEquals(true, calculator.containsNumbers(arr1));
    }
}
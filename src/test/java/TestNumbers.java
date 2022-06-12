import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestNumbers {
    private Testing testing;
    public int[][] arr = {{1, 3, 2, 4, 5, 3, 6},{1, 2, 4, 4, 2, 3, 4, 1, 7},{1, 4, 4, 1, 1, 4, 3},{7, 5, 12, 4, 5, 3, 2},{12, 12, 24, 4 , 7, 2, 5, 8, 9, 10},{1, 3, 2, 4, 5, 3, 6, 4}};
    public int [][] arrayToCheck = {{5, 3, 6},{1, 7},{3},{5, 3, 2},{7, 2, 5, 8, 9, 10},{}};

    @BeforeEach
    public void init() {
        testing = new Testing();
    }

    @Test
    public void testEqual1() {
        int[] nums = arr[0];
        Assertions.assertArrayEquals(arrayToCheck[0], testing.arrTest(nums) );
    }
    @Test
    public void testEqual2() {
        int[] nums = arr[1];
        Assertions.assertArrayEquals(arrayToCheck[1], testing.arrTest(nums) );
    }
    @Test
    public void testEqual3() {
        int[] nums = arr[2];
        Assertions.assertArrayEquals(arrayToCheck[2], testing.arrTest(nums) );
    }
    @Test
    public void testEqual4() {
        int[] nums = arr[3];
        Assertions.assertArrayEquals(arrayToCheck[3], testing.arrTest(nums) );
    }
    @Test
    public void containsNumbersTest1() {
        Assertions.assertEquals(true, testing.containsNumbers(arr[0]));
    }
    @Test
    public void containsNumbersTest2() {
        Assertions.assertEquals(false, testing.containsNumbers(arrayToCheck[0]));
    }
    @Test
    public void containsNumbersTest3() {
        Assertions.assertEquals(false, testing.containsNumbers(arrayToCheck[5]));
    }
    @Test
    public void containsNumbersTest4() {
        Assertions.assertEquals(true, testing.containsNumbers(arr[1]));
    }
}
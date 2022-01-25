import com.sparta.basics.Summer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummerTest {
    Summer summer = new Summer();
    @Test
    public void testSumArray(){
        int[] myInts = {1,2,3,4,5};
        int actual = summer.sumArray(myInts);
        Assertions.assertEquals(15, actual);
    }
    @Test
    public void negativeTestSumArray(){
        int[] negInts = {-1, -5, -10, -15};
        int actual = summer.sumArray(negInts);
        Assertions.assertEquals(-31, actual);
    }
    @Test
    public void maxInt(){
        int maxInts[] = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int actual = summer.sumArray(maxInts);
        Assertions.assertEquals(-2, actual);
    }
}
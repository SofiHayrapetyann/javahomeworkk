import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderTest {
    @Test(groups = "smoke")
    public void test1(){
        System.out.println(1);
    }
@DataProvider(name="smoke")
        public Object[][] dataTest(){
    return new Object[][] {
            {8,2,4},
            {4,2,2}
    };
}


}

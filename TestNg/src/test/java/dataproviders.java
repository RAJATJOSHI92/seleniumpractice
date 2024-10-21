import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {
    @Test(dataProvider = "dataname")
    public void test(String username,String pasward)
    {
        System.out.println("username"+username);
        System.out.println("passward"+pasward);
    }

    @DataProvider(name = "dataname")
    public Object[][] getdata()
    {
        Object[][] data={{"raja@gmaiul","passward1"},{"joshi@","passward2"},{"email","passward3"}};
        return  data;
    }
}

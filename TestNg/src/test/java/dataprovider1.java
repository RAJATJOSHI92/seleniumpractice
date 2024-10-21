import org.testng.annotations.Test;

public class dataprovider1 {
    @Test(dataProvider = "dataname",dataProviderClass = dataproviders.class)
    public void test(String username,String pasward)
    {
        System.out.println("username"+username);
        System.out.println("passward"+pasward);
    }
}

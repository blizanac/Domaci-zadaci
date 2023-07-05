package Tests;

import org.testng.annotations.Test;

public class Tests extends BaseTest{

    @Test
    public void verifayclickSingInButton(){
        getIndexPage().open()
                .SingInButtonClick();
    }
}

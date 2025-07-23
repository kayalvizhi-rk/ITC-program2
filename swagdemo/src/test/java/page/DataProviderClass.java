package page;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	

	    @DataProvider(name = "loginData")
	    public Object[][] provideLoginData() {
	        return new Object[][] {
	            {"standard_user", "secret_sauce", true}, // Valid credentials
	            {"problem_user", "secret_sauce", true},   // Valid credentials
	           {"locked_out_user", "secret_sauce", false},// Invalid credentials
	            {"standard_user", "wrong_password", false},  // Invalid credentials
	            {"standard_user", "secret_sauce", true}
	        };
	    }
	}



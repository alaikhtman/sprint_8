import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    public String name;
    public boolean isValidName;

    public AccountTest(String name, boolean isValidName) {
        this.name = name;
        this.isValidName = isValidName;

    }

    @Parameterized.Parameters
    public static Object[][] checkName() {
        return new Object[][]{
                {"Anna Ivanova", true},
                {"A I", true},
                {"123456789 123456789", true},
                {"AI", false},
                {"123456789 1234567890", false},
                {"Anna Ivanova ", false},
                {" Anna Ivanova", false},
                {" Anna Ivanova ", false},
                {"Anna Ivan ova ", false},
        };
    }


    @Test
    public void checkNameToEmbossTest() {
        Account testAccount = new Account(name);
        boolean actualIsValid = testAccount.checkNameToEmboss();
        Assert.assertEquals(isValidName, actualIsValid);

    }
}

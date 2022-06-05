import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoodTester {
    @Test
    public void foodTest(){
        Food frenchPotatoes = new FrenchPotatoes();
        Assertions.assertEquals("Food: French Potatoes", frenchPotatoes.serve());
    }

    @Test
    public void addSauceTest(){
        Food spaghetti = new Spaghetti();
        AddSauce sauceAdded = new AddSauce(spaghetti);
        Assertions.assertEquals("Food: Spaghetti with Sauce", sauceAdded.serve());
    }
}

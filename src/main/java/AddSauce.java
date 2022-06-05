public class AddSauce extends SauceDecorator{

    public AddSauce(Food decoratedFood) {
        super(decoratedFood);
    }

    public String serve(){
        return addSauce();
    }

    private String addSauce(){
        return decoratedFood.serve() + " with Sauce";
    }

}

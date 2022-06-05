public abstract class SauceDecorator implements Food{
    protected Food decoratedFood;

    public SauceDecorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }

    public String serve(){
        return decoratedFood.serve();
    }
}

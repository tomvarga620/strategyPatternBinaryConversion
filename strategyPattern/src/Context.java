public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){

        this.strategy = strategy;

    }

    public String executeStrategy(int numToConvert){

        return strategy.addOperation(numToConvert);

    }

}

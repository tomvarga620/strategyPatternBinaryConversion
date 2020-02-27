public class Octa implements Strategy {
    @Override
    public String addOperation(int numToConvert) {
        return Integer.toOctalString(numToConvert);
    }
}

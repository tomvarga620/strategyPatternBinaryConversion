public class Bin implements Strategy {
    @Override
    public String addOperation(int numToConvert) {
        return Integer.toBinaryString(numToConvert);
    }
}

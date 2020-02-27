public class Hex implements Strategy {
    @Override
    public String addOperation(int numToConvert) {
        return Integer.toHexString(numToConvert);
    }
}

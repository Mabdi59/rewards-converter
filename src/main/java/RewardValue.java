public class RewardValue {
    private double cash;
    private double milesValue;

    // This is the rate for converting miles to cash
    private static final double RATE = 0.0035;

    // Constructor for cash
    public RewardValue(double cash) {
        this.cash = cash;
        this.milesValue = cash / RATE;
    }

    // Constructor for miles
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cash = miles * RATE;
    }

    // Get the cash value
    public double getCash() {
        return cash;
    }

    // Get the miles value
    public double getMiles() {
        return milesValue;
    }

    public String getMilesValue() {
        return String.format("%.2f miles", milesValue);
    }
}
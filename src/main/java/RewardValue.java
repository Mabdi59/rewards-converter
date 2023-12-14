public class RewardValue {
    private double cashValue;
    private double milesValue;

    // This is the rate for converting miles to cash
    private static final double RATE = 0.0035;

    // Constructor for cash
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / RATE;
    }

    // Constructor for miles
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * RATE;
    }

    // Get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Get the miles value as a double
    public double getMiles() {
        return this.milesValue;
    }

    public String getMilesValue() {
        return String.format("%.2f miles", this.milesValue);
    }
}
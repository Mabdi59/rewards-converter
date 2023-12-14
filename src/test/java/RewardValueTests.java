import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.01, "Creating with cash value did not set the correct cash value");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMiles(), 0.01, "Creating with miles value did not set the correct miles");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMiles(), 0.01, "Conversion from cash to miles is incorrect");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01, "Conversion from miles to cash is incorrect");
    }
}
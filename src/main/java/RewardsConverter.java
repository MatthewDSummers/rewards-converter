import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        // Cash
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

        // Mileage
        System.out.println("Please enter a mileage value to convert it to cash: ");
        var mileage_input = scanner.nextLine();
        int mileageValue;
        try{
            mileageValue = Integer.parseInt(mileage_input);
        }catch (NumberFormatException exception) {
            System.out.println("Could not parse mileage value as an integer, exiting");
            return;
        }
        System.out.println("converting " + mileage_input + " miles to cash");
        var mileageReward = new RewardValue(mileageValue);
        System.out.println(mileage_input + " mile is worth $" + mileageReward.getCashValue());
    }
}
public class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double applyDiscount(double price) {
        return price - (price * percentage / 100);
    }
}

public abstract class Product implements Cloneable {
    String name;
    double price;
    boolean available;
    DiscountStrategy discountStrategy;

    public Product(String name, double price, boolean available, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.discountStrategy = discountStrategy;
    }

    double getPriceAfterDiscount() {
        return discountStrategy.applyDiscount(price);
    }

    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}

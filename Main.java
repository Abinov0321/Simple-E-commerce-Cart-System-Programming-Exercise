public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product laptop = new Laptop("Laptop", 1000, true, new NoDiscount());
        Product headphones = new Headphones("Headphones", 50, true, new PercentageDiscount(10));

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(headphones);
        cart.updateQuantity(laptop, 2);

        System.out.println("Total bill: " + cart.calculateTotal());
    }
}

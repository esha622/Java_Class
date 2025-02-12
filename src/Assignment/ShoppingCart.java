package Assignment;

class Item {
    private String name;
    private double price;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
class ShoppingCart {
    private Item item1;
    private Item item2;
    public void addItem(Item item) {
        if (item1 == null) {
            item1 = item;
            System.out.println("Added: " + item.getName());
        } else if (item2 == null) {
            item2 = item;
            System.out.println("Added: " + item.getName());
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }
    public void removeItem(String itemName) {
        if (item1 != null && item1.getName().equals(itemName)) {
            item1 = null;
            System.out.println("Removed: " + itemName);
        } else if (item2 != null && item2.getName().equals(itemName)) {
            item2 = null;
            System.out.println("Removed: " + itemName);
        } else {
            System.out.println("Item not found in the cart.");
        }
    }
    public double calculateTotal() {
        double total = 0;
        if (item1 != null) total += item1.getPrice();
        if (item2 != null) total += item2.getPrice();
        return total;
    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Laptop", 999.99);
        Item item2 = new Item("Mouse", 25.50);

        cart.addItem(item1);
        cart.addItem(item2);
        System.out.println("Total Price: $" + cart.calculateTotal());

        cart.removeItem("Laptop");
        System.out.println("Total Price after removal: $" + cart.calculateTotal());
    }
}
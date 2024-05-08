public class ClothingItem extends Item {

    private String size;
    private String color;

    public ClothingItem(int id, String name, double price, int quantity, String size, String color) {
        super(id, name, price, quantity);
        this.size = size;
        this.color = color;
    }

    @Override
    public void restock(int quantityToAdd) {
        setQuantity(getQuantity() + quantityToAdd);
    }

    @Override
    public void sell(int quantityToSell) {
        if (getQuantity() >= quantityToSell) {
            setQuantity(getQuantity() - quantityToSell);
            System.out.println("Sold " + quantityToSell + " " + getName());
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

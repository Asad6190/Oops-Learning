public class FoodItem extends Item {


    private String expirationDate;

    public FoodItem(int id, String name, double price, int quantity, String expirationDate) {
        super(id, name, price, quantity);
        this.expirationDate = expirationDate;
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
            System.out.println("Insufficient Quantity to sell ");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}

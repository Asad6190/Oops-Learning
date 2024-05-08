public class ElectronicItem extends Item {

    private String brand;
    private String model;

    public ElectronicItem(int id, String name, double price, int quantity, String brand, String model) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void restock(int quantityToAdd) {
        setQuantity(getQuantity() + quantityToAdd);
    }

    @Override
    public void sell(int quantityToSell) {
        if (getQuantity() >= quantityToSell) {
            setQuantity(getQuantity() - quantityToSell);
            System.out.println("Sold out of " + quantityToSell + " " + getName());
        } else {
            System.out.println("Insufficient Quantity");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $ " + getPrice());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

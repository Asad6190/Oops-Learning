public class Main {
    public static void main(String[] args) {
        ElectronicItem electronicItem = new ElectronicItem(1, "Laptop", 1020.20, 10, "Huawei", "Matebook x Pro");
        ClothingItem clothingItem = new ClothingItem(2, "Shirt", 25.99, 5, "M", "Navy Blue");
        FoodItem foodItem = new FoodItem(3, "Banana", 20, 12, "10/08/24");

        //Display Items
        System.out.println("Printing ElectronicItem information");
        electronicItem.displayDetails();

        System.out.println("\nPrinting ClothingItem information");
        clothingItem.displayDetails();

        System.out.println("\nPrinting FoodItem information");
        foodItem.displayDetails();

        //Sell Items
        System.out.println("\nPrinting ElectronicItem Sell information");
        electronicItem.sell(2);


        System.out.println("\nPrinting ClothingItem Sell information");
        clothingItem.sell(3);

        System.out.println("\nPrinting FoodItem Sell information");
        foodItem.sell(6);
    }
}
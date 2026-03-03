package LAB_5.Q_3;

public class ElectricalProduct extends Product{
    int voltageRange;
    int wattage;

    ElectricalProduct(int productID, String name, int categoryID, int unitPrice, int voltageRange, int wattage)
    {
        this.productID = productID;
        this.name = name;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
        this.voltageRange = voltageRange;
        this.wattage = wattage;

    }

    void changeWattage(int newWattage)
    {
        this.wattage = newWattage;
    }

    void changePrice(int newPrice)
    {
        this.unitPrice = newPrice;
    }

    void display()
    {
        System.out.println("productID = " + productID);
        System.out.println("name = " + name);
        System.out.println("categoryID = " + categoryID);
        System.out.println("unit price = " + unitPrice);
        System.out.println("productID = " + productID);
        System.out.println("voltage Rnage = " + voltageRange);
        System.out.println("wattage = " + wattage);
    }
}

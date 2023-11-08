// Create the Product interface
interface Product {
    double calculateSalesForLastThreeMonths();
}

// Hardware class implementing the Product interface
class Hardware implements Product {
    private String category;
    private String manufacturer;
    private double sales[];

    public Hardware(String category, String manufacturer, double[] sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public double calculateSalesForLastThreeMonths() {
        double totalSales = 0.0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

// Software class implementing the Product interface
class Software implements Product {
    private String type;
    private String operatingSystem;
    private double sales[];

    public Software(String type, String operatingSystem, double[] sales) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    @Override
    public double calculateSalesForLastThreeMonths() {
        double totalSales = 0.0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

public class CompanySalesDemo {
    public static void main(String[] args) {
        // Example sales data for hardware and software
        double[] hardwareSales = {1000.0, 1500.0, 1200.0};
        double[] softwareSales = {800.0, 1100.0, 900.0};

        // Create hardware and software products
        Hardware hardwareProduct = new Hardware("Laptops", "Dell", hardwareSales);
        Software softwareProduct = new Software("Antivirus", "Windows", softwareSales);

        // Calculate and display the total sales for the last 3 months
        System.out.println("Hardware Total Sales: $" + hardwareProduct.calculateSalesForLastThreeMonths());
        System.out.println("Software Total Sales: $" + softwareProduct.calculateSalesForLastThreeMonths());
    }
}

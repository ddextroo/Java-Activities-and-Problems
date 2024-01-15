class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	//Generic constructor provided so that setters can be used to set variable values
	public Invoice() {
		partNumber = "";
		partDescription ="";
		quantity = 0;
		pricePerItem = 0.0;
	}
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}
	
	public double getInvoiceAmount(){
		return quantity * pricePerItem;
	}

	//Generic getter method
	public String getPartNumber() {
		return partNumber;
	}
	//Generic setter method
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	//Generic getter method
	public String getPartDescription() {
		return partDescription;
	}

	//Generic setter method
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	//Generic getter method
	public int getQuantity() {
		return quantity;
	}
	
	//Setter method makes sure that quantity is a positive number
	public void setQuantity(int quantity) {
		//If the quantity is not positive, it should be set to zero
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	//Setter method makes sure that price per item is a positive number
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		} else {
			this.pricePerItem = 0.0;
		}
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription="
				+ partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}
	
	
}
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("P000003", "Part Number 3", -2, 4.99);
        System.out.println("Testing negative Quantity. Total Invoice should be 0");
        displayInvoiceDetails(invoice);
    
        Invoice invoice1 = new Invoice("P000001", "Part Number 1", 5, 4.99);
        System.out.println("Standard Functionality Test. Total Invoice should be 24.95");
        displayInvoiceDetails(invoice1);
    
        // Additional test with zero price
        Invoice invoice2 = new Invoice("P000002", "Part Number 2", 10, 0.0);
        System.out.println("Testing zero Price. Total Invoice should be 0");
        displayInvoiceDetails(invoice2);
    }
    
    private static void displayInvoiceDetails(Invoice invoice) {
        System.out.printf("Invoice for Part: %s \t", invoice.getPartNumber());
        System.out.printf("Part Description: %s \t", invoice.getPartDescription());
        System.out.printf("Quantity: %s \t", invoice.getQuantity());
        System.out.printf("Price Per Item: %.2f \n", invoice.getPricePerItem());
        System.out.printf("Total Invoice Amount: %.2f \n", invoice.getInvoiceAmount());
        System.out.println("***************************************************");
        System.out.println();
    }
}
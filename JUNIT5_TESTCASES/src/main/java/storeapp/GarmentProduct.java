package storeapp;


	import java.time.LocalDate;


	public class GarmentProduct {
	    private final String name;
	    private final int saleCount;
	    private final double price;
	    private final LocalDate saleDate;

	    public GarmentProduct(String name, int saleCount, double price, LocalDate saleDate) {
	        this.name = name;
	        this.saleCount = saleCount;
	        this.price = price;
	        this.saleDate = saleDate;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getSaleCount() {
	        return saleCount;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public LocalDate getSaleDate() {
	        return saleDate;
	    }

	    public double getTotalSaleAmount() {
	        return saleCount * price;
	    }
	}
	
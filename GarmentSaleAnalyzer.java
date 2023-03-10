package storeapp;



	import java.time.LocalDate;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;

	// TODO: Auto-generated Javadoc
	/**
	 * Hello world!.
	 */
	public class GarmentSaleAnalyzer {
	  
	  /** The garments. */
	  private final List<GarmentProduct> garments;

	  /**
	   * Instantiates a new garment sale analyzer.
	   *
	   * @param garments the garments
	   */
	  public GarmentSaleAnalyzer(List<GarmentProduct> garments) {
		  
		  this.garments = garments;
	  }

	  /**
	   * Analyze.
	   *
	   * @param selectedDate the selected date
	   * @return the map
	   */
	  public Map<String, Double> analyze(LocalDate selectedDate) {
	      List<GarmentProduct> selectedGarments = garments.stream()
	              .filter(g -> g.getSaleDate().equals(selectedDate))
	              .collect(Collectors.toList());

	      Map<String, Double> garmentSales = new HashMap<>();

	      for (GarmentProduct garment : selectedGarments) {
	          double totalSaleAmount = garment.getTotalSaleAmount();
	          if (garmentSales.containsKey(garment.getName())) {
	              totalSaleAmount += garmentSales.get(garment.getName());
	          }
	          garmentSales.put(garment.getName(), totalSaleAmount);
	      }

	      return garmentSales;
	  }
	}
	
// Eric Braun
// 10121660
// 13eb20

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public abstract class Building{
    
    // Initiailizing all the instances to be used in subclasses.
    protected int unit;
    protected int locationRating;
    protected boolean elevator = false;
    protected int bedrooms;
    protected int bathrooms;
    protected int rating = 0;
    protected static int rent;
    protected int tax;
    
    // These will be used for the sorting methods.
    protected static int rentCompare;
    protected static int taxCompare;
    protected static int profitCompare;

    // Rent method used by all kinds of buildings taking in no parameters.
    // Returns the rent as an integer.
    public abstract int rent();
    // Tax method used by all kinds of building taking in no parameters.
    // Returns the tax of the building as an integer.
    abstract int tax();
    
    // Constructor for new RentComparator to be used by rent sort method.
    public static class RentComparator implements Comparator<Building> {
        
        // Overriding the compare method
        public int compare(Building b1, Building b2){
            Integer rent1 = b1.rent();
            Integer rent2 = b2.rent();
            rentCompare = rent1.compareTo(rent2);
            return rentCompare;
        }// end compare method
    }// end RentCompator constructor

    // Constructor for new TaxComparator to be used by tax sort method
    public static class TaxComparator implements Comparator<Building> {
        public int compare(Building b1, Building b2){
            Integer tax1 = b1.tax();
            Integer tax2 = b2.tax();
            taxCompare = tax1.compareTo(tax2);
            return taxCompare;
        }// end compare method
    }// end TaxComparator constructor
    
    // Constructor for new ProfitComparator to be used by profit sort method 
    public static class ProfitComparator implements Comparator<Building>{
        public int compare(Building b1, Building b2){
            
            // Landlord's profit is calculated by the rent minus the tax.
            Integer profit1 = b1.rent()- b1.tax();
            Integer profit2 = b2.rent() - b2.tax(); 
            profitCompare = profit1.compareTo(profit2);
            return profitCompare;
        }// end compare method
    }// end ProfitComparator constructor
    
    // Sort methods take in parameter of the ArrayList of buildings.
    // sortByRent sorts the buildings in descending order by their rent
    static void sortByRent(ArrayList<Building> building) { 
        Collections.sort(building, new RentComparator());
    }
   
    // soryByProfit organizes the list in descending order by the landlord's profit
    static void sortByProfit(ArrayList<Building> building){
        Collections.sort(building, new ProfitComparator());
    }
    
    // sortByTax organizes the list in descending order by their taxes.
    static void sortByTax(ArrayList<Building> building){
        Collections.sort(building, new TaxComparator());
    }
}// end Building Class
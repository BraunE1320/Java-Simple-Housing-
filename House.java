import java.util.ArrayList;
public class House extends Building {
    
    // Constructor for house
    public House (int br, int ba) throws BuildingException {
        bedrooms = br; 
        // Throws exception if there are less than 2 bedrooms
        if (bedrooms < 2) {
            throw new BuildingException(2);
        }
        bathrooms = ba;
        
        // Throws exception if there are less than 1 bathroom
        if (bathrooms < 1) {
            throw new BuildingException(3);
        }
    } // end constructor
    
    // method extension adds bedrooms and/or bathrooms to House
    public void extension(int newBr, int newBa) {
        bedrooms += newBr;
        bathrooms += newBa;
    } // end extension class
    
    // method rent is set through assignment details
    public int rent() {
        rent = 1000;
        if (bedrooms > 2) {
            // add $200 for every bedroom more than 2.
            rent += 200*(bedrooms-2);
        }
        if (bathrooms > 1) {
            // add $100 for every bathroom more than 1.
            rent += 100*(bathrooms-1);
        }
        return rent;
    } //end rent method
    
    // method tax is set through assignment's details
    public int tax() {
        tax = (200*bedrooms) + (50*bathrooms);
        return tax;
    }// end tax method
    
    //Override toString method
    public String toString() {
        String bedroomString = "bedrooms";
        String bathroomString = "bathrooms";
        
        // If statement changes output between singular and plural
        if (bedrooms == 1) {
            bedroomString = "bedroom";
        }
        if (bathrooms == 1) {
            bathroomString = "bathroom";
        }
        return "house (" + bedrooms + " " + bedroomString + ", " + bathrooms + " " + bathroomString + ")";
    }// end toString method
}
   
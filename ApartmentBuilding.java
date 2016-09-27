import java.util.ArrayList;
public class ApartmentBuilding extends MultiUnitBuilding {

    // Start apartment constructor
    public ApartmentBuilding(int u, int r, boolean e) {
       unit = u;
       locationRating = r;
       elevator = e; 
    }// end constructor
   
    // method rent sets the rent based on prof's instructions.
    public int rent() {
       rent = 500;
       if (locationRating > 1) {
           // add $100 for every rating point after 1.
           rent += 100*(locationRating-1);
       }
       if (elevator) {  
           // add $50 if there's an elevator.
           rent += 50;
       }
       rent *= unit;
       return rent;
    }
    
    // Method rent is defined through prof's instructions
    public int tax(){
        tax = (unit*200);
        if (elevator) {
            // add $100 if there's an elevator.
            tax += 100;
        }
        return tax;
    }
    
    // Override toString method.
    // Uses if statement to change between plural and singular in the output.
    public String toString() {
        String elevatorString;
        String unitString = "units";
        if (elevator) {
            elevatorString = "elevator";
        }
        else {
            elevatorString = "no elevator";
        }
        if (unit == 1) {
            unitString = "unit";
        }
        return "apartments (" + unit + " " + unitString + ", location rating " + locationRating + ", " + elevatorString + ")";
        
    }
}
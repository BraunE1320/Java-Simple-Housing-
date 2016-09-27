import java.util.ArrayList;
public class OfficeBuilding extends MultiUnitBuilding {
    
    // Constructor for OfficeBuilding
    public OfficeBuilding(int u, boolean e) {
        unit = u;
        elevator = e;
    }// end OfficeBuilding constructor
    
    // method tax sets the tax dependent on profs instructions
    public int tax() {
        tax = 1000;
        if (elevator) {
            // add $100 if there's an elevator
            tax += 100;
        }
        if (unit > 5) {
            // add $1000 if there's more than 5 office units
            tax += 1000;
        }
        return tax;
    }// end tax method
    
    // method rent sets the rent dependent on profs instructions
    public int rent() {
        rent = 2000;
        if (elevator) {
            // add $50 if there's an elevator
            rent += 50;
        }
        rent *= unit;
        return rent;
    }// end rent method
    
    // Override the toString method
    public String toString() {
        String elevatorString;
        String officeString = "offices";
        
        // If statement changes the output between plural and singular
        if (elevator) {
            elevatorString = "elevator";
        }
        else {
            elevatorString = "no elevator";
        }
        if (unit == 1) {
            officeString = "office";
        }
        return "offices (" + unit + " " + officeString + ", " + elevatorString + ")";
        
    }// end toString method
}// end OfficeBuilding class


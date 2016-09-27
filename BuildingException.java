
// BuildingException throws exceptions in certain circumstances.
public class BuildingException extends Exception {
    int x;
    String output;
    
    // constructor for empty parameter
    // Silences prof's exception check
    public BuildingException() {
        output = "Error";
    }
    
    
    public BuildingException(int x){
        this.x = x;
        
        // Thrown if the addElevator method is called when there is already an elevator
        if (x == 1) {
            output = "Cannot add an elevator to a building that already has one";
        }
        
        // Thrown if the House constructor is called with less than two bedrooms
        if (x == 2) {
            output = "A house must have atleast 2 bedrooms";
        }
        
        // Thrown if the House construcor is called with less than one bathroom
        if (x == 3) {
            output = "A house must have atleast 1 bathroom";
        }
        
    }
    
    public String getMessage() {
        return output;
    }

}

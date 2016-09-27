public abstract class MultiUnitBuilding extends Building {
    
    // addElevator class is used by both OfficeBuilding and ApartmentBuilding
    public void addElevator() throws BuildingException {
        
        // If there isn't already an elevator, add an elevator
        if (!elevator){
            elevator = true;
        }
        
        // If there is already an elevator, throw BuildingException
        else {
            throw new BuildingException(1);
        }
        
    }
    
    // extension method takes in integer of units then adds that number to amount of units.
    public void extension(int u){
        unit += u;
    }
}

import java.util.ArrayList;

public class Simulation
{
    private int rows;
    private int columns;
    private ArrayList<Vehicle> vehicles;
    private int bonus;
    private int steps;
    private int currentTime;

    public void Simulation(int inRows, int inColumns, int inFleet, int inRides, int inBonus, int inSteps)
    {
        int count;

        rows = inRows;
        columns = inColumns;
        bonus = inBonus;
        steps = inSteps;
        currentTime = 0;
        vehicles = new ArrayList<>();

        for(int count = 0; count < inFleet; count++)
        {
            vehicles.add(new Vehicle());
        }

        for(int count = 0; count < inRides; count++)
        {
            rides.add(new Ride);
        }
        currentTime = 0;
    }

    public void assignRide(Ride input)
    {
        //Find the closest available vehicle and assign it to a vehicle
    }

    void checkDest()
    {
        for (int x = 0; x < vehicles.size(); x++)
        {
            Vehicle vehicleToCheck = vehicles.get(x);
            for (int i = 0; i < vehicleToCheck.ridesAssigned().size(); i++)
            {
                if (vehicleToCheck.getRowPosition == vehicleToCheck.ridesAssigned().get(i).getFinishY() && vehicleToCheck.getColumnPosition() == vehicleToCheck.ridesAssigned().get(i).getFinishX())
                {
                    if (vehicleToCheck.ridesAssigned().size() == 0)
                    {
                        vehicleToCheck.rideFinished(vehicleToCheck.ridesAssigned().get(i));
                    }
                }
            }
        }
    }
    //advanceTime()
    {
    /*First, check if any vehicles are at destinations. Add points to vehicle if applicable and free them.
    Then, assign rides to available vehicles. Any vehicles still free after this remain in place.
    Vehicles moving to pick up or transporting a passenger, move 1 x in direction of destination or 1 y if already at correct x
    If a vehicle arrives at a pick-up exactly on time, apply bonus
    Vehicles at pick-up must wait if currentTime < earliest start
    Finally, increment currentTime
     */
    }
    
}
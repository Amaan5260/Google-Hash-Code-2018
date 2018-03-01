
import java.util.ArrayList;

public class Simulation
{
    private int rows;
    private int columns;
    private ArrayList<Vehicle> vehicles;
    private int bonus;
    private int steps;
    private int currentTime;

    public void Simulation(int inRows, int inColumns, int inFleet, int inRides, int inBonus, int inSteps) //input params are passed through file
    {
        int count;

        rows = inRows;
        columns = inColumns;
        bonus = inBonus;
        steps = inSteps;
        currentTime = 0;
        vehicles = new ArrayList<>();
        rides = new ArrayList<>();

        for(count = 0; count < inFleet; count++)
        {
            vehicles.add(new Vehicle());
        }


    }

    public void assignRide(Ride input)
    {
        int min = 99999999999999;
        double dist;
        Vehicle closest;
        for (int i = 0; i<vehicles.size(); i++) {
            dist = Math.abs(vehicles.get(i).getRowPosition()-input.getStartX()) + Math.abs(vehicles.get(i).getColumnPosition()-input.getStartY())
            if ((dist < min) && (vehicles.get(i).isInRide()==false))  {
                min = dist;
                closest = vehicles.get(i);
            }
        }
        closest.inRide = true;
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

    public void readFile()
    {
        /*Take input file, parse second line onwards and pass values to Ride constructors
         while(file.hasNextLine)
        {
            READ DA LINE OF DA FILE AND PARSE IT INTO DA INDIVIDUAL FILES
            rides.add(new Ride(PARAMETERS INNIT));
        }

         */
    }

    ArrayList getVehicle()
    {
        return vehices;
    }
}

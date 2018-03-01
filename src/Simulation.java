
import java.util.ArrayList;

public class Simulation
{
    private int rows;
    private int columns;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Ride> rides;
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
            vehicles.add(new Vehicle())
        }

        for(int count = 0; count < inRides; count++)
        {
            rides.add(new Ride)
        }
    }
}
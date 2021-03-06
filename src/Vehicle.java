import java.lang.reflect.Array;
import java.util.ArrayList;


public class Vehicle
{
    private int rowPosition;
    private int columnPosition;
    private int pointsEarned;
    private boolean inRide;
    private ArrayList<Ride> rides;

    public void Vehicle()
    {
        rowPosition = 0;
        columnPosition = 0;
        pointsEarned = 0;
        inRide = false;
    }

    public int getRowPosition
    {
        return rowPosition;
    }

    public int getColumnPosition()
    {
        return columnPosition;
    }

    public int getPointsEarned()
    {
        return pointsEarned;
    }

    public boolean isInRide()
    {
        return inRide;
    }

    public ArrayList<Ride> ridesAssigned()
    {
        return rides;
    }

    public boolean rideFinished(Ride rideFin)
    {
        rides.remove(rideFin);
        this.inRide = false;
    }
}

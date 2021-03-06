import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.Math;
import java.lang.Boolean;

public class Ride {
    private int startx;
    private int starty;
    private int finishx;
    private int finishy;
    private int earliestStart;
    private int latestFinish;
    private boolean assigned;

    public Ride(int startx,int starty,int finishx,int finishy,int earliestStart,int latestFinish)
    {
      this.startx=startx;
      this.starty=starty;
      this.finishx=finishx;
      this.finishy=finishy;
      this.earliestStart=earliestStart;
      this.latestFinish=latestFinish;
    }

    public Ride()
    {
      this.startx=0;
      this.starty=0;
      this.finishx=0;
      this.finishy=0;
      this.earliestStart=0;
      this.latestFinish=0;
    }
    public int getStartX()
    {
      return this.startx;
    }
    public int getStartY()
    {
      return this.starty;
    }
    public int getFinishX()
    {
     return this.finishx;
    }
    public int getFinishY()
    {
      return this.finishy;
    }
    public int getEarliestStart()
    {
      return this.earliestStart;
    }
    public int getLatestFinish()
    {
      return  this.latestFinish;
    }
    public boolean isAssigned()
    {
     return assigned;
    }

  public int getDistance()
    {
        return (Math.abs((getStartX()-getFinishX())) + Math.abs(getFinishY()-getStartY()));
    }
}
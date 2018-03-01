import java.util.*;
import java.io.*;

public class Ride {
    private int startx;
    private int starty;
    private int finishx;
    private int finishy;
    private int earliestStart;
    private int latestFinish;

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
    int getStartX()
    {
      return this.startx;
    }
    int getStartY()
    {
      return this.starty;
    }
    int getFinishX()
    {
     return this.finishx;
    }
    int getFinishy()
    {
      return this.finishy;
    }
    int getEarliestStart()
    {
      return this.earliestStart;
    }
    int getLatestFinish()
    {
      return  this.latestFinish;
    }
}
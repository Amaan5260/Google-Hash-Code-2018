//main




public static void main(String[]args)
{
 /*construct a simulation object using space separated values of input file
 call readFile to fill ride arrayList with all rides
 while currentTime < steps OR there are still rides to be done (Check if the arrayList is/isn't empty since rides are removed when they are completed)
    advanceTime*/
 FileIO file = new FileIO(filename);
 Simulation sim = new Simulation(file.parseAttributesAitor.get[0], file.parseAttributesAitor.get[1], file.parseAttributesAitor.get[2], file.parseAttributesAitor.get[3], file.parseAttributesAitor.get[4], file.parseAttributesAitor.get[5]);
 Simulation.readFile();
 while(Simulation.getCurrentTime() < Simulation.getSteps() || Simulation.getRides().isEmpty == false)
        {
            Simulation.advanceTime()
        }

}

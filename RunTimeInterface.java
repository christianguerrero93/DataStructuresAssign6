
public interface RunTimeInterface {


	public static enum TimeUnits {Seconds, MilliSeconds, MicroSeconds, NanoSeconds};
	public static enum MemoryUnits {Bytes, KiloBytes, MegaBytes};
	public TimeUnits getTimeUnits();
	public void setTimeUnits(TimeUnits timeUnits);
	public MemoryUnits getMemoryUnits();
	public void setMemoryUnits(MemoryUnits memoryUnits);
	public double getLastRunTime();
	public double getLastMemoryUsage();
	public double[] getRunTimes();
	public double[] getMemoryUsages();
	public void resetRunTimes();
	public void addRuntime(long runTime);
	public double getAverageRunTime();
	public double getAverageMemoryUsage();
	
}

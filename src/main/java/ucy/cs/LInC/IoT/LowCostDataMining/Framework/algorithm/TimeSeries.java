/**
 * 
 */
package ucy.cs.LInC.IoT.LowCostDataMining.Framework.algorithm;

import java.util.ArrayList;

import ucy.cs.LInC.IoT.LowCostDataMining.Framework.data.DataPoint;

/**
 * @author hamdy
 *
 */
public interface TimeSeries <T> {
	
	public double getMedian();
	
	public void addDataPoint(T dp);

//	void addDataPoint(DataPoint dp);

	
		
	

}

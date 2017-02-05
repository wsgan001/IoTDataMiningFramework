package client;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import ucy.cs.LInC.IoT.LowCostDataMining.Framework.algorithm.SimpleMovingAverage;
import ucy.cs.LInC.IoT.LowCostDataMining.Framework.algorithm.TimeSeries;
import ucy.cs.LInC.IoT.LowCostDataMining.Framework.data.DataPointType;
import ucy.cs.LInC.IoT.LowCostDataMining.Framework.data.DoubleDataPoint;
import ucy.cs.LInC.IoT.LowCostDataMining.Framework.resource.ReadCSV;

public class IoT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<DoubleDataPoint> data = new ArrayList<DoubleDataPoint>();
		ReadCSV<DoubleDataPoint> reader = new ReadCSV<DoubleDataPoint>();
		try {
			reader.openFile("test.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		data = reader.readData(",", 2, DataPointType.DOUBLE);
		TimeSeries<DoubleDataPoint> movingAverage = new SimpleMovingAverage<DoubleDataPoint>(2);
		for (DoubleDataPoint dataPoint : data) {
			movingAverage.addDataPoint(dataPoint);
		}
		
		System.out.println(movingAverage.getMedian());
		
	}

}

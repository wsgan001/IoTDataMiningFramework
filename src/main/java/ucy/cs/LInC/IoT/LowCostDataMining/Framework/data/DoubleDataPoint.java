package ucy.cs.LInC.IoT.LowCostDataMining.Framework.data;
/**
 * 
 */

/**
 * @author hmicha01
 *
 */
public class DoubleDataPoint extends DataPoint{
	double value;
	
	public DoubleDataPoint(String name, String type, double value, int timestamp){
		sequenceID++;
		this.setName(name);
		this.setType(type);
		this.setValue(value);
		this.setTimestamp(timestamp);
	}
	
	/*
	 * 
	 * ------------SETTERS--------------
	 * 
	 * */
	public void setValue(double value){
		this.value=value;
	}
	
	/*
	 * 
	 * ------------GETTERS--------------
	 * 
	 * */
	public Double getValue(){
		return this.value;
	}
}
package by.tc.task01.entity;

import java.util.HashMap;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{
	// you may add your own code here
	private SearchCriteria.Refrigerator sc;
	private HashMap<String, Object> map = new HashMap<String, Object>();
	
	public Refrigerator() {}
	
	
	
	public Refrigerator(Object powerConsumption, Object weight, Object freezerCapacity, Object overallCapacity, Object height, Object width) {
		map.put(sc.POWER_CONSUMPTION.toString(), powerConsumption);
		map.put(sc.WEIGHT.toString(), weight);
		map.put(sc.FREEZER_CAPACITY.toString(), freezerCapacity);
		map.put(sc.OVERALL_CAPACITY.toString(), overallCapacity);
		map.put(sc.HEIGHT.toString(), height);
		map.put(sc.WIDTH.toString(), width);		
		
	}
	
	@Override
	public void setParametrs(String[] s) {
		map.put(sc.POWER_CONSUMPTION.toString(), s[2]);
		map.put(sc.WEIGHT.toString(),  s[4]);
		map.put(sc.FREEZER_CAPACITY.toString(), s[6]);
		map.put(sc.OVERALL_CAPACITY.toString(), s[8]);
		map.put(sc.HEIGHT.toString(), s[10]);
		map.put(sc.WIDTH.toString(),  s[12]);
		// TODO Auto-generated method stub
		
	}



	@Override
	public HashMap<String, Object> getMap() {
		// TODO Auto-generated method stub
		return null;
	}
}

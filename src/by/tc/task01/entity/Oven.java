package by.tc.task01.entity;

import java.util.HashMap;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{
	
	private SearchCriteria.Oven sc;
	private HashMap<String, Object> map = new HashMap<String, Object>();
	
	public Oven() {}
	
	
	
	public Oven(Object powerConsumption, Object weight, Object capacity, Object depth, Object height, Object width) {
		map.put(sc.POWER_CONSUMPTION.toString(), powerConsumption);
		map.put(sc.WEIGHT.toString(), weight);
		map.put(sc.CAPACITY.toString(), capacity);
		map.put(sc.DEPTH.toString(), depth);
		map.put(sc.HEIGHT.toString(), height);
		map.put(sc.WIDTH.toString(), width);		
		
	}
	
	@Override
	public void setParametrs(String[] s) {
		map.put(sc.POWER_CONSUMPTION.toString(), s[2]);
		map.put(sc.WEIGHT.toString(),  s[4]);
		map.put(sc.CAPACITY.toString(), s[6]);
		map.put(sc.DEPTH.toString(), s[8]);
		map.put(sc.HEIGHT.toString(), s[10]);
		map.put(sc.WIDTH.toString(),  s[12]);
		// TODO Auto-generated method stub
		
	}



	public HashMap<String, Object> getMap() {
		return map;
	}



	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	// you may add your own code here



	@Override
	public String toString() {
		return "Oven [map=" + map + "]";
	}



	
}

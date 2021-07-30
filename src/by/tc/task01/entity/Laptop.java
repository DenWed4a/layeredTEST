package by.tc.task01.entity;

import java.util.HashMap;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{

	private SearchCriteria.Laptop sc;
	private HashMap<String, Object> map = new HashMap<String, Object>();
	
	public Laptop() {}
	
	@Override
	public void setParametrs(String[] s) {
		map.put(sc.BATTERY_CAPACITY.toString(), s[2]);
		map.put(sc.OS.toString(), s[4]);
		map.put(sc.MEMORY_ROM.toString(), s[6]);
		map.put(sc.SYSTEM_MEMORY.toString(), s[8]);
		map.put(sc.CPU.toString(), s[10]);
		map.put(sc.DISPLAY_INCHS.toString(), s[12]);
		
		// TODO Auto-generated method stub
		
	}
	
	
	public Laptop(Object batteryCapacity, Object oS, Object memoryRom, Object systemMemory, Object cPU, Object displayInchs) {
		map.put(sc.BATTERY_CAPACITY.toString(), batteryCapacity);
		map.put(sc.OS.toString(), oS);
		map.put(sc.MEMORY_ROM.toString(), memoryRom);
		map.put(sc.SYSTEM_MEMORY.toString(), systemMemory);
		map.put(sc.CPU.toString(), cPU);
		map.put(sc.DISPLAY_INCHS.toString(), displayInchs);		
		
	}



	public HashMap<String, Object> getMap() {
		return map;
	}



	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}



	@Override
	public String toString() {
		return "Laptop [map=" + map + "]";
	}




	
	
	
	
	
	
	
	
	
	
	
	// you may add your own code here
}

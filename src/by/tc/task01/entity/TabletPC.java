package by.tc.task01.entity;

import java.util.HashMap;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance{
	private SearchCriteria.TabletPC sc;
	private HashMap<String, Object> map = new HashMap<String, Object>();
	
	public TabletPC() {}
	
	
	
	public TabletPC(Object batteryCapacity, Object displayInchs,  Object memoryRom, Object flashMemoryCapacity, Object color) {
		map.put(sc.BATTERY_CAPACITY.toString(), batteryCapacity);
		map.put(sc.DISPLAY_INCHES.toString(), displayInchs);
		map.put(sc.MEMORY_ROM.toString(), memoryRom);
		map.put(sc.FLASH_MEMORY_CAPACITY.toString(), flashMemoryCapacity);
		map.put(sc.COLOR.toString(), color);		
		
	}
	
	@Override
	public void setParametrs(String[] s) {
		
		map.put(sc.BATTERY_CAPACITY.toString(), s[2]);
		map.put(sc.DISPLAY_INCHES.toString(), s[4]);
		map.put(sc.MEMORY_ROM.toString(), s[6]);
		map.put(sc.FLASH_MEMORY_CAPACITY.toString(), s[8]);
		map.put(sc.COLOR.toString(), s[10]);
		// TODO Auto-generated method stub
		
	}



	public HashMap<String, Object> getMap() {
		return map;
	}



	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}



	@Override
	public String toString() {
		return "TabletPC [map=" + map + "]";
	}



	
	
	
	// you may add your own code here
}

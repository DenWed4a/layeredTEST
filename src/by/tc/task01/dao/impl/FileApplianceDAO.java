package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
//import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.TabletPC;

public class FileApplianceDAO implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {

		List<Appliance> applianceList = new ArrayList<>();
		Map<String, Object> criteriaMap = criteria.getCriteria();
		String groupSearchName = criteria.getGroupSearchName();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/resources/appliances_db.txt"));
			String s;

			while (reader.ready()) {
				s = reader.readLine();
				boolean itsMyAppliance = false;
				
				if (groupSearchName != "" && s.contains(groupSearchName)) {
					itsMyAppliance = true;
				}
				if (criteriaMap != null) {
					for (Map.Entry<String, Object> entry : criteriaMap.entrySet()) {
						Pattern pattern = Pattern.compile(entry.getKey() + "=" + entry.getValue());
						Matcher matcher = pattern.matcher(s);
						itsMyAppliance = matcher.find();
						if (itsMyAppliance == false) {
							break;
						}
					}
					if (!s.contains(groupSearchName) && groupSearchName != null) {
						itsMyAppliance = false;
					}
				}
				if (itsMyAppliance == true) {
					String[] split = s.split("\\s*(\\s|,|=|;|:)\\s*");
					String appliance = split[0];
					switch (appliance) {

					case ("Laptop"):
						Laptop laptop = new Laptop();
						laptop.setParametrs(split);
						applianceList.add(laptop);

						break;
					case ("Oven"):
						Oven oven = new Oven();
						oven.setParametrs(split);
						applianceList.add(oven);
						break;
					case ("TabletPC"):
						TabletPC tabletPC = new TabletPC();
						tabletPC.setParametrs(split);
						applianceList.add(tabletPC);
						break;
					case ("Refrigerator"):
						Refrigerator Refrigerator = new Refrigerator();
						Refrigerator.setParametrs(split);
						applianceList.add(Refrigerator);
						break;

					}
				}
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return applianceList;
	}

	@Override
	public void add(Appliance appliance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Appliance appliance) {
		// TODO Auto-generated method stub

	}

	// you may add your own code here

}

//you may add your own new classes
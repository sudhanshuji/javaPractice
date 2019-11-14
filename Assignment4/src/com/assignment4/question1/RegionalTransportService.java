package com.assignment4.question1;

import java.util.*;

/**
 * @author C2
 *
 */
public class RegionalTransportService {

	// Map RTO CODE with Area Name
	private static final Map<String, String> rtoCodeMap = new TreeMap<String, String>();

	// RTO Codes and Area Names of Regional Transport offices in Bangalore
	static {
		rtoCodeMap.put("KA-01", "Koramangala");
		rtoCodeMap.put("KA-02", "Rajajinagar");
		rtoCodeMap.put("KA-03", "Indiranagar");
		rtoCodeMap.put("KA-04", "Yeshwanthpur");
		rtoCodeMap.put("KA-05", "Jayanagar");
		rtoCodeMap.put("KA-50", "Yelahanka");
		rtoCodeMap.put("KA-51", "Electronics City");
		rtoCodeMap.put("KA-52", "Nelamangala");
		rtoCodeMap.put("KA-53", "K.R.Puram");
		rtoCodeMap.put("KA-54", "Nagamangala");
		rtoCodeMap.put("KA-55", "Mysore East");
		rtoCodeMap.put("KA-56", "Basvakalyan");
		rtoCodeMap.put("KA-57", "Shantinagar");

	}

	/**
	 * 
	 * @param vehicleList
	 * @return sorted list of vehicles based on Area Name
	 */
	private static String getKey(String value) {
		String requiredKey = "";
		for (String key : rtoCodeMap.keySet()) {
			if (rtoCodeMap.get(key).equals(value)) {
				requiredKey = key;
				break;
			}
		}

		return requiredKey;
	}

	public static List<String> sortVehiclesRegisteredBasedOnArea(List<String> vehicleList) {
		List<String> result = new ArrayList<String>();
		Map<String, String> rtoCodeMapSorted = new TreeMap<String, String>();
		ArrayList<String> listOfKeys = new ArrayList<String>();
		ArrayList<String> listOfKeys1 = new ArrayList<String>();
		ArrayList<String> listOfValues = new ArrayList<String>();
		for (String s : rtoCodeMap.keySet())
			listOfKeys.add(s);

		for (String s : rtoCodeMap.values())
			listOfValues.add(s);
		Collections.sort(listOfValues);

		for (String s : listOfValues)
			rtoCodeMapSorted.put(s, getKey(s));

		for (String s : rtoCodeMapSorted.values())
			listOfKeys1.add(s);

		for (String s : listOfKeys1) {
			int count = 0;
			for (int i = 0; i < vehicleList.size(); i++) {
				if (vehicleList.get(i).substring(0, 5).equals(s) && count <1) {
					result.add(vehicleList.get(i));
					count++;
				}
				if (!result.contains(vehicleList.get(i))) {
					String s1=vehicleList.get(i);
					result.add(s1);
				}
			}
		}
		for (String s : result) {
			System.out.println(s);
			System.out.println(" ");
		}
		System.out.println(" ");

//		List<VehicleNumber> vnList = new ArrayList<VehicleNumber>();
//
//		for (String vn : vehicleList) {
//			String rtoCode = vn.substring(0, 5);
//			String vehicleNo = vn.substring(6);
//			String rtoName = rtoCodeMap.get(rtoCode);
//			VehicleNumber vnObject = new VehicleNumber(rtoName, vehicleNo);
//			vnList.add(vnObject);
//		}
//		// Collections.sort(vnList);
//		vnList.sort(new Comparator<VehicleNumber>() {
//
//			@Override
//			public int compare(VehicleNumber o1, VehicleNumber o2) {
//				int r = o1.getRtoCode().compareTo(o2.getRtoCode());
//				if (r == 0) {
//					r = o1.getVehicleNumber().compareTo(o2.getVehicleNumber());
//				}
//
//				return r;
//			}
//		});
//
//		for (VehicleNumber vn : vnList) {
//
//			// String n = getKey(vn.getRtoCode()) + "-" + vn.getVehicleNumber();
//			// System.out.println(n);
//			result.add(getKey(vn.getRtoCode()) + "-" + vn.getVehicleNumber());
//		}

		return result;

	}
}
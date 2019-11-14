package com.assignment4.question1;

import java.util.Comparator;

public class VehicleNumberComparatot implements Comparator<VehicleNumber> {

	@Override
	public int compare(VehicleNumber o1, VehicleNumber o2) {
		int r1 = o1.getRtoCode().compareTo(o2.getRtoCode());
		if (r1 == 0) {
			r1 = o1.getVehicleNumber().compareTo(o2.getVehicleNumber());
		}

		return r1;
	}

}

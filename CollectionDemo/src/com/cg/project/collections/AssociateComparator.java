package com.cg.project.collections;

import java.util.Comparator;

public class AssociateComparator implements Comparator<Associate>{

	@Override
	public int compare(Associate o1, Associate o2) {
		
		return o1.getBasicSalary()-o2.getBasicSalary();
	}

}

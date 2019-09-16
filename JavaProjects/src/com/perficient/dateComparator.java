package com.perficient;

import java.util.Comparator;

public class dateComparator implements Comparator<Voter>{
	public int compare(Voter o1, Voter o2) {
		
		return o1.getDOB().compareTo(o2.getDOB());
	}
}

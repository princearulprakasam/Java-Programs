package com.perficient;

import java.util.Comparator;

public class nameComparator implements Comparator<Voter>{
	public int compare(Voter o1, Voter o2) {
				return o1.getName().compareTo(o2.getName());
	}

}

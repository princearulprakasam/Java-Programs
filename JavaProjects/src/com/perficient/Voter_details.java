package com.perficient;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Voter_details {
	public static void main(String[] args) throws ParseException {
		Voter vote = new Voter();
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = df.format(date);
		Date dt = (Date) df.parse(strDate);
		Voter vote1 = new Voter(1, "Arun", (Date) df.parse("10/10/1995"), 23, "Vriddhachalam");
		Voter vote2 = new Voter(2, "Mahesh", (Date) df.parse("13/03/1995"), 25, "Chennai");
		Voter vote3 = new Voter(3, "Karthick", (Date) df.parse("23/09/1995"), 33, "Chennai");
		Voter vote4 = new Voter(4, "Mahesh", (Date) df.parse("13/03/1995"), 25, "Tirupati");
		Voter vote5 = new Voter(5, "Karthick", (Date) df.parse("23/09/1995"), 33, "Erode");
		ArrayList<Voter> voterList = new ArrayList<Voter>();
		voterList.add(vote1);
		voterList.add(vote2);
		voterList.add(vote3);
		voterList.add(vote4);
		voterList.add(vote5);
		System.out.println(voterList);
		ArrayList<Voter> uniqueName = removeDuplicateNames(voterList);
		System.out.println("\nVoter List without duplicates");
		System.out.println(uniqueName);
		Collections.sort(uniqueName, new nameComparator());
		System.out.println("\nVoter List Sorted by Name");
		System.out.println(uniqueName);
		Collections.sort(uniqueName, new dateComparator());
		System.out.println("\nVoter List Sorted by DOB");
		System.out.println(uniqueName);
		System.out.println(voterList.removeAll(uniqueName));
		System.out.println(voterList);
	}

	private static ArrayList<Voter> removeDuplicateNames(List<Voter> voterList) {
		Iterator it = voterList.iterator();
		ArrayList<Voter> uniqueNames = new ArrayList<Voter>(voterList);
		ArrayList<Voter> itr2 = new ArrayList<Voter>(voterList);
		while (it.hasNext()) {
			Voter vote1 = (Voter) it.next();
			itr2.remove(vote1);
			Iterator it1 = itr2.iterator();
			while (it1.hasNext()) {
				Voter vote2 = (Voter) it1.next();
				if (vote1.getName() == vote2.getName() && vote1.getAge() == vote2.getAge()
						&& vote1.getDOB().compareTo(vote2.getDOB()) == 0) {
					uniqueNames.remove(vote1);
				}
			}
		}
		return uniqueNames;
	}
}

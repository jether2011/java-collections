package com.jetherrodrigues.hackerrank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class WorkSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		/**
		 * 8888888
		 */
		List<String> results = Result.findSchedules(56, 8, "???8???");
		results.forEach(System.out::println);
		System.out.println();
		
		/**
		 * 08 04 840
		 * 08 13 840
		 * 08 22 840
		 * 08 31 840
		 * 08 40 840
		 */
		List<String> results2 = Result.findSchedules(24, 4, "08??840");
		results2.forEach(System.out::println);
		System.out.println();
		
		/**
		 * 00 2 01 00
		 * 00 2 10 00
		 * 01 2 00 00
		 * 10 2 00 00
		 */
		List<String> results3 = Result.findSchedules(3, 2, "??2??00");
		results3.forEach(System.out::println);
		System.out.println();
		
		/**
		 * Muitas possibilidades
		 */
		//List<String> results4 = Result.findSchedules(3, 1, "???????");
		//results4.forEach(System.out::println);
		System.out.println();
	}
}

class Result {

    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
    	
    	return returnListOfScheduleWorkHours(workHours, dayHours, pattern);	
    }

	private static List<String> returnListOfScheduleWorkHours(int workHours, int dayHours, String pattern) {
		List<String> schedules = new ArrayList<String>();
		List<String> auxSchedules = new ArrayList<String>();
		
		char[] values = pattern.toCharArray();
		int daysToWork = returnHowManyDaysToWork(values);
    	int diffWorkHoursAndWorkedHours = returnDifference(workHours, values);
    	
		if ((diffWorkHoursAndWorkedHours % daysToWork == 0) && 
				(diffWorkHoursAndWorkedHours / daysToWork == dayHours)) {
			schedules.add(pattern.replace("?", String.valueOf(dayHours)));
			return schedules;
		}
		
		for (int i = 0; i < diffWorkHoursAndWorkedHours; i++) {
			int value = calculate(i, (diffWorkHoursAndWorkedHours - i));
			
			if ((value <= dayHours) && (dayHours == 1)) {
				auxSchedules.add(String.valueOf(value));
			}
			
			if ((i + value) <= dayHours) {
				auxSchedules.add(i + "" + value);
				
				if ((i + 1) == diffWorkHoursAndWorkedHours) {
					auxSchedules.add(reverse(auxSchedules.get(0)));
				}
			}
		}
		
		for (int i = 0; i < auxSchedules.size(); i++) {
			String value = auxSchedules.get(i);
			
			if((auxSchedules.size() == 1) && (value.equals(String.valueOf(dayHours)))) {
				
			}
			
			if (daysToWork == 4) {
				if ((i + 1) < auxSchedules.size()) {
					schedules.add(new StringBuilder()
							.append("00")
							.append(values[2])
							.append(value)
							.append("00").toString());
					
					schedules.add(new StringBuilder()
							.append("00")
							.append(values[2])
							.append(auxSchedules.get(i + 1))
							.append("00").toString());
				}
				
				if ( i == 1 && auxSchedules.size() == 2) {
					schedules.add(new StringBuilder()
							.append(auxSchedules.get(i - 1))
							.append(values[2])
							.append("00")
							.append("00").toString());
					
					schedules.add(new StringBuilder()
							.append(value)
							.append(values[2])
							.append("00")
							.append("00").toString());
				}
			} 
			
			if (daysToWork < 4)
				schedules.add(pattern.replace("??", value));
		}
		
		return schedules;
	}

	private static String reverse(String aux) {
		String reverse = "";
		for (int i = (aux.length() - 1 ); i >= 0 ; i--) {
			reverse += String.valueOf(aux.charAt(i));
		}
		return reverse;
	}

	private static int calculate(int i, int diffWorkHoursAndWorkedHours) {
		return i + (diffWorkHoursAndWorkedHours - i);
	}

	private static int returnDifference(int workHours, char[] values) {
		int sumOfWorkedHours = 0;
		for (int i = 0; i < values.length; i++) {
			char c = values[i];
			if (Character.isDigit(c)) {
				sumOfWorkedHours += Integer.parseInt(String.valueOf(c));
			}
		}
		return workHours - sumOfWorkedHours;
	}

	private static int returnHowManyDaysToWork(char[] values) {
		int days = 0;
		for (int i = 0; i < values.length; i++) {
			char c = values[i];
			if (!Character.isDigit(c)) {
				days++;
			}
		}
		return days;
	}
}
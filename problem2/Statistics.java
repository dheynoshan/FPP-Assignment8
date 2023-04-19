package problem2;
import java.util.*;
public class Statistics {
	/**
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double salary=0;
		for (EmployeeData emp : aList){
			salary += emp.getSalary();
		}

		return salary;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}

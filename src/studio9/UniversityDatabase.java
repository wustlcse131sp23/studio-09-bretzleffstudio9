package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	Map<String, Student> map;
	
	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
	}

	public UniversityDatabase() {
		super();
		this.map = new HashMap<>();
	}

	public int getStudentCount() {
		return map.size();
	}
	public String lookupFullName(String accountName) {
		if (map.get(accountName).getFullName()!=null)
		{
			return map.get(accountName).getFullName();
		}
		else
		{
		return "null";
		}
	}

	public double getTotalBearBucks() {
		double w=0;
		for (int i=0; i<map.size(); i++)
		{
			if (map.get(i).getBearBucksBalance()!=null)
			{
			w+=map.get(i).getBearBucksBalance();
			}
		}
		return w;
	}
}

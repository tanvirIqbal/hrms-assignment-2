package hrms;

import hrms.boundary.IHrmsData;

public class HardCodedData implements IHrmsData {
	public String getWelcomeMessage()
	{
		return "Welcome to Human Resource Management System.";
	}
}

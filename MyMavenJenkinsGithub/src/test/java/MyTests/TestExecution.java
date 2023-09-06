package MyTests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jenkins.MyExecution;

public class TestExecution extends MyExecution{

	@Test
	public void create()
	{
		Reporter.log("Create",true);
		Reporter.log("This is the change",true);
	}
	@Test
	public void modify()
	{
		Reporter.log("Modify",true);
	}
}

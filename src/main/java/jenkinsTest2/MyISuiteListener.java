package jenkinsTest2;

import java.util.List;
import java.util.Map;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyISuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
	}

	@Override
	public void onFinish(ISuite suite) {
		TestListenerAdapter adapter = (TestListenerAdapter)suite.getAttribute("TestListenerAdapter");
//		int fail = adapter.getFailedTests().size();
//		int pass = adapter.getPassedTests().size();
//		int skip = adapter.getSkippedTests().size();
//		
//		System.out.println("fail = " + fail); 
//		System.out.println("pass = " + pass); 
//		System.out.println("skip = " + skip); 
		System.out.println("执行结束了");
	}

}

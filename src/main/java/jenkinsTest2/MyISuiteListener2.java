package jenkinsTest2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyISuiteListener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		int pass = context.getPassedTests().getAllResults().size();
		int skip = context.getSkippedTests().getAllResults().size();
		int fail = context.getFailedTests().getAllResults().size();
		try {
			Document doc = DocumentHelper.createDocument();
			Element element = doc.addElement("value");
			if (pass + fail == 0) {
				element.addText("0");
			} else {
				element.addText(Math.ceil(pass * 100 / (pass + fail)) + "");
			}
			XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());

			File file = new File("");
			String filePath = file.getCanonicalPath();
			FileOutputStream fos = new FileOutputStream(file.getCanonicalPath() + "\\src\\main\\java\\xx.xml");
			writer.setOutputStream(fos);
			writer.write(doc);
			System.out.println("写出完毕!");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

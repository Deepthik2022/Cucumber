package reportsSep25a;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Sep25b2DWHReports {
	public static void cucumberReports(String json) {
File f=new File("C:\\Users\\Achyutha\\eclipse-workspace\\Cucumber\\target");
Configuration c=new Configuration(f, "Cucumber");
c.addClassifications("OS name:", "Windows");
c.addClassifications("OS version", "11");
c.addClassifications("Browser name:", "Chrome");
List<String>l=new ArrayList<>();
l.add(json);
ReportBuilder r=new ReportBuilder(l, c);
r.generateReports();
	}
}

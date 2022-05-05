package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String currentworkingDir=System.getProperty("user.dir");
		System.out.println(currentworkingDir);
		String filePath=currentworkingDir+"\\TestData\\Data.property";
		System.out.println(filePath);
	//get location --->create an instance of FileInputStream class and pass the file location its constructor
		// FileInputStream fis = new  FileInputStream("D:\\Class\\eclipse\\F1Javaworkspace\\javabasic\\TestData\\Data.property");
		 
		// FileInputStream fis = new  FileInputStream("filePath");
		 //or
		 FileInputStream fis = new  FileInputStream(".\\TestData\\Data.property");
		 
		 Properties prop = new  Properties();
		 prop.load(fis);
		 
		 //read data
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("pinCode"));
	}

}

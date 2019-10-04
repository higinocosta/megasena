package processos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravaCSV {
	
	static String path = "c:\\temp\\MegaCSV.csv";
	
	public void GravaCSV(String[] line) {
	
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String item:line) {
				bw.write(item+";");
			}
			bw.newLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
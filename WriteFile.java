package textfiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	private String path;
	
	public WriteFile(String file_path){
		path = file_path;
	}
	
	public void writeToFile( String textLine ) throws IOException {
		/*********************
		FileWriter writer = new FileWriter( path);
		
	    writer.append("@DisplayName");
	    writer.append(',');
	    writer.append("@Age");
	    writer.append('\n');
 
	    writer.append("MKYONG");
	    writer.append(',');
	    writer.append("26");
        writer.append('\n');
		
	    writer.flush();
	    writer.close();
	    /****************************/
	}
}





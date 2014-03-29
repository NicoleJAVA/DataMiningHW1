package textfiles;
import java.io.FileWriter;
import java.io.IOException;

public class FileData {
	public static void main(String[] args)throws IOException{
		String file_name = "C:/spamtest.txt";

		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			System.out.println( aryLines[ i ] ) ;
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		//Write to a file
		generateCsvFile("c:\\result.arff"); 
	}
	public static void generateCsvFile(String sFileName)
	{
		String file_name = "C:/spamtest.txt";
		try
		{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
		    FileWriter writer = new FileWriter(sFileName);
		    
		    writer.append("@relation SMS-Analysis\n\n");
		    writer.append("@attribute type\n");
		    writer.append("@attribute content\n\n");
		    writer.append("@data\n");
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
				String type = stringFormat(aryLines[i]);
				String content = aryLines[i].substring(4);
				writer.append(type);
				writer.append(content);
				writer.append('\n');
			}
			//generate whatever data you want
	 
		    writer.flush();
		    writer.close();
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
	}
	
	public static String stringFormat(String textLine){
		String type = textLine.substring(0,3);
		if(type=="spam"){
			return "spam,";
		}
		else{
			return "ham,";
		}
	}

}

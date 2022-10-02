
import java.io.*;
import java.util.*;

public class FileRead{
    // public static void main(String[] args) throws IOException{
    // 	// loading in text file
    // 	File file = new File("test.txt");
    // 	String oldText = "";
    // 	// reads the file
    // 	BufferedReader reader = new BufferedReader(new FileReader(file));
    // 	String line = reader.readLine();
    	
    // 	// reads every line of the file
    // 	while (line != null) {
    // 		oldText = oldText + line;
    // 		line = reader.readLine();
    // 	}
    	
    // 	// saving original data 
    // 	String ogString1 = oldText.substring(oldText.indexOf("#"), 
	// 			oldText.lastIndexOf("#") + 1);
    // 	String ogString2 = oldText.substring(oldText.indexOf("$"), 
	// 			oldText.lastIndexOf("$") + 1);
    // 	String ogString3 = oldText.substring(oldText.indexOf("%"), 
	// 			oldText.lastIndexOf("%") + 1);
    // 	String ogString4 = oldText.substring(oldText.indexOf("@"), 
	// 			oldText.lastIndexOf("@") + 1);
    	
    // 	// value for quadratics 
    // 	String numString1 = oldText.substring(oldText.indexOf("#") + 1, 
    // 						oldText.lastIndexOf("#"));
    // 	// value for factors
    // 	String numString2 = oldText.substring(oldText.indexOf("$") + 1, 
	// 			oldText.lastIndexOf("$"));
    // 	// values for linear 
    // 	String numString3 = oldText.substring(oldText.indexOf("%") + 1, 
	// 			oldText.lastIndexOf("%"));
    // 	// values for vertices
    // 	String numString4 = oldText.substring(oldText.indexOf("@") + 1, 
	// 			oldText.lastIndexOf("@"));
    	
    // 	// asking user which line to replace
    // 	Scanner input = new Scanner(System.in);
    // 	System.out.println("Which line would you like to update? ");
    // 	int lineNum = input.nextInt();
    	
    // 	// initializing writer 
    // 	FileWriter writer = new FileWriter(file);
    	
	// 	// asking user what to replace the string with depending on their line chosen
    // 	if (lineNum == 1) {
    //     	// changing score for quadratics
    //     	System.out.println("Please input the number you would like to add: ");
    //     	int newValue = input.nextInt();
    //     	int num1Changed = Integer.parseInt(numString1) + newValue;
        	
    //     	String newText = num1Changed + "";
    //     	String outputString = "#" + newText + "#";
        	
    //     	writer.write(outputString + "\n" + ogString2 + "\n"
    //     				 + ogString3 + "\n" + ogString4);
    // 	}
    // 	else if (lineNum == 2) {
    // 		// changing score for factors
    //     	System.out.println("Please input the number you would like to add: ");
    //     	int newValue = input.nextInt();
    //     	int num1Changed = Integer.parseInt(numString2) + newValue;
        	
    //     	String newText = num1Changed + "";
    //     	String outputString = "$" + newText + "$";
        	
    //     	writer.write(ogString1 + "\n" + outputString + "\n"
    //     				 + ogString3 + "\n" + ogString4);
    // 	}
    // 	else if (lineNum == 3) {
    // 		// changing score for linear
    //     	System.out.println("Please input the number you would like to add: ");
    //     	int newValue = input.nextInt();
    //     	int num1Changed = Integer.parseInt(numString3) + newValue;
        	
    //     	String newText = num1Changed + "";
    //     	String outputString = "%" + newText + "%";
        	
    //     	writer.write(ogString1 + "\n" + ogString2 + "\n"
    //     				 + outputString + "\n" + ogString4);
    // 	}
    // 	else if (lineNum == 4) {
    // 		// changing score for vertices
    //     	System.out.println("Please input the number you would like to add: ");
    //     	int newValue = input.nextInt();
    //     	int num1Changed = Integer.parseInt(numString4) + newValue;
        	
    //     	String newText = num1Changed + "";
    //     	String outputString = "@" + newText + "@";
        	
    //     	writer.write(ogString1 + "\n" + ogString2 + "\n"
    //     				 + ogString3 + "\n" + outputString);
    // 	}
    	
    // 	// closing reader / writer
    // 	reader.close();
    // 	writer.close();
    // }
    public static void updateInformation(Question q) throws IOException {
    	if (q.getQuestionTopic() instanceof Quadratic) {
			if (q.getQuestionType() == 1) {
				// loading in text file
				File file = new File("test.txt");
				String oldText = "";
				// reads the file
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();
				
				// reads every line of the file
				while (line != null) {
					oldText = oldText + line;
					line = reader.readLine();
				}
				
				// saving original data 
				String ogString1 = oldText.substring(oldText.indexOf("#"), 
						oldText.lastIndexOf("#") + 1);
				String ogString2 = oldText.substring(oldText.indexOf("$"), 
						oldText.lastIndexOf("$") + 1);
				String ogString3 = oldText.substring(oldText.indexOf("%"), 
						oldText.lastIndexOf("%") + 1);
				String ogString4 = oldText.substring(oldText.indexOf("@"), 
						oldText.lastIndexOf("@") + 1);
				
				// value for quadratics 
				String numString1 = oldText.substring(oldText.indexOf("#") + 1, 
									oldText.lastIndexOf("#"));
				// value for factors
				String numString2 = oldText.substring(oldText.indexOf("$") + 1, 
						oldText.lastIndexOf("$"));
				// values for linear 
				String numString3 = oldText.substring(oldText.indexOf("%") + 1, 
						oldText.lastIndexOf("%"));
				// values for vertices
				String numString4 = oldText.substring(oldText.indexOf("@") + 1, 
						oldText.lastIndexOf("@"));
				
				// initializing writer 
				FileWriter writer = new FileWriter(file);

				// changing score for quadratics
				int newValue = 1;
				int num1Changed = Integer.parseInt(numString1) + newValue;
					
				String newText = num1Changed + "";
				String outputString = "#" + newText + "#";
					
				writer.write(outputString + "\n" + ogString2 + "\n"
							+ ogString3 + "\n" + ogString4);
				
				// closing reader / writer
				reader.close();
				writer.close();
			}
			else if (q.getQuestionType() == 2) {
				File file = new File("test.txt");
				String oldText = "";
				// reads the file
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();
					
				// reads every line of the file
				while (line != null) {
					oldText = oldText + line;
					line = reader.readLine();
				}
					
				// saving original data 
				String ogString1 = oldText.substring(oldText.indexOf("#"), 
							oldText.lastIndexOf("#") + 1);
				String ogString2 = oldText.substring(oldText.indexOf("$"), 
							oldText.lastIndexOf("$") + 1);
				String ogString3 = oldText.substring(oldText.indexOf("%"), 
							oldText.lastIndexOf("%") + 1);
				String ogString4 = oldText.substring(oldText.indexOf("@"), 
							oldText.lastIndexOf("@") + 1);
					
				// value for quadratics 
				String numString1 = oldText.substring(oldText.indexOf("#") + 1, 
									oldText.lastIndexOf("#"));
				// value for factors
				String numString2 = oldText.substring(oldText.indexOf("$") + 1, 
									oldText.lastIndexOf("$"));
				// values for linear 
				String numString3 = oldText.substring(oldText.indexOf("%") + 1, 
									oldText.lastIndexOf("%"));
				// values for vertices
				String numString4 = oldText.substring(oldText.indexOf("@") + 1, 
									oldText.lastIndexOf("@"));
					
				// initializing writer 
				FileWriter writer = new FileWriter(file);

				// changing score for factors
				int newValue = 1;
				int num1Changed = Integer.parseInt(numString2) + newValue;
						
				String newText = num1Changed + "";
				String outputString = "$" + newText + "$";
						
				writer.write(ogString1 + "\n" + outputString + "\n"
				    		+ ogString3 + "\n" + ogString4);
					
					
				// closing reader / writer
				reader.close();
				writer.close();
			}
		}
		else if (q.getQuestionTopic() instanceof Linear) {
			if (q.getQuestionType() == 1) {
				// loading in text file
				File file = new File("test.txt");
				String oldText = "";
				// reads the file
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();
				
				// reads every line of the file
				while (line != null) {
					oldText = oldText + line;
					line = reader.readLine();
				}
				
				// saving original data 
				String ogString1 = oldText.substring(oldText.indexOf("#"), 
						oldText.lastIndexOf("#") + 1);
				String ogString2 = oldText.substring(oldText.indexOf("$"), 
						oldText.lastIndexOf("$") + 1);
				String ogString3 = oldText.substring(oldText.indexOf("%"), 
						oldText.lastIndexOf("%") + 1);
				String ogString4 = oldText.substring(oldText.indexOf("@"), 
						oldText.lastIndexOf("@") + 1);
				
				// value for quadratics 
				String numString1 = oldText.substring(oldText.indexOf("#") + 1, 
									oldText.lastIndexOf("#"));
				// value for factors
				String numString2 = oldText.substring(oldText.indexOf("$") + 1, 
									oldText.lastIndexOf("$"));
				// values for linear 
				String numString3 = oldText.substring(oldText.indexOf("%") + 1, 
									oldText.lastIndexOf("%"));
				// values for vertices
				String numString4 = oldText.substring(oldText.indexOf("@") + 1, 
									oldText.lastIndexOf("@"));
				
				// initializing writer 
				FileWriter writer = new FileWriter(file);

				// changing score for quadratics
				int newValue = 1;
				int num1Changed = Integer.parseInt(numString3) + newValue;
					
				String newText = num1Changed + "";
				String outputString = "%" + newText + "%";
					
				writer.write(ogString1 + "\n" + ogString2 + "\n"
							+ outputString + "\n" + ogString4);
				
				// closing reader / writer
				reader.close();
				writer.close();
			}
			else if (q.getQuestionType() == 2) {
					File file = new File("test.txt");
					String oldText = "";
					// reads the file
					BufferedReader reader = new BufferedReader(new FileReader(file));
					String line = reader.readLine();
					
					// reads every line of the file
					while (line != null) {
						oldText = oldText + line;
						line = reader.readLine();
					}
					
					// saving original data 
					String ogString1 = oldText.substring(oldText.indexOf("#"), 
							oldText.lastIndexOf("#") + 1);
					String ogString2 = oldText.substring(oldText.indexOf("$"), 
							oldText.lastIndexOf("$") + 1);
					String ogString3 = oldText.substring(oldText.indexOf("%"), 
							oldText.lastIndexOf("%") + 1);
					String ogString4 = oldText.substring(oldText.indexOf("@"), 
							oldText.lastIndexOf("@") + 1);
					
					// value for quadratics 
					String numString1 = oldText.substring(oldText.indexOf("#") + 1, 
										oldText.lastIndexOf("#"));
					// value for factors
					String numString2 = oldText.substring(oldText.indexOf("$") + 1, 
										oldText.lastIndexOf("$"));
					// values for linear 
					String numString3 = oldText.substring(oldText.indexOf("%") + 1, 
										oldText.lastIndexOf("%"));
					// values for vertices
					String numString4 = oldText.substring(oldText.indexOf("@") + 1, 
										oldText.lastIndexOf("@"));
					
					// initializing writer 
					FileWriter writer = new FileWriter(file);

					// changing score for factors
				    int newValue = 1;
				    int num1Changed = Integer.parseInt(numString4) + newValue;
						
				    String newText = num1Changed + "";
				    String outputString = "@" + newText + "@";
						
				    writer.write(ogString1 + "\n" + ogString2 + "\n"
				    		    + ogString3 + "\n" + outputString);
					
					
					// closing reader / writer
					reader.close();
					writer.close();
			}
		}
    }
	public static void main (String[] args) throws IOException {
		Question test = new Question("test", 2, "yes", new Linear("Linear"), null);
		updateInformation(test);
	}
}
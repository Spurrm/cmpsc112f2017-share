public class Examples {
	public static void main(String[] args) {
		
		//create a FileUtility that uses a file called "accounts.txt"
		FileUtility accounts = new FileUtility("accounts.txt");
		
		//read the first line from "acounts.txt" and store it
		String first_line = accounts.read();
		
		//read the second line from "acounts.txt" and store it
		String second_line = accounts.read();
		
		//append a line to the end of "accounts.txt"
		accounts.write("Thus ends this file");
		
		//update the first line to be "This is now the first line"
		accounts.update(0, "This is now the first line");
		
		//get how many lines there are in the file and store that
		int lines = accounts.size();
		
		//update the last line to be "This is now the last line"
		accounts.update(lines-1, "This is now the last line");
		
		//reset the reader to the beginning of the file
		accounts.reset();
		
		//read the first line again, and print it
		String line = accounts.read();
		System.out.println(line);
		
	}
}
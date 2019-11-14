package File.Handling;

import java.io.*;

public class FileOutput {

	private static void readfile() {

		String line = "";
		BufferedReader br = null;

		try {

			FileReader reader = new FileReader("D:\\Golu\\names.txt");
			br = new BufferedReader(reader);
			boolean check;

			line = br.readLine();
			int counter =1;
			while (line != null) {
				if(counter===1) {
					
				}
				if (line.contains("it") || line.contains("cs") || line.contains("ex")) {
					check = true;
					System.out.println("Valid code");
				} else {
					check = false;
					System.out.println("invalid code");
				}
				if (check)
				System.out.println("Names are : " + line);
				line = br.readLine();
				counter++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeToFile() {
		BufferedWriter bw = null;
		try {
			FileWriter writer = new FileWriter("D:\\Golu\\names1.txt", true);
			bw = new BufferedWriter(writer);
			bw.write("sudhanshu kumar\n");
			bw.write("gaurav shran\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		readfile();
		writeToFile();

	}

}

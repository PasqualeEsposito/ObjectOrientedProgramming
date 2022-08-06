package cifraDecifra;

import java.io.*;

public class Cifrare {

	public Cifrare() {
		
	}
	
	public static void cifra(int k, FileInputStream read, FileOutputStream write) throws IOException {
		while(read.read() != -1) {
			write.write(read.read() + k);
		}
	}
	
	public static void decifra(int k, FileInputStream read, FileOutputStream write) throws IOException {
		while(read.read() != -1) {
			write.write(read.read() - k);
		}
	}
}

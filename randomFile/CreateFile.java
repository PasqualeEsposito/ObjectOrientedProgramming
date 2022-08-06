package randomFile;

import java.io.*;
import java.util.Scanner;
import java.util.Random;


public class CreateFile {

	public static void main(String[] args) throws Exception {
		Random generator = new Random();
		File fl = new File("/home/pasquale/eclipse-workspace/programmazioneObjectOriented/src/randomFile/test");
		Scanner sc = new Scanner(fl);
		for(int i = 0; i < 100; i++)
			System.out.println((1 + generator.nextInt(100)));
		sc.close();
	}

}

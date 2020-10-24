package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Leitor {

	public static void main(String[] args) {
		//Aqui o caminho do arquivo tem que estar identico
		File file = new File ("C:\\temp curso java\\ws_eclipse\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Erro: " + e.getMessage());			
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}

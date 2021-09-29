package gyak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class KKFileOlvas {

	public static void main(String[] args) throws IOException {
		File f=new File("kiraly");
		FileReader fr=new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int [] x=new int [100];
		int i=0;
		String s=br.readLine();
		while(s!=null) {
			x[i]=Integer.parseInt(s);
			i++;
			s=br.readLine();
		}
		int sum=0;
		System.out.println("Az adatok száma = "+i);
		for(int j=0; j<i; j++) {
			System.out.println(i+". adat = "+x[j]);
			sum+=x[j];
		}
		System.out.println("Összeg: "+sum);
	}
}

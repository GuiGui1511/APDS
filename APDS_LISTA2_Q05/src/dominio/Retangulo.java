package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Retangulo {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int cx1;
	private int cy1;
	private int cx2;
	private int cy2;

	public void detectarColisao() {

		String path = "C:\\Users\\nb11j\\OneDrive\\Documentos\\APDS\\APDS_L2_05\\test1.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while ((line = br.readLine()) != null) {

				String[] ler = line.split(" ");

				x1 = Integer.parseInt(ler[0]);
				y1 = Integer.parseInt(ler[1]);
				x2 = Integer.parseInt(ler[2]);
				y2 = Integer.parseInt(ler[3]);

				line = br.readLine();
				String[] ler2 = line.split(" ");
				cx1 = Integer.parseInt(ler2[0]);
				cy1 = Integer.parseInt(ler2[1]);
				cx2 = Integer.parseInt(ler2[2]);
				cy2 = Integer.parseInt(ler2[3]);

				if (x2 < cx1 || cx2 < x1 || y2 < cy1 || cy2 < y1 || x1 > cx2 || cx1 > x2 || y1 > cy2 || cy1 > y2) {
					System.out.println("0");

				} else {
					System.out.println("1");
				}

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

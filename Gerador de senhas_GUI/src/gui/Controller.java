package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {

	@FXML
	Button gerar;

	@FXML
	Text senha;
	
	@FXML
	public void gerar() {
		Random r = new Random();
		String[] gerada = new String[] { "a", "b", "c", "1", "2", "3", "@"};
		Integer rand = r.nextInt(gerada.length);
		Integer rand1 = r.nextInt(gerada.length);
		Integer rand2 = r.nextInt(gerada.length);
		Integer rand3 = r.nextInt(gerada.length);
		Integer rand4 = r.nextInt(gerada.length);
		String gerado = gerada[rand] + gerada[rand1] + gerada[rand2] + gerada[rand3] + gerada[rand4];
		
		senha.setText(gerado);
	}

}
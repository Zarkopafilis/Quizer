import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		
		try {
			Data.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		launch(args);
		

	}

	@Override
    public void start(Stage stage) {
		stage.setTitle("Quizer");
		stage.setResizable(false);

		//Resolution : 1366 x 768 (Fullscreen)
		
		StackPane root = new StackPane();
		stage.setScene(new Scene(root));
		stage.show();
	}
	
}
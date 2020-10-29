package Mouse001Pkg;

import com.sun.javafx.geom.Rectangle;

import java.lang.System;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mouse001Class extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Text text = new Text(20,20, "Java is fun");
		
		Button button = new Button();
		button.setLayoutX(290);
		button.setLayoutY(145);
		
		Rectangle rect = new Rectangle(30,20);
				
		Pane pane = new Pane();
		pane.getChildren().add(text);
		pane.getChildren().add(button);
//		pane.getChildren().add(rect);

		
		Scene scene = new Scene(pane, 600, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		text.setOnMouseDragged(e -> {
			text.setX(e.getX());
			text.setY(e.getY());
		});
		
		button.setOnAction(e -> {
			System.out.println("Button Clicked");
		});
		
		button.setOnMouseDragged(e -> {
			button.setLayoutX(e.getX());
			button.setLayoutY(e.getY());
		});
		
		DropShadow shadow = new DropShadow();
		button.setOnMouseDragEntered(e -> button.setEffect(shadow));
		button.setOnMouseDragExited(e -> button.setEffect(null));
	}

	public static void main(String[] args) {
		launch(args);
	}
}

//class ButtonHandler implements EventHandler<ActionEvent> {
//	public void handle(ActionEvent e)
	
//}

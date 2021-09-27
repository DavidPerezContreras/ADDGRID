import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane root =new StackPane();
		
		GridPane gp1 = new GridPane();
		
		
		 //CREA BOTONES
        Button btn = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        
        //Crea una etiqueta (Label)
        Label label = new Label("Example");
        
        
        //ESCRIBE EN LOS BOTONES
        btn.setText("Say 'Hello World'");
        btn2.setText("Say 'Hello World'");
        btn3.setText("Say 'Hello World'");
        btn4.setText("Say 'Hello World'");
        btn5.setText("Say 'Hello World'");
		
		
        
        //SET ESPACIO ENTRE CELDAS
        gp1.setVgap(10);
        gp1.setHgap(10);
		
		
        gp1.add(label, 0,0);
        gp1.add(btn2, 1, 1);
        gp1.add(btn3, 2, 2);
        gp1.add(btn4, 3, 3);
        gp1.add(btn5, 4, 4);
        
        //RowSpan que junta 3 celdas (1+2) //Para columnas solo hay que poner Column en vez de Row
        GridPane.setRowSpan(label, 3);
        

        
        //Alinea el GridPane en el centro del contenedor raiz
        gp1.setAlignment(Pos.CENTER);
        
        //TOP_LEFT
        //TOP_CENTER
        //BOTTOM_RIGHT
        
		
		
        
        
        
        ColumnConstraints column1 = new ColumnConstraints(); //Para filas solo hay que poner Row
        
        
        
        //Anchura del 10% del contenedor
        column1.setPercentWidth(10);
        
        //Anchura mínima  y máxima
        column1.setMinWidth(90);
        column1.setMaxWidth(300);
        

        ColumnConstraints column2 = new ColumnConstraints(); //Para filas solo hay que poner Row
      //segunda columna anchura del 20%
        column2.setPercentWidth(20);

      //Añade las restricciones a las dos primeras columnas //Para filas solo hay que poner Row
        gp1.getColumnConstraints().addAll(column1, column2);
        
        
        //Cambia la etiqueta a la última columna  //Para filas solo hay que poner Row
        //GridPane.setColumnIndex(label, 5);
        
        
        //Alinea la etiqueta arriba derecha
        GridPane.setHalignment(label, HPos.RIGHT);
        GridPane.setValignment(label, VPos.TOP);
        
        
		
        root.getChildren().add(gp1);
		gp1.setGridLinesVisible(true);
		primaryStage.setScene(new Scene(root, 700, 200));
        primaryStage.show();
	}

	
}
	
	


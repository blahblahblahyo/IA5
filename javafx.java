import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
/**
Simple demonstration of adding buttons to the BorderPane layout.
*/
public class javafx extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception
   {
       
       VBox root = new VBox();   
   
      
      HBox centerPane = new HBox();

      centerPane.setLayoutX(100);
      

      VBox topPane = new VBox();
      
      HBox buttonBox = new HBox();
      
      Button btnDeposit;
      Button btnWithdraw;
      btnDeposit = new Button("Deposit");
      btnWithdraw = new Button("Withdraw");
      
      
      
      Label accountHolder = new Label("Account Holder: John Doe");
      Label balance = new Label("Balance: 0.00");
      accountHolder.setFont(Font.font("Times New Roman", 26));
      balance.setFont(Font.font("Times New Roman", 20));
      Label empty = new Label("");
      
      
 
	  topPane.getChildren().add(accountHolder);
	  topPane.getChildren().add(balance);
      topPane.getChildren().add(empty);
      

	  TextField txtName = new TextField("");
	  
	  txtName.setPrefWidth(100);
	  
	  Label enter = new Label("Enter amount: ");
	  enter.setFont(Font.font("Times New Roman", 16));
	  
	  centerPane.getChildren().add(enter);
	  centerPane.getChildren().add(txtName);
	  topPane.setAlignment(Pos.CENTER);
	  centerPane.setAlignment(Pos.CENTER);
	  
	  //hbox with buttons
	  
	  buttonBox.getChildren().add(btnDeposit);
  	  buttonBox.getChildren().add(btnWithdraw);
	  buttonBox.setAlignment(Pos.CENTER);
	  buttonBox.setLayoutY(1);
	  
	  root.getChildren().add(topPane);
	  root.getChildren().add(centerPane);
	  
	  root.getChildren().add(buttonBox);
	  root.setSpacing(40);
	  



   	  Scene scene = new Scene(root, 500, 250);
        primaryStage.setTitle("Label Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
    



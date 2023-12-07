/*
   Name:Nathalia Valli
   Date: 11/15/18
   Purpose : create label fields and text fields for a bill calculator
   Lab #8 
*/


import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox;
import javafx.scene.control.Label; 
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

  
 public class BillCalculator extends Application 
   { 
      // Fields
   private TextField valueTextField;
   private TextField tipTextField;
   private TextField taxTextField;
   private TextField tipValue;
   private TextField taxValue;
   private Label resultLabel;
   
   
   public static void main(String[] args) 
    { 
    
    
     // Launch the application. 
     launch(args);
     } 
      @Override 
       public void start(Stage primaryStage) 
       { 
       
              


        // Create a Label and text field control.
         Label labelBox1 = new Label("Check Value"); 
         valueTextField = new TextField();
                           
                    
         Label labelBox2 = new Label("Tip Percentage"); 
         tipTextField = new TextField();
         
         Label labelBox3 = new Label ("Tax Percentage");
         taxTextField = new TextField();
         
         Label labelBox4 = new Label ("Tip Value");
         tipValue = new TextField ("");
                  
         Label labelBox5 = new Label ("Tax Value");         
         taxValue = new TextField ("");
                 
          //create a button
         Button calcButton = new Button("Calculate");
         //register the action
         calcButton.setOnAction(new CalcButtonHandler());
         resultLabel = new Label();
 
          
         
          // Put the Label in an HBox.
           HBox hBox1 = new HBox(20,labelBox1, valueTextField);
           HBox hBox2 = new HBox (20, labelBox2, tipTextField);
           HBox hBox3 = new HBox(20, labelBox3, taxTextField);
           HBox hBox4 = new HBox (20, labelBox4, tipValue); 
           HBox hBox5 = new HBox (20, labelBox5, taxValue);
           
           VBox vBox = new VBox ( 10,hBox1, hBox2, hBox3, hBox4, hBox5,calcButton, resultLabel);
           
           vBox.setAlignment(Pos.CENTER);
           vBox.setPadding(new Insets(10));
 
           
            // Create a Scene with the HBox as its root node. 
          Scene scene = new Scene(vBox ); 
          // Add the Scene to the Stage. 
          primaryStage.setScene(scene); 
          // Set the stage title. 
          primaryStage.setTitle("Bill Calculator"); 
          // Show the window. 
           primaryStage.show();
                  
         }
         
  class CalcButtonHandler implements EventHandler<ActionEvent>
         
   {
       @Override
      public void handle(ActionEvent event)
             {
           // Get the values added.
           double value = Double.parseDouble(valueTextField.getText());
           double tip = Double.parseDouble (tipTextField.getText());
           double tax = Double.parseDouble(taxTextField.getText());
            
            //calculate tip
           double tipValue1 = value * tip / 100;
           double taxValue1 = value * tax/ 100;
           double total = value +tipValue1 + taxValue1 ;

          // Display the results.
           resultLabel.setText(String.format("%,.2f Total Bill ", total ));
           tipValue.setText(String.format("" + tipValue1 ));
           taxValue.setText(String.format( "" + taxValue1 ));
          
           
           
     }
     }
     }
     
/*
   Name:Nathalia Valli
   Date: 11/25/18
   Purpose : Draw a house 
   Lab #9
*/


 import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.scene.Scene;
 import javafx.scene.layout.Pane;
 import javafx.scene.shape.Rectangle;
 import javafx.scene.shape.Line;
 import javafx.scene.shape.Circle;
 import javafx.scene.shape.Polygon;
 import javafx.scene.paint.Color;
 
  public class House extends Application
  {
     public static void main(String[] args)
     {
        launch(args);
     }

     @Override
     public void start(Stage primaryStage)
     {
        // Constants for the scene size
        final double SCENE_WIDTH = 840.0;
        final double SCENE_HEIGHT = 680.0;
        
        //create a polygon to create a triangle (roof)
        Polygon triangle = new Polygon();
         triangle.getPoints().addAll(500.0, 10.0,  // Top
                           350.0, 220.0, // Right
                           650.0, 220.0); // Bottom 
        triangle.setFill(Color.DARKRED);
                                                       
        //points for a circle (window)       
        final double CENTER_X = 410.0;
        final double CENTER_Y = 270.0;
        final double RING1_RADIUS = 45.0;
        
        // Create the circles.
        Circle ring1  = new Circle(CENTER_X, CENTER_Y, RING1_RADIUS, Color.DARKBLUE);
        
        //points for a circle (window)       
        final double CENTER_X3 = 590.0;
        final double CENTER_Y3 = 270.0;
        final double RING3_RADIUS = 45.0;
        
        // Create the circles.
        Circle ring3  = new Circle(CENTER_X3, CENTER_Y3, RING3_RADIUS, Color.DARKBLUE);

        
        //points for second circle (sun)
        final double CENTER_X1 = 80.0;
        final double CENTER_Y1 = 50.0;
        final double RING2_RADIUS = 50.0;
        
        Circle ring2  = new Circle(CENTER_X1, CENTER_Y1, RING2_RADIUS, Color.YELLOW);
        
        
        // points for rectangle (house)
        final double WIDTH = 300.0;
        final double HEIGHT = 250.0; 

        final double BOX1_X = 350.0;
        final double BOX1_Y = 220.0;
        
        Rectangle box1  = new Rectangle(BOX1_X, BOX1_Y, WIDTH, HEIGHT);
        box1.setFill(Color.DARKORANGE);
        
        //points for a small rectangle (door)
        final double WIDTH1 = 70.0;
        final double HEIGHT1 = 120.0; 

        final double BOX2_X = 465.0;
        final double BOX2_Y = 362.0;
        
        Rectangle box2  = new Rectangle(BOX2_X, BOX2_Y, WIDTH1, HEIGHT1);
        box2.setFill(Color.BLUE);
        
        //points for a big rectangle (floor)
        final double WIDTH2 = 840.0;
        final double HEIGHT2 = 250.0; 

        final double BOX3_X = 0.0;
        final double BOX3_Y = 470.0;
        
        Rectangle box3  = new Rectangle(BOX3_X, BOX3_Y, WIDTH2, HEIGHT2);
        box3.setFill(Color.DARKGREEN);
        
        //points for a big rectangle (sky)
        final double WIDTH3 = 840.0;
        final double HEIGHT3 = 470.0; 

        final double BOX4_X = 0.0;
        final double BOX4_Y = 0.0;
        
        Rectangle box4  = new Rectangle(BOX4_X, BOX4_Y, WIDTH3, HEIGHT3);
        box4.setFill(Color.LIGHTBLUE);
 
                           

        // Add shapes to pane
        Pane pane = new Pane(box4,triangle, box1, box2, box3 ,ring1, ring2, ring3);
        

        // Create a Scene and display it.
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
     }
  }
        
        
        

       
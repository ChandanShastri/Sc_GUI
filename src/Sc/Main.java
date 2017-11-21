package Sc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Chandan Shastri's GUI");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);

        System.out.println("Chandan Shastri");

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(Exception e)
        {
            System.out.println(" ERROR ");
        }
        finally {
            try
            {if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }}
            catch(Exception c)
            {

            }
        }


    }
}

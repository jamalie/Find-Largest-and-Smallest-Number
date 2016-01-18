package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        int[] array = new int[10];
        int a, b;
        Random r = new Random();

        for(int i = 0; i < 10; i++){
            array[i] = (r.nextInt(100) + 1);
        }

        System.out.println("The number filled in the array are: " + array[0]+", " + array[1]+", " + array[2]+", " + array[3]+", " + array[4]+", " + array[5]+", " + array[6]+", " + array[7]+", " + array[8]+", " + array[9]);

        a = largest(array);
        b = smallest(array);

        System.out.println("The largest number is: " + a + ".");
        System.out.println("The smallest number is " + b + ".");

    }

    public static int largest(int[] a){
        int largestNumber = 0;

        for(int i = 0; i<10; i++){
            if(i == 0){
                largestNumber =  a[i];
            }
            if(largestNumber < a[i]){
                largestNumber = a[i];
            }
        }
        return largestNumber;
    }

    public static int smallest(int[] a){
        int smallestNumber = 0;

        for(int i = 0; i<10; i++){
            if(i == 0){
                smallestNumber =  a[i];
            }
            if(smallestNumber > a[i]){
                smallestNumber = a[i];
            }
        }
        return smallestNumber;
    }
}

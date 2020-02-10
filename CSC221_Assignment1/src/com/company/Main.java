package com.company;

import java.util.Scanner;
import java.util.GregorianCalendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
    	launch(args);
    	
        /*System.out.println("Enter first name: ");
        Scanner inFirstName = new Scanner(System.in);
        String firstName = inFirstName.nextLine();

        System.out.println("Enter last name: ");
        Scanner inLastName = new Scanner(System.in);
        String lastName = inLastName.nextLine();

        System.out.println("Enter birth month: ");
        Scanner inMonth = new Scanner(System.in);
        int month = inMonth.nextInt();
        while(month < 1 || month > 12) {
            System.out.println("I know that's not your real birth month. ");
            month = inMonth.nextInt();
        }

        System.out.println("Enter birth day: ");
        Scanner inDay = new Scanner(System.in);
        int day = inDay.nextInt();
        while(day < 1 || day > 31) {
            System.out.println("I know that's not your real birth day: ");
            day = inDay.nextInt();
        }

        System.out.println("Enter birth year: ");
        Scanner inYear = new Scanner(System.in);
        int year = inYear.nextInt();
        GregorianCalendar calendar = new GregorianCalendar();
        while(year > calendar.get(GregorianCalendar.YEAR) || year < (calendar.get(GregorianCalendar.YEAR) - 120)) {
            System.out.println("What are you a time traveler? ");
            year = inYear.nextInt();
        }

        HeartRates test = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("First name: " + test.getFirstName());
        System.out.println("Last name: " + test.getLastName());
        System.out.println("Birth date: " + test.getMonth() + "/" + test.getDay() + "/" + test.getYear());
        System.out.println("Age: " + test.age());
        System.out.println("Max heart rate: " + test.maxHeartRate());
        System.out.println("Target heart rate: " + test.targetHeartRate()[0] + " - " + test.targetHeartRate()[1]);*/
    }
    
    @Override
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Title of the Window");
          
        TextField firstNameTF = new TextField();
        firstNameTF.setMinHeight(30);
        firstNameTF.setMinWidth(150);
        firstNameTF.setPromptText("Enter first name");
          
        TextField lastNameTF = new TextField();
        lastNameTF.setMinHeight(30);
        lastNameTF.setMinWidth(150);
        lastNameTF.setPromptText("Enter last name");

        TextField monthTF = new TextField();
        monthTF.setMinHeight(30);
        monthTF.setMinWidth(150);
        monthTF.setPromptText("Enter birth month");

        TextField dayTF = new TextField();
        dayTF.setMinHeight(30);
        dayTF.setMinWidth(150);
        dayTF.setPromptText("Enter birth day");

        TextField yearTF = new TextField();
        yearTF.setMinHeight(30);
        yearTF.setMinWidth(150);
        yearTF.setPromptText("Enter birth year");

        Button button = new Button();
        button.setMinHeight(25);
        button.setMinWidth(80);
        button.setText("Submit");
          
        VBox vBox = new VBox();
        vBox.getChildren().addAll(firstNameTF,lastNameTF, monthTF, dayTF, yearTF, button);

        Scene scene = new Scene(vBox, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();

        //  OUTPUT WINDOW
        Text output1 = new Text();
        Text output2 = new Text();
        Text ifIncorrect = new Text();

        VBox outputvBox = new VBox();

        Scene outputScene = new Scene(outputvBox, 300, 250);

        Stage outputStage = new Stage();
        outputStage.setScene(outputScene);

        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                GregorianCalendar calendar = new GregorianCalendar();
                int currentYear = calendar.get(GregorianCalendar.YEAR);
                
                int month = Integer.parseInt(monthTF.getText());
                int day = Integer.parseInt(dayTF.getText());
                int year = Integer.parseInt(yearTF.getText());
                HeartRates test2 = new HeartRates(firstNameTF.getText(), lastNameTF.getText(), month, day, year);

                output1.setText("First name: " + test2.getFirstName() + "\nLast name: " + test2.getLastName() + "\nBirth date: " + test2.getMonth() + "/" + test2.getDay() + "/" + test2.getYear());
                output2.setText("Age: " + test2.age() + "\nMax heart rate: " + test2.maxHeartRate() + "\nTarget heart rate: " + test2. targetHeartRate()[0] + " - " + test2.targetHeartRate()[1]);
                if(day < 1 || day > 31 || month < 1 || month > 12 || year > currentYear) {
                    ifIncorrect.setText("INVALID DATE WAS ENTERED.");
                }
                outputvBox.getChildren().addAll(output1, output2, ifIncorrect);
                outputStage.show();
            }

        });
	}
}

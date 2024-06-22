package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Filters {

    @FXML
    private Pane initializePane;

    Button button = new Button("Apply Filters");
    Button button1 = new Button("Get Filters");

    @FXML
    private Pane filterContainer;

    @FXML
    private void initialize() throws IOException {

        Image image = new Image(getClass().getResourceAsStream("/assets/dashboard.png"));
        javafx.scene.image.ImageView imageView = new javafx.scene.image.ImageView(image);
        imageView.setLayoutX(50.0);
        imageView.setLayoutY(23.0);
        imageView.setFitHeight(39.0);
        imageView.setFitWidth(45.0);
        imageView.setSmooth(false);

        Image image1 = new Image(getClass().getResourceAsStream("/assets/browse.png"));
        javafx.scene.image.ImageView imageView1 = new javafx.scene.image.ImageView(image1);
        imageView1.setLayoutX(53.0);
        imageView1.setLayoutY(105.0);
        imageView1.setFitHeight(44.0);
        imageView1.setFitWidth(43.0);
        imageView1.setPreserveRatio(true);

        Image image2 = new Image(getClass().getResourceAsStream("/assets/analysis.png"));
        javafx.scene.image.ImageView imageView2 = new javafx.scene.image.ImageView(image2);
        imageView2.setLayoutX(53.0);
        imageView2.setLayoutY(195.0);
        imageView2.setFitHeight(47.0);
        imageView2.setFitWidth(48.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    initializee();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Image image3 = new Image(getClass().getResourceAsStream("/assets/feedback.png"));
        javafx.scene.image.ImageView imageView3 = new javafx.scene.image.ImageView(image3);
        imageView3.setLayoutX(53.0);
        imageView3.setLayoutY(270.0);
        imageView3.setFitHeight(47.0);
        imageView3.setFitWidth(48.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);

        initializePane.getChildren().add(imageView);
        initializePane.getChildren().add(imageView1);
        initializePane.getChildren().add(imageView2);
        initializePane.getChildren().add(imageView3);

    }

    @FXML
    private void initializee() throws IOException {
        Rectangle rectangle = new Rectangle(192, 35, 1479, 56);
        rectangle.setArcWidth(5.0);
        rectangle.setArcHeight(5.0);
        rectangle.setFill(javafx.scene.paint.Color.rgb(0, 81, 255, 0.15));
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(StrokeType.INSIDE);

        Text text1 = new Text(789, 70, "Data Analytics");
        text1.setFont(Font.font("System Bold", 25));

        Rectangle rectangle2 = new Rectangle(208, 135, 883, 47);
        rectangle2.setArcWidth(5.0);
        rectangle2.setArcHeight(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.rgb(0, 81, 255, 0.15));
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(StrokeType.INSIDE);

        Text text2 = new Text(230, 166, "New Severage leak in my pipeline 2 hours far away");
        text2.setFont(Font.font("System Bold", 21));

        Text text3 = new Text(210, 122, "Complaints Assigned:");
        text3.setFont(Font.font("System Bold", 19));
        Button newButton = new Button("Generate Report");
        newButton.setLayoutX(1434.0);
        newButton.setLayoutY(132.0);
        newButton.setPrefHeight(50.0);
        newButton.setPrefWidth(119.0);
        newButton.setOnAction(e -> {
            try {
                report(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        // <Button layoutX="1221.0" layoutY="133.0" mnemonicParsing="false"
        // prefHeight="50.0" prefWidth="119.0" text="Get Filters" onAction="#check" />
        button1.setLayoutX(1220.0);
        button1.setLayoutY(133.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(50.0);
        button1.setPrefWidth(119.0);
        button1.setOnAction(e -> {
            try {
                check(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        initializePane.getChildren().addAll(rectangle, text1, rectangle2, text2, text3, button1, newButton);

    }

    @FXML
    private void check(ActionEvent event) throws IOException {

        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(5.0);
        rectangle.setFill(Color.web("#ffffff00"));
        rectangle.setHeight(82.0);
        rectangle.setLayoutX(209);
        rectangle.setLayoutY(197.0);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeLineCap(StrokeLineCap.ROUND);
        rectangle.setStrokeType(StrokeType.INSIDE);
        rectangle.setWidth(1216.0);

        RadioButton radioButton1 = new RadioButton("Filter 1");
        radioButton1.setLayoutX(240.0);
        radioButton1.setLayoutY(225.0);
        radioButton1.setScaleX(1.3);
        radioButton1.setScaleY(1.3);

        RadioButton radioButton2 = new RadioButton("Filter 2");
        radioButton2.setLayoutX(360.0);
        radioButton2.setLayoutY(225.0);
        radioButton2.setScaleX(1.3);
        radioButton2.setScaleY(1.3);

        RadioButton radioButton3 = new RadioButton("Filter 3");
        radioButton3.setLayoutX(480.0);
        radioButton3.setLayoutY(225.0);
        radioButton3.setScaleX(1.3);
        radioButton3.setScaleY(1.3);

        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);

        button.setLayoutX(1220.0);
        button.setLayoutY(210.0);
        button.setPrefHeight(49.0);
        button.setPrefWidth(120.0);

        button.setOnAction(e -> {
            if (radioButton1.isSelected()) {
                filterContainer.getChildren().clear();
                Image image = new Image(getClass().getResourceAsStream("/assets/graph.png"));
                ImageView imageView = new ImageView(image);
                imageView.setLayoutX(640.0);
                imageView.setLayoutY(300.0);
                imageView.setFitHeight(410);
                imageView.setFitWidth(400);
                filterContainer.getChildren().add(imageView);
            } else if (radioButton2.isSelected()) {
                filterContainer.getChildren().clear();
                Image image = new Image(getClass().getResourceAsStream("/assets/analysis.png"));
                ImageView imageView = new ImageView(image);
                imageView.setLayoutX(640.0);
                imageView.setLayoutY(300.0);
                imageView.setFitHeight(410);
                imageView.setFitWidth(400);
                filterContainer.getChildren().add(imageView);
            } else if (radioButton3.isSelected()) {
                filterContainer.getChildren().clear();
                Image image = new Image(getClass().getResourceAsStream("/assets/dashboard.png"));
                ImageView imageView = new ImageView(image);
                imageView.setLayoutX(640.0);
                imageView.setLayoutY(300.0);
                imageView.setFitHeight(410);
                imageView.setFitWidth(400);
                filterContainer.getChildren().add(imageView);
            }
        });

        filterContainer.getChildren().addAll(rectangle, radioButton1, radioButton2, radioButton3, button);
    }

    @FXML
    private void report(ActionEvent event) throws IOException {
        // print report
        // FileChooser fileChooser = new FileChooser();
        // fileChooser.setTitle("Save Report");
        // fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF
        // Files", "*.pdf"));
        // fileChooser.showSaveDialog(null);

        // URL url = new URL("https://www.google.com");
        // ReadableByteChannel readableByteChannel =
        // Channels.newChannel(url.openStream());
        // FileOutputStream fileOutputStream = new FileOutputStream(
        // fileChooser.getInitialDirectory() + "/" + fileChooser.getInitialFileName());
        // fileOutputStream.getChannel().transferFrom(readableByteChannel, 0,
        // Long.MAX_VALUE);

        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE,
                Printer.MarginType.DEFAULT);
        PrinterJob job = PrinterJob.createPrinterJob();
        job.getJobSettings().setPageLayout(pageLayout);
        job.showPrintDialog(null);
        job.printPage(filterContainer);
        job.endJob();


    }

    // get filters
    public void getFilters() {
        // call check function
        try {
            check(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

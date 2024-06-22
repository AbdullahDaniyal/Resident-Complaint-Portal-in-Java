package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewStatusController {

    @FXML
    private Pane container;

    @FXML
    private Pane initializedPane;

    @FXML
    private void initializing(ActionEvent event) throws IOException {
        Rectangle rectangle1 = new Rectangle(257, 153, 1270, 644);
        rectangle1.setArcWidth(5.0);
        rectangle1.setArcHeight(5.0);
        rectangle1.setFill(javafx.scene.paint.Color.rgb(255, 255, 255, 0.07));
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(StrokeType.INSIDE);

        Rectangle rectangle2 = new Rectangle(191, 47, 1407, 809);
        rectangle2.setArcWidth(5.0);
        rectangle2.setArcHeight(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.rgb(31, 147, 255, 0.07));
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(StrokeType.INSIDE);

        Rectangle rectangle3 = new Rectangle(257, 202, 1269, 56);
        rectangle3.setArcWidth(5.0);
        rectangle3.setArcHeight(5.0);
        rectangle3.setFill(javafx.scene.paint.Color.rgb(31, 147, 255, 0.07));
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(StrokeType.INSIDE);

        Text text1 = new Text(319, 235, "Complaint ID");
        text1.setFont(Font.font(14));

        Text text2 = new Text(504, 235, "Name");
        text2.setFont(Font.font(14));

        Text text3 = new Text(660, 235, "Address");
        text3.setFont(Font.font(14));

        Text text4 = new Text(834, 235, "CNIC");
        text4.setFont(Font.font(14));

        Text text5 = new Text(1158, 235, "Date");
        text5.setFont(Font.font(14));

        Text text6 = new Text(971, 235, "Complaint Type");
        text6.setFont(Font.font(14));

        Text text7 = new Text(328, 301, "12345678");
        text7.setFont(Font.font(14));

        Text text8 = new Text(474, 301, "Abdullah Daniyal");
        text8.setFont(Font.font(14));

        Text text9 = new Text(644, 301, "F10/4, St#56...");
        text9.setFont(Font.font(14));

        Text text10 = new Text(817, 302, "11324-322...");
        text10.setFont(Font.font(14));

        Text text11 = new Text(983, 302, "Electricity");
        text11.setFont(Font.font(14));

        Text text12 = new Text(1149, 301, "01-2-2023");
        text12.setFont(Font.font(14));

        Text text13 = new Text(310, 105, "From");
        text13.setFont(Font.font(14));

        TextField textField1 = new TextField();
        textField1.setLayoutX(362);
        textField1.setLayoutY(89);
        textField1.setPrefHeight(25);
        textField1.setPrefWidth(56);

        TextField textField2 = new TextField();
        textField2.setLayoutX(438);
        textField2.setLayoutY(89);
        textField2.setPrefHeight(25);
        textField2.setPrefWidth(56);

        TextField textField3 = new TextField();
        textField3.setLayoutX(513);
        textField3.setLayoutY(90);
        textField3.setPrefHeight(25);
        textField3.setPrefWidth(56);

        Text text14 = new Text(501, 106, "/");
        text14.setFont(Font.font(14));

        Text text15 = new Text(424, 105, "/");
        text15.setFont(Font.font(14));

        Text text16 = new Text(694, 105, "To");
        text16.setFont(Font.font(14));

        TextField textField4 = new TextField();
        textField4.setLayoutX(717);
        textField4.setLayoutY(89);
        textField4.setPrefHeight(25);
        textField4.setPrefWidth(56);

        TextField textField5 = new TextField();
        textField5.setLayoutX(793);
        textField5.setLayoutY(89);
        textField5.setPrefHeight(25);
        textField5.setPrefWidth(56);

        TextField textField6 = new TextField();
        textField6.setLayoutX(868);
        textField6.setLayoutY(90);
        textField6.setPrefHeight(25);
        textField6.setPrefWidth(56);

        Text text17 = new Text(856, 106, "/");
        text17.setFont(Font.font(14));

        Text text18 = new Text(779, 105, "/");
        text18.setFont(Font.font(14));

        TextField textField7 = new TextField();
        textField7.setLayoutX(1152);
        textField7.setLayoutY(91);
        textField7.setPrefHeight(25);
        textField7.setPrefWidth(135);

        Text text19 = new Text(1060, 108, "Complaint ID");
        text19.setFont(Font.font(14));

        Button searchButton = new Button("Search");
        searchButton.setLayoutX(1429);
        searchButton.setLayoutY(81);
        searchButton.setMnemonicParsing(false);

        Font font2 = new Font(14);
        searchButton.setFont(font2);

        // ImageView searchImageView = new ImageView();
        // searchImageView.setFitHeight(35);
        // searchImageView.setFitWidth(40);
        // searchImageView.setPreserveRatio(true);
        // Image searchImage = new Image("@../Icons/browse.png");
        // searchImageView.setImage(searchImage);

        // searchButton.setGraphic(searchImageView);

        Button openButton = new Button("Open");
        openButton.setLayoutX(1314);
        openButton.setLayoutY(282);
        openButton.setMnemonicParsing(false);
        openButton.setOnAction(e -> {
            try {
                this.check(event);
            } catch (IOException ex) {

            }
        });

        Font font3 = new Font(14);
        openButton.setFont(font3);

        initializedPane.getChildren().addAll(rectangle1, rectangle2, rectangle3, text1, text2, text3, text4, text5,
                text6, text7, text8, text9, text10, text11, text12, text13, textField1, textField2, textField3,
                text14, text15, text16, textField4, textField5, textField6, text17, text18, textField7, text19,
                searchButton, openButton);
    }

    @FXML
    private void check(ActionEvent event) throws IOException {
        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(5.0);
        rectangle.setFill(Color.web("#ffffff00"));
        rectangle.setHeight(82.0);
        rectangle.setLayoutX(284.0);
        rectangle.setLayoutY(337.0);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeLineCap(StrokeLineCap.ROUND);
        rectangle.setStrokeType(StrokeType.INSIDE);
        rectangle.setWidth(1216.0);

        Line line = new Line();
        line.setEndX(914.1112060546875);
        line.setLayoutX(440.0);
        line.setLayoutY(377.0);
        line.setStartX(-43.222198486328125);

        Circle circle1 = new Circle();
        circle1.setFill(Color.DODGERBLUE);
        circle1.setLayoutX(396.0);
        circle1.setLayoutY(377.0);
        circle1.setRadius(10.0);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeType(StrokeType.INSIDE);

        Circle circle2 = new Circle();
        circle2.setFill(Color.DODGERBLUE);
        circle2.setLayoutX(697.0);
        circle2.setLayoutY(377.0);
        circle2.setRadius(10.0);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeType(StrokeType.INSIDE);

        Circle circle3 = new Circle();
        circle3.setFill(Color.WHITE);
        circle3.setLayoutX(1005.0);
        circle3.setLayoutY(377.0);
        circle3.setRadius(10.0);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeType(StrokeType.INSIDE);

        Circle circle4 = new Circle();
        circle4.setFill(Color.WHITE);
        circle4.setLayoutX(1351.0);
        circle4.setLayoutY(377.0);
        circle4.setRadius(10.0);
        circle4.setStroke(Color.BLACK);
        circle4.setStrokeType(StrokeType.INSIDE);

        Text text1 = new Text();
        text1.setLayoutX(370.0);
        text1.setLayoutY(407.0);
        text1.setStrokeType(StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Received");
        text1.setFont(new Font(14.0));

        Text text2 = new Text();
        text2.setLayoutX(637.0);
        text2.setLayoutY(407.0);
        text2.setStrokeType(StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Received by admin");
        text2.setFont(new Font(14.0));

        Text text3 = new Text();
        text3.setLayoutX(898.0);
        text3.setLayoutY(405.0);
        text3.setStrokeType(StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Forwarded to Concerned Department");
        text3.setFont(new Font(14.0));

        Text text4 = new Text();
        text4.setLayoutX(1279.0);
        text4.setLayoutY(406.0);
        text4.setStrokeType(StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Complaint Resolved");
        text4.setFont(new Font(14.0));

        Pane pane = new Pane();
        pane.getChildren().add(rectangle);
        pane.getChildren().add(line);
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle4);
        pane.getChildren().add(text1);
        pane.getChildren().add(text2);
        pane.getChildren().add(text3);
        pane.getChildren().add(text4);

        container.getChildren().add(pane);

    }

}

package com.iucosoft.internshipappfx.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomePageView extends AnchorPane {
    VBox mainVBox = new VBox();
    HBox headerHBox = new HBox();
    HBox searchBarHBox = new HBox();
    HBox categoriesHBox = new HBox();
    VBox internshipsVBox = new VBox();

    Button stagiiMdButton;
    Button homeButton;
    Button internshipsButton;
    Button companiesButton;
    Button searchButton;
    Button itButton;
    Button designButton;
    Button marketingButton;
    Button managementButton;
    Button othersButton;
    Button moreInternshipsButton;

    TextField searchBar;
    Label examplesLabel;
    Label findInternshipsLabel;
    Label byCategoryLabel;
    Label featInternshipsLabel;

    public HomePageView() {
        createGUI();
    }

    private void createGUI() {
        initComponents();
        createHeader();



        searchBarHBox.getChildren().addAll(searchBar, searchButton);
        categoriesHBox.getChildren().addAll(itButton, designButton, marketingButton, managementButton, othersButton);



        mainVBox.getChildren().addAll(headerHBox, findInternshipsLabel, searchBarHBox, examplesLabel, categoriesHBox,
                featInternshipsLabel, internshipsVBox, moreInternshipsButton);
        this.getChildren().add(mainVBox);

    }

    private void createHeader() {
        headerHBox.setPrefWidth(1000);
        headerHBox.setSpacing(100);
        headerHBox.setAlignment(Pos.CENTER);
        headerHBox.getChildren().addAll(stagiiMdButton, homeButton, internshipsButton, companiesButton);
    }

    private void initComponents() {
        stagiiMdButton = new Button("STAGII.MD");
        homeButton = new Button("Home");
        internshipsButton = new Button("Internships");
        companiesButton = new Button("Companies");
        searchButton = new Button("Search");
        itButton = new Button("IT");
        designButton = new Button("Design");
        marketingButton = new Button("Marketing");
        managementButton = new Button("Management");
        othersButton = new Button("Other");
        moreInternshipsButton = new Button("More Internships");
        searchBar = new TextField();
        examplesLabel = new Label("Examples: Front-End, Java Developer, Graphic Designer");
        findInternshipsLabel = new Label("Find Internships:");
        byCategoryLabel = new Label("By Category");
        featInternshipsLabel = new Label("Featured Internships:");
    }
}

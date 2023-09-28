/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx;

import com.iucosoft.internshipappfx.gui.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author munka
 */
public class InternshipAppFX extends Application {

    Stage primaryStage;
    HomePageView homePage;
    ApplicationView applicationView;
    CompaniesView companiesView;
    CompanyProfileView companyProfileView;
    InternshipsView internshipsView;
    IntershipPageView intershipPageView;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showHomePageView();
    }

    private void showHomePageView() {
        homePage = new HomePageView();
        refreshScene(homePage, 1000, 800, "Home Page");
    }

    private void showIntershipsView() {

    }

    private void showInternshipPageView() {

    }

    private void showCompanyProfileView() {

    }

    private void showCompaniesView() {

    }

    private void showApplicationView() {

    }

    private void refreshScene(Pane pane, int w, int h, String title) {
        Scene scene = new Scene(pane, w, h, Color.LIGHTYELLOW);

        primaryStage.setTitle("Library Management");
        primaryStage.setScene(scene);

        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        double x = bounds.getMinX() + (bounds.getWidth() - scene.getWidth()) * 0.5;
        double y = bounds.getMinY() + (bounds.getHeight() - scene.getHeight()) * 0.5;
        primaryStage.setX(x);
        primaryStage.setY(y);

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */

    
}

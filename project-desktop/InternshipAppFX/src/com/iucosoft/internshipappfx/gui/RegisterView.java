/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class RegisterView extends AnchorPane {
    GridPane mainGridPane = new GridPane();
    
    Label usernameLabel;
    Label passwordLabel;
    Label firstNameLabel;
    Label lastNameLabel;
    Label ageLabel;
    Label statusLabel;
    Label domainLabel;
    Label cvFileLabel;
    Label emailLabel;
    Label phoneNumberLabel;
    
    TextField usernameField;
    PasswordField passwordField;
    TextField firstNameField;
    TextField lastNameField;
    TextField ageField;
    FileChooser cvFileChooser;
    TextField emailField;
    TextField phoneNumberField;
    
    ChoiceBox statusChoiceBox;
    ChoiceBox domainChoiceBox;
    
    Button registerButton;
    
    public RegisterView() {
        createGUI();
    }
    
    private void createGUI() {
        initComponents();
        
        mainGridPane.setGridLinesVisible(false);
        mainGridPane.setVgap(10);
        mainGridPane.setHgap(10);
        mainGridPane.setPadding(new Insets(30, 30, 30, 30));
        
        mainGridPane.add(usernameLabel, 0, 0);
        mainGridPane.add(usernameField, 1, 0);
        
        mainGridPane.add(passwordLabel, 0, 1);
        mainGridPane.add(passwordField, 1, 1);
        
        mainGridPane.add(firstNameLabel, 0, 2);
        mainGridPane.add(firstNameField, 1, 2);
        
        mainGridPane.add(lastNameLabel, 0, 3);
        mainGridPane.add(lastNameField, 1, 3);
        
        mainGridPane.add(ageLabel, 0, 4);
        mainGridPane.add(ageField, 1, 4);
        
        mainGridPane.add(statusLabel, 0, 5);
        mainGridPane.add(statusChoiceBox, 1, 5);
        
        mainGridPane.add(domainLabel, 0, 6);
        mainGridPane.add(domainChoiceBox, 1, 6);
        
        mainGridPane.add(cvFileLabel, 0, 7);
       // mainGridPane.add(cvFileChooser, 1, 7);
        
        mainGridPane.add(emailLabel, 0, 8);
        mainGridPane.add(emailField, 1, 8);
        
        mainGridPane.add(phoneNumberLabel, 0, 9);
        mainGridPane.add(phoneNumberField, 1, 9);
        
        mainGridPane.add(registerButton, 1, 10);
        
        this.getChildren().add(mainGridPane);
    }
    
    private void initComponents() {
        usernameLabel = new Label("Username:");
        passwordLabel = new Label("Password:");
        firstNameLabel = new Label("First Name:");
        lastNameLabel = new Label("Last Name:");
        ageLabel = new Label("Age:");
        statusLabel = new Label("Status:");
        domainLabel = new Label("Domain:");
        cvFileLabel = new Label("CV File:");
        emailLabel = new Label("Email:");
        phoneNumberLabel = new Label("Phone Number:");
        
        usernameField = new TextField();
        passwordField = new PasswordField();
        firstNameField = new TextField();
        lastNameField = new TextField();
        ageField = new TextField("0");
        cvFileChooser = new FileChooser();
        emailField = new TextField();
        phoneNumberField = new TextField();
        
        statusChoiceBox = new ChoiceBox();
        statusChoiceBox.getItems().addAll("Student", "Unemployed", "Working");
        
        registerButton = new Button("Register!");
        
        domainChoiceBox = new ChoiceBox();
        domainChoiceBox.getItems().addAll("IT","DESIGN","EDUCATION",
                "SPORT, BEAUTY and WELLNESS","TOURISM","FOOD","MARKETING",
                "MEDICINE","BANKING","ENGINEERING","ENTERTAINMENT","COMMERCE");
        
    }
    
}

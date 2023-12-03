package com.example.sajing_finalexam;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.security.interfaces.DSAKey;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableColumn<Data, String> bmiCol;


    @FXML
    private TableColumn<Data, Double> heightC;

    @FXML
    private TextField heightInput;

    @FXML
    private TableColumn<Data, String> statusCol;

    @FXML
    private TextField weightDisplay;

    @FXML
    private TextField heightDisplay;

    @FXML
    private TextField bmiDisplay;

    @FXML
    private TextField statusDisplay;

    @FXML
    private TableColumn<Data, Double> weightC;


    @FXML
    private TextField weightInput;

    @FXML
    private TableView tableView;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        weightC.setCellValueFactory(new PropertyValueFactory<Data, Double>("weight"));
        heightC.setCellValueFactory(new PropertyValueFactory<Data, Double>("height"));
        bmiCol.setCellValueFactory(new PropertyValueFactory<Data, String>("bmiString"));
        statusCol.setCellValueFactory(new PropertyValueFactory<Data, String>("status"));

    }

    @FXML
    void onCalculateBMI(ActionEvent event) {
Data data=new Data(Double.valueOf(weightInput.getText()),Double.valueOf(heightInput.getText()));
data.checkStatus(data.getBmi());
        ObservableList<Data> values=tableView.getItems();
        values.add(data);
        tableView.setItems(values);
        weightDisplay.setText("");
        heightDisplay.setText("");
        bmiDisplay.setText("");
        statusDisplay.setText("");
        weightDisplay.setText(String.valueOf(data.getWeight()));
        heightDisplay.setText(String.valueOf(data.getHeight()));
        bmiDisplay.setText(data.getBmiString());
        statusDisplay.setText(data.getStatus());
        weightInput.setText("");
        heightInput.setText("");
    }

}

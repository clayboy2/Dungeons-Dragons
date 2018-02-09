/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author austen
 */
public class BattleModeController implements Initializable {

    @FXML
    private ListView monsters;
    @FXML
    private ListView initiative;
    @FXML
    private TextField playerName;
    @FXML
    private TextField playerInit;
    @FXML
    private TextField monsterName;
    @FXML
    private TextField monsterInit;
    
    private ArrayList<String> monsterList;
    private ArrayList<String> initiativeList;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monsterList = new ArrayList<>();
        initiativeList = new ArrayList<>();
        ObservableList<String> items = FXCollections.observableList(monsterList);
        monsters.setItems(items);
        ObservableList<String> itemsInit = FXCollections.observableList(initiativeList);
        initiative.setItems(itemsInit);
    }
    
    @FXML
    public void addInit(ActionEvent e)
    {
        
    }
    
    @FXML
    public void addMonster(ActionEvent e)
    {
        
    }
    
    @FXML
    public void calculate(ActionEvent e)
    {
        
    }
}

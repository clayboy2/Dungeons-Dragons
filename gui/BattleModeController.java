/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import utils.Entity;

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
    
    private ArrayList<Entity> monsterList;
    private ArrayList<Entity> initiativeList;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monsterList = new ArrayList<>();
        initiativeList = new ArrayList<>();
        ObservableList<Entity> items = FXCollections.observableList(monsterList);
        monsters.setItems(items);
        ObservableList<Entity> itemsInit = FXCollections.observableList(initiativeList);
        initiative.setItems(itemsInit);
    }
    
    @FXML
    public void addInit(ActionEvent e)
    {
        String name = playerName.getText();
        int init = Integer.parseInt(playerInit.getText());
        Entity thing = new Entity(name,init);
        initiativeList.add(thing);
    }
    
    @FXML
    public void addMonster(ActionEvent e)
    {
        String name = monsterName.getText();
        int init = Integer.parseInt(monsterInit.getText());
        Entity thing = new Entity(name,init);
        monsterList.add(thing);
        initiativeList.add(thing);
    }
    
    @FXML
    public void calculate(ActionEvent e)
    {
        Collections.sort(initiativeList);
        initiative.refresh();
    }
}

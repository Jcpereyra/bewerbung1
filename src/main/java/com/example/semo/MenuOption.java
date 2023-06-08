package com.example.semo;

import javafx.geometry.NodeOrientation;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

/**
 * The type Menu option.
 */
//This Class will optimize The Menu on the top right
public class MenuOption  extends AnchorPane  {
    /**
     * Instantiates a new Menu option.
     *
     * @param $forWho the for who
     * @param parent  the parent
     */
    public MenuOption(String $forWho, Pane parent){
        this.setNodeOrientation(NodeOrientation.INHERIT);
        this.setScaleY(1.0);
        Button[] homeButtons = new Button[2];
        Button[] computerButtons = new Button[3];
        Button[] userButtons = new Button[2];
        switch($forWho){
            case "home":
                this.setPrefSize(parent.getWidth(),parent.getHeight());
                this.setLayoutX(0);
                this.setLayoutY(0);
                this.setId("home1");
                this.getChildren().addAll(homeButtons(homeButtons));
                break;
            case "pc":
                this.setPrefSize(parent.getWidth(),parent.getHeight());
                this.setLayoutX(0);
                this.setLayoutY(0);
                this.setId("pc1");
                this.toFront();
                this.getChildren().addAll(computerButtons(computerButtons));
                break;
            case "user":
                this.setPrefSize(parent.getWidth(),parent.getHeight());
                this.setLayoutX(0);
                this.setLayoutY(0);
                this.setId("user1");
                this.toFront();
                this.getChildren().addAll(userButtons(userButtons));
                break;

        }
    }
    //Create All Buttons
    private Button[] homeButtons(Button [] homeButtons){
        for(int i=0; i<homeButtons.length; i++){
            switch(i){
                case 0:
                    homeButtons[i]=new Button("Skills");
                    homeButtons[i].setPrefSize(200, 30);
                    homeButtons[i].setLayoutX(0);
                    homeButtons[i].setLayoutY(90);
                    homeButtons[i].setScaleY(0.3);
                    break;
                case 1:
                    homeButtons[i]=new Button("Pc-Mirror");
                    homeButtons[i].setPrefSize(200, 30);
                    homeButtons[i].setLayoutX(0);
                    homeButtons[i].setLayoutY(100);
                    homeButtons[i].setScaleY(0.3);
                    break;
            }
        }
        return  homeButtons;
    }
    private Button [] computerButtons(Button [] computerButtons){
        for(int i=0; i<computerButtons.length; i++){
            switch(i){
                case 0:
                    computerButtons[i]=new Button("Taskmanager");
                    computerButtons[i].setPrefSize(200, 30);
                    computerButtons[i].setLayoutX(0);
                    computerButtons[i].setLayoutY(70);
                    computerButtons[i].setFont(Font.font("Corbel",12));
                    computerButtons[i].setScaleY(0.3);
                    break;
                case 1:
                    computerButtons[i]=new Button("Terminal");
                    computerButtons[i].setPrefSize(200, 30);
                    computerButtons[i].setLayoutX(0);
                    computerButtons[i].setLayoutY(90);
                    computerButtons[i].setFont(Font.font("Corbel",12));
                    computerButtons[i].setScaleY(0.3);
                    break;
                case 2:
                    computerButtons[i]=new Button("Open File");
                    computerButtons[i].setPrefSize(200, 30);
                    computerButtons[i].setLayoutX(0);
                    computerButtons[i].setLayoutY(105);
                    computerButtons[i].setFont(Font.font("Corbel",12));
                    computerButtons[i].setScaleY(0.3);
                    break;
            }
        }
        return  computerButtons;
    }
    private Button [] userButtons(Button [] userButtons){
        for(int i=0; i<userButtons.length; i++){
            switch(i){
                case 0:
                    userButtons[i]=new Button("Login");
                    userButtons[i].setPrefSize(200, 10);
                    userButtons[i].setLayoutX(0);
                    userButtons[i].setLayoutY(90);
                    userButtons[i].setFont(Font.font("Corbel",12));
                    userButtons[i].setScaleY(0.3);
                    break;
                case 1:
                    userButtons[i]=new Button("create acc");
                    userButtons[i].setPrefSize(200, 10);
                    userButtons[i].setLayoutX(0);
                    userButtons[i].setLayoutY(106);
                    userButtons[i].setFont(Font.font("Corbel",12));
                    userButtons[i].setScaleY(0.3);
                    break;
            }
        }
        return  userButtons;
    }
}

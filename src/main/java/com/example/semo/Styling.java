package com.example.semo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;

/**
 * The type Styling.
 */
public class Styling implements Initializable{
@FXML
private Text mycss;
@FXML
private Pane texter;
@FXML
private TextArea code;
@FXML
private WebView cubo;
@FXML
private Button coderun;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //HTML rectangel to style
        File  html = new File("src/main/java/com/example/semo/web/play.html");
        //setting up my css skills
        System.setProperty("http.proxyHost", "https://fonts.googleapis.com/css?family=Tangerine");
        System.setProperty("http.proxyPort", "8080");
      File  file = new File("src/main/resources/codeInformations/css.txt");
      File  file2 = new File("src/main/java/com/example/semo/web/selfplay.css");
        try {
            String  content = new String(Files.readAllBytes(file.toPath()));
            mycss.setFont(Font.font("Tangerine", FontWeight.LIGHT,10));
            mycss.setText(content);
            String liste=new String(Files.readAllBytes(file2.toPath()));
            code.setText(liste);
            cubo.getEngine().load(html.toURI().toURL().toString());
            coderun.setOnAction((e)->{
                try {
                    Files.write(file2.toPath(),code.getText().getBytes());
                } catch (IOException ex) {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);alert.setContentText("Something wrong with ya code ");
                    alert.show();
                }
                cubo.getEngine().reload();});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

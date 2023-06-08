package com.example.semo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;

/**
 * The type Gui.
 */
public class Gui implements Initializable {
    @FXML
    private Text ui;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File ui_ux=new File("src/main/resources/codeInformations/ui.txt");
        try {
            ui.setText(new String(Files.readAllBytes(ui_ux.toPath())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.example.semo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * The type Api.
 */
public class Api  implements Initializable {
    /**
     * The Api.
     */
    @FXML
    protected WebView Api;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
           Api.getEngine().load("https://www.ibm.com/de-de/topics/rest-apis");
    }
}

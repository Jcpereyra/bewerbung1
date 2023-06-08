package com.example.semo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


/**
 * The type Hello controller.
 */
public class HelloController implements Initializable{
    /**
     * The Pinwand.
     */
    @FXML
    public AnchorPane pinwand;
    /**
     * The Hide.
     */
    @FXML
    public Pane hide;
    /**
     * The Hide 1.
     */
    @FXML
    public Pane hide1;
    /**
     * The Hide 2.
     */
    @FXML
    public Pane hide2;
    /**
     * The Home.
     */
    @FXML
    public Pane home;
    /**
     * The Pc.
     */
    @FXML
    public Pane pc;
    /**
     * The User.
     */
    @FXML
    public Pane user;
    /**
     * The Menu 1.
     */
    @FXML
    public HBox menu1;
    /**
     * The Title.
     */
    @FXML
    public  Label title;
    /**
     * The Learn.
     */
    @FXML
    public TabPane learn;
    /**
     * The Web.
     */
    @FXML
    public WebView online;
    /**
     * The Booklist.
     */
    @FXML
    public AnchorPane booklist;
    /**
     * The List.
     */
    @FXML
    public ScrollPane list;


    /**
     * The Engine.
     */
    public WebEngine engine;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine=online.getEngine();
        pinwand.requestFocus();
        //Get My access to the Label Node in The root
        Label[] glass = new Label[4];
        pinwand.getChildren().get(2).setOpacity(0.5);
        for(int i = 0; i< glass.length; i++){
            glass[i]=(Label) pinwand.getChildren().get(i+3);
            glass[i].requestFocus();
            glass[i].setOpacity(0.8);
            int finalI = i;
        }
        hide.setVisible(false);
        hide1.setVisible(false);
        hide2.setVisible(false);
        learn.toBack();
        engine.load("https://www.w3schools.com/default.asp");
        list.setContent(new VBox(books()));

    }

    /**
     * Components.
     *
     * @param mouseEvent the mouse event
     */
//This Method will make the options be visible
    public void components(MouseEvent mouseEvent) {
        //set the Options Visible
       //informations.setVisible(true);
        Label clear=(Label) mouseEvent.getSource();
        clear.requestFocus();
        clear.getGraphic().setVisible(true);
    }

    /**
     * Destroyer.
     *
     * @param mouseEvent the mouse event
     */
//this Method will set the Nodes in the Label invisible
    public void destroyer(MouseEvent mouseEvent) {
        Label clear=(Label) mouseEvent.getSource();
        clear.requestFocus();
      clear.getGraphic().setVisible(false);
    }

    /**
     * Styleimages.
     *
     * @param mouseEvent the mouse event
     */
//Manipulate Cursor on the first label
    public void styleimages(MouseEvent mouseEvent) {
        Button cursor=(Button) mouseEvent.getSource();
        Image image;
        switch(cursor.getText()){
            case "MK-Language":
                image=new Image("https://cdn-icons-png.flaticon.com/512/2282/2282188.png");
                cursor.setCursor(new ImageCursor(image));
                break;
            case "Style":
                image=new Image("https://cdn-icons-png.flaticon.com/512/3436/3436472.png");
                cursor.setCursor(new ImageCursor(image));
                break;
            case "Design":
                image=new Image("https://cdn-icons-png.flaticon.com/512/3940/3940056.png");
                cursor.setCursor(new ImageCursor(image));
                break;
        }

    }

    /**
     * Anonymous.
     *
     * @param mouseEvent the mouse event
     */
//Little Anonymous
    public void anonymous(MouseEvent mouseEvent) {
        VBox cursor=(VBox) mouseEvent.getSource();
        Image image;
                image=new Image("https://cdn-icons-png.flaticon.com/512/843/843280.png");
                cursor.setCursor(new ImageCursor(image));
    }

    /**
     * Capacities.
     *
     * @param mouseEvent the mouse event
     */
//Make Posible to resize the menu and activate the frame for it
    public void capacities(MouseEvent mouseEvent) {
        ImageView  ops=(ImageView) mouseEvent.getSource();
        ops.setVisible(false);
        title.toBack();
        switch (ops.getParent().getId()){
            case "home":
                home.setScaleZ(5);
                home.scaleYProperty().set(9);
                home.scaleXProperty().set(1.4);
                home.getChildren().add(new MenuOption("home",home));
                break;
            case "pc":
                pc.scaleYProperty().set(9);
                pc.scaleXProperty().set(1.4);
                pc.getChildren().add(new MenuOption("pc",pc));
                break;
            case "user":
                user.scaleYProperty().set(9);
                user.scaleXProperty().set(1.4);
                user.getChildren().add(new MenuOption("user",user));
                //user.toFront();
                break;
        }
    }

    /**
     * Minimize.
     *
     * @param mouseEvent the mouse event
     */
    public void minimize(MouseEvent mouseEvent) {
        Pane kill=(Pane)mouseEvent.getSource();
        ImageView  ops=(ImageView) kill.getChildren().get(0);
        switch (kill.getId()){
            case "home":
                home.scaleYProperty().set(1.0);
                home.scaleXProperty().set(1.0);
                home.setStyle("-fx-background-color: transparent");
                ops.setVisible(true);
                home.getChildren().remove(home.getChildren().get(1));
                break;
            case "pc":
                pc.scaleYProperty().set(1.0);
                pc.scaleXProperty().set(1.0);
                pc.setStyle("-fx-background-color: transparent;");
                ops.setVisible(true);
                pc.getChildren().remove(pc.getChildren().get(1));
                break;
            case "user":
                user.scaleYProperty().set(1.0);
                user.scaleXProperty().set(1.0);
                user.setStyle("-fx-background-color:  transparent;");
                ops.setVisible(true);
                user.getChildren().remove(user.getChildren().get(1));
                break;
        }
    }

    /**
     * Change engine.
     *
     * @param actionEvent the action event
     */
    public void changeEngine(ActionEvent actionEvent) {
        Hyperlink link=(Hyperlink) actionEvent.getSource();
        switch (link.getId()){
            case "w3school":
                engine.load("https://www.w3schools.com/default.asp");
                break;
            case "codepen":
                engine.load("https://www.codecademy.com/");
                break;
            case "youtube":
                engine.load("  https://www.youtube.com/@NetworkChuck");
                break;
        }
    }

    private Label [] books(){
        Label[] holder=new Label[12];
        for(int i=0; i<holder.length; i++){
            holder[i]=new Label("");
            holder[i].setId("book"+i);
            holder[i].setPrefSize(565,300);
            holder[i].setGraphic(call(holder[i]));
            buy(holder[i]);

        }
        return holder;
    }
    private ImageView call(Label parent){
        Image which;
        ImageView  call=new ImageView();
        call.setFitWidth(200);
        call.setFitHeight(200);
        call.setLayoutX(200);
        call.setLayoutY(0);
        switch(parent.getId()){
            case "book0":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/415/41502878_9783836287456_xl.jpg");
                call.setImage(which);
                break;
            case "book1":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/224/22486798_22486798_xl.jpg");
                call.setImage(which);
                break;
            case "book2":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/376/37651516_9783966450294_xl.jpg");
                call.setImage(which);
                break;
            case "book3":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/414/41403603_9783836285131_xl.jpg");
                call.setImage(which);
                break;
            case "book4":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/410/41034791_9783836281171_xl.jpg");
                call.setImage(which);
                break;
            case "book5":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/426/42698348_9783836290845_xl.jpg");
                call.setImage(which);
                break;
            case "book6":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/370/37052609_9783966450195_xl.jpg");
                call.setImage(which);
                break;
            case "book7":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/397/39753497_9783960091547_xl.jpg");
                call.setImage(which);
                break;
            case "book8":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/399/39908872_9783747502167_xl.jpg");
                call.setImage(which);
                break;
            case "book9":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/418/41810049_9783747504826_xl.jpg");
                call.setImage(which);
                break;
            case "book10":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/360/36061242_9783966450133_xl.jpg");
                call.setImage(which);
                break;
            case "book11":
                which=new Image("https://media2.hugendubel.de/shop/coverscans/398/39822711_9783836283175_xl.jpg");
                call.setImage(which);
                break;
        }
        return  call;
    }
    private Button[] buy(Label label){
        Pane cap=new Pane();
        Button[] buy=new Button[12];
        for(int i=0; i<buy.length; i++){
            buy[i]=new Button("Buy");
            buy[i].setId("kauf");
            buy[i].setPrefSize(110,50);
            buy[i].setLayoutX(200);
            buy[i].setLayoutY(230);
            int finalI = i;
            buy[i].setOnAction((e)->{
                Button buy1=(Button)e.getSource();
                    String [] shops={"https://www.hugendubel.de/de/buch_gebunden/christian_ullenboom" +
                            "-java_ist_auch_eine_insel-41502878-produkt-details.html", "https://www.hugendubel" +
                            ".de/de/buch_gebunden/ulrich_kaiser_martin_guddat-c_c-22486798-produkt-details.html", "https://www.hugendubel.de/de/buch_kartoniert/michael_bonacina-c_programmieren_fuer_einsteiger-36061260-produkt-details.html"
                    , "https://www.hugendubel.de/de/buch_kartoniert/michael_kofler-python-41403603-produkt-details" +
                            ".html", "https://www.hugendubel.de/de/buch_gebunden/juergen_wolf-html_und_css-41034791" +
                            "-produkt-details.html", "https://www.hugendubel.de/de/buch_gebunden/philip_ackermann" +
                            "-fullstack_entwicklung-42698348-produkt-details.html",
                    "https://www.hugendubel.de/de/buch_gebunden/paul_fuchs-javascript_programmieren_fuer_einsteiger" +
                            "-37652133-produkt-details.html", "https://www.hugendubel" +
                            ".de/de/buch_kartoniert/alan_beaulieu-einfuehrung_in_sql-39753497-produkt-details.html",
                            "https://www.hugendubel.de/de/buch_kartoniert/eugen_richter-android_apps_programmieren" +
                                    "-39908872-produkt-details.html", "https://www.hugendubel" +
                            ".de/de/buch_gebunden/eric_amberg_daniel_schmid-hacking-41810049-produkt-details.html",
                            "https://www.hugendubel.de/de/buch_kartoniert/michael_bonacina-raspberry_pi_handbuch_fuer_einsteiger-36061242-produkt-details.html","https://www.hugendubel.de/de/buch_gebunden/bernhard_lahres_gregor_ra_man_stefan_strich-objektorientierte_programmierung-39822711-produkt-details.html"};
                switch(label.getId()){
                    case "book0":
                        learn.getSelectionModel().select(0);
                       engine.load(shops[0]);
                        break;
                    case "book1":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[1]);
                        break;
                    case "book2":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[2]);
                        break;
                    case "book3":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[3]);
                        break;
                    case "book4":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[4]);
                        break;
                    case "book5":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[5]);
                        break;
                    case "book6":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[6]);
                        break;
                    case "book7":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[7]);
                        break;
                    case "book8":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[8]);
                        break;
                    case "book9":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[9]);
                        break;
                    case "book10":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[10]);
                        break;
                    case "book11":
                        learn.getSelectionModel().select(0);
                        engine.load(shops[11]);
                        break;
                }

            });
        }
        cap.setId("market");
        cap.getChildren().addAll(buy);
        cap.getChildren().addAll(call(label));
        label.setGraphic(cap);
        return buy;
    }

    /**
     * Frontend.
     *
     * @param actionEvent the action event
     * @throws IOException the io exception
     */
    public void frontend(ActionEvent actionEvent) throws IOException {
        //resources file holder
        File datas=new File("src/main/resources/com/example/semo/styling.css");
        //HtML File and FXML
        File path = new File("src/main/resources/com/example/semo");
        File html=new File("src/main/java/com/example/semo/web/frontend.html");
        File [] roots=path.listFiles();
        System.out.println(Arrays.stream(roots).toList());
        //frontend Window
        int win_width=950;
        int win_height= 700;
        boolean visible=false;
        //setting frame variables
        FXMLLoader page = new FXMLLoader(roots[6].toURI().toURL());
        FXMLLoader style=new FXMLLoader(roots[10].toURI().toURL());
         Group table = page.getRoot();
        Thread frontdrif=new Thread();
        Scene frontScene=new Scene(page.load(),win_width,win_height);
        //get Button sources
        Button frontenter_Button=(Button) actionEvent.getSource();
        Stage  frontendWindow = new Stage();
        //set The new Front
        switch (frontenter_Button.getText()){
            case "MK-Language":
                System.out.println(page.getLocation());
                page.setLocation(roots[6].toURI().toURL());
                System.out.println(page.getLocation());
                table=
                        new Group((Node) page.getRoot());
                WebView   web=new WebView();
                web.setPrefSize(950,600);
                WebEngine en=web.getEngine();
                web.setZoom(0.6);
                en.load(html.toURI().toURL().toString());
                en.setJavaScriptEnabled(true);
                System.out.println(en.getLocation());
                table.getChildren().add(web);
              frontendWindow.setTitle("Frontend");
              frontScene.setUserAgentStylesheet(new File("src/main/resources/com/example/semo/frontend.css").toURI().toURL().toString());
              frontendWindow.getIcons().add(new Image("https://www.achieversit.com/management/uploads/course_image/web-dev-img.jpeg"));
              frontendWindow.setScene(frontScene);
              frontendWindow.setResizable(false);
              table.getChildren().addAll($Forward_Backward(en));
              frontScene.setRoot(table);
              frontendWindow.show();
              break;
            case "Style":
                frontScene.setRoot(style.load());
               frontendWindow.setTitle("Style");
               frontendWindow.setScene(frontScene);
               frontScene.getStylesheets().add(datas.toURI().toURL().toString());
                frontendWindow.setResizable(false);
               frontendWindow.show();
                break;
            case "Design":
                Alert design=new Alert(Alert.AlertType.INFORMATION);
                design.setContentText("Rechs finden sie meine Liebste Design plattform");
               System.out.println(getClass().getClassLoader());
                design.show();
                engine.load("https://www.figma.com/de/design/");
                break;
        }
    }
    private Button  $Forward_Backward(WebEngine engine){
        Button  controll=new Button("<- Back");
        if(controll!=null){
            controll.setLayoutX(250);
            controll.setLayoutY(600);
            controll.setOnAction((e)->engine.getHistory().go(-1));
            controll.setPrefSize(300,100);

        }
        return  controll;
    }

    /**
     * Backend.
     *
     * @param actionEvent the action event
     * @throws IOException the io exception
     */
    public void backend(ActionEvent actionEvent) throws IOException {
        File datas=new File("src/main/resources/com/example/semo/styling.css");
        //HtML File and FXML
        File path = new File("src/main/resources/com/example/semo");
        File ui_ux=new File("src/main/resources/codeInformations/ui.txt");
        File [] roots=path.listFiles();
        System.out.println(Arrays.stream(roots).toList());
        //frontend Window
        int win_width=950;
        int win_height= 700;
        boolean visible=false;
        //setting frame variables
        FXMLLoader page = new FXMLLoader(roots[3].toURI().toURL());
        FXMLLoader api=new FXMLLoader(roots[0].toURI().toURL());
        Button back=(Button) actionEvent.getSource();
        switch (back.getText()){
            case "GUI":
            Stage gui = new Stage();
            gui.setScene(new Scene(page.load()));
            gui.setTitle("Gui");
            gui.setResizable(false);
                gui.getScene().setUserAgentStylesheet(new File("src/main/resources/com/example/semo/frontend.css").toURI().toURL().toString());
            gui.show();
            break;
            case "Games":
                break;

            case "API":
                Stage aPI = new Stage();
                aPI.setScene(new Scene(api.load()));
                aPI.getScene().setUserAgentStylesheet("src/main/resources/com/example/semo/frontend.css");
                aPI.setTitle("API");

                aPI.show();
                break;
        }
    }

    /**
     * Request.
     *
     * @param actionEvent the action event
     */
    public void request(ActionEvent actionEvent) {
        Alert request=new Alert(Alert.AlertType.INFORMATION);
        String ask="Diese Ebene ist Etwas Empfindlicher und darft nicht beliebig bearbeitet Werden. Sie haben jedoch " +
                "die Möglichkeit Projekte zu fordern dazu können sie jederzeit Juan Carlos kontaktieren";
        request.setContentText(ask);
        request.getDialogPane().setGraphic(new ImageView(new Image("https://image.freepik.com/vetores-gratis/atendimento-ao-cliente-e-suporte-conceito-de-call-center_18591-20378.jpg")));
        request.getDialogPane().setStyle("-fx-background-color: linear-gradient(from 0.0% 0.0% to 100.0% 0.0%, " +
                "#23d0f3ff 0.0%, #d791f9ff 50.0%, #fe7b84ff 100.0%); ");
        request.show();
    }
}
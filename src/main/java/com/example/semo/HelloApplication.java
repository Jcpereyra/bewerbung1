package com.example.semo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.transform.NonInvertibleTransformException;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;

/**
 * The type Hello application.
 */
public class HelloApplication extends Application implements Initializable , Runnable{
    /**
     * The Bewerbung.
     */
    public DialogPane bewerbung;
    /**
     * The Name.
     */
//Personal Data Storing
    final String name="Juan Carlos Pereyra de Leon" ;
    /**
     * The Street.
     */
    final String street="Alte Ziegelei 39";
    /**
     * The State.
     */
    final String state="Hannover, Germany";
    /**
     * The Nummer.
     */
    final String nummer="017631182461";
    /**
     * The Personal.
     */
    final  String personal="Sehr geehrte Damen und Herren,\n" +
            "\n" +
            "mit großem Interesse habe ich auf Ihrer Webseite erfahren, dass Sie aktuell eine Stelle im Bereich der Informatik zu besetzen haben. Als passionierter Programmierer mit Erfahrung in der Entwicklung von Apps bin ich davon überzeugt, dass ich ein wertvoller Beitrag für Ihr Unternehmen sein kann.\n" +
            "\n" +
            "ich habe mir ein umfangreiches Wissen in den Bereichen der Softwareentwicklung und Datenbanken " +
            "angeeignet und konnte dieses durch meine praktische Erfahrung als App-Entwickler vertiefen.  Ich bin " +
            "stolz darauf, dass meine App bereits von mehreren personen erfolgreich eingesetzt wird.\n" +
            "\n" +
            "Was mich an Ihrer Stellenausschreibung besonders anspricht, ist die Möglichkeit, meine Kenntnisse und Erfahrungen in einem innovativen und dynamischen Unternehmen wie Ihrem einzubringen und somit dazu beizutragen, die technologische Entwicklung voranzutreiben. Zudem bin ich davon überzeugt, dass ich durch eine enge Zusammenarbeit mit Ihrem erfahrenen und motivierten Team meine Fähigkeiten weiter ausbauen und von deren Expertise profitieren kann.\n" +
            "\n" +
            "Ich bin ein motivierter und zielstrebiger Programmierer, der bereit ist, neue Herausforderungen anzunehmen und sich stets weiterzuentwickeln. Ich bin davon überzeugt, dass ich mit meinem technischen Verständnis, meiner Erfahrung in der Softwareentwicklung und meinem Enthusiasmus einen wichtigen Beitrag zu Ihrem Unternehmen leisten kann.\n" +
            "\n" +
            "Ich würde mich sehr über eine Einladung zu einem persönlichen Gespräch freuen, um meine Qualifikationen und Fähigkeiten weiter zu erläutern und weitere Einzelheiten zu besprechen.";
   //pulling Nodes From The FXML Document to gain Static Control over it.
    @FXML
    private Text  data;
    @FXML
    private  Text    informationen;
    /**
     * The Personal 1.
     */
    @FXML
    public TextFlow personal1;
    /**
     * The Scroll.
     */
    @FXML
    public ScrollPane scroll;
    /**
     * The Cpp.
     */
    @FXML
    public Label  cpp;
    /**
     * The Csh.
     */
    @FXML
    public Label csh;
    /**
     * The Java.
     */
    @FXML
  public Label  java;
    /**
     * The Script.
     */
    @FXML
    public Label script;
    /**
     * The Python.
     */
    @FXML
    public Label python;
    /**
     * The Css.
     */
    @FXML
   public Label css;
    /**
     * The Droid.
     */
    @FXML
    public Label droid;
    /**
     * The Struct.
     */
    @FXML
     public Label     struct;
    /**
     * The Sava.
     */
    @FXML
    public Label sava;
    /**
     * The Web.
     */
    @FXML
      public Label  web;
    /**
     * The Bank.
     */
    @FXML
    public Label bank;
    /**
     * The Können.
     */
    @FXML
    public VBox können;

    //Other Nodes Controls And Arrays to collect All The Necessary nodes and variables
    private Label [] label_Fast_Conroll;
    /**
     * The constant misu.
     */
    public static Thread misu;
    /**
     * The Scene.
     */
    public Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
      scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bewerbung");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("Anschreiben");
        stage.getIcons().add(new Image("C:\\Users\\Latin419\\myBit\\semo\\src\\main\\resources\\pictures\\visit_Card" +
                ".png"));
        stage.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
//Main method with just one comand and it is just to launch the App
    public static void main(String[] args) throws IOException {
        launch();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Initializing Components but also giving them some Variables Already
        data.setText(name+"\n"+street+"\n" +state+"\n"+nummer);
        informationen.setText(personal);
        label_Fast_Conroll= new  Label[11];
        for(int i=0; i<label_Fast_Conroll.length; i++){
            label_Fast_Conroll[i]= (Label) können.getChildren().get(i);
            int finalI = i;
            label_Fast_Conroll[i].setOnMouseClicked((e)-> {
                try {
                    textChange(label_Fast_Conroll[finalI]);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            label_Fast_Conroll[i].setOnMouseEntered((e)-> {
                try {
                    kristallbloks(e);
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
            });
        }
        misu=new Thread(this);
        misu.start();

    }
    //Controlling text through clicks
    private  void textChange(Label which) throws IOException {
        File file;
        String content;
        switch(which.getText()){
            case "C++":
                file = new File("src/main/resources/codeInformations/c++.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 19));
                informationen.setText(content);
                Alert backer=new Alert(Alert.AlertType.INFORMATION);
                backer.setContentText("If you want to jump back to the text press ANY Key");
                backer.show();
                break;
            case "C#":
                file= new File("src/main/resources/codeInformations/c#.txt");
                content= new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 30));
                informationen.setText(content);
                break;
            case "Java":
                file = new File("src/main/resources/codeInformations/java.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("Arial", 24));
                informationen.setText(content);
                break;
            case "Javascript":
                file = new File("src/main/resources/codeInformations/javascript.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 23));
                informationen.setText(content);
                break;
            case "Python":
                file = new File("src/main/resources/codeInformations/python.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "CSS":
                file = new File("src/main/resources/codeInformations/css.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "Android-Dev":
                file = new File("src/main/resources/codeInformations/android.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "XML":
                file = new File("src/main/resources/codeInformations/xml.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "UI/UX Design":
                file = new File("src/main/resources/codeInformations/ui.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "HTML":
                file = new File("src/main/resources/codeInformations/html.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
            case "SQL":
                file = new File("src/main/resources/codeInformations/sql.txt");
                content = new String(Files.readAllBytes(file.toPath()));
                informationen.setFont(Font.font("ArialBlack", 20));
                informationen.setText(content);
                break;
        }
    }

    /**
     * Kristallbloks.
     *
     * @param mouseEvent the mouse event
     * @throws MalformedURLException the malformed url exception
     */
//Label hover Sounds
    public void kristallbloks(MouseEvent mouseEvent) throws MalformedURLException {
        File sound=new File("src/main/resources/sounds/hover.mp3");
        AudioClip clip =
                new AudioClip(sound.toURI().toURL().toString());
        if(mouseEvent.isDragDetect()){
            clip.setVolume(0.1);
            clip.play();
        }

    }

    /**
     * Runs this operation.
     * The Run Interface will be use just for the music
     */
    @Override
    public void run() {
        try {

            if (!Thread.currentThread().isInterrupted()) {
                if (misu.isAlive()) {
                    File sound = new File("src/main/resources/sounds/bmelodie.mp3");
                    try {
                        AudioClip clip =
                                new AudioClip(sound.toURI().toURL().toString());
                        clip.setVolume(0.5);
                        clip.setCycleCount(3);
                        clip.play();

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }else if(!misu.isAlive()){
                    Runtime.getRuntime().freeMemory();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            misu=null;
        }


    }

    /**
     * Exit.
     *
     * @param actionEvent the action event
     */
//Method to end the App
    public void exit(ActionEvent actionEvent) {
        File sound=new File("src/main/resources/sounds/down.mp3");
        try {
            AudioClip clip =
                    new AudioClip(sound.toURI().toURL().toString());
            clip.setVolume(0.5);
            clip.setCycleCount(14);
            clip.play();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        
        System.exit(0);
    }

    /**
     * Enter.
     *
     * @param actionEvent the action event
     * @throws IOException                     the io exception
     * @throws InterruptedException            the interrupted exception
     * @throws NonInvertibleTransformException the non-invertible transform exception
     * @throws InvocationTargetException       the invocation target exception
     * @throws ClassNotFoundException          the class not found exception
     */
//Method to enter the next Content and change Content
    public void enter(ActionEvent actionEvent) throws IOException, InterruptedException,
            NonInvertibleTransformException, InvocationTargetException, ClassNotFoundException {
        //to Grand access to the whole window I will create a Button which will be equal to the sources off The Enter
        // Button Located ind The fxml file as A RootMember of hello-view.fxml
        Button clue = (Button) actionEvent.getSource();
        //here I will create The jumpOver And Animations
        Stage crazy = (Stage) clue.getScene().getWindow();
        crazy.setFullScreen(true);

            FXMLLoader enter = new FXMLLoader(HelloApplication.class.getResource("inside1.fxml"));
            Parent root = enter.load();
            Runtime.getRuntime().gc();
            clue.getScene().setRoot(root);


    }


    /**
     * Anschreiben.
     *
     * @param keyEvent the key event
     */
    public void anschreiben(KeyEvent keyEvent) {
            informationen.setText(personal);
            informationen.setFont(Font.font("Corbel Light",24));
    }
}

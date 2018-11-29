package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button SHI;
    @FXML
    private Button FU;
    @FXML
    private Button ME;
    @FXML
    private TextField screenOB;
    @FXML
    private TextField screenTR;
    @FXML
    private TextField SCOB;
    @FXML
    private TextField SCTR;
    @FXML
    private int SCob = 0;
    @FXML
    private int SCtr = 0;


    public void takePhoto(MouseEvent event) {

    }

    public void ButtonAction(ActionEvent a) {
        Button button = (Button)
                a.getSource();
        if (button.getId().equals("SHI"))
            screenTR.setText("Pierre");
        if (button.getId().equals("FU"))
            screenTR.setText("Feuille");
        if (button.getId().equals("ME"))
            screenTR.setText("Ciseaux");
        aleatoire();
    }

    public void aleatoire() {
        int al = (int) (Math.random() * 3 + 1);
        if (al == 1)
            screenOB.setText("Ciseaux");
        if (al == 2)
            screenOB.setText("Pierre");
        if (al == 3)
            screenOB.setText("Feuille");
        score();
    }

    public void score() {
        if (screenTR.getText().equals("Feuille") & screenOB.getText().equals("Pierre")) {
            SCTR.setText(String.valueOf(++SCtr));

        } else if (screenTR.getText().equals("Pierre") & screenOB.getText().equals("Ciseaux")) {
            SCTR.setText(String.valueOf(++SCtr));
        } else if (screenTR.getText().equals("Ciseaux") & screenOB.getText().equals("Feuille")) {
            SCTR.setText(String.valueOf(++SCtr));
        }

        if (screenOB.getText().equals("Feuille") & screenTR.getText().equals("Pierre")) {
            SCOB.setText(String.valueOf(++SCob));

        } else if (screenOB.getText().equals("Pierre") & screenTR.getText().equals("Ciseaux")) {
            SCOB.setText(String.valueOf(++SCob));
        } else if (screenOB.getText().equals("Ciseaux") & screenTR.getText().equals("Feuille")) {
            SCOB.setText(String.valueOf(++SCob));
        }


    }
}





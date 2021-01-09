/**
 * ModifyPart Controller Class
 */

package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ModifyPart {

    @FXML // fx:id="modifyPartInhouseRadioButton"
    private RadioButton modifyPartInhouseRadioButton;

    @FXML // fx:id="modifyPartTogglegrp"
    private ToggleGroup modifyPartTogglegrp;

    @FXML // fx:id="modifyPartOutsourcedRadioButton"
    private RadioButton modifyPartOutsourcedRadioButton;

    @FXML // fx:id="modifyPartIdText"
    private TextField modifyPartIdText;

    @FXML // fx:id="modifyPartNameText"
    private TextField modifyPartNameText;

    @FXML // fx:id="modifyPartInvText"
    private TextField modifyPartInvText;

    @FXML // fx:id="modifyPartPriceCostText"
    private TextField modifyPartPriceCostText;

    @FXML // fx:id="modifyPartMaxText"
    private TextField modifyPartMaxText;

    @FXML // fx:id="modifyPartCompanyNameText"
    private TextField modifyPartCompanyNameText;

    @FXML // fx:id="modifyPartMinText"
    private TextField modifyPartMinText;

    @FXML
    void onActionModfyPartCancelButton(ActionEvent event) {

    }

    @FXML
    void onActionmodifyPartSaveButton(ActionEvent event) {

    }

}

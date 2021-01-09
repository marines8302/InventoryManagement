/**
 * AddPart Controller Class
 */

package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AddPart {

    @FXML // fx:id="addPartInHouseRadioButton"
    private RadioButton addPartInHouseRadioButton;

    @FXML // fx:id="addPartToggleGrp"
    private ToggleGroup addPartToggleGrp;

    @FXML // fx:id="addPartOutsourcedRadioButton"
    private RadioButton addPartOutsourcedRadioButton;

    @FXML // fx:id="addPartIDText"
    private TextField addPartIDText;

    @FXML // fx:id="addPartNameText"
    private TextField addPartNameText;

    @FXML // fx:id="addPartInventoryText"
    private TextField addPartInventoryText;

    @FXML // fx:id="addPartPriceText"
    private TextField addPartPriceText;

    @FXML // fx:id="addPartMinText"
    private TextField addPartMinText;

    @FXML // fx:id="addPartCompanyNameText"
    private TextField addPartCompanyNameText;

    @FXML // fx:id="addPartMaxText"
    private TextField addPartMaxText;

    @FXML
    void onActionAddPartCancelButton(ActionEvent event) {

    }

    @FXML
    void onActionAddPartSaveButton(ActionEvent event) {

    }

}

/**
 * ModifyProduct Controller Class
 */

package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ModifyProduct {

    @FXML // fx:id="modifyProductTableview"
    private TableView<?> modifyProductTableview;

    @FXML // fx:id="modifyProductPartIdCol"
    private TableColumn<?, ?> modifyProductPartIdCol;

    @FXML // fx:id="modifyProductPartNameCol"
    private TableColumn<?, ?> modifyProductPartNameCol;

    @FXML // fx:id="modifyProductInvCol"
    private TableColumn<?, ?> modifyProductInvCol;

    @FXML // fx:id="modifyProductPriceCostCol"
    private TableColumn<?, ?> modifyProductPriceCostCol;

    @FXML // fx:id="modifyProductRmvTableview"
    private TableView<?> modifyProductRmvTableview;

    @FXML // fx:id="modifyProductPartIdRmvCol"
    private TableColumn<?, ?> modifyProductPartIdRmvCol;

    @FXML // fx:id="modifyProductPartNameRmvCol"
    private TableColumn<?, ?> modifyProductPartNameRmvCol;

    @FXML // fx:id="modifyProductInvRmvCol"
    private TableColumn<?, ?> modifyProductInvRmvCol;

    @FXML // fx:id="modifyProductPriceCostRmvCol"
    private TableColumn<?, ?> modifyProductPriceCostRmvCol;

    @FXML // fx:id="modifyProductSeachText"
    private TextField modifyProductSeachText;

    @FXML // fx:id="modifyProductIdText"
    private TextField modifyProductIdText;

    @FXML // fx:id="modifyProductNameText"
    private TextField modifyProductNameText;

    @FXML // fx:id="modifyProductInvText"
    private TextField modifyProductInvText;

    @FXML // fx:id="modifyProductPriceText"
    private TextField modifyProductPriceText;

    @FXML // fx:id="modifyProductMaxText"
    private TextField modifyProductMaxText;

    @FXML // fx:id="modifyProductMinText"
    private TextField modifyProductMinText;

    @FXML
    void onActionAddModifyProductButton(ActionEvent event) {

    }

    @FXML
    void onActionModifyProductCancelButton(ActionEvent event) {

    }

    @FXML
    void onActionModifyProductRemoveButton(ActionEvent event) {

    }

    @FXML
    void onActionModifyProductSaveButton(ActionEvent event) {

    }

}

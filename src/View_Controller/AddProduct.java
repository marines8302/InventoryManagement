/**
 * AddProduct Controller Class
 */

package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AddProduct {

    @FXML // fx:id="addProductTableviewAdd"
    private TableView<?> addProductTableviewAdd;

    @FXML // fx:id="addProductPartIdCol"
    private TableColumn<?, ?> addProductPartIdCol;

    @FXML // fx:id="addProductPartNameCol"
    private TableColumn<?, ?> addProductPartNameCol;

    @FXML // fx:id="addProductInvCol"
    private TableColumn<?, ?> addProductInvCol;

    @FXML // fx:id="addProductPriceCostCol"
    private TableColumn<?, ?> addProductPriceCostCol;

    @FXML // fx:id="addProductTableviewRmvCol"
    private TableView<?> addProductTableviewRmvCol;

    @FXML // fx:id="addProductPartIdRmvCol"
    private TableColumn<?, ?> addProductPartIdRmvCol;

    @FXML // fx:id="addProductPartNameRmvCol"
    private TableColumn<?, ?> addProductPartNameRmvCol;

    @FXML // fx:id="addProductInvRmvCol"
    private TableColumn<?, ?> addProductInvRmvCol;

    @FXML // fx:id="addProductPriceCostRmvCol"
    private TableColumn<?, ?> addProductPriceCostRmvCol;

    @FXML // fx:id="addProductSearchText"
    private TextField addProductSearchText;

    @FXML // fx:id="addProductIDText"
    private TextField addProductIDText;

    @FXML // fx:id="addProductNameText"
    private TextField addProductNameText;

    @FXML // fx:id="addProductInvText"
    private TextField addProductInvText;

    @FXML // fx:id="addProductPriceText"
    private TextField addProductPriceText;

    @FXML // fx:id="addProductMaxText"
    private TextField addProductMaxText;

    @FXML // fx:id="addProductMinText"
    private TextField addProductMinText;

    @FXML
    void onActionAddProductAddButton(ActionEvent event) {

    }

    @FXML
    void onActionAddProductCancelButton(ActionEvent event) {

    }

    @FXML
    void onActionAddProductRemoveButton(ActionEvent event) {

    }

    @FXML
    void onActionAddProductSaveButton(ActionEvent event) {

    }

}

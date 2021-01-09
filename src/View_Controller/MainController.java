/**
 * Main Controller Class
 */

package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML // fx:id="partsTable"
    private AnchorPane partsTable;

    @FXML // fx:id="searchPartField"
    private TextField searchPartField;

    @FXML // fx:id="addPartButton"
    private Button addPartButton;

    @FXML // fx:id="modifyPartButton"
    private Button modifyPartButton;

    @FXML // fx:id="deletePartButton"
    private Button deletePartButton;

    @FXML // fx:id="partTableview"
    private TableView<?> partTableview;

    @FXML // fx:id="partIdCol"
    private TableColumn<?, ?> partIdCol;

    @FXML // fx:id="partNameCol"
    private TableColumn<?, ?> partNameCol;

    @FXML // fx:id="partInvCol"
    private TableColumn<?, ?> partInvCol;

    @FXML // fx:id="partPriceCostCol"
    private TableColumn<?, ?> partPriceCostCol;

    @FXML // fx:id="productTable"
    private AnchorPane productTable;

    @FXML // fx:id="searchProductField"
    private TextField searchProductField;

    @FXML // fx:id="addProductButton"
    private Button addProductButton;

    @FXML // fx:id="modifyProductButton"
    private Button modifyProductButton;

    @FXML // fx:id="deleteProductButton"
    private Button deleteProductButton;

    @FXML // fx:id="productTableview"
    private TableView<?> productTableview;

    @FXML // fx:id="productIdCol"
    private TableColumn<?, ?> productIdCol;

    @FXML // fx:id="productNameCol"
    private TableColumn<?, ?> productNameCol;

    @FXML // fx:id="productInvCol"
    private TableColumn<?, ?> productInvCol;

    @FXML // fx:id="productPriceCostCol"
    private TableColumn<?, ?> productPriceCostCol;

    @FXML
    void addPart(MouseEvent event) {

    }

    @FXML
    void addProduct(MouseEvent event) {

    }

    @FXML
    void deletePart(MouseEvent event) {

    }

    @FXML
    void deleteProduct(MouseEvent event) {

    }

    @FXML
    void exitButton(MouseEvent event) {

    }

    @FXML
    void modifyPart(MouseEvent event) {

    }

    @FXML
    void modifyProduct(MouseEvent event) {

    }

    @FXML
    void onActionExitButton(ActionEvent event) {

    }

}

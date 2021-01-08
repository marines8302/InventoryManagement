package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author John Molato
 */
public class MainController {

    @FXML
    private AnchorPane mainScreen;

    @FXML
    private Button exitButton;

    @FXML
    private AnchorPane partsTable;

    @FXML
    private TextField searchPartField;

    @FXML
    private Button addPartButton;

    @FXML
    private Button modifyPartButton;

    @FXML
    private Button deletePartButton;

    @FXML
    private Button searchPartButton;

    @FXML
    private AnchorPane productTable;

    @FXML
    private TextField searchProductField;

    @FXML
    private Button addProductButton;

    @FXML
    private Button modifyProductButton;

    @FXML
    private Button deleteProductButton;

    @FXML
    private Button searchProductButton;

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
        System.exit(0);

    }

    @FXML
    void modifyPart(MouseEvent event) {

    }

    @FXML
    void modifyProduct(MouseEvent event) {

    }

    @FXML
    void searchPart(MouseEvent event) {

    }

    @FXML
    void searchProduct(MouseEvent event) {

    }

}

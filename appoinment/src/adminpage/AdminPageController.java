package adminpage;

import db.MyJDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class AdminPageController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextArea outputArea;

    @FXML
    private TableView<MyJDBC> loggedInUsersTable;

    @FXML
    private TableColumn<MyJDBC, String> usernameColumn;

    @FXML
    private TableColumn<MyJDBC, String> passwordColumn;

    @FXML
    private void initialize() {
        usernameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<>("password"));
        refreshLoggedInUsersTable();
    }

    @FXML
    private void registerUser() {
        // ... (existing code)
    }

    @FXML
    private void validateLogin() {
        // ... (existing code)
    }

    @FXML
    private void refreshLoggedInUsersTable() {
        List<MyJDBC> loggedInUsers = MyJDBC.getLoggedInUsers();
        ObservableList<MyJDBC> observableLoggedInUsers = FXCollections.observableArrayList(loggedInUsers);
        loggedInUsersTable.setItems(observableLoggedInUsers);
    }
}

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class BookController {
    @FXML private TextField searchField;
    @FXML private TableView<Book> bookTable;

    private BookDAO bookDAO = new BookDAO();

    public void initialize() {
        loadBooks("");
    }

    public void onSearch() {
        String keyword = searchField.getText().trim();
        if (keyword.isEmpty()) {
            showAlert("Validation Error", "Search field cannot be empty.");
            return;
        }
        loadBooks(keyword);
    }

    private void loadBooks(String keyword) {
        List<Book> books = bookDAO.getBooksByKeyword(keyword);
        ObservableList<Book> observableBooks = FXCollections.observableArrayList(books);
        bookTable.setItems(observableBooks);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
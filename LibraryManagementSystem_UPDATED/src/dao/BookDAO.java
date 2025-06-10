import java.sql.*;
import java.util.*;

public class BookDAO {
    public List<Book> getAllBooks() {
        return getBooksByKeyword("");
    }

    public List<Book> getBooksByKeyword(String keyword) {
        List<Book> books = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            String likePattern = "%" + keyword + "%";
            stmt.setString(1, likePattern);
            stmt.setString(2, likePattern);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                books.add(new Book(rs.getInt("id"), rs.getString("title"),
                                   rs.getString("author"), rs.getBoolean("isIssued")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
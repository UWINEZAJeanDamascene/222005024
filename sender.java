import java.sql.*;

public class sender {
    public static void connect(String name1, String name2, int reg) {
        // Using try-with-resources to automatically close resources like Connection and PreparedStatement
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
             PreparedStatement stat = conn.prepareStatement("INSERT INTO student(firstname,lastname,regno) VALUES (?,?,?)")) {

            // Setting parameters for the PreparedStatement
            stat.setString(1, name1);
            stat.setString(2, name2);
            stat.setInt(3, reg);

            // Executing the update
            int row = stat.executeUpdate();

            // Checking the result
            if (row > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (SQLException e) {
            // Print the exception details to the console or log it
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example usage
        connect("John", "Doe", 12345);
    }
}

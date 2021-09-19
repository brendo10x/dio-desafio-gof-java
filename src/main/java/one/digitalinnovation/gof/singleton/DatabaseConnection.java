package one.digitalinnovation.gof.singleton;

public class DatabaseConnection {

    private static DatabaseConnection connection = null;

    public static DatabaseConnection getInstance() {

        if (connection == null) {
            connection = new DatabaseConnection();
            return connection;
        }

        return connection;
    }
}

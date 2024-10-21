package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {

    private String userID;

    public LogoutInputData(String username) {
        this.userID = username;
    }

    public String getUserID() {
        return userID;
    }
}

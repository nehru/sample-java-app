public class Example {

    // 🔐 Hardcoded secret
    private String apiKey = "12345-SECRET-KEY";

    public void connect() {
        // 🐞 SQL Injection (string concatenation)
        String userInput = "admin";  // pretend this comes from user
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        db.execute(query);
    }

    public void login(String username, String password) {
        // 🔐 Suspicious variable names
        String secretToken = "top-secret";

        // 🐞 SQL Injection in login
        String loginQuery = "SELECT * FROM users WHERE user = '" + username + "' AND pass = '" + password + "'";
        db.execute(loginQuery);
    }

    public void print() {
        // ✅ Safe function (no issue)
        System.out.println("Hello, world!");
    }

    public void hardcodedEmail() {
        // 🔐 Hardcoded sensitive data
        String email = "admin@example.com";
        String smtpPassword = "emailPassword123";
    }
}

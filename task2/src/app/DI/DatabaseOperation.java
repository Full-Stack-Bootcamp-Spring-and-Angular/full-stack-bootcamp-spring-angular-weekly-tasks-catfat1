package app.DI;

public class DatabaseOperation {

    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveToDatabase(String vehichelName) {
        System.out.println(String.format("connection to DataBase with URL: %s , username:%s,password:%s",url,username,password));
        System.out.println(String.format("vehichelName: %s",vehichelName));

       }
}

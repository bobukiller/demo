package student_project;

public class User {
    private String username;
    private String password;
    private String ID;
    private String phone;


    public User() {
    }

    public User(String username, String password, String ID, String phone) {
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.phone = phone;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", ID = " + ID + ", phone = " + phone + "}";
    }
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author jennifer
 */
public class Database {
    //credeciales a la base de datos 
    private String url;
    private String user;
    private String contra;
    private String driver;

    public Database() {
        this.url = "jdbc:mysql://localhost:3306/gps";
        this.user = "root";
        this.contra = "";
        this.driver = "com.mysql.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getContra() {
        return contra;
    }

    public String getDriver() {
        return driver;
    }

   
    
}

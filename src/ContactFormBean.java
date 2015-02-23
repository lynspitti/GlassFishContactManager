import org.hibernate.validator.constraints.NotEmpty;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.SQLException;

/**
 * Created by DBJ on 23-02-2015.
 */
@ManagedBean(name = "ContactForm")
@RequestScoped
public class ContactFormBean {
    private String Name;
    private String Phone;
    private String Email;

    private String Department;
    private String Company;

    public void addInternalContact() {
        Internal contactObj = new Internal(Name, Phone,Email,Department);
        try {
            DbHelper.getInstance().getInternalDao().create(contactObj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Name="";
        Phone="";
        Email="";
        Department="";
    }
    public void addExternalContact() {
        External contactObj = new External(Name, Phone, Email, Company);
        try {
            DbHelper.getInstance().getExternalDao().create(contactObj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Name="";
        Phone="";
        Email="";
        Company="";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

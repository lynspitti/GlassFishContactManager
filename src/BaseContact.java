import com.j256.ormlite.field.DatabaseField;

/**
 * Created by code on 17/02/15.
 */
public class BaseContact {

    public BaseContact(String name, String phone, String email) {
        this.Name = name;
        this.Phone = phone;
        this.Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getId(){
        return id;
    }

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String Name;
    @DatabaseField
    private String Phone;
    @DatabaseField
    private String Email;
}
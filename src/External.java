import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by code on 17/02/15.
 */
@DatabaseTable(tableName="External")
public class External extends BaseContact implements iViewable{

    public External(String name, String phone, String email, String company) {
        super(name, phone, email);
        this.Company = company;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                "\nPhone: " + this.getPhone() +
                "\nEmail: " + this.getEmail() +
                "\nCompany: " + this.getCompany();
    }

    @DatabaseField
    private String Company;
}

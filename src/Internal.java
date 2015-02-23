import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by code on 17/02/15.
 */
@DatabaseTable(tableName="Internal")
public class Internal extends BaseContact implements iViewable{

    public Internal(String name, String phone, String email, String department) {
        super(name, phone, email);
        this.Department = department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                "\nPhone: " + this.getPhone() +
                "\nEmail: " + this.getEmail() +
                "\nDepartment: " + this.getDepartment();
    }

    @DatabaseField
    private String Department;
}

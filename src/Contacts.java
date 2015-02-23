import com.j256.ormlite.stmt.QueryBuilder;

import javax.faces.bean.ManagedBean;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by DBJ on 23-02-2015.
 */
@ManagedBean(name = "Contacts")
public class Contacts {
    public List<Internal> getInternals(){
        List<Internal> contacts = null;
        try {
            QueryBuilder<Internal, Integer> queryBuilder = DbHelper.getInstance().getInternalDao().queryBuilder();
            queryBuilder.orderBy("id", false);
            contacts = DbHelper.getInstance().getInternalDao().query(queryBuilder.prepare());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }
    public List<External> getExternals(){
        List<External> contacts = null;
        try {
            QueryBuilder<External, Integer> queryBuilder = DbHelper.getInstance().getExternalDao().queryBuilder();
            queryBuilder.orderBy("id", false);
            contacts = DbHelper.getInstance().getExternalDao().query(queryBuilder.prepare());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by DBJ on 23-02-2015.
 */
public class DbHelper {
    private static DbHelper instance = null;
    private ConnectionSource connectionSource;
    private Dao<Internal, Integer> InternalContact;
    private Dao<External, Integer> ExternalContact;

    protected DbHelper() {
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:Contacts.db");

            TableUtils.createTableIfNotExists(connectionSource, Internal.class);
            TableUtils.createTableIfNotExists(connectionSource, Internal.class);

            InternalContact = DaoManager.createDao(connectionSource, Internal.class);
            ExternalContact = DaoManager.createDao(connectionSource, External.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbHelper getInstance(){
        if (instance == null)
            instance = new DbHelper();
        return instance;
    }

    public Dao<Internal, Integer> getInternalDao() {
        return InternalContact;
    }
    public Dao<External, Integer> getExternalDao() {
        return ExternalContact;
    }
}

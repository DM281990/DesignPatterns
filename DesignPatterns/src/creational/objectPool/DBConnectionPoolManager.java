package creational.objectPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    List<DBConnection> freeConnectionPool = new ArrayList<>();
    List<DBConnection> connectionCurrentlyInUse = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;

    public DBConnectionPoolManager(){
        for(int i = 0;i<INITIAL_POOL_SIZE;i++){
            freeConnectionPool.add(new DBConnection());
        }
    }

    public DBConnection getDBConnection(){
        if(freeConnectionPool.isEmpty() ){
            if(connectionCurrentlyInUse.size()<MAX_POOL_SIZE){
                freeConnectionPool.add(new DBConnection());
            }
            else if(connectionCurrentlyInUse.size()>=MAX_POOL_SIZE){
                return null;
            }
        }
        DBConnection dbConnection = freeConnectionPool.remove(freeConnectionPool.size()-1);
        connectionCurrentlyInUse.add(dbConnection);
        return dbConnection;
    }

    public void releaseDbConnection(DBConnection dbConnection){
        if(dbConnection!=null){
            connectionCurrentlyInUse.remove(dbConnection);
            freeConnectionPool.add(dbConnection);
        }
    }
}

package solidPrinciples.D_DependencyInversion;

public class UserService {
//    private MySQLDatabase db1=new MySQLDatabase();
//
//    public void saveUser(String user){
//        db1.saveData(user);
//    }
//
//    private MongoDBDatabase db2=new MongoDBDatabase();
//
//    public void saveUserData(String user){
//        db2.storeDocument(user);
//
//    }

    // Tight Coupling



    private Database db;

    public UserService(Database db){
        this.db=db;
    }


    public void saveUser(String user){
        db.save(user);
    }
}

package solidPrinciples.D_DependencyInversion;

public class Main {
    static void main(String[] args) {
        UserService user=new UserService(new MongoDBDatabase());
        user.saveUser("Satya");

        UserService user2=new UserService(new MySQLDatabase());
        user2.saveUser("anu");
    }
}

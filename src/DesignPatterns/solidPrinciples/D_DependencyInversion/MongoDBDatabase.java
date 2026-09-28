package DesignPatterns.solidPrinciples.D_DependencyInversion;

public class MongoDBDatabase implements Database{


    @Override
    public void save(String user) {
        System.out.println("Saving data in MongoDB: "+user);

    }
}

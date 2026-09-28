package DesignPatterns.solidPrinciples.D_DependencyInversion;

public class MySQLDatabase implements Database{
    @Override
    public void save(String user) {
        System.out.println("Saving data in MySQLDatabase: "+user);

    }
}

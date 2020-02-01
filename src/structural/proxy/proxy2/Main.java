package structural.proxy.proxy2;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {
        HibernateConnection proxy = new HibernateConnectionProxy();
        proxy.writeToDB();
        proxy.writeToDB();
        proxy.writeToDB();
    }
}

package structural.proxy.proxy_2;

/**
 * Created by Illia Chenchak
 */
public class HibernateConnectionImpl implements HibernateConnection{

    public HibernateConnectionImpl() {
        init();
    }

    @Override
    public void writeToDB() {
        System.out.println("saved");
    }

    public void init() {
        System.out.println("created connection heavy");
    }

}

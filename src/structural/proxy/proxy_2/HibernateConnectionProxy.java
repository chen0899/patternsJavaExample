package structural.proxy.proxy_2;

import static java.util.Objects.isNull;

/**
 * Created by Illia Chenchak
 */
public class HibernateConnectionProxy implements HibernateConnection{

    private static HibernateConnection hibernateConnection;

    @Override
    public void writeToDB() {
        if (isNull(hibernateConnection)) {
            hibernateConnection = new HibernateConnectionImpl();
        }

        hibernateConnection.writeToDB();
    }
}

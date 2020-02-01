package structural.adapter;

/**
 * Created by Illia Chenchak
 */
public class MovableAdapterImpl implements MovableAdapter{

    private Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public Double getSpeed() {
        return convertMPHtoKMPH(car.getSpeed());
    }

    Double convertMPHtoKMPH(Double mph) {
        return mph * 1.60934;
    }
}

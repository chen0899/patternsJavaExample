package structural.decorator.decorator2;

/**
 * Created by Illia Chenchak
 */
public class Sport extends VehicleDecorator{

    public Sport(Car car) {
        super(car);
    }

    @Override
    public String vehicleDecorate() {
        return super.vehicleDecorate() + " sport ";
    }
}

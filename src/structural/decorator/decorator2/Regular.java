package structural.decorator.decorator2;

/**
 * Created by Illia Chenchak
 */
public class Regular extends VehicleDecorator{

    public Regular(Car car) {
        super(car);
    }

    @Override
    public String vehicleDecorate() {
        return super.vehicleDecorate() + " normal ";
    }
}

package structural.decorator.decorator2;

/**
 * Created by Illia Chenchak
 */
public class VehicleDecorator implements Car{

    private Car car;

    public VehicleDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String vehicleDecorate() {
        return car.vehicleDecorate();
    }
}

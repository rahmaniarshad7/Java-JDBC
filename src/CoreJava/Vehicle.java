public class Vehicle {
    public void service() {
        System.out.println("Vehicle is getting serviced...");
    }

    public class Car extends Vehicle {
        public void service() {
            System.out.println("Car is getting serviced...");
        }

        public void main(String[] args) {
            Vehicle vh = new Vehicle();
            Car car = new Car();
            vh.service();
            car.service();

        }

    }
}

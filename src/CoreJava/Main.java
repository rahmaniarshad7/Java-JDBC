import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the Transport class
class Transport {
    private String type;
    private String departureTime;
    private String arrivalTime;
    private double price;

    public Transport(String type, String departureTime, String arrivalTime, double price) {
        this.type = type;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                '}';
    }
}

// Define the Route class
class Route {
    private String startPoint;
    private String destination;
    private List<Transport> transports;

    public Route(String startPoint, String destination) {
        this.startPoint = startPoint;
        this.destination = destination;
        this.transports = new ArrayList<>();
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public List<Transport> getTransports() {
        return transports;
    }
}

// Define the TransportEnquirySystem class
class TransportEnquirySystem1 {
    private List<Route> routes;

    public TransportEnquirySystem1() {
        this.routes = new ArrayList<>();
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public List<Transport> searchTransports(String startPoint, String destination) {
        for (Route route : routes) {
            if (route.getStartPoint().equalsIgnoreCase(startPoint) && route.getDestination().equalsIgnoreCase(destination)) {
                return route.getTransports();
            }
        }
        return null;
    }

    public void inquireTransport(String lowerCase, String code) {
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a transport enquiry system
        TransportEnquirySystem1 enquirySystem = new TransportEnquirySystem1();

        // Define some routes and transports
        Route route1 = new Route("Dehradun", "Delhi");
        route1.addTransport(new Transport("Bus", "08:00", "12:00", 50.0));
        route1.addTransport(new Transport("Train", "10:00", "14:00", 70.0));

        Route route2 = new Route("Dehradun", "Patna");
        route2.addTransport(new Transport("Flight", "09:00", "11:00", 120.0));
        route2.addTransport(new Transport("Bus", "11:30", "15:30", 60.0));

        // Add routes to the system
        enquirySystem.addRoute(route1);
        enquirySystem.addRoute(route2);

        // Interact with the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        String startPoint = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        List<Transport> transports = enquirySystem.searchTransports(startPoint, destination);

        if (transports != null) {
            System.out.println("Available transports from " + startPoint + " to " + destination + ":");
            for (Transport transport : transports) {
                System.out.println(transport);
            }
        } else {
            System.out.println("No transports available for the specified route.");
        }
    }
}

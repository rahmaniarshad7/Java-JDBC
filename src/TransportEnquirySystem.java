import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TransportEnquirySystem {
    private Map<String, String> busSchedule;
    private Map<String, String> trainSchedule;
    private Map<String, String> flightSchedule;

    public TransportEnquirySystem() {
        busSchedule = new HashMap<>();
        trainSchedule = new HashMap<>();
        flightSchedule = new HashMap<>();
        initializeSchedules();
    }

    private void initializeSchedules() {
        busSchedule.put("B101", "Volvo - 9:00 AM  - Dehradun To Delhi");
        busSchedule.put("B102", "Super Deluxe - Patna Delhi- 11:30 AM");
        busSchedule.put("B103", "Tirupur Balaji - Dehradun Chennai - 2:00 PM");

        trainSchedule.put("T201", "Train X - 8:45 AM");
        trainSchedule.put("T202", "Train Y - 1:15 PM");
        trainSchedule.put("T203", "Train Z - 5:45 PM");

        flightSchedule.put("F301", "Flight P - 10:30 AM");
        flightSchedule.put("F302", "Flight Q - 3:45 PM");
        flightSchedule.put("F303", "Flight R - 7:00 PM");
    }

    public void inquireTransport(String mode, String code) {
        Map<String, String> schedule = getScheduleByMode(mode);

        if (schedule.containsKey(code)) {
            System.out.println("Transport Details:");
            System.out.println("Code: " + code);
            System.out.println("Details: " + schedule.get(code));
        } else {
            System.out.println("Transport not found for code: " + code);
        }
    }

    private Map<String, String> getScheduleByMode(String mode) {
        switch (mode) {
            case "bus":
                return busSchedule;
            case "train":
                return trainSchedule;
            case "flight":
                return flightSchedule;
            default:
                throw new IllegalArgumentException("Invalid transport mode: " + mode);
        }
    }
}

class Arshad {
    public static void main(String[] args) {
        TransportEnquirySystem1 enquirySystem = new TransportEnquirySystem1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Transport Enquiry System!");

        while (true) {
            System.out.println("\nEnter Transport Mode (bus/train/flight) or 'exit' to quit:");
            String mode = scanner.nextLine();

            if (mode.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Transport Enquiry System. Goodbye!");
                break;
            }

            System.out.println("Enter Transport Code:");
            String code = scanner.nextLine();

            enquirySystem.inquireTransport(mode.toLowerCase(), code);
        }

        scanner.close();
    }
}

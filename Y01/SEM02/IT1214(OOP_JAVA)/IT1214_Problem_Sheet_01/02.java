class Vehicle {
    private String licencePlate;
    private String ownerName;
    private int hoursParked;
    
    Vehicle(String licencePlate, String ownerName, int hoursParked) {
        this.licencePlate = licencePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }
    
    public String getLicencePlate() {
        return licencePlate;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public int getHoursParked() {
        return hoursParked;
    }
    
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }
}

class ParkingLot {
    Vehicle[] parkedVehicles = new Vehicle[5]; // 5 spots available
    int parkLimit = 0;
    
    public void addVehicle(String licencePlate, String owner, int hours) {
        if (parkLimit < 5) {
            parkedVehicles[parkLimit] = new Vehicle(licencePlate, owner, hours);
            parkLimit++;
            System.out.println("Vehicle " + licencePlate + " added successfully!");
        } else {
            System.out.println("Can't add " + licencePlate + "...! Park is full please remove a vehicle\n");
        }
    }
    
    public boolean validateLicencePlate(String licencePlate) {
        for (Vehicle vehicle : parkedVehicles) {
            if (vehicle != null && vehicle.getLicencePlate().equals(licencePlate)) {
                return true;
            }
        }
        return false;
    }
    
    public void removeVehicle(String licencePlate) {
        if (!validateLicencePlate(licencePlate)) {
            System.out.println("Vehicle " + licencePlate + " not found in parking lot!");
            return;
        }
        
        for (int i = 0; i < parkLimit; i++) {
            if (parkedVehicles[i] != null && parkedVehicles[i].getLicencePlate().equals(licencePlate)) {
                System.out.println("Licence Plate " + licencePlate + " was removed");
                
                // Shift remaining vehicles to fill the gap
                for (int k = i; k < parkLimit - 1; k++) {
                    parkedVehicles[k] = parkedVehicles[k + 1];
                }
                parkedVehicles[parkLimit - 1] = null; // Clear the last position
                parkLimit--;
                break;
            }
        }
    }
    
    public void printVehicle(String licencePlate) {
        for (Vehicle vehicle : parkedVehicles) {
            if (vehicle != null && vehicle.getLicencePlate().equals(licencePlate)) {
                System.out.println("Licence Plate: " + vehicle.getLicencePlate());
                System.out.println("Owner: " + vehicle.getOwnerName());
                System.out.println("Parked For " + vehicle.getHoursParked() + " Hours");
                System.out.println();
                return;
            }
        }
        System.out.println("Vehicle " + licencePlate + " not found!");
    }
    
    public void printAllVehicles() {
        if (parkLimit == 0) {
            System.out.println("No vehicles in parking lot.");
            return;
        }
        
        System.out.println("=== All Parked Vehicles ===");
        for (int i = 0; i < parkLimit; i++) {
            if (parkedVehicles[i] != null) {
                System.out.println("Licence Plate: " + parkedVehicles[i].getLicencePlate());
                System.out.println("-------");
                System.out.println("Owner: " + parkedVehicles[i].getOwnerName());
                System.out.println("Parked For " + parkedVehicles[i].getHoursParked() + " Hours");
                System.out.println();
            }
        }
        System.out.println("Total vehicles: " + parkLimit + "/5");
    }
}

class Problem02 {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        
        // Add vehicles directly in one line each
        parkingLot.addVehicle("ABC123", "John Doe", 2);
        parkingLot.addVehicle("XYZ789", "Jane Smith", 5);
        parkingLot.addVehicle("LMN556", "Bob Brown", 1);
        
        System.out.println("\n--- Before Removal ---");
        parkingLot.printAllVehicles();
        
        System.out.println("--- Removing Vehicle ---");
        parkingLot.removeVehicle("ABC123");
        parkingLot.removeVehicle("NOTFOUND"); // Test non-existent vehicle
        
        System.out.println("\n--- After Removal ---");
        parkingLot.printAllVehicles();
        
        System.out.println("--- Individual Vehicle Details ---");
        parkingLot.printVehicle("XYZ789");
        parkingLot.printVehicle("ABC123"); // This should show "not found"

    }
}
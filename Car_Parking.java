import java.util.Scanner;

class Parking_Lot 
{
    private Car[][] parking_lot;

    
    public Parking_Lot(int floors, int slots_per_floor) 
    {
        this.parking_lot = new Car[floors][slots_per_floor];
    }

  
    public int[] find_nearest_slot()
    {
        for (int floor = 0; floor < parking_lot.length; floor++)
        {
            for (int slot = 0; slot < parking_lot[floor].length; slot++)
            {
                if (parking_lot[floor][slot] == null)
                {
                    return new int[]{floor, slot};
                }
            }
        }
        return null; 
    }

    
    public boolean park_car(String car_number, String car_color) 
    {
        int[] slot = find_nearest_slot();
        if (slot == null) 
        {
            System.out.println("No available slots for parking.");
            return false;
        }
        int floor = slot[0];
        int slot_number = slot[1];
        parking_lot[floor][slot_number] = new Car(car_number, car_color);
        System.out.println("Car " + car_number + " (" + car_color + ") parked at Floor " + (floor + 1) + ", Slot " + (slot_number + 1) + ".");
        return true;
    }

    
    public void find_car(String search_by, String value)
    {
        for (int floor = 0; floor < parking_lot.length; floor++) 
        {
            for (int slot = 0; slot < parking_lot[floor].length; slot++)
            {
                Car car = parking_lot[floor][slot];
                if (car != null) 
                {
                    if ((search_by.equals("number") && car.get_car_number().equals(value)) ||
                        (search_by.equals("color") && car.get_car_color().equals(value)) ||
                        (search_by.equals("slot") && (slot + 1) == Integer.parseInt(value))) {
                        System.out.println("Car found at Floor " + (floor + 1) + ", Slot " + (slot + 1) + ": " + car);
                        return;
                    }
                }
            }
        }
        System.out.println("Car with " + search_by + " '" + value + "' not found.");
    }

    
    public boolean exit_car(int floor, int slot) 
    {
        if (floor >= 1 && floor <= parking_lot.length && slot >= 1 && slot <= parking_lot[floor - 1].length)
        {
            if (parking_lot[floor - 1][slot - 1] != null)
            {
                Car car = parking_lot[floor - 1][slot - 1];
                parking_lot[floor - 1][slot - 1] = null;
                System.out.println("Car " + car.get_car_number() + " (" + car.get_car_color() + ") exited from Floor " + floor + ", Slot " + slot + ".");
                return true;
            } 
            else 
            {
                System.out.println("Slot " + slot + " on Floor " + floor + " is already empty.");
                return false;
            }
        }
        System.out.println("Invalid floor or slot.");
        return false;
    }

    
    public void show_parking_status() 
    {
        System.out.println("\nParking Lot Status:");
        for (int floor = 0; floor < parking_lot.length; floor++)
        {
            System.out.print("Floor " + (floor + 1) + ": ");
            for (int slot = 0; slot < parking_lot[floor].length; slot++)
            {
                Car car = parking_lot[floor][slot];
                if (car == null) 
                {
                    System.out.print("[Empty] ");
                } 
                else 
                {
                    System.out.print("[Car: " + car.get_car_number() + ", Color: " + car.get_car_color() + "] ");
                }
            }
            System.out.println();
        }
    }
}

class Car 
{
    private String car_number;
    private String car_color;

    
    public Car(String car_number, String car_color)
    {
        this.car_number = car_number;
        this.car_color = car_color;
    }

  
    public String get_car_number()
    {
        return car_number;
    }

    
    public String get_car_color() 
    {
        return car_color;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "car_number='" + car_number + '\'' +
                ", car_color='" + car_color + '\'' +
                '}';
    }

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of floors: ");
        int floors = scanner.nextInt();
        System.out.print("Enter the number of slots per floor: ");
        int slots_per_floor = scanner.nextInt();

        Parking_Lot parking_lot = new Parking_Lot(floors, slots_per_floor);

        while (true) 
        {
            System.out.println("\n1. Park a Car");
            System.out.println("2. Find a Car");
            System.out.println("3. Exit a Car");
            System.out.println("4. Show Parking Status");
            System.out.println("5. Exit Program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter car number: ");
                    String car_number = scanner.nextLine();
                    System.out.print("Enter car color: ");
                    String car_color = scanner.nextLine();
                    parking_lot.park_car(car_number, car_color);
                    break;
                case 2:
                    System.out.println("Search by:");
                    System.out.println("1. Car Number");
                    System.out.println("2. Car Color");
                    System.out.println("3. Slot Number");
                    System.out.print("Enter your choice: ");
                    int search_option = scanner.nextInt();
                    scanner.nextLine();  

                    if (search_option == 1) 
                    {
                        System.out.print("Enter car number: ");
                        String search_number = scanner.nextLine();
                        parking_lot.find_car("number", search_number);
                    } 
                    else if (search_option == 2) 
                    {
                        System.out.print("Enter car color: ");
                        String search_color = scanner.nextLine();
                        parking_lot.find_car("color", search_color);
                    } 
                    else if (search_option == 3) 
                    {
                        System.out.print("Enter slot number: ");
                        String search_slot = scanner.nextLine();
                        parking_lot.find_car("slot", search_slot);
                    } 
                    else
                    {
                        System.out.println("Invalid search option.");
                    }
                    break;
                case 3:
                    System.out.print("Enter floor number: ");
                    int floor = scanner.nextInt();
                    System.out.print("Enter slot number: ");
                    int slot = scanner.nextInt();
                    parking_lot.exit_car(floor, slot);
                    break;
                case 4:
                    parking_lot.show_parking_status();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

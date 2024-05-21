// Movie Theater Assignment
// Seating chart for Ondine 2009
import java.util.Scanner;

public class MovieTheaterSeats {
    private char[] seats;
    private final int totalSeats = 50;

    public MovieTheaterSeats() {
        seats = new char[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = '0'; // '0' represents an available seat
        }
    }

    // Method to display the seating chart
    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    // Method to reserve a seat
    public void reserveSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Invalid seat number. Please select a seat number between 1 and " + totalSeats + ".");
        } else if (seats[seatNumber - 1] == 'X') {
            System.out.println("Seat " + seatNumber + " is already taken.");
        } else {
            seats[seatNumber - 1] = 'X'; // 'X' represents a reserved seat
            System.out.println("Seat " + seatNumber + " has been successfully reserved.");
        }
    }

    public static void main(String[] args) {
        MovieTheaterSeats movieTheater = new MovieTheaterSeats();
        
        System.out.println("Welcome to Gold Dragon Theater!");
        System.out.println("Movie: Ondine");
        System.out.println("Year Released: 2009");
        System.out.println("Running time: 1h 51m");
        System.out.println("Rated: PG-13");
        
        movieTheater.displaySeatingChart();

        // List of people and their seat reservations
        String[] people = {
            "Liam Kałwa", "Olivia Kade", "Noah Kain", "Emma Kallend", "Oliver Kalwa",
            "Charlotte Kane", "James Karlin", "Amelia Karridge", "Elijah Kary", "Sophia Kauffeld",
            "Mateo Keam", "Mia Kear", "Theodore Kearn", "Isabella Kearsley", "Henry Keating",
            "Ava Keem", "Lucas Keena", "Evelyn Keere", "William Keeton", "Luna Kehir"
        };

        int[] reservedSeats = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 2, 6, 11, 16, 21, 26, 31, 36, 41, 46};

        // Reserve seats for the people
        for (int i = 0; i < people.length; i++) {
            System.out.println("Reserving seat for " + people[i]);
            movieTheater.reserveSeat(reservedSeats[i]);
        }

        System.out.println("\nUpdated Seating Chart:");
        movieTheater.displaySeatingChart();
    }
}
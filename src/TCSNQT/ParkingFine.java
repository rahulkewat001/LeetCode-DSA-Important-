package TCSNQT;

import java.util.Scanner;

public class ParkingFine {
    // if parking time <= 2 hrs -> fine = 100
    // if parking time > 2 hrs and <= 5 hrs -> fine = 50
    // if parking time > 5 hrs -> fine = 20
    // calculate and print the parking fine

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();

        int fine = 0;
        if(hrs <= 2) fine = 100;
        else if (hrs > 2 && hrs <= 5) fine = 50;
        else fine = 20;

        System.out.println(fine);
    }
}

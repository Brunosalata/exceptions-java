package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
// Programa consiste na inserção de Número do quarto, data de entrada e de saída, para retornar a Reserva
// datas poderão ser alteradas, desde que sejam posteriores à anterior

	public static void main(String[] args) {
	

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	
	try {
	System.out.print("Room number: ");
	int number = sc.nextInt();
	System.out.print("Check-in date (dd/MM/yyyy): ");
	Date checkIn = sdf.parse(sc.next());
	System.out.print("Check-out date (dd/MM/yyyy): ");
	Date checkOut = sdf.parse(sc.next());
	
	
	Reservation reservation = new Reservation(number, checkIn, checkOut);
	System.out.println("Reservation: " + reservation);
	
	System.out.println();
	System.out.println("Enter data to update the reservation:");
	System.out.print("Check-in date (dd/MM/yyyy): ");
	checkIn = sdf.parse(sc.next());
	System.out.print("Check-out date (dd/MM/yyyy): ");
	checkOut = sdf.parse(sc.next());
	
	reservation.updateDates(checkIn, checkOut);
	System.out.println("Reservation: " + reservation);
	}
	catch (ParseException e){
		System.out.println("Invalid date format.");
	}
	catch (DomainException e) {
		System.out.println("Error in reservation: " + e.getMessage());
	}
	catch (RuntimeException e) {	//para qualquer outro erro não previsto (evita quebra do programa)
		System.out.println("Unexpected error");
	}
	
	sc.close();
	}
}

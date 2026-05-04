package com.pluralsight;

public class Main {

    static void main() {
        Room room = new Room(2,150,false,false);
        System.out.println(room.getNumberOfBeds());
        System.out.println(room.getPrice());
        System.out.println(room.isOccupied());
        System.out.println(room.isDirty());
        System.out.println(room.isAvailable());

        System.out.println();

        Reservation reservation = new Reservation("KiNg",5,false);
        System.out.println(reservation.getRoomType());
        reservation.setRoomType("DoUbLe");
        System.out.println(reservation.getRoomType());
        System.out.println(reservation.getPrice());
        System.out.println(reservation.getNumberOfNights());
        reservation.setNumberOfNights(10);
        System.out.println(reservation.getNumberOfNights());
        System.out.println(reservation.isWeekend());
        reservation.setIsWeekend(true);
        System.out.println(reservation.isWeekend());
        System.out.println(reservation.getReservationPrice());

        System.out.println();

        Employee employee = new Employee("A1","Samuel","App Dev",17.50,45);
        System.out.println(employee.getTotalPay());
        System.out.println(employee.getRegularHours());
        System.out.println(employee.getOvertimeHours());
    }


}

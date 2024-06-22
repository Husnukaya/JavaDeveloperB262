package miniproject01;

import java.util.ArrayList;
import java.util.List;

public class Bus {


    //Number of seats, busNo

    //1) create busNumber variable

    public String busNum;

    //2) Create an object from Bus class into TicketReservation class

    public List<String> seats = new ArrayList<>();



    public Bus(String busNum){

        this.busNum = busNum;

        for (int i = 1; i <33 ; i++) {

            this.seats.add(String.valueOf(i));

        }


    }
}

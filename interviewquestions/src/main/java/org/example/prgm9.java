package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Event {
    String eventname;
    Date date;
    String location;

    Event(String eventname, Date date, String location) {
        this.eventname = eventname;
        this.date = date;
        this.location = location;
    }

    public void display() {
        System.out.println("Event name :" + eventname);
        System.out.println("Date :" + date);
        System.out.println("Location :" + location);
    }

    public boolean isconflict(Event e) {
        return this.location.equals(e.location) && this.date.equals(e.date) && this.eventname.equals(e.eventname);
    }
}


class Seminar extends Event {
    int noofspeakers;

    Seminar(String eventname, Date date, String location, int noofspeakers) {
        super(eventname, date, location);
        this.noofspeakers = noofspeakers;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("no of speakers :" + noofspeakers);
    }
}

class Musicalperformance extends Event {
    List performers;

    Musicalperformance(String eventname, Date date, String location, List performers) {
        super(eventname, date, location);
        this.performers = performers;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Performers are  :" + String.join(",", performers));
    }
}


public class prgm9 {
    public static void main(String[] args) {
        Date date = new Date();
        Seminar s = new Seminar("punjabi", date, "patiala", 5);
        System.out.println("Seminar details  :");
        s.display();
        List performers = new ArrayList();
        performers.add("rajat");
        performers.add("joshi");
        Musicalperformance pp = new Musicalperformance("punjab", date, "patiala", performers);
        System.out.println("Musical  details  :");
        pp.display();

        Event e = new Event("punjabi", date, "patiala");
        if (s.isconflict(pp)) {
            System.out.println("matched");
        } else {
            System.out.println("not matched");
        }

    }
}

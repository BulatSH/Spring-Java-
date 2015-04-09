package edu.kfu.itis.spring.day03.lab01.service;

import edu.kfu.itis.spring.day03.lab01.model.Event;
import edu.kfu.itis.spring.day03.lab01.model.Guest;
import edu.kfu.itis.spring.day03.lab01.model.Order;

import java.util.List;


public interface EventService {

    void register(Event event, Order order);

    List<Guest> getGuests(Event event);

}

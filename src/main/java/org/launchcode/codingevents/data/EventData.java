package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to put events (Event class)
    private final static Map<Integer, Event> allEvents = new HashMap<>();

    // get all events
    public static Collection<Event> getAllEvents() {
        return allEvents.values();
    }

    // get a single event
    public static Event getEventById(int eventId) {
        return allEvents.get(eventId);
    }

    // add an event
    public static void addEvent(Event event) {
        allEvents.put(event.getId(), event);
    }

    // remove an event
    public static void removeEvent(int eventId) {
        allEvents.remove(eventId);
    }
}

package org.campus02.eventcal;

import java.util.ArrayList;

public class EventKalender {

  private ArrayList<Event> events = new ArrayList<>();

  public void add(Event event) {
    events.add(event);
  }

  public Event getByTitle(String title) {
    for(Event e : events) {
      if(e.getTitle().equals(title)) {
        return e;
      }
    }
    return null;
  }

  public ArrayList<Event> getByOrt(String ort) {
    ArrayList<Event> found = new ArrayList<>();
    for(Event e : events) {
      if(e.getOrt().equals(ort)) {
        found.add(e);
      }
    }
    return found;
  }

  public ArrayList<Event> getByEintrittsPreis(double min, double max) {
    ArrayList<Event> found = new ArrayList<>();
    for(Event e : events) {
        if(e.getEintrittsPreis() >= min
            && e.getEintrittsPreis() <= max) {
          found.add(e);
        }
    }
    return found;
  }

  public Event getMostExpensiveByOrt(String ort) {
    double maxPreis = 0.0;
    Event mostExpensive = null;
    for(Event e : events) {
      if(e.getOrt().equals(ort)) {
        if(e.getEintrittsPreis() > maxPreis) {
          maxPreis = e.getEintrittsPreis();
          mostExpensive = e;
        }
      }
    }
    return mostExpensive;
  }

  public double getAvgPreisByOrt(String ort) {
    double sum = 0.0;
    int count = 0;
    for(Event e : events) {
      if (e.getOrt().equals(ort)) {
        sum += e.getEintrittsPreis();
        count++;
      }
    }
    //NOTE: could check for div by 0 -> NaN
    return sum / count;
  }



}

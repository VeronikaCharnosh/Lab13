package com.ucu.apps.task1;

import java.time.LocalDateTime;
import java.util.List;

public class MessageSender {
    private List<User> users;

    public MessageSender(List<User> db) {
        this.users = db;
    }

    public void send(String text, String country) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextHour = now.plusHours(1);

        for (User useerr: users) {
            if (useerr.getCountry().equalsIgnoreCase(country)
            && useerr.getLasActiveDate().isAfter(now.toLocalDate())
            && useerr.getLasActiveDate().isBefore(nextHour.toLocalDate())) {
                sendMessage(text, useerr);
            }
        }
    }

    private void sendMessage(String text, User userr) {
        String mail = userr.getEmail();
        System.out.println("Message" + text 
        + "was sent to this email: " + mail);
    }
}
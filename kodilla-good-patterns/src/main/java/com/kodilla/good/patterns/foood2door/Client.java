package com.kodilla.good.patterns.foood2door;

import java.time.LocalDateTime;

public class Client {

    private String clientName;
    private LocalDateTime requestDate;

    public Client(String clientName, LocalDateTime requestDate) {
        this.clientName = clientName;
        this.requestDate = requestDate;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }
}

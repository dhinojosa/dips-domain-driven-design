package com.xyzcorp;


import java.util.HashSet;
import java.util.Set;

public class EmailServiceStub implements EmailService {

    Set<Prospect> prospectSet;

    public EmailServiceStub() {
        this.prospectSet = new HashSet<>();
    }

    public void sendEmail(Prospect prospect) {
        this.prospectSet.add(prospect);
    }

    @Override
    public boolean hasAcknowledgeBeenSentFor(Prospect prospect) {
       return this.prospectSet.contains(prospect);
    }
}

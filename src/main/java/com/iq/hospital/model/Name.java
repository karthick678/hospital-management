package com.iq.hospital.model;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String first;
    private String last;
    private String middle;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }
}

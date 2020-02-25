package com.iq.hospital.model;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class PageDocument {
    private List<Doctor> docs;
    private int total;
    private int pages;
    private int limit;

    public List<Doctor> getDocs() {
        return docs;
    }

    public void setDocs(List<Doctor> docs) {
        this.docs = docs;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

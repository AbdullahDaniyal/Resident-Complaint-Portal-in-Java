package com.example;

import java.io.IOException;
import java.util.ArrayList;

public class DataAnalyst extends Person{
    private int dataAnalystID;
    Complaint complaint = new Complaint();

    public DataAnalyst() {
    }

    //get Complaints
    public void getComplaints() throws IOException {
        complaint.getComplaint(dataAnalystID);
    }

    //select Complaint
    public void selectComplaint(int complaintID) {
        // Complaint complaint = new Complaint();
        complaint.selectComplaint(complaintID);
    }

    //get Filters
    public Complaint getFilters() {
        complaint.getFilters();
        return complaint;
    }

    //select Filter
    public void selectFilter(String filter) {
        complaint.selectFilter(filter);
    }
}

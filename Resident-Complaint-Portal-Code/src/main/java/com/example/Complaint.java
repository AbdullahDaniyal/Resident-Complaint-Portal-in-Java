package com.example;

import java.util.ArrayList;

public class Complaint {
    // stringg array
    private String complaintsString = "";
    ComplaintData ComplaintData = new ComplaintData();

    boolean getstatusofFile() {
        return ComplaintData.checkFile();
    }

    String getComplaint(int i) {

        complaintsString = ComplaintData.getID(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getname(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getAddress(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getcnic(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getCategory(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getDescription(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getDateReceived(i);
        complaintsString += ",";
        complaintsString += ComplaintData.getExpedite(i);
        complaintsString += ",";
        return complaintsString;

    }

    String selectComplaint(int complaintID) {
        complaintsString = ComplaintData.getID(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getname(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getAddress(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getcnic(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getCategory(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getDescription(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getDateReceived(complaintID);
        complaintsString += ",";
        complaintsString += ComplaintData.getExpedite(complaintID);
        complaintsString += ",";
        return complaintsString;
    }

    //get filter
    String getFilters(){
        return "ComplaintData.getFilters();";
    }

    //select filter 
    String selectFilter(String filter){
        return "ComplaintData.selectFilter(filter);";
    }
    
}

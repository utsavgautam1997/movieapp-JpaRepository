package com.upgrad.movieapp.Dto;

import java.util.List;

public class ErrorResponses {



    private  String message;
    private List<String> errorDetails;

    public ErrorResponses(String message, List<String> errorDetails) {
        this.message = message;
        this.errorDetails = errorDetails;
    }
}

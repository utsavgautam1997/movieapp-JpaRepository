package com.upgrad.movieapp.Exception;

import com.upgrad.movieapp.Dto.ErrorResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.http.HttpHeaders;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class CoustomExceptionHandler extends ResponseEntityExceptionHandler {
    private String No_Record= "NO_RECORD_FOUND";
    private String Bad_request = "BAD_REQUEST";
    private MethodArgumentNotValidException ex;
    private HttpHeaders headers;
    private HttpStatus status;
    private WebRequest request;


    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<ErrorResponses> handleRecordNotFoundException(RecordNotFoundException e,
                                                                              WebRequest req){


        List<String> errordetails = new ArrayList<String>();
        errordetails.add(e.getLocalizedMessage());
       // ErrorResponses errorResponses = new ErrorResponses(No_Record,errordetails);
        return new ResponseEntity(errordetails, HttpStatus.NOT_FOUND);


    }
   @ExceptionHandler(uniqueEntityException.class)
    public final ResponseEntity<ErrorResponses> handleUniqueEntityException(uniqueEntityException e,
                                                                              WebRequest req){


        List<String> errordetails = new ArrayList<String>();
        errordetails.add(e.getLocalizedMessage());
        // ErrorResponses errorResponses = new ErrorResponses(No_Record,errordetails);
        return new ResponseEntity(errordetails, HttpStatus.BAD_REQUEST);


    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", status.value());

        List<String> errors = ex.getBindingResult().getFieldErrors().
                stream().map(x -> x.getDefaultMessage()).collect(Collectors.toList());

        body.put("error", errors);

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

}

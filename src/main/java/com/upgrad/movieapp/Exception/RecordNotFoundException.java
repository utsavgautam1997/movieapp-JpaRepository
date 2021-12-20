package com.upgrad.movieapp.Exception;

import org.springframework.stereotype.Component;


    public class RecordNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;



        public RecordNotFoundException(String message) {
            super(message);
        }
    }


package com.upgrad.movieapp.Exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;

public class uniqueEntityException extends DataIntegrityViolationException {

    public uniqueEntityException(String msg) {
        super(msg);
    }
}

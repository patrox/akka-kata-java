/**
 *  Copyright (C) 2011-2013 Typesafe <http://typesafe.com/>
 */
package com.typesafe.akkademo.processor.repository;

public class DatabaseFailureException extends RuntimeException {
    DatabaseFailureException(String s) {
        super(s);
    }
}

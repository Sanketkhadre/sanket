package com.cts.Employee.Management.App.Poc.exception;

import java.math.BigInteger;

public class ResourcesNotFoundException extends RuntimeException {

	 

    private String resourceName;
    private int fieldValue;
    private Object fieldName;
    public ResourcesNotFoundException(String resourceName, int id, Object fieldName) {
        super(String.format(resourceName, id,fieldName));
        this.resourceName = resourceName;
        this.fieldValue = id;
        this.fieldName = fieldName;
    }

 

    public String getResourceName() {
        return resourceName;
    }

    public int getFieldValue() {
        return fieldValue;
    }

    public Object getFieldName() {
        return fieldName;
    }


}
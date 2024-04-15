package com.cts.Employee.Management.App.Poc.payload;

public class AppModelResponse {
private String message;

 

    

 

    public AppModelResponse() {
        super();
    }

 

 

    public AppModelResponse(String message) {
        super();
        this.message = message;
    }

 

    

 

    public String getMessage() {
        return message;
    }

 

    public void setMessage(String message) {
        this.message = message;
    }

 

 

    @Override
    public String toString() {
        return "AccountServiceResponseModel [message=" + message + "]";
    }


 

}
package com.axelolea.inflapartybackend.exceptions;


import lombok.Builder;

import java.util.Date;

@Builder
public class ErrorObject {

    private String message;
    private Date timestamp;
    private int statusCode;

}

package com.springBootLaunch.launchbootv3;

import lombok.Data;

@Data
public class AjaxResponse {
    private boolean isRequestOk;
    private Integer statusCode; //200 400 500
    private String statusMessage;
    private Object data;

    public AjaxResponse(){}
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setRequestOk(true);
        ajaxResponse.setStatusCode(200);
        ajaxResponse.setStatusMessage("Request executed successfully");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object object) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setRequestOk(true);
        ajaxResponse.setStatusCode(200);
        ajaxResponse.setStatusMessage("Request executed successfully");
        ajaxResponse.setData(object);
        return ajaxResponse;
    }

    public static AjaxResponse success(Object object, String statusMessage) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setRequestOk(true);
        ajaxResponse.setStatusCode(200);
        ajaxResponse.setStatusMessage(statusMessage);
        ajaxResponse.setData(object);
        return ajaxResponse;
    }
}

package com.gamatechno.ggfw.downloaderx.Exception;

public class GTDownloadException extends Exception {
    public static final String REQUEST_IN_PROCESS = "URI Request in process";
    public static final String REQUEST_NOT_IN_PROCESS = "URI Request not in process";
    public GTDownloadException(String exception){
        super(exception);
    }
}

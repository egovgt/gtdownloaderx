package com.gamatechno.ggfw.downloaderx;

public interface GTDownloadCallback {
    void onProcess(GTDownloadRequest request);
    void onCancel(GTDownloadRequest request);
    void onSuccess(GTDownloadRequest request);
}

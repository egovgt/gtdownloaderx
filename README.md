# gtdownloaderx
GTDownloader Androidx

## Initialization
```
Uri destination = Uri.withAppendedPath(Uri.fromFile(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)), "YourDirectory");

try {
                            new GTDownloadManager(getContext(), new GTDownloadCallback(){
                                @Override
                                public void onProcess(GTDownloadRequest request) {

                                }

                                @Override
                                public void onCancel(GTDownloadRequest request) {

                                }

                                @Override
                                public void onSuccess(GTDownloadRequest request) {

                                }
                            }).startRequest(new GTDownloadRequest(Uri.parse(uri)) // start your download request
                                            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN) // default = show
                                            .setDestinationUri(destination)); // destination uri = xxx
                        } catch (GTDownloadException e) {
                            e.printStackTrace();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
```


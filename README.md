# gtdownloaderx
GTDownloader Androidx
## Module Setup :
### Add to gradle dependency
~~~
implementation 'com.github.egovgt:gtdownloaderx:1.0'
~~~

### Add it in your root build.gradle at the end of repositories:
~~~
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~

## How To
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


package org.practice;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownloader {


        public static void downloadImage(String imageUrl, String outputFilePath) {
            HttpURLConnection connection = null;
            try {
                URL url = new URL(imageUrl);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);

                // Check if response is successful
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    // Read input stream
                    try (BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
                         FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)) {

                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer, 0, 1024)) != -1) {
                            fileOutputStream.write(buffer, 0, bytesRead);
                        }
                        System.out.println("Image downloaded successfully to: " + outputFilePath);
                    }
                } else {
                    System.out.println("Failed to download image. Response code: " + connection.getResponseCode());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        }

        public static void main(String[] args) {
            String imageUrl = "https://lookaside.fbsbx.com/whatsapp_business/attachments/?mid=3904196246532798&ext=1730908160&hash=ATv_xLPbf346Zj3fx64PfbPTfMEE--0PaukbWk_g7bSlWA";
            String outputFilePath = "downloaded_image.jpg";  // Specify the path to save the image
            downloadImage(imageUrl, outputFilePath);
        }
    }


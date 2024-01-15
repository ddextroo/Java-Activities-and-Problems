import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class InferenceLocal {
    // Get Image Path
    public String detect(String filePath, String fileName) {
        File file = new File(filePath);

        // Base 64 Encode
        String encodedFile;
        try (FileInputStream fileInputStreamReader = new FileInputStream(file)) {
            byte[] bytes = new byte[(int) file.length()];
            fileInputStreamReader.read(bytes);
            encodedFile = new String(Base64.getEncoder().encode(bytes), StandardCharsets.US_ASCII);

            String API_KEY = "BNPmtVcTPzgRmg3Xxlq3"; // Your API Key
            String MODEL_ENDPOINT = "fruit-qbury/3"; // model endpoint

            // Construct the URL
            String uploadURL = "https://detect.roboflow.com/" + MODEL_ENDPOINT + "?api_key=" + API_KEY + "&name=" + fileName;

            // Http Request
            HttpURLConnection connection = null;
            try {
                // Configure connection to URL
                URL url = new URL(uploadURL);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

                connection.setDoOutput(true);

                // Send request
                try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                    wr.writeBytes(encodedFile);
                }

                // Get Response
                try (InputStream stream = connection.getInputStream();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                        response.append(System.lineSeparator());
                    }

                    return response.toString().trim(); // Trim to remove any leading or trailing whitespace
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null; // Return null if an error occurs
    }
}

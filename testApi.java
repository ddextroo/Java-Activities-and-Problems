
public class testApi {
    public static void main(String[] args) {
        InferenceLocal inf = new InferenceLocal();

        System.out.print(inf.detect("C:/Users/W10/Downloads/download (1).jpg", "download.jpg"));
        String responseData = inf.detect("C:/Users/W10/Downloads/download (1).jpg", "download.jpg");

        
    }
}

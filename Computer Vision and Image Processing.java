import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ImageProcessingExample {

    static {
        // Load the OpenCV native library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        // Read an image from file
        Mat image = Imgcodecs.imread("input.jpg");

        if (image.empty()) {
            System.out.println("Could not open or find the image");
            return;
        }

        // Convert the image to grayscale
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Apply Gaussian blur
        Mat blurredImage = new Mat();
        Imgproc.GaussianBlur(grayImage, blurredImage, new org.opencv.core.Size(5, 5), 0);

        // Apply Canny edge detection
        Mat edges = new Mat();
        Imgproc.Canny(blurredImage, edges, 50, 150);

        // Draw contours
        Mat result = new Mat();
        Core.addWeighted(image, 1, edges, 1, 0, result, Core.LINE_8, 0);

        // Save the result
        Imgcodecs.imwrite("output.jpg", result);

        System.out.println("Image processing complete");
    }
}

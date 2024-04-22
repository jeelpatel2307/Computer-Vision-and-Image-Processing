# Computer Vision and Image Processing in Java

This Java program demonstrates basic image processing techniques using the OpenCV library. OpenCV is a popular library for computer vision and provides various functionalities for image processing, object detection, and more.

## Overview

The program performs the following tasks:

1. **Reading an Image**: It reads an input image file from the disk.
2. **Converting to Grayscale**: The input image is converted to grayscale, which simplifies subsequent processing steps.
3. **Applying Gaussian Blur**: Gaussian blur is applied to the grayscale image to reduce noise and smoothen the edges.
4. **Edge Detection**: Canny edge detection algorithm is used to detect edges in the blurred image.
5. **Drawing Contours**: Detected edges are drawn as contours on the original color image.
6. **Saving the Result**: The processed image with contours drawn is saved as an output file.

## Requirements

To run this program, you need:

- Java Development Kit (JDK) installed on your system.
- OpenCV library configured in your Java project. You can download the OpenCV library from the official website and include it in your project's dependencies.

## Usage

1. Clone or download the repository to your local machine.
2. Configure OpenCV library in your Java project.
3. Replace the `"input.jpg"` with the path to your input image file.
4. Run the program.

## Example

Here's an example of how to run the program:

```bash
javac -cp "opencv.jar" ImageProcessingExample.java
java -cp ".:opencv.jar" ImageProcessingExample

```

This will process the input image and save the output as `"output.jpg"` in the same directory.

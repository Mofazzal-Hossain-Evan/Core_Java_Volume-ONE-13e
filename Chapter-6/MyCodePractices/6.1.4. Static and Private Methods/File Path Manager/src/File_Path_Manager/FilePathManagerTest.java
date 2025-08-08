/* Package declaration to match directory structure */
package File_Path_Manager;

import java.net.URI;

/**
 * FilePathManagerTest
 * -------------------
 * Demonstrates usage of the FilePath interface and implementations.
 *
 * Shows creation of FilePath objects using static factory methods:
 * - FilePath.of(root, segments...)
 * - FilePath.fromURI(URI)
 *
 * Also indirectly tests the private normalizePath method by
 * printing normalized paths with redundant slashes cleaned up.
 */
public class FilePathManagerTest {

    public static void main(String[] args) throws Exception {
        // Create a local file path using static method
        FilePath localPath = FilePath.of("C:/Users/evan", "Documents", "Projects//FilePathManager/");
        System.out.println(localPath); // Prints normalized local path

        // Create a network file path using static method
        FilePath networkPath = FilePath.of("https://example.com/", "/files//images/", "photo.jpg");
        System.out.println(networkPath); // Prints normalized network path

        // Create from URI for local file
        URI fileUri = new URI("file:///C:/Windows/System32//drivers/etc/hosts");
        FilePath fromFileUri = FilePath.fromURI(fileUri);
        System.out.println(fromFileUri); // LocalFilePath

        // Create from URI for network resource
        URI httpUri = new URI("https://www.example.com//api//v1/resource/");
        FilePath fromHttpUri = FilePath.fromURI(httpUri);
        System.out.println(fromHttpUri); // NetworkFilePath

        // Private normalizePath tested indirectly through these outputs
    }
}

/* Package declaration to match directory structure */
package File_Path_Manager;

import java.net.URI;

/**
 * FilePath Interface
 * ------------------
 * This interface defines a contract for file path representations.
 *
 * Key points demonstrated here:
 * 1. Static Methods in Interface:
 *    - Provide utility or factory methods related to the interface.
 *    - Can be called without any instance, e.g. FilePath.of(...).
 *    - Useful for creating instances based on input parameters.
 *
 * 2. Private Methods in Interface:
 *    - Support internal logic used by static (or default) methods.
 *    - Not visible outside the interface, hence encapsulated.
 *    - Here used to normalize/clean path strings before creating objects.
 *
 * This design helps group related path construction and normalization
 * logic within the interface, promoting encapsulation and code reuse.
 *
 * Implementations like LocalFilePath and NetworkFilePath represent concrete
 * file path types created via static methods here.
 */
public interface FilePath {

    /* Abstract method to get the full path as String */
    String getPath();

    /*
     * Static factory method to create FilePath from root and segments.
     * Decides instance type based on root format and normalizes path.
     */
    static FilePath of(String root, String... segments) {
        StringBuilder sb = new StringBuilder(root);
        for (String segment : segments) {
            if (!segment.startsWith("/")) {
                sb.append("/");
            }
            sb.append(segment);
        }
        String normalized = normalizePath(sb.toString());
        if (root.startsWith("http://") || root.startsWith("https://")) {
            return new NetworkFilePath(normalized);
        } else {
            return new LocalFilePath(normalized);
        }
    }

    /*
     * Static method to create a FilePath from a URI.
     * Supports "file" scheme for local files and "http/https" for network paths.
     */
    static FilePath fromURI(URI uri) {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        String fullPath;
        if ("file".equalsIgnoreCase(scheme)) {
            fullPath = path;
            return new LocalFilePath(normalizePath(fullPath));
        } else if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            fullPath = uri.toString(); // Use full URI string for network paths
            return new NetworkFilePath(normalizePath(fullPath));
        } else {
            throw new IllegalArgumentException("Unsupported URI scheme: " + scheme);
        }
    }

    /*
     * Private helper method to normalize a path string.
     * Removes redundant slashes and trailing slashes except root.
     *
     * This method is not accessible outside this interface,
     * ensuring internal logic encapsulation.
     */
    private static String normalizePath(String path) {
        String protocolSeparator = "://";
        int protoIndex = path.indexOf(protocolSeparator);
        String protocolPart = "";
        String pathPart = path;

        if (protoIndex != -1) {
            protocolPart = path.substring(0, protoIndex + protocolSeparator.length());
            pathPart = path.substring(protoIndex + protocolSeparator.length());
        }
        pathPart = pathPart.replaceAll("/{2,}", "/");
        if (pathPart.length() > 1 && pathPart.endsWith("/")) {
            pathPart = pathPart.substring(0, pathPart.length() - 1);
        }
        return protocolPart + pathPart;
    }
}

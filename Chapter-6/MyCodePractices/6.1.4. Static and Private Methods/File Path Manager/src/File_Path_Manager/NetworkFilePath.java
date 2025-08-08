/* Package declaration to match directory structure */
package File_Path_Manager;

/**
 * NetworkFilePath Class
 * ---------------------
 * Represents a file path on a network (URL).
 *
 * Implements FilePath interface.
 *
 * Instantiated via FilePath interface static methods,
 * encapsulating URL path handling.
 *
 * Immutable class holding normalized URL string.
 */
public class NetworkFilePath implements FilePath {

    /* Full normalized network URL path */
    private final String path;

    /* Constructor to initialize path */
    public NetworkFilePath(String path) {
        this.path = path;
    }

    /* Returns the full network path */
    @Override
    public String getPath() {
        return path;
    }

    /* Override toString for better display */
    @Override
    public String toString() {
        return "NetworkFilePath: " + path;
    }
}

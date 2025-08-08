/* Package declaration to match directory structure */
package File_Path_Manager;

/**
 * LocalFilePath Class
 * -------------------
 * Represents a file path in a local file system.
 *
 * Implements FilePath interface.
 *
 * Created via static factory methods in FilePath interface,
 * which handle path normalization and type selection.
 *
 * Simple immutable class holding the normalized path string.
 */
public class LocalFilePath implements FilePath {

    /* Full normalized local file system path */
    private final String path;

    /* Constructor to initialize path */
    public LocalFilePath(String path) {
        this.path = path;
    }

    /* Returns the full path */
    @Override
    public String getPath() {
        return path;
    }

    /* Override toString for better display */
    @Override
    public String toString() {
        return "LocalFilePath: " + path;
    }
}

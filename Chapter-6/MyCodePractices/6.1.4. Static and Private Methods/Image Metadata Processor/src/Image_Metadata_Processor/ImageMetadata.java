/* Package declaration */
package Image_Metadata_Processor;

/**
 * ImageMetadata Interface
 * -----------------------
 * থিওরি (বাংলা):
 * ========================
 * - এই interface-এ static method দিয়ে বিভিন্ন সোর্স (file path, URL) থেকে
 *   metadata তৈরি করা হয়।
 * - private method validateSource() ইনপুটের সঠিকতা চেক করে,
 *   এবং static method থেকে কল হয়।
 * - এইভাবে object creation এবং validation centralize হয় interface-এ,
 *   যেটা code reuse ও encapsulation বাড়ায়।
 */
public interface ImageMetadata {

    /* Method to get metadata info as String */
    String getMetadataInfo();

    /**
     * Static method to create metadata from local file path.
     * Calls validateSource internally.
     */
    static ImageMetadata fromFile(String filePath) {
        validateSource(filePath);

        // Simple extension check to decide Photo or Video
        if (filePath.endsWith(".mp4") || filePath.endsWith(".avi")) {
            return new VideoMetadata(filePath);
        } else {
            return new PhotoMetadata(filePath);
        }
    }

    /**
     * Static method to create metadata from URL.
     * Calls validateSource internally.
     */
    static ImageMetadata fromURL(String url) {
        validateSource(url);

        if (url.endsWith(".mp4") || url.endsWith(".avi")) {
            return new VideoMetadata(url);
        } else {
            return new PhotoMetadata(url);
        }
    }

    /**
     * Private helper method to validate file path or URL.
     * Throws IllegalArgumentException if invalid.
     */
    private static void validateSource(String source) {
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Source cannot be null or empty");
        }
        if (!(source.startsWith("http://") || source.startsWith("https://") || source.contains("/") || source.contains("\\"))) {
            throw new IllegalArgumentException("Source must be a valid file path or URL");
        }
    }
}

/* Package declaration */
package Image_Metadata_Processor;

/**
 * VideoMetadata Class
 * ------------------
 * থিওরি (বাংলা):
 * ========================
 * - VideoMetadata class ImageMetadata interface implement করে।
 * - একটি ফাইল বা URL থেকে Video-specific metadata ধারণ করে।
 * - getMetadataInfo() method দিয়ে সেই তথ্য String আকারে দেয়।
 */
public class VideoMetadata implements ImageMetadata {

    private final String source;

    public VideoMetadata(String source) {
        this.source = source;
    }

    @Override
    public String getMetadataInfo() {
        // সাধারণত এখানে video duration, codec info ইত্যাদি আসতে পারে,
        // এখানে সিম্পল রিটার্ন দিচ্ছি source ও ধরন।
        return "Video Metadata from source: " + source;
    }

    @Override
    public String toString() {
        return getMetadataInfo();
    }
}

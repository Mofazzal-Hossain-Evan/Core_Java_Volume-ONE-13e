/* Package declaration */
package Image_Metadata_Processor;

/**
 * ImageMetadataTest Class
 * ----------------------
 * থিওরি (বাংলা):
 * ========================
 * - static method fromFile ও fromURL দিয়ে বিভিন্ন সোর্স থেকে
 *   metadata object তৈরি করে।
 * - private validation method validateSource() indirect ভাবে পরীক্ষা হয়।
 * - ভুল ইনপুট দিলে exception দেখানো হয়।
 */
public class ImageMetadataTest {

    public static void main(String[] args) {
        try {
            ImageMetadata photo1 = ImageMetadata.fromFile("C:/Users/evan/Pictures/vacation.jpg");
            System.out.println(photo1.getMetadataInfo());

            ImageMetadata video1 = ImageMetadata.fromFile("/media/videos/movie.mp4");
            System.out.println(video1.getMetadataInfo());

            ImageMetadata photoUrl = ImageMetadata.fromURL("https://example.com/images/sunset.png");
            System.out.println(photoUrl.getMetadataInfo());

            ImageMetadata videoUrl = ImageMetadata.fromURL("https://videos.example.com/clip.avi");
            System.out.println(videoUrl.getMetadataInfo());

            // Invalid source (empty)
            ImageMetadata invalid = ImageMetadata.fromFile("");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        try {
            // Invalid source (no slash or protocol)
            ImageMetadata invalid2 = ImageMetadata.fromURL("invalidsource");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}

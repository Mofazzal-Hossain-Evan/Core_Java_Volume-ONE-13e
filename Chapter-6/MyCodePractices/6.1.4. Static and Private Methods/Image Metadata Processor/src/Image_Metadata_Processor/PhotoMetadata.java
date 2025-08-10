package Image_Metadata_Processor;

public class PhotoMetadata implements ImageMetadata{

    private final  String source;

    public PhotoMetadata(String source) {
        this.source = source;
    }
public String getMetadataInfo(){
    return "Video Metadata from source: " + source;
}

    @Override
    public String toString() {
        return "PhotoMetadata{" +
                "source='" + source + '\'' +
                '}' + getMetadataInfo();
    }
}

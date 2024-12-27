public class ItemLabeler {
    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public static void main(String[] args) {
        Size itemSize1 = Size.SMALL;
        Size itemSize2 = Size.EXTRA_LARGE;
        Size itemSize3 = null;

        String label1 = getLabel(itemSize1);
        String label2 = getLabel(itemSize2);
        String label3 = getLabel(itemSize3);

        System.out.println("Label for " + itemSize1 + ": " + label1);
        System.out.println("Label for " + itemSize2 + ": " + label2);
        System.out.println("Label for null size: " + label3);

    }

        public static String getLabel (Size itemSize){
            return switch (itemSize) {
                case SMALL -> "S";
                case MEDIUM -> "M";
                case LARGE -> "L";
                case EXTRA_LARGE -> "XL";
                case null -> "???";
            };
        }
}

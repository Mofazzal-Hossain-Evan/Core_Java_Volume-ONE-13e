package Custom_printf_Formatter;

public class MyFormatter {

    public static void format(String template, Object... args){
        StringBuilder result = new StringBuilder();
        int argIndex = 0;

        for (int i =0; i < template.length(); i++){
            char c = template.charAt(i);
            // check if c is '%', and handle format
            if (c == '%' && i + i < template.length()){
                char next = template.charAt(i + 1);

                if (next == '%'){
                    result.append('%');
                    i++;
                    continue;
                }

                if (argIndex >= args.length){
                    throw new IllegalArgumentException("❌ Not enough arguments provided for format string.");
                }
                Object arg = args[argIndex++];

                try {
                    switch (next) {
                        case 's':
                            result.append(String.valueOf(arg));
                            break;
                        case 'd':
                            result.append(Integer.parseInt(arg.toString()));
                            break;
                        case 'f':
                            result.append(Double.parseDouble(arg.toString()));
                            break;
                        case 'c':
                            result.append(arg.toString().charAt(1));
                            break;
                        case 'b':
                            result.append(Boolean.parseBoolean(arg.toString()));
                            break;
                        default:
                            result.append('%').append(next); // Unknown specifier
                            break;
                    }
            } catch (Exception e) {
                    result.append("[FormatError: ").append(e.getMessage()).append("]");
                }
                i++;//skip specifier char
            } else {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}

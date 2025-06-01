package Nested_Box_Unpacker;

public class NestedBoxUnpacker {
    public static String unpack(Box<Box<String>> doubleBoxed)

    //Box<Box<String>>	argument-এর টাইপ: একটি Box যার ভিতরে আরেকটি Box আছে.
    // 🔁 Box<Box<String>> মানে কী?
    //তুমি একটা Box-এর ভিতরে আরেকটা Box রাখছো, এবং সেই ভেতরের Box-এর মধ্যে আছে একটা String।
    //দেখো:
    //Box<String> inner = new Box<>("Hello");
    //Box<Box<String>> outer = new Box<>(inner);

    //এখানে:
    //outer.contents() দিলে তুমি পাবে Box<String>
    //আর outer.contents().contents() দিলে পাবে String

    {

        return switch (doubleBoxed){
            case Box(Box(String str)) -> "📦 Unboxed value: " + str;
            case Box(null) ->  "⚠️ Inner box is null!";
            case  null -> "❌ Outer box is null!";
    };
    }

    public static void main(String[] args) {
        Box<Box<String>> case1 = new Box<>(new Box<>("Surprise!"));
        Box<Box<String>> case2 = new Box<>(null);
        Box<Box<String>> case3 = null;

        System.out.println(unpack(case1));
        System.out.println(unpack(case2));
        System.out.println(unpack(case3));
    }
}

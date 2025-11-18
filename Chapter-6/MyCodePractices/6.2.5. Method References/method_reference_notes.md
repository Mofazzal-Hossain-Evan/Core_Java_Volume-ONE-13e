# Method Reference -- সহজ বাংলায় ব্যাখ্যা

## ১) Method Reference --- এটা আসলে কী?

ল্যাম্বডা এক্সপ্রেশন অনেক সময় শুধু একটি মেথড কল করে। যেমন:

``` java
event -> System.out.println(event)
```

এটার Method Reference:

``` java
System.out::println
```

------------------------------------------------------------------------

## ২) কবে Method Reference ব্যবহার করা যায়?

যখন ল্যাম্বডা শুধুমাত্র **একটি মেথড কল** করে এবং অতিরিক্ত কোনো কাজ নেই।

------------------------------------------------------------------------

## ৩) কেন Method Reference?

কোড ছোট, পরিষ্কার এবং readable হয়।

``` java
var timer = new Timer(1000, event -> System.out.println(event));
```

পরিবর্তিত রূপ:

``` java
var timer = new Timer(1000, System.out::println);
```

------------------------------------------------------------------------

## ৪) এটা কীভাবে কাজ করে?

Method Reference = Functional Interface এর জায়গায় রাখা যায় এমন একটি
shortcut।

Java এটাকে সেই interface এর instance এ রূপান্তর করে।

------------------------------------------------------------------------

## ৫) Method Reference এর তিন ধরন

### ✔️ object::instanceMethod

``` java
System.out::println
```

### ✔️ Class::instanceMethod

``` java
String::compareToIgnoreCase
```

### ✔️ Class::staticMethod

``` java
Math::pow
```

------------------------------------------------------------------------

## ৬) overloaded মেথড থাকলে?

Java context দেখে ঠিক version বেছে নেয়।

------------------------------------------------------------------------

## ৭) রূপান্তরযোগ্য নয় এমন example

``` java
s -> s.length() == 0
```

এখানে extra logic আছে → Method Reference সম্ভব নয়।

------------------------------------------------------------------------

## ৮) Objects::isNull

``` java
list.removeIf(Objects::isNull);
```

Equivalent:

``` java
list.removeIf(x -> x == null);
```

------------------------------------------------------------------------

## ৯) null নিয়ে সতর্কতা

### ❌ separator::equals → separator null হলে সাথে সাথে error

### ✔️ x -\> separator.equals(x) → error runtime এ

------------------------------------------------------------------------

## ১০) this::method এবং super::method

``` java
this::equals
super::greet
```

------------------------------------------------------------------------

## ✔️ সারাংশ

-   Single method call হলে Method Reference ব্যবহার করা যায়\
-   Functional Interface এর সাথে auto-convert হয়\
-   তিন ধরণের রূপ আছে\
-   overloaded হলে Java সঠিকটি বেছে নেয়\
-   Extra logic থাকলে lambda ব্যবহার করতে হয়

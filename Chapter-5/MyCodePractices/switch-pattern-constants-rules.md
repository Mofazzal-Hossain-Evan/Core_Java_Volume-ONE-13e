# 🧠 মূল নিয়মগুলো মনে রাখো (Switch Pattern Matching with Constants)

## ❌ ভুল নিয়ম ও কারণ

| ভুল নিয়ম                         | কারণ                                                   |
|----------------------------------|--------------------------------------------------------|
| `case 0` যখন selector = `Object` | `0` কেবল `int`/`Integer` টাইপে বৈধ                    |
| `case ""` যখন selector = `Object`| String constant pattern কেবল `String` selector-এ      |
| `case Point(0, y)`              | Record pattern-এর ভিতরে constant match নিষিদ্ধ        |

---

## ✅ ঠিক নিয়ম ও শর্ত

| ঠিক নিয়ম                             | শর্ত                                                                |
|--------------------------------------|----------------------------------------------------------------------|
| `case Integer i when i == 0`         | Guard (`when`) ব্যবহার করে constant check                           |
| `case String s when s.isEmpty()`     | একইভাবে guard দিয়ে string check                                    |
| `case DayOfWeek.FRIDAY`              | Enum constant সবসময় বৈধ যদি selector enum টাইপ বা তার supertype হয় |
| `case Point(x, y) when x == 0`       | Record pattern + guard = OK                                         |

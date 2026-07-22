# Date and Time in Java

## Getting the current date and time with the system's time zone

```java
ZonedDateTime currentDateTime = ZonedDateTime.now();
System.out.println("Date and time from the system: " + currentDateTime);
```

<p>By instantiating <code>ZonedDateTime.now()</code>, we can get the current date, time, and time zone from the machine.</p>

---

## Getting the date and time from another time zone

```java
ZonedDateTime dateTimeLA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
System.out.println(dateTimeLA);
```

<p>Using <code>ZoneId.of()</code>, we can get the current date and time from any supported time zone, such as <code>"America/Los_Angeles"</code> or <code>"Asia/Tokyo"</code>.</p>

---

## Converting a date and time to another time zone

```java
ZonedDateTime londonDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
System.out.println("The date and time in London: " + londonDateTime);
```

<p>Using <code>withZoneSameInstant()</code>, we can convert the same instant in time to another time zone.</p>

---

## Creating a date and time manually

```java
LocalDateTime birthday = LocalDateTime.of(1969, 7, 22, 14, 15);
System.out.println("Date of the person: " + birthday);
```

<p>With <code>LocalDateTime.of()</code>, we can manually create a date and time.</p>

---

## Formatting the date and time

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
String formattedDate = birthday.format(formatter);
System.out.println("Formatted date: " + formattedDate);
```

<p><code>DateTimeFormatter</code> allows us to display the date and time in different formats. In this example, the output uses the Brazilian format.</p>
# Date in Java

## Getting the current date

```java
LocalDate date = LocalDate.now();
System.err.println("Hello, you are running this code in the day :" + date);
```

<p>instantiating the class LocalDate.now(); we can get the current date from your machine.</p>

---

## Setting the date manually

```java
LocalDate BirthDate = LocalDate.of(2009, Month.OCTOBER, 23);
System.err.println("David´s birthday is :" + BirthDate);
```

<p>With this instantiating you can change the date manually</p>

---

## ADDING dates

```java
LocalDate Advice = date.plusWeeks(13);
System.err.println("Future date" + Advice);
```

<p></p>

---

## Subtracting dates

```java
LocalDate Subtractrion = date.minusWeeks(3);
System.err.print(Subtractrion);
```
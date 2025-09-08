# Övning 2

### Task 2
- Indamon (klasser)
- Klass, fält, konstruktor
- Variable shadowing

### Diskussion
- Vad är en klass?
    - Vad är ett fält / attribut?
    - Vad är en Metod?
    - Vad är en konstruktor?
    - Vad är en instans eller objekt?
    - Hur ska man tolka punkten "." i:
    ```java 
    indamon.heal(10);
    ```

### Presentation

### Lektion
- if-satser
    - Boolean datatypen?
- Debugging
    - Errors
    - Se Error.java

```java
int pin = 1235

if (pin == 1234){
    System.out.println("Logged in");
} else {
    System.out.println("Du är en skurk! >:(");
}
```

```java
public int absoluteValue(int n){
    if (n > 0){
        return n;
    } else if (n < 0){
        return -n;
    } else {
        return 0;
    }
}
```

### Uppgifter
Debugging:
Öppna filen DebugTest.java kör den med javac && java, läs errormedellandet, korrigera felen och försök få filen att köra som den ska!
- Syntax fel
- Logiska fel
- Stilfel

### Avslutande
Köra flera fider samtidigt?
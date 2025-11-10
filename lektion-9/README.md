# Lektion 9

### Task 9
- Testing 
- Refactor

### Diskussion
- Hjälpte testerna dig?
- Vad gjorde ni för optimeringar
- Vad innebär test driven development
- Vad är fördelarna med refaktorering

### Presentation
- inverse
    - Hur funkar miniräknar klassen?
    - Hur fungerar inverse?
    - Skrev du testerna eller koden först?
    - Vad var fördelarna/nackdelarna med det?
- sieves
    - Hur fungerar algoritmen
    - Hur säkerställer du att rätt exceptions kastas
- Refactoring & Optimization
    - Vad är refaktorering
    - När är det lämpligt
    - Förklara primecache optimeringen av sieves

### Lektion
- Rekursion:
Vad händer här?
```java
public void func() {
    System.out.println("hej");
    func();
}
```
Hur skriver vi detta som kod?

$$
f(n) =
\begin{cases}
1 & \text{if } n = 0 \\
f(n - 1) + n & \text{if } n > 0
\end{cases}
$$

Svårare exempel

$$
fib(n) =
\begin{cases}
1 & \text{if } n = 0 \\
1 & \text{if } n = 1 \\
fib(n - 1) + fib(n - 2) & \text{if } n \geq 1
\end{cases}
$$

### PAUS

### Övningar
- Implementera fakultet iterativt 
```java
public static int factorial(int n) {/* ... */}
```
- Implementera den igen men rekursivt

- Implementera en palindrom-checker som kollar om en array av integers är palindrom eller inte.
Använd hjälpmetoden `palindromeHelper`för att utföra rekursionen
```java
public static boolean palindrome(int[] array) {
    return palindromeHelper(array, 0, array.length - 1)
}

public static boolean palindromeHelper(int[] array, int left, int right) {/* ... */}
// Vad blir basfallet???
```

### Gå igenom nästa task (15 min)
- Vad ska de göra?
- Vad är det för ämnen och varför är de användbara
    - Rekursion!

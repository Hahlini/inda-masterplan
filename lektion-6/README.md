# Lektion 6

### Task 6
- Random
- Inheritance

### Ämnen
- Random
- Ternary operator
- Debugging
- Deep copies
- Iterators
- Inheritance

### Diskussion
- Vad är ```Random``` för något?
- Vilka nummer kan variabeln value anta i koden nedan?
```java
Random rng = new Random();
int value = rng.nextInt(6);
```
- Vilka nummer kan variabeln value anta i koden nedan? (leta i dokumentationen i uppgiftsbeskrivningen om ni är osäkra)
```java
Random rng = new Random();
int value = rng.nextInt();
```
- Vad skiljer en if-sats från en ternary operator?
- Vad kommer variabeln ```value``` ha för värde?
```java
int value = false ? 42 : 420;
```
- När är det praktiskt att göra en deep copy?
- Vad innebär det att skriva ```extends``` på en klass som nedan?
```java
public class BiasedDice extends Dice { // New keyword: 'extends'
    // Class code goes here
}
```

### Redovisningar
1. Task 6.0 - 6.3
   - Vad är ```Random``` för något? 
   - Vad är en deep copy?
3. Task 6.4 - 6.6
   - Vad innebär det när det står ```ArrayList<Dice>```?
4. Task 6.7 - 6.9
   - Vad var fördelen med att använda ```extends``` över att använda den vanliga klassen?
   - Tror du att det hade gått att göra samma sak i 6.8 utan en ```iterator```?
   - Varför kan du inte bara kalla ```System.out.println(new Dice());``` för att skriva ut värdet?

### Lektion
- Om String.split() behöver vi gå igenom regex
- Hashmap

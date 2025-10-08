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
- Vilka nummer kan variaberna `x` och `y` anta i koden nedan? <br>
(leta i dokumentationen i uppgiftsbeskrivningen om ni är osäkra)
```java
Random rng = new Random();
int x = rng.nextInt(6);
int y = rng.nextInt();
```
- Vad skiljer en if-sats från en ternary operator?
- Vad blir `int x = x < 0 ? -x : x`?
- När är det praktiskt att göra en deep/shallow copy?
- Vad innebär det att skriva ```extends``` på en klass som nedan?
```java
public class BiasedDice extends Dice { // New keyword: 'extends'
    // Class code goes here
}
``` 
- Kan ni komma på verkliga saker som kan modeleras som subklass och superklass?

### Redovisningar
1. Task 6.0 - 6.2
    - Vad är ```Random``` för något? 
    - Vad är en deep copy?
    - Kan du motivera att din shuffle faktiskt är random?
    - Hur vet du att antalet utfall för random.NextInt() är det du säger? 
2. Task 6.3 - 6.6
    - Hur designade du Dice klassen?
    - Vad innebär det när det står ```ArrayList<Dice>```?
    - Returnerar din shuffle en shallow eller deep copy?
```java
ArrayList<Integer> array; // En ArrayList som innehåller några element
ArrayList<Integer> copy = shuffle(array);
```
3. Task 6.7 - 6.9
    - Vad var fördelen med att använda ```extends``` över att använda den vanliga klassen?
    - Vilket problem löser en Iterator i remove()? 
    - Varför kan du inte bara kalla ```System.out.println(new Dice());``` för att skriva ut värdet?

### Lektion
- Vad printas innan man gjort en toString()?
    - Var kommer det ifrån?
    - Är `Dice` en subklass till något?
- Köra filer genom `java Main \<input>` (String[] args)
    - Vad betyder allt i Main metod headern? `public static void main(String[] args)`?
    - Vad fan är args för något?
    - IsEven.java

### Uppgift
Gör ett rollspelstärnings program:
java DnDdice 2d6 -> Rullar 2 6-sidiga tärningar och summerar resultaten.
java DnDdice 1d20 -> Rullar en 20 sidig tärning och returnerar resultatet.
- Implementera XdY som rullar x tärningar med y sidor
- Implementera XdY+AdB som returnerar summan av XdY och AdB om man vill rulla olika sorters tärningar samtidigt.
- Implementera XdY+AdB+C så att man kan addera ett konstant värde C: java DnDdice 2d6+3 -> 2 d6:or + 3;
- Implementera så att man kan skriva flera uttryck samtidigt: 
    java DnDdice 2d6+3 2d20 -> printar först resultatet av 2d6+3 sedan 2d20 

### Avslutningsvis
- HashMap
    - Telefonkatalog.java


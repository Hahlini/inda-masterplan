# Övning 5

### Task 5
- Arrays
- Lists
- Static

### Ämnen
- Inheritance 
- Random - andra biblotek
- Testning
- Iterator
- Kopior?


### Diskussion
- Vad är en Array?
- Vad är en List?
- Vad är en ArrayList?
- Vad är egentligen skillnaden på Lists och ArrayLists? 
- Vad är egentligen skillnaden på arrayer och ArrayLists? 
- Vad betyder static?
- Vad händer i en for-each loop?
```java
public class ForEachLoop {
  public static void main(String[] args) {
    String[] people = ["Isak", "Johan", "Carl-Johan"];

    for (String person : people) {
      System.out.println("Hi " + person + "!")
    }
  }
}
```
- Vad betyder det när en datatyp har ```<>``` efter sig som exemplet nedan?
```java
ArrayList<Integer> numberList = new ArrayList<>();
```

### Redovisningar
Dela in i tre grupper, be dem sätta sig två och två. Varje del av rummet får spana in en delmängd av uppgiften. De får fem minuter för detta.

1. Arrays 5.0 - 5.3
  - Vad är funktion overloading?
  - Hur vet du att funktionerna kommer returnera korrekt?
  - Var är Integer.MAX_VALUE för något?
    - Vad används den till?
2. Arrays 5.4 - 5.5
  - Hur vet du att funktionerna kommer returnera korrekt?
  - Varför ska man returnera en kopia av arrayen?
  - Arrayer kan inte ändra storlek, vad kan det orsaka för svårigheter?
3. Set Theory 5.6 - 5.11
  - Kan du motivera att dessa edgecases kommer funka korrekt?
    U = universum
    Ø = tomma mängden
    A ⋃ U = U
    A ⋃ Ø = Ø
    A ⋂ U = A
    A ⋂ Ø = Ø
  - Vad är fördelen med att använda ArrayLists här?

### Lektion

* Gå igenom subklasser
  * Skriv upp 'katt', 'hund', 'kanin' - Hur hade du gjort klasser av dem? Få dem att skriva ut metoder och fält
  * Vad har de gemensamt?
    * Kodduplicering!
  * Alternativ: Subklasser!
  * Vi skapar en 'djur'-klass
  * Livekoda den?
* Random - Livekoda en liten coin toss grej

### Övning
* Gå igenom olika metoderna i MyArrayList.java
  * `add(int value)`
  * `get(int index)`
  * `set(int index, int value)`
  * `size()`
  * `contains(int value)`
  * `print()`

1. Gör klart MyArrayList.java

### Avslutning
* Se passbyvalue



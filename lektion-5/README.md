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

* Se passbyvalue

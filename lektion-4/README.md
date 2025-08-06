# Övning 4

### Task 4
- Loopar
- JShell
- Boolean expressions

### Ämnen
- Arrays
- ArrayList
- For each
- static
- Feng shuie (kodstil)


### Discussion


### Lektion
- Förklara en array. Gärna med visuellt exempel
```java
// ...          [0][1][2][3]
int[] siffror = {1, 5, 8, 9};
System.out.println(siffror[3]);
// Prints 8 eller 9? 
// ...
```
- Vad kommer skrivas till terminalen i koden ovan?

- Förklara sedan vad som gör en arraylist annourlunda. Dvs. att det är ett större object skapat för att hantera arrayer. 
```java
// ... Integer???
ArrayList<Integer> arrayList= new ArrayList<>();
arrayList.add(1); // [0]
arrayList.add(5); // [1]
arrayList.add(8); // [2]
arrayList.add(9); // [3]
arrayList.set(3, 7) // ?

System.out.println(siffror.get(3));
// Prints 8 eller 9? 
```

- Diskutera skillnaderna
    - Vad är skillnaden på en Array och en ArrayList?
    - Vad har de för för- och nackdelar?
    - När är det lämpligt att använda den ena eller den andra?

### Uppgift
- Hälsa på listan! (Greet)
```java
public class Greet {
    private static final String[] PEOPLE = {"Bosse", "Hjalmar", "Big Ed", "Elsa", "Anna", "Samira", "Johan", "Isak"};

    static void greetPeople(String[] list){
        // Print "Hello <name>! You look happy today :)" or something similar
        // for each name in the list
        // Hint: Consider using the loops you've learned about
    }

    public static void main(String[] args) {
        greetPeople(PEOPLE);
    }
    
}
```

### Slutligen
Användbar loop! (for each)
```java
// List: {4, 5, 3, 10, 2}
for (int element : list){
    System.out.println(element);
}
// Printar:
// 4
// 5
// 3
// 10
// 2
```
# inda-masterplan

## Lektionsupplägg

### Diskussion (10 min)
- Kan ni komma på några exempel på Stack:ar från verkligheten? (till exempel en hög med tallrikar)
- Kan man skapa en instans av ett interface? Varför / Varför inte?
- Vad innebär det när man "pushar ett värde till stacken"? Vad är tidskomplexiteten av att göra den här operationen?
- Hur var det att arbeta med er egen tidigare kod för den här tasken? Skapade det några nya problem för er i implementationen? Eller gjorde det uppgiften lättare? Om så var fallet: varför tror du det blev så?

### Presentation av lösningar (15 min)
- Tester
- 15.1-15.2
- 15.3

### PAUS

### Lektion
- Grafer
    - Exempel
        - Vägar mellan städer (Google Maps)
        - Avloppssystem, begränsat flöde genom varje kant och nod
        - Kontaktnät (Facebook)
    - Formellt
        - Noder och kanter
        - Grannar / Neighbors / Adjacent: Noder kopplade till noden vi fokuserar på
        - Grad / Degree: Antal grannar
        - Gles (Sparse) graf vs Tät (Dense) graf vs Fully connected
    - Implementation
        - Adjacency matrix
            - Pros: add/remove/check edge är snabbt, passar för fixed dense grafer
            - Cons: Långsamt add/remove nod, modellerar alla kanter vilket är slösaktigt för sparse grafer, passar ej för dynamiska sparse grafer.
            - 2D arrays
        - Adjacency list
            - Pros: Platseffektivt, bra för dynamiska sparse grafer, snabb add vertex och edge
            - Cons: Långsam för remove vertex, remove edge och test adjacency
            - Arrays, linkedlists eller hashtable
        - Operations
| Operation              | Adjacency Matrix | Adjacency List |
|------------------------|------------------|----------------|
| Storage cost           | O(V²)            | O(V + E)       |
| addVertex(G, v, w)     | O(V²)            | O(1)           |
| removeVertex(G, v)     | O(V²)            | O(E)           |
| addEdge(G, v, w)       | O(1)             | O(1)           |
| removeEdge(G, v, w)    | O(1)             | O(V)           |
| adjacent(G, v, w)      | O(1)             | O(V)           |
- Markdownformatering - fungerar ej som Docs
    - Line breaks
    - Listor
    - Tabeller


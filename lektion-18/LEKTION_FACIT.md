- Grafer
    - Exempel
        - Vägar mellan städer (Google Maps)
        - Avloppssystem, begränsat flöde genom varje kant och nod
        - Kontaktnät (Facebook)
        - Neurala nätverk (Maskininlärning)
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
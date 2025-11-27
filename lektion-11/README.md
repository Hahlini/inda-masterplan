## Lektionsupplägg

### Diskussion (10 min)
Diskutera i grupper om 3-4
- Vad är Comparable för typ? Vad gör den typen?
- Vad testar testet nedan?
```java
@Test
public void unknownTest() {
    for (int n = -10; n <= 10; n++) {
        assertThat(arithmetic.difference(n, 0), equalTo(n));
    }
}
```
- Välj en av sorteringsalgoritmerna insertion sort och selection sort. Förklara i breda drag hur den algoritm ni valt fungerar
- Förklara i breda drag hur sequential search skiljer sig från binary search
    - Hur skiljer de sig i tidskomplexitet? (är de lika snabba att köra?)
    - Hur skiljer de sig i minneskomplexitet? (tar de lika mycket minne att köra?)

### Presentation av lösningar (15 min)
- 11.1 & 11.2
- 11.3 & 11.4
- Testing

### PAUS

### Lektion


### Övningar! (30 min)
- Klura på övningar i par (i de flesta fallen)
- Kanske diskutera det i helgrupper

### Gå igenom nästa task (15 min)
- Vad ska de göra?
- Vad är det för ämnen och varför är de användbara

### Veckans något-kul-på-slutet
- Veckans kodnyheter?

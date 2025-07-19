
# Teoria: Introduzione agli array in Java

## 🔍 Perché servono gli array?

Quando dobbiamo memorizzare più valori dello stesso tipo (es. i voti di 10 studenti), dichiarare 10 variabili diverse è inefficiente e poco scalabile. Gli **array** ci permettono di:

* Memorizzare **dati omogenei** (tutti dello stesso tipo)
* Gestire insiemi di dati di **quantità nota**
* Accedere ai valori con un **indice numerico**

---

## 📌 Definizione

Un **array** è una **struttura dati indicizzata** che contiene una sequenza di valori **dello stesso tipo**.
In Java:

* Ha una **lunghezza fissa** (non può cambiare dopo l'inizializzazione)
* Gli elementi sono numerati a partire da **indice 0**

---

## 🧱 Sintassi base

```java
// dichiarazione
int[] numeri;

// allocazione
numeri = new int[5]; // crea un array di 5 interi

// combinata
int[] numeri = new int[5];

// assegnazione
numeri[0] = 7;
numeri[1] = 10;

// accesso
System.out.println(numeri[0]); // stampa 7
```

---

## 💡 Schema logico testuale

```
1. Dichiarare l'array
2. Decidere la dimensione
3. Creare un ciclo (es. do-while) per chiedere n input
4. Inserire ogni input nella posizione corretta
5. Accedere/stampare i valori con l'indice
```

---

## 🧠 Array e memoria (stack e heap)

Quando in Java dichiari un array con `new`, la memoria viene suddivisa tra **stack** e **heap**:

```java
int[] numeri = new int[5];
```

### 🗂️ Rappresentazione della memoria

```
// Dichiarazione
int[] numeri = new int[5];

// Memoria

+------------------+       +----------------------------+
|      Stack       |       |           Heap             |
+------------------+       +----------------------------+
| numeri ----------+-----> | [0] 0                      |
|                  |       | [1] 0                      |
|                  |       | [2] 0                      |
|                  |       | [3] 0                      |
|                  |       | [4] 0                      |
+------------------+       +----------------------------+

Legenda:
- La variabile `numeri` nello stack contiene un riferimento (freccia)
- L’array `new int[5]` vive nello heap, inizializzato con zeri
```

Ogni elemento viene inizializzato con il valore **predefinito** del tipo:

* `int` → 0
* `double` → 0.0
* `boolean` → false
* `char` → '\u0000'

---

## 📘 Esempio completo con input e stampa

```java
import java.util.Scanner;

public class LetturaArray {
    public void esegui() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();

        int[] numeri = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < n);

        System.out.println("Hai inserito:");
        i = 0;
        do {
            System.out.println(numeri[i]);
            i++;
        } while (i < n);
    }
}
```

---

## 🧪 Test JUnit dell'esempio

```java
import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class LetturaArrayTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testEseguiConInputValido() {
        String simulatedInput = "3
10
20
30
";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        LetturaArray programma = new LetturaArray();
        programma.esegui();

        String output = outContent.toString();
        assertTrue(output.contains("Hai inserito:"));
        assertTrue(output.contains("10"));
        assertTrue(output.contains("20"));
        assertTrue(output.contains("30"));
    }
}
```

## ✅ Conclusione

Gli array sono fondamentali per:

* Evitare codice duplicato
* Strutturare i dati in modo ordinato e indicizzato
* Preparare il terreno per algoritmi più avanzati (ricerca, ordinamento, ecc.)

L’uso di `do-while` permette di acquisire input **in modo controllato**, anche su array.

**Nelle prossime lezioni introdurremo i cicli ****`for`**** e il for-each per semplificare l’accesso.**

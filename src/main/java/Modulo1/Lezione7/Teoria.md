# 🔄 Il ciclo `for` classico

## ✍️ Introduzione

Il ciclo `for` in Java è una struttura di controllo iterativa **a conteggio**. È utile quando sappiamo **quante volte** vogliamo ripetere un'azione, o quando dobbiamo **controllare manualmente l’indice** della ripetizione.

---

## 🧱 Sintassi generale

```java
for (inizializzazione; condizione; aggiornamento) {
    // corpo del ciclo
}
```

* **inizializzazione**: eseguita una volta sola (es. `int i = 0`)
* **condizione**: valutata prima di ogni iterazione (es. `i < 5`)
* **aggiornamento**: eseguito alla fine di ogni iterazione (es. `i++`)

---

## 💡 Esempio semplice

```java
for (int i = 0; i < 3; i++) {
    System.out.println("Valore di i: " + i);
}
```

🔎 Output:

```
Valore di i: 0
Valore di i: 1
Valore di i: 2
```

---

## 🔁 Confronto tra cicli

| Aspetto          | `do-while`                                | `for` classico                | `for-each`                          |
| ---------------- | ----------------------------------------- | ----------------------------- | ----------------------------------- |
| Tipo             | Post-condizionale                         | Controllo a contatore         | Iterazione automatica su collezioni |
| Uso              | Quando l’azione va fatta almeno una volta | Quando serve gestire l’indice | Quando voglio solo leggere i valori |
| Controllo indice | Manuale (interno)                         | Manuale (esplicito)           | Non disponibile                     |
| Array            | ✓                                         | ✓                             | ✓                                   |
| Lettura input    | ✓                                         | ✓                             | ✗ (non utile con `Scanner`)         |

---

## 🧩 Quando usare `for` classico

Il ciclo `for` classico è preferibile quando:

* Dobbiamo **accedere a elementi con posizione** (indice `i`)
* Vogliamo **saltare** o **modificare** posizioni specifiche
* Serve **aggiornare solo alcune posizioni** di un array

---

## 🧠 Schema logico testuale

```
1. Inizializza contatore (i = 0)
2. Verifica condizione (i < lunghezza)
3. Se vera:
   a. Esegui operazione su array[i]
   b. Aggiorna indice (i++)
4. Ripeti dal punto 2
```

---

## 🗂️ Schema grafico testuale – Scansione di un array con `for`

```text
int[] numeri = {5, 8, 12};

//      i     valori[i]
        ↓
Step 1: i=0 → numeri[0] = 5   → Esegui operazione
        ↑
        |
        +--> i++

        ↓
Step 2: i=1 → numeri[1] = 8   → Esegui operazione
        ↑
        |
        +--> i++

        ↓
Step 3: i=2 → numeri[2] = 12  → Esegui operazione
        ↑
        |
        +--> i++

        ↓
Step 4: i=3 → condizione i < 3 → FALSE → Esci dal ciclo
```

---

## 📘 Esempio completo

```java
import java.util.Scanner;

public class ControlloPari {
    public void stampaPari() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri? ");
        int n = input.nextInt();
        int[] numeri = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
        }

        System.out.println("Numeri pari:");
        for (int i = 0; i < n; i++) {
            if (numeri[i] % 2 == 0) {
                System.out.println(numeri[i]);
            }
        }
    }
}
```

---

## 🧪 Test JUnit

```java
import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ControlloPariTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testStampaPari() {
        String input = "5\n1\n2\n3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ControlloPari c = new ControlloPari();
        c.stampaPari();

        String output = outContent.toString();
        assertTrue(output.contains("2"));
        assertTrue(output.contains("4"));
        assertFalse(output.contains("1"));
    }
}
```

---

## ✅ Conclusione

Il ciclo `for` classico è fondamentale per:

* Gestire indici manualmente
* Applicare trasformazioni selettive su array
* Preparare algoritmi più avanzati (ricerca, ordinamento, ecc.)


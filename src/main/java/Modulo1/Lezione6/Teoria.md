# Lezione 6 – Teoria: Scansione di array con `for-each`

## 🔍 Perché usare il ciclo `for-each`?

Quando vogliamo **leggere tutti gli elementi di un array**, spesso non ci interessa l'indice, ma solo il valore. In questi casi, il ciclo `for-each` è la soluzione ideale:

* È **più leggibile** e compatto
* Riduce il rischio di errori con l’indice
* È particolarmente utile per **stampare** o **analizzare** i valori di un array

---

## 📌 Sintassi del ciclo `for-each`

```java
for (tipo variabile : array) {
    // blocco di istruzioni
}
```

* `tipo` → il tipo degli elementi dell’array
* `variabile` → un nome temporaneo per ciascun elemento
* `array` → la struttura da scansionare

---

## 🧠 Schema testuale del funzionamento di `for-each`

```
Array dichiarato:
int[] numeri = {3, 5, 7};

Memoria (semplificata):
+--------+--------+--------+
| [0] 3  | [1] 5  | [2] 7  |
+--------+--------+--------+

Esecuzione del ciclo:

for (int n : numeri) {
    System.out.println(n);
}

Passaggi logici:
┌──────────────┐
│ n = 3        │ → stampa "3"
│ n = 5        │ → stampa "5"
│ n = 7        │ → stampa "7"
└──────────────┘

Nota: la variabile `n` assume il valore di ogni elemento,
      ma NON si può usare per modificare il contenuto dell’array.
```

---

## 📘 Esempio completo con input

```java
import java.util.Scanner;

public class ForEachDemo {
    public void esegui() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();

        int[] valori = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci valore " + (i + 1) + ": ");
            valori[i] = input.nextInt();
            i++;
        } while (i < n);

        System.out.println("Valori inseriti:");
        for (int v : valori) {
            System.out.println(v);
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

public class ForEachDemoTest {
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testEsegui() {
        String inputSimulato = "3\n10\n20\n30\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        ForEachDemo demo = new ForEachDemo();
        demo.esegui();

        String output = outContent.toString();
        assertTrue(output.contains("10"));
        assertTrue(output.contains("20"));
        assertTrue(output.contains("30"));
    }
}
```

---

✅ Il ciclo `for-each` è uno strumento potente per esplorare i dati contenuti in un array in modo semplice, leggibile e sicuro.


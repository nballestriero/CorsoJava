# Lezione teorica – Il ciclo `do-while` per il controllo dell'input

## 🔍 Introduzione

Il ciclo `do-while` permette di **ripetere un blocco di istruzioni almeno una volta** e poi continuare a ripeterlo **finché una condizione è vera**.

È particolarmente utile quando si vuole **acquisire un input da tastiera e verificarne la validità**, ripetendo la richiesta finché l'utente non fornisce un dato corretto.

---

## 🔁 Sintassi del ciclo `do-while`

```java
do {
    // istruzioni da eseguire
} while (condizione);
```

* Le istruzioni vengono **eseguite almeno una volta**, anche se la condizione è falsa fin dall'inizio.
* La **condizione viene valutata alla fine** di ogni ciclo.

---

## 💡 Esempio: controllo su un numero positivo

```java
import java.util.Scanner;

public class InserimentoPositivo {
    public void leggiNumero() {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Inserisci un numero positivo: ");
            numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("Numero non valido. Riprova.");
            }
        } while (numero <= 0);

        System.out.println("Hai inserito: " + numero);
    }
}
```

---

## 🧠 Schema logico testuale

```
1. Inizio
2. Esegui blocco:
    - chiedi input
    - verifica con if
3. Verifica condizione:
    - se vera: torna al punto 2
    - se falsa: esci dal ciclo
4. Fine
```

---

## ✅ Test JUnit dell’esempio

```java
import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class InserimentoPositivoTest {
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
    void testInputNegativoSeguitoDaValido() {
        String input = "-4\n0\n7\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new InserimentoPositivo().leggiNumero();

        String output = outContent.toString();
        assertTrue(output.contains("Hai inserito: 7"));
        assertTrue(output.contains("Numero non valido"));
    }
}
```

---

## 📌 Conclusione

Il ciclo `do-while` è ideale per:

* acquisire input **obbligatorio** e **validarlo**
* controllare la correttezza dell'input con un `if`
* evitare codice duplicato e richieste multiple

Costituisce la base per costruire interfacce utente testuali più robuste, come **menu interattivi**, **login**, **scelte numeriche con vincoli**, ecc.


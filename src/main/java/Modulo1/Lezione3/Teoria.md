# Lezione completa – Strutture di controllo `if` in Java

## 🔍 Introduzione

Il costrutto `if` consente a un programma di **eseguire istruzioni solo se una condizione è vera**.
È la base per introdurre il concetto di **flusso condizionale**, ovvero la possibilità di reagire a input diversi in modo differenziato.

---

## 🔢 Forme principali del costrutto `if`

### 1. `if` semplice

```java
if (condizione) {
    // istruzioni eseguite se la condizione è vera
}
```

📌 Esempio:

```java
int eta = 20;
if (eta >= 18) {
    System.out.println("Sei maggiorenne.");
}
```

---

### 2. `if` con ramo `else`

```java
if (condizione) {
    // eseguito se vero
} else {
    // eseguito se falso
}
```

📌 Esempio:

```java
int numero = -3;
if (numero > 0) {
    System.out.println("Numero positivo");
} else {
    System.out.println("Numero negativo o nullo");
}
```

---

### 3. `if - else if - else`

```java
if (condizione1) {
    // eseguito se condizione1 è vera
} else if (condizione2) {
    // eseguito se condizione2 è vera
} else {
    // eseguito se nessuna delle precedenti è vera
}
```

📌 Esempio:

```java
int voto = 7;
if (voto >= 9) {
    System.out.println("Ottimo");
} else if (voto >= 6) {
    System.out.println("Sufficiente");
} else {
    System.out.println("Insufficiente");
}
```

---

## 🔄 Schema logico testuale

```
1. IF semplice
   [condizione]
       |
     true  ---> [esegui blocco]
       |
     false ---> [salta blocco]

2. IF-ELSE
   [condizione]
       |
   └── true ---> [blocco1]
       |
   └── false ---> [blocco2]

3. IF-ELSE IF-ELSE
   [condizione1]
       |
     true ---> [blocco1]
       |
     false
        |
   [condizione2]
       |
     true ---> [blocco2]
       |
     false ---> [blocco finale]
```

---

## 🧪 Esempio completo con Scanner

```java
import java.util.Scanner;

public class VerificaEta {
    public void controllaEta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();

        if (eta >= 18) {
            System.out.println("Accesso consentito");
        } else {
            System.out.println("Accesso negato");
        }
    }
}
```

---

## ✅ Test JUnit per l'esempio

```java
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class VerificaEtaTest {
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
    void testAccessoConsentito() {
        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new VerificaEta().controllaEta();

        String output = outContent.toString();
        assertTrue(output.contains("Accesso consentito"));
    }

    @Test
    void testAccessoNegato() {
        String input = "15\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new VerificaEta().controllaEta();

        String output = outContent.toString();
        assertTrue(output.contains("Accesso negato"));
    }
}
```

---

## 📌 Conclusione

Questa lezione introduce:

* il **costrutto if** e le sue varianti `else`, `else if`
* la **valutazione di condizioni** con operatori logici e relazionali
* il **controllo dell’input da tastiera** con `Scanner`
* la **validazione** di input e la **risposta condizionata**

Costituisce la base ideale per affrontare, nella lezione successiva, il **ciclo `do-while`** per la ripetizione dell’input fino a inserimento corretto.


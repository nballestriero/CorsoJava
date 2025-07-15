# 🧪 Esercizi – Classe Scanner e Input

## 🧪 Esercizio 1 – Saluto personalizzato

**Obiettivo**: Creare un programma che legga il nome dell'utente e lo saluti in modo personalizzato.

**Consegna**:

1. Scrivere una classe `Esercizio1` con un metodo `salutaUtente()` che:
   * Legge da tastiera il nome dell’utente (con `nextLine()`)
   * Stampa a video `Ciao, <nome>!`

**Test JUnit**:

* Simula l’input con un nome a scelta
* Verifica che il messaggio di saluto venga stampato correttamente

---

## 🔄 Esercizio 2 – Somma di due interi

**Obiettivo**: Sviluppare un programma che legga due numeri interi e ne calcoli la somma.

**Consegna**:

1. Scrivere una classe `Esercizio2` con un metodo `somma()` che:
   * Legge due numeri interi da tastiera (con `nextInt()`)
   * Stampa la loro somma

**Test JUnit**:

* Simula input `4` e `5`
* Verifica che l’output contenga `La somma è: 9`

---

## 🧮 Esercizio 3 – Verifica maggiorenne

**Obiettivo**: Creare un programma che verifichi se una persona è maggiorenne o minorenne.

**Consegna**:

1. Scrivere una classe `Esercizio3` con un metodo `verifica()` che:
   * Chiede l’età all’utente
   * Stampa `Sei maggiorenne` se >=18, altrimenti `Sei minorenne`

**Test JUnit**:

* Simula input `17` e `20`
* Verifica che l’output sia coerente con l’età

---

## 🧠 Esercizio 4 – Informazioni scolastiche

**Obiettivo**: Creare un programma che raccolga e stampi informazioni scolastiche in modo strutturato.

**Consegna**:

1. Scrivere una classe `Esercizio4` con un metodo `leggiStudente()` che:
   * Chiede all’utente: nome (`nextLine()`), classe (`nextLine()`), media (`nextDouble()`)
   * Stampa un riepilogo su più righe

**Test JUnit**:

* Simula input multipli
* Verifica che tutti i dati siano presenti nell’output

---

## 🔄 Esercizio 5 – Inverti due parole

**Obiettivo**: Creare un programma che legga due parole e le stampi in ordine invertito.

**Consegna**:

1. Scrivere una classe `Esercizio5` con un metodo `inverti()` che:
   * Legge due parole (`next()`)
   * Stampa: `Seconda parola: ...`, `Prima parola: ...`

**Test JUnit**:

* Simula input `ciao` e `mondo`
* Verifica che l’output sia invertito

---

## 🔍 Esercizio 6 – Vero o falso

**Obiettivo**: Creare un programma che legga una risposta booleana e ne verifichi la correttezza.

**Consegna**:

1. Scrivere una classe `Esercizio6` con un metodo `verificaRisposta()` che:
   * Chiede: "Il sole è una stella? (true/false)"
   * Legge un booleano con `nextBoolean()`
   * Stampa se la risposta è corretta o sbagliata

**Test JUnit**:

* Simula input `true`
* Verifica che l’output confermi la risposta corretta

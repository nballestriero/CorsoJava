# 🧪 Esercizi – Ciclo `for` classico e confronto tra cicli

## 🔁 Esercizio 1 – Somma dei numeri da 1 a N

**Obiettivo**: Applicare il ciclo `for` per sommare una sequenza di numeri.

**Consegna**:

1. Scrivere una classe `Esercizio1` con un metodo `sommaNumeri()` che:

   * Chiede all’utente un numero intero `N`
   * Somma tutti i numeri da 1 a `N`
   * Stampa `Somma: <valore>`

**Test JUnit**:

* Simula input `5`
* Verifica che l’output sia `Somma: 15`

---

## 🔄 Esercizio 2 – Validazione di input con `do-while`

**Obiettivo**: Usare `do-while` per garantire che venga inserito un numero positivo.

**Consegna**:

1. Scrivere una classe `Esercizio2` con un metodo `leggiPositivo()` che:

   * Chiede all’utente un numero intero
   * Continua a chiedere finché non riceve un numero > 0
   * Stampa `Hai inserito: <numero>`

**Test JUnit**:

* Simula input `-3`, `0`, `4`
* Verifica che l’output finale sia `Hai inserito: 4`

---

## 🧠 Esercizio 3 – Scansione di un array con `for-each`

**Obiettivo**: Usare `for-each` per elaborare tutti gli elementi di un array.

**Consegna**:

1. Scrivere una classe `Esercizio3` con un metodo `stampaPari()` che:

   * Chiede quanti numeri leggere
   * Legge i numeri in un array
   * Stampa solo quelli pari, usando `for-each`

**Test JUnit**:

* Simula input `4`, `2`, `3`, `6`, `9`
* Verifica che l’output contenga `2` e `6`, ma non `3` o `9`

---

## 🔍 Esercizio 4 – Trovare l’indice del massimo

**Obiettivo**: Usare `for` per accedere agli indici e trovare la posizione del valore massimo.

**Consegna**:

1. Scrivere una classe `Esercizio4` con un metodo `indiceMassimo()` che:

   * Legge un array di interi
   * Trova e stampa l’indice del valore massimo

**Test JUnit**:

* Simula input `5`, `10`, `7`, `15`, `4`, `9`
* Verifica che l’output sia `Indice massimo: 2` (valore 15 alla posizione 2)

---

## 🧩 Esercizio 5 – Convalida array con cicli combinati

**Obiettivo**: Progettare un algoritmo che richiede di scegliere il ciclo più adatto.

**Consegna**:

1. Scrivere una classe `Esercizio5` con un metodo `convalidaArray()` che:

   * Chiede quanti valori inserire (`n`)
   * Legge `n` numeri da tastiera in un array (usando `for`)
   * Continua a chiedere **ogni singolo numero** finché è positivo (usare `do-while`)
   * Al termine, stampa tutti i valori negativi trovati (con `for-each`)

**Test JUnit**:

* Simula inserimento `3`, poi `-1`, `0`, `-5`
* Verifica che l’output contenga `-1`, `-5`


---

## 🧪 Esercizio 1 – Dichiarazione e stampa

**Obiettivo**: Dichiarare variabili di tipo primitivo e stampare i valori in output.

**Consegna**:

1. All'interno di una classe chiamata `Esercizio1`, dichiara le seguenti variabili:

   * `int studenti = 25;`
   * `double media = 7.8;`
   * `boolean promosso = true;`
   * `char voto = 'B';`
   * `byte eta = 17;`
   * `float altezza = 1.75f;`
2. Crea un metodo `stampaVariabili()` (non statico) che stampi ciascuna variabile su una riga diversa, nel formato:

   ```
   Studenti: 25
   Media: 7.8
   Promosso: true
   Voto: B
   Età: 17
   Altezza: 1.75
   ```

**Test JUnit**: Verifica che tutte le righe siano presenti nell'output del metodo.

---

## 🔄 Esercizio 2 – Conversioni tra tipi

**Obiettivo**: Sperimentare le conversioni implicite ed esplicite tra tipi primitivi.

**Consegna**:

1. Crea una classe `Esercizio2` con un metodo `conversioni()` (non statico) che ritorni una `String` con le seguenti variabili:

   * `int a = 100;`
   * `double b = a;`
   * `int c = (int) b;`
   * `double d = 9.75;`
   * `int e = (int) d;`
   * `byte f = (byte) 130;` (nota: overflow)
2. Il metodo deve restituire una stringa con ogni variabile stampata su una riga:

   ```
   a: 100
   b: 100.0
   c: 100
   d: 9.75
   e: 9
   f: -126
   ```

**Test JUnit**: Verifica che le righe siano presenti e che le conversioni siano corrette.

---

## 🧮 Esercizio 3 – Calcoli tra primitivi

**Obiettivo**: Comprendere il comportamento della divisione tra interi e double.

**Consegna**:

1. Crea una classe `Esercizio3` con un metodo `divisioneInteraEReale()` che:

   * dichiari due `int` `a = 10;` e `b = 3;`
   * ritorni la divisione `a / b` castata in `double`

**Test JUnit**: Verifica che il risultato sia `3.3333` con una tolleranza di `0.0001`.

---

## 🧠 Esercizio 4 – Quiz sui tipi primitivi

**Obiettivo**: Analizzare comportamenti particolari (overflow, booleani, cast implicito).

**Consegna**:

1. Crea una classe `Esercizio4` con un metodo `quiz()` che ritorni una stringa con:

   * `byte a = 127; a++;`
   * `boolean x = false;`
   * `char c = 'A';`
   * Il metodo deve restituire:

     ```
     a: -128
     !x: true
     (int)c: 65
     ```

**Test JUnit**: Verifica ciascuna riga della stringa.

---

## 🔍 Esercizio 5 – Limiti dei tipi primitivi

**Obiettivo**: Utilizzare le costanti `MAX_VALUE` e `MIN_VALUE` delle classi wrapper.

**Consegna**:

1. Crea una classe `Esercizio5` con un metodo `stampaLimiti()` che restituisca:

   ```
   Byte max: 127
   Byte min: -128
   Short max: 32767
   Int max: 2147483647
   Long max: 9223372036854775807
   Float max: 3.4028235E38
   Double max: 1.7976931348623157E308
   ```

**Test JUnit**: Verifica che l'output contenga tutte le costanti richieste.


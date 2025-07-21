# 📘 Il ciclo `while` in Java

## 🔁 Cos'è il ciclo `while`?

Il ciclo `while` è una struttura iterativa **a controllo iniziale**:
✅ **La condizione viene valutata prima dell’esecuzione del blocco.**
Se la condizione è falsa all’inizio, il corpo del ciclo **non viene eseguito nemmeno una volta**.

---

## 🧱 Sintassi

```java
while (condizione) {
    // istruzioni ripetute
}
```

* Se `condizione` è `true`, il blocco viene eseguito.
* Dopo ogni esecuzione, la condizione viene rivalutata.
* Se la condizione è `false`, il ciclo termina.

---

## 💡 Esempio semplice

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Output:**

```
1
2
3
4
5
```

---

## ⚠️ Differenza con `do-while`

| Caratteristica    | `while`                              | `do-while`        |
| ----------------- | ------------------------------------ | ----------------- |
| Tipo di controllo | Iniziale                             | Finale            |
| Esecuzione minima | 0 volte                              | Almeno 1 volta    |
| Uso tipico        | Iterazione **condizionata a priori** | Validazione input |

---

## 🔄 Differenza con `for`

* Il ciclo `for` è ideale quando **sai quante volte** iterare (es. 10 numeri).
* Il ciclo `while` è più adatto quando **non conosci a priori** il numero di iterazioni ma dipendi da una **condizione dinamica**.

---

## 🔍 Esempio con input da tastiera

```java
import java.util.Scanner;

public class EsempioWhile {
    public void leggiFinchéZero() {
        Scanner input = new Scanner(System.in);
        int numero = -1;

        while (numero != 0) {
            System.out.print("Inserisci un numero (0 per uscire): ");
            numero = input.nextInt();
        }

        System.out.println("Fine.");
    }
}
```

---

## 🔁 Schema testuale del funzionamento

```text
numero = -1;

valuta (numero != 0)? → true → entra nel ciclo
    chiedi numero → es. 3

valuta (numero != 0)? → true → entra nel ciclo
    chiedi numero → es. 0

valuta (numero != 0)? → false → fine ciclo
```

---

## ✅ Quando usare `while`

Usalo quando:

* La **condizione di uscita** dipende da un **dato esterno**
* Potrebbe essere necessario **non eseguire mai** il corpo del ciclo
* Vuoi simulare un ciclo "finché non accade qualcosa"


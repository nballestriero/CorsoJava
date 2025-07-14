# Teoria – Input da tastiera con la classe Scanner

## Introduzione

La classe `Scanner`, parte del pacchetto `java.util`, consente di leggere facilmente dati da input standard (tastiera), file, stringhe e altre fonti.

## Importazione

```java
import java.util.Scanner;
```

## Creazione di un oggetto Scanner

```java
Scanner input = new Scanner(System.in);
```

## Metodi principali della classe `Scanner`

| Metodo          | Tipo di dato letto     | Esempio                            | Note                          |
| --------------- | ---------------------- | ---------------------------------- | ----------------------------- |
| `nextInt()`     | `int`                  | `int x = input.nextInt();`         | Legge un numero intero        |
| `nextDouble()`  | `double`               | `double d = input.nextDouble();`   | Legge un numero con decimali  |
| `nextBoolean()` | `boolean`              | `boolean b = input.nextBoolean();` | Legge `true` o `false`        |
| `next()`        | `String` (una parola)  | `String parola = input.next();`    | Legge fino al primo spazio    |
| `nextLine()`    | `String` (intera riga) | `String linea = input.nextLine();` | Legge fino al newline (invio) |

## Differenza tra `next()` e `nextLine()`

* `next()` legge solo fino al primo spazio.
* `nextLine()` legge l’intera riga.
* **Attenzione:** Se `nextInt()`, `nextDouble()` o altri metodi sono seguiti da `nextLine()`, può essere necessario consumare la newline rimasta con una `input.nextLine()` extra.

## Esempio completo

```java
import java.util.Scanner;

public class InputDemo {
    public void leggiDati() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();

        System.out.print("Inserisci la tua media scolastica: ");
        double media = input.nextDouble();

        input.nextLine(); // consuma il newline

        System.out.print("Sei promosso? (true/false): ");
        boolean promosso = input.nextBoolean();

        System.out.println("\nRiepilogo:");
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("Media: " + media);
        System.out.println("Promosso: " + promosso);

        input.close();
    }
}
```

## Uso con test JUnit

```java
@Test
void testLeggiDati() {
    String simulatedInput = "Mario Rossi\n18\n7.8\ntrue\n";
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    InputDemo demo = new InputDemo();
    demo.leggiDati();

    String output = outContent.toString();
    Assertions.assertTrue(output.contains("Mario Rossi"));
    Assertions.assertTrue(output.contains("18"));
    Assertions.assertTrue(output.contains("7.8"));
    Assertions.assertTrue(output.contains("true"));
}
```

## Riepilogo

* `Scanner` è utile per ottenere input interattivo.
* I metodi `next()`, `nextLine()`, `nextInt()` ecc. hanno comportamenti specifici.
* Nei programmi reali è buona norma chiudere lo scanner con `input.close()` alla fine dell’uso.


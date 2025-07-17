
# Approfondimento: Casting dei Tipi Base in Java

## Cos'è il Casting?

Il **casting** è il processo di conversione di un tipo di dato in un altro. In Java, possiamo fare casting sia con i tipi primitivi che con gli oggetti. In questa lezione, esploreremo come funziona il casting per i tipi primitivi (tipi base).

## 1. Casting Implicito (Automatico)

Il casting implicito avviene automaticamente quando si converte un tipo di dato più piccolo in uno più grande, senza bisogno di specificare esplicitamente il tipo di destinazione. Ad esempio, puoi assegnare un valore di tipo `int` a una variabile di tipo `long` o `double`.

### Esempio di Casting Implicito:

```java
public class CastingImplicito {
    public static void main(String[] args) {
        int numeroIntero = 100;
        double numeroDecimale = numeroIntero;  // Casting implicito (int -> double)
        System.out.println("Il numero decimale è: " + numeroDecimale);
    }
}
```

**Spiegazione:**
- Il valore di `numeroIntero` (di tipo `int`) viene automaticamente convertito in `double`, poiché il tipo `double` può contenere un `int` senza perdita di dati.

## 2. Casting Esplicito (Forzato)

Il casting esplicito è necessario quando si converte un tipo più grande in uno più piccolo. Poiché questa conversione potrebbe comportare una perdita di dati (ad esempio, quando si converte da un tipo `double` a `int`), è necessario specificare il tipo di destinazione esplicitamente.

### Esempio di Casting Esplicito:

```java
public class CastingEsplicito {
    public static void main(String[] args) {
        double numeroDecimale = 9.99;
        int numeroIntero = (int) numeroDecimale;  // Casting esplicito (double -> int)
        System.out.println("Il numero intero è: " + numeroIntero);
    }
}
```

**Spiegazione:**
- Il valore di `numeroDecimale` (di tipo `double`) viene forzatamente convertito in `int`. Durante la conversione, la parte decimale (`.99`) viene scartata, lasciando il valore `9`.

## Riepilogo

- **Casting Implicito:** avviene automaticamente quando non c'è rischio di perdita di dati, come nel caso di conversione da un tipo più piccolo a uno più grande (ad esempio, `int` a `double`).
- **Casting Esplicito:** è necessario quando si converte un tipo più grande a uno più piccolo (ad esempio, da `double` a `int`), e potrebbe comportare la perdita di precisione o di dati.


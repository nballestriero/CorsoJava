
# Lezione: Casting degli Oggetti e delle Classi in Java

## Cos'è il Casting tra Oggetti?

In Java, il casting tra oggetti viene utilizzato per convertire un oggetto di una classe in un oggetto di un'altra classe, in particolare quando si lavora con **classi derivate**. Il casting può essere implicito (quando si esegue un **upcasting**) o esplicito (quando si esegue un **downcasting**).

## 1. Upcasting (Casting Implicito)

L'**upcasting** è quando si converte un oggetto di una classe derivata in un oggetto di una classe base. In Java, questo tipo di casting avviene automaticamente e senza la necessità di esplicitare il tipo di destinazione.

### Esempio di Upcasting:

```java
class Animale {
    void faiVerso() {
        System.out.println("L'animale fa un verso.");
    }
}

class Cane extends Animale {
    @Override
    void faiVerso() {
        System.out.println("Il cane abbaia.");
    }
}

public class CastingOggetti {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Animale animale = cane;  // Upcasting implicito (Cane -> Animale)
        animale.faiVerso();  // Chiamata al metodo della classe Cane
    }
}
```

**Spiegazione:**
- Qui, l'oggetto di tipo `Cane` viene automaticamente trattato come un oggetto di tipo `Animale` grazie al polimorfismo. Il comportamento della classe `Cane` viene mantenuto, ma l'oggetto è riferito come `Animale`.

## 2. Downcasting (Casting Esplicito)

Il **downcasting** è quando si converte un oggetto di tipo base in un oggetto di tipo derivato. Questo tipo di casting richiede un'esplicita conversione, e può causare errori di runtime se l'oggetto non è effettivamente del tipo derivato.

### Esempio di Downcasting:

```java
class Animale {
    void faiVerso() {
        System.out.println("L'animale fa un verso.");
    }
}

class Cane extends Animale {
    @Override
    void faiVerso() {
        System.out.println("Il cane abbaia.");
    }
}

public class CastingOggetti {
    public static void main(String[] args) {
        Animale animale = new Cane();  // Oggetto di tipo Cane assegnato a variabile di tipo Animale
        Cane cane = (Cane) animale;  // Downcasting esplicito (Animale -> Cane)
        cane.faiVerso();  // Chiamata al metodo della classe Cane
    }
}
```

**Spiegazione:**
- L'oggetto di tipo `Animale` viene esplicitamente convertito in `Cane` per accedere ai metodi specifici della classe `Cane`. Se l'oggetto non è effettivamente un `Cane`, verrà lanciata una `ClassCastException`.

## 3. Errore di Casting (ClassCastException)

Se si tenta di fare un downcasting a un tipo non compatibile, Java lancerà una **ClassCastException**.

### Esempio di errore di Casting:

```java
class Animale { }

class Gatto extends Animale { }

public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Gatto gatto = (Gatto) animale;  // ClassCastException
    }
}
```

**Spiegazione:**
- In questo caso, si tenta di fare un downcasting da `Animale` a `Gatto`, ma l'oggetto `animale` non è di tipo `Gatto`, quindi verrà lanciata una `ClassCastException`.

## Riepilogo

- **Upcasting (Implicito):** avviene automaticamente quando si converte un oggetto di una classe derivata in una classe base.
- **Downcasting (Esplicito):** richiede un'esplicita conversione e può causare errori se l'oggetto non appartiene effettivamente alla classe derivata.
- **Errore di Casting:** si verifica quando si tenta di fare un casting non valido, come quando si converte un oggetto di una classe base in una classe non correlata.


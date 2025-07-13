# Tipi primitivi in Java – Tabella e spiegazione

## 🧮 Tabella riassuntiva

| Tipo       | Dimensione       | Intervallo di valori                                   | Valore di default | Uso comune                                  |
|------------|------------------|--------------------------------------------------------|--------------------|----------------------------------------------|
| `byte`     | 8 bit (1 byte)   | –128 → 127                                             | 0                  | Array di interi piccoli, memoria ridotta     |
| `short`    | 16 bit (2 byte)  | –32.768 → 32.767                                       | 0                  | Valori numerici intermedi                    |
| `int`      | 32 bit (4 byte)  | –2.147.483.648 → 2.147.483.647                         | 0                  | Tipo intero predefinito                      |
| `long`     | 64 bit (8 byte)  | –9.223.372.036.854.775.808 → 9.223.372.036.854.775.807 | 0L                 | Numeri interi molto grandi                   |
| `float`    | 32 bit (4 byte)  | ±1.4×10⁻⁴⁵ → ±3.4×10³⁸                                 | 0.0f               | Valori decimali a precisione moderata        |
| `double`   | 64 bit (8 byte)  | ±4.9×10⁻³²⁴ → ±1.8×10³⁰⁸                               | 0.0                | Valori decimali ad alta precisione           |
| `char`     | 16 bit (2 byte)  | '\u0000' (0) → '\uffff' (65.535)                       | '\u0000'           | Singolo carattere Unicode                    |
| `boolean`  | 1 bit (logico)   | `true` / `false`                                       | false              | Flag e condizioni logiche                    |

---

## 📖 Spiegazione dei tipi primitivi

In Java esistono **8 tipi primitivi**, suddivisi in:

- **Numerici interi**: `byte`, `short`, `int`, `long`
- **Numerici reali (virgola mobile)**: `float`, `double`
- **Caratteri**: `char`
- **Logici**: `boolean`

### 🔢 Tipi interi (`byte`, `short`, `int`, `long`)
Questi tipi rappresentano numeri **senza parte decimale**. Cambiano per dimensione e intervallo:

- `byte`: il più piccolo (1 byte), utile per dati compatti (es. immagini, array grandi).
- `short`: occupa 2 byte; usato raramente.
- `int`: è il tipo **standard** per i numeri interi.
- `long`: usato quando servono numeri interi molto grandi.

> Esempio:  
> `int anno = 2025;`  
> `long popolazioneTerra = 8000000000L;`

### 🔣 Tipo `char`
`char` rappresenta un **singolo carattere Unicode**, codificato su 16 bit.

> Esempio:  
> `char iniziale = 'N';`  
> `char simbolo = '\u03A9'; // Omega greca`

Può essere usato anche per valori numerici associati al codice Unicode.

### 🔘 Tipo `boolean`
`boolean` ha solo due valori possibili: `true` o `false`.  
È usato nelle condizioni logiche (`if`, `while`, `for`, ecc.).

> Esempio:  
> `boolean isOnline = true;`

### 💧 Tipi a virgola mobile (`float`, `double`)
Permettono di rappresentare **numeri decimali**:

- `float`: meno preciso (6-7 cifre significative), occupa meno memoria.
- `double`: più preciso (15-16 cifre), è il tipo decimale **predefinito**.

> Esempio:  
> `float piGreco = 3.14f;`  
> `double iva = 22.0;`

> ⚠️ Attenzione: per i `float` è **obbligatorio** scrivere la `f` finale.

---

## 🧠 Note importanti

- I tipi primitivi **non sono oggetti**: non hanno metodi e sono gestiti in modo più efficiente.
- Ogni tipo ha un **valore di default**, ma solo se è usato come **campo di una classe**.  
  Le variabili locali **vanno sempre inizializzate**.
- Java assegna **dimensioni fisse** ai tipi primitivi, a differenza di altri linguaggi in cui dipendono dall’architettura della macchina.

---

## 🧪 Test rapido (esempio)

```java
public class TipiPrimitivi {
    public static void main(String[] args) {
        byte eta = 16;
        int studenti = 20;
        double media = 7.5;
        char iniziale = 'J';
        boolean promosso = true;

        System.out.println("Età: " + eta);
        System.out.println("Studenti: " + studenti);
        System.out.println("Media: " + media);
        System.out.println("Iniziale: " + iniziale);
        System.out.println("Promosso: " + promosso);
    }
}


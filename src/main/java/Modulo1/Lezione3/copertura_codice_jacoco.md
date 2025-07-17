
# Approfondimento: Copertura del Codice con JaCoCo in Java

## Cos'è la Copertura del Codice?

La **copertura del codice** è una metrica che misura quanto del codice sorgente è stato eseguito durante i test. Una copertura elevata significa che una grande parte del codice è stata testata. La copertura del codice aiuta a identificare le aree non testate, migliorando la qualità e la robustezza del software.

## JaCoCo: Strumento per la Misurazione della Copertura del Codice

**JaCoCo** è uno degli strumenti più utilizzati per misurare la copertura del codice in Java. Si integra facilmente con strumenti di build come **Maven** e **Gradle** e può generare report dettagliati sulla copertura delle linee di codice.

JaCoCo è in grado di analizzare diverse forme di copertura:
- **Line Coverage**: misurazione di quante righe di codice sono state eseguite.
- **Branch Coverage**: verifica dei percorsi condizionali (i rami `if` e `else`).
- **Method Coverage**: verifica di quante funzioni/metodi sono stati eseguiti.
- **Class Coverage**: misura di quante classi sono state caricate ed eseguite.

## Come Integrare JaCoCo con un Progetto Java

### 1. Configurazione di JaCoCo in un Progetto Maven

Per usare JaCoCo con Maven, devi aggiungere il plugin JaCoCo al tuo `pom.xml`. Ecco un esempio di configurazione di base:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.7</version>
            <executions>
                <execution>
                    <goals>
                        <goal>prepare-agent</goal>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

- `prepare-agent`: inizia la raccolta dei dati di copertura quando l'applicazione viene eseguita.
- `report`: genera un report della copertura del codice una volta completati i test.

### 2. Esecuzione di JaCoCo con Maven

Dopo aver configurato JaCoCo, puoi eseguire i test unitari e generare un report di copertura con il comando Maven:

```bash
mvn clean test
```

Dopo aver eseguito i test, JaCoCo genererà un report che mostra la copertura delle linee di codice, dei metodi e delle classi.

### 3. Esempio di Test e Report di Copertura

Supponiamo di avere una classe con un semplice metodo di somma:

```java
public class Calcolatrice {
    public int somma(int a, int b) {
        return a + b;
    }
}
```

Ora, scriviamo un test JUnit per il metodo `somma`:

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

    @Test
    public void testSomma() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(5, calcolatrice.somma(2, 3));
    }
}
```

Eseguiamo i test con Maven:

```bash
mvn clean test
```

JaCoCo genererà un report della copertura che potrebbe apparire così (in formato HTML):

- Line Coverage: 100%
- Branch Coverage: 100%
- Method Coverage: 100%

Questi valori indicano che tutte le linee di codice, i rami condizionali e i metodi sono stati eseguiti durante i test.

## 4. Visualizzazione dei Report di Copertura

Il plugin JaCoCo può generare diversi tipi di report:
- **HTML**: un report visualizzabile tramite il browser.
- **XML**: utile per l'integrazione con altri strumenti di analisi.
- **CSV**: utile per la raccolta dei dati in un formato più semplice da analizzare.

Per generare un report HTML, dopo aver eseguito `mvn clean test`, puoi trovare il report nella directory `target/site/jacoco/index.html`. Aprendo questo file, vedrai una panoramica dettagliata sulla copertura del codice, evidenziando le linee di codice coperte e quelle non coperte.

## Riepilogo

- **JaCoCo** è uno strumento efficace per misurare la copertura del codice in Java.
- Può essere facilmente integrato in un progetto Maven.
- La copertura del codice può essere monitorata a livello di linee, metodi, classi e rami.
- I report generati da JaCoCo sono utili per identificare le aree del codice non coperte dai test.

Con questo strumento, puoi migliorare la qualità del tuo codice scrivendo test unitari mirati e migliorando la copertura complessiva.


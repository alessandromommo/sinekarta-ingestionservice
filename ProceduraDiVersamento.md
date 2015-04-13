# Procedura di versamento #

Il sistema di conservazione riceve dal _“Produttore”_ (vedi AttoriDelSistema) le richieste di archiviazione dei documenti sotto forma di **Pacchetti di versamento**.

Ogni pacchetto ricevuto assume lo stato di "versato"; per ogni oggetto (fascicolo, documento) contenuto in ognuno di questi pacchetti, si eseguono i controlli previsti dal sistema: controlli sul formato del file, sulla completezza dei metadati, sulla validità di firme e marche temporali, sulla presenza di codice eseguibile.

Nel caso in cui tutti i controlli abbiano un esito positivo il sistema accetta in maniera automatica il pacchetto di versamento, il quale transisce nello stato "valido". Da questo momento la documentazione diventa disponibile per essere inserita in un pacchetto di archiviazione.

Nel caso in cui, invece, un pacchetto contenga uno o più oggetti con errori, il sistema crea un _“esito controllo”_ che riporta il tipo di errore e il dettaglio dell’errore. A seconda degli errori rilevati, l’operatore della conservazione decide se rifiutare il pacchetto etichettandolo come “rifiutato”.

Per ogni pacchetto "valido" o "rifiutato", viene creato un rapporto di versamento contenente un esito controllo che riporta ogni eventuale errore.

Il documento ottenuto viene spedito all’utente _“Produttore”_ che aveva inoltrato la richiesta di archiviazione.

## Requisiti per la conservazione ##

La conservazione a lungo termine di un documento digitale necessita, per la sua realizzazione, di un certo numero di informazioni che devono essere acquisite, necessariamente, durante la fase di versamento.

Fra le più importanti possiamo evidenziare:
  * **Informazioni sull’identificazione**: identificano e, se necessario, descrivono, uno o più meccanismi per attribuire degli identificatori al contenuto di un versamento;
  * **Informazioni sul contesto**: documentano le relazioni fra il contenuto digitale e il suo ambiente, ivi inclusi i motivi della creazione e il modo in cui è in relazione con altri contenuti esistenti;
  * **Informazioni sulla provenienza**: documentano la storia del contenuto di un versamento fornendo indicazioni sulla fonte di provenienza, sui cambiamenti avvenuti dal momento della creazione e su chi ne ha curato la custodia fin dall’origine;
  * **Informazioni sull’integrità**: forniscono i controlli sull’integrità dei dati o le chiavi di validazione/verifica utilizzate per garantire che un oggetto appartenente al versamento non abbia subito alterazioni non autorizzate;
  * **Informazioni sull’impacchettamento**: sono informazioni che, concretamente o concettualmente, uniscono o mettono in relazione le componenti del pacchetto all’interno di un’entità identificabile su un determinato supporto;
  * **Informazioni descrittive**: contengono dati che fungono da input per gli strumenti di accesso, siano essi documenti o applicazioni, utilizzati per localizzare, analizzare, recuperare o richiedere informazioni. Possono essere considerate come un indice che, una volta effettuata la memorizzazione all’interno del sistema di conservazione, consente un accesso efficiente all’informazione desiderata.

Tutte queste informazioni devono essere contenute nel _“Pacchetto di versamento”_ che, di conseguenza, deve essere strutturato in maniera tale da poterle contenere.
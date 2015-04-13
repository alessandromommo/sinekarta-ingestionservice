# Introduzione #

In questa sezione sono descritti alcuni dei principali casi d’uso individuati, che consentono di evidenziare al meglio i requisiti funzionali del sistema, insieme ad uno scenario tipico di utilizzo.

![http://sinekarta-ingestionservice.googlecode.com/svn/wiki/sinekarta-ingestionservice-useCase3.png](http://sinekarta-ingestionservice.googlecode.com/svn/wiki/sinekarta-ingestionservice-useCase3.png)

## Crea fascicolo ##

<table width='1000px' border='1'>
<blockquote><tr>
<blockquote><td><b>CU1:</b> Crea fascicolo</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Descrizione:</b> Il caso d’uso si riferisce alla procedura di creazione di un fascicolo di file.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Attore:</b> Utente</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Precondizione:</b> Il sistema mostra la schermata relativa alla procedura.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenario principale:</b>
</blockquote></blockquote><ol><li>Il caso d’uso inizia quando un utente decide di creare un fascicolo e invoca l'operazione corrispondente;<br>
</li><li>Il sistema chiede un identificativo univoco per il fascicolo;<br>
</li><li>L'utente inserisce l'identificativo;<br>
</li><li><b>INCLUDE</b> "Seleziona file"<br>
</li><li>Il sistema memorizza il fascicolo.</td>
<blockquote></tr>
<tr>
<blockquote><td><b>Scenari secondari:</b></td>
</blockquote></tr>
<tr>
<blockquote><td><b>Postcondizione:</b> Il fascicolo è memorizzato correttamente all'interno del sistema con l'identificativo scelto.</td>
</blockquote></tr>
</table></blockquote></li></ol>

## Seleziona file ##

<table width='1000px' border='1'>
<blockquote><tr>
<blockquote><td><b>CU2:</b> Seleziona file</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Descrizione:</b> Il caso d’uso si riferisce alla selezione di un file memorizzato nel sistema.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Attore:</b> Utente</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Precondizione:</b> Il sistema mostra la schermata relativa alla funzionalità.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenario principale:</b>
<ol>
<li>Il caso d'uso inizia quando un utente seleziona la funzione di visualizzazione dei file memorizzati nel sistema;</li>
<li>Il sistema mostra una pagina con l'elenco dei file attualmente presenti;</li>
<li><b>FOR</b> ogni file selezionato:<br>
<dl>
<dt>3.1 Il sistema mostra i dettagli del file;</dt>
<dt>3.2 L'utente inserisce/modifica i metadati assegnati al file;</dt>
</dl>
</li>
<li>Il sistema memorizza correttamente tutte le modifiche.</li>
</ol>
</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenari secondari:</b>
<blockquote>3.2.1 L'utente assegna il file ad un fascicolo esistente;<br>
</blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td><b>Postcondizione:</b> Eventuali modifiche apportate dall'utente sono memorizzate correttamente dal sistema.</td>
</blockquote></tr>
</table></blockquote>

## Crea SIP ##

<table width='1000px' border='1'>
<blockquote><tr>
<blockquote><td><b>CU3:</b> Crea SIP</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Descrizione:</b> Il caso d’uso si riferisce alla procedura di creazione di un pacchetto di versamento.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Attore:</b> Utente</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Precondizione:</b> Il sistema mostra la schermata relativa alla procedura.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenario principale:</b>
<ol>
<li>Il caso d’uso inizia quando un utente decide di creare un pacchetto di versamento;</li>
<li><b>FOR</b> ogni fascicolo da inserire nel pacchetto:<br>
<dl>
<dt>2.1 <b>INCLUDE</b> "Crea fascicolo";</dt>
<dt>2.2 Il fascicolo viene inserito nel pacchetto di versamento;</dt>
</dl>
</li>
<li><b>FOR</b> ogni file da inserire nel pacchetto:<br>
<dl>
<dt>3.1 <b>INCLUDE</b> "Seleziona file";</dt>
<dt>3.2 Il sistema chiede se nel pacchetto debba essere inserito il file oppure un link ad esso;</dt>
<dt>3.3 L'utente seleziona la scelta corrispondente all'inserimento del file;</dt>
<dt>3.4 Il sistema inserisce il file nel pacchetto;</dt>
</dl>
</li>
<li>L'utente inserisce un nome mnemonico per il pacchetto;</li>
<li>Il sistema genera in identificativo univoco e lo assegna al pacchetto.</li>
</ol>
</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenari secondari:</b>
<ol>
<dl>
<dt>3.3.1 L'utente seleziona la scelta corrispondente all'inserimento di un link al file;</dt>
<dt>3.3.2 Il sistema inserisce nel pacchetto l'indirizzo pubblico del file;</dt>
</dl>
</ol>
</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Postcondizione:</b> Il pacchetto di versamento è correttamente memorizzato nel sistema.</td>
</blockquote></tr>
</table></blockquote>

## Versamento asincrono SIP ##

<table width='1000px' border='1'>
<blockquote><tr>
<blockquote><td><b>CU4:</b> Versamento asincrono SIP</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Descrizione:</b> Il caso d’uso si riferisce alla procedura asincrona di versamento.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Attore:</b> Utente</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Precondizione:</b> Il sistema mostra la schermata relativa alla procedura.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenario principale:</b>
<ol>
<dl>
<dt>7.1 L'utente seleziona la modalità di versamento asincrona;</dt>
<dt>7.2 Il sistema chiede un indirizzo dove salvare il pacchetto di versamento;</dt>
<dt>7.3 L'utente digita l'indirizzo;</dt>
<dt>7.4 Il sistema assembla il pacchetto di versamento, ne salva una copia all'indirizzo precedentemente acquisito e invia quest'ultimo al servizio di conservazione. Il servizio di conservazione risponde con un messaggio di conferma.</dt>
</dl>
</ol>
</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenari secondari:</b>
<ol>
<dl>
<dt>7.4.1 Il sistema non riesce ad accedere l'indirizzo fornito dall'utente e, dopo aver mostrato un messaggio di errore, interrompe la procedura;</dt>
<dt>7.4.1 Il sistema riceve un messaggio con un errore che verrà visualizzato all'utente;</dt>
</dl>
</ol>
<blockquote></td>
</blockquote></blockquote></tr>
<tr>
<blockquote><td><b>Postcondizione:</b> Il destinatario recupera correttamente il pacchetto di versamento.</td>
</blockquote></tr>
</table></blockquote>

## Versamento sincrono SIP ##

<table width='1000px' border='1'>
<blockquote><tr>
<blockquote><td><b>CU5:</b> Versamento sincrono SIP</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Descrizione:</b> Il caso d’uso si riferisce alla procedura di versamento in modalità sincrona.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Attore:</b> Utente</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Precondizione:</b> Il sistema mostra la schermata relativa alla procedura.</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Scenario principale:</b>
</blockquote></blockquote><ol><li>Il caso d'uso inizia quando l'utente decide di inviare un pacchetto di versamento all'ente prescelto.<br>
</li><li>Il sistema mostra l'elenco dei pacchetti di versamento attualmente memorizzati al suo interno;<br>
</li><li>L'utente seleziona il pacchetto da inviare;<br>
</li><li>Il sistema chiede l'indirizzo del web service al quale inviare le ricevute;<br>
</li><li>L'utente digita l'indirizzo corretto;<br>
</li><li>Il sistema chiede se inviare il pacchetto in modalità sincrona o asincrona;<br>
</li><li>L'utente seleziona la modalità sincrona;<br>
</li><li>Il sistema invia il pacchetto di versamento e riceve un messaggio di conferma.</td>
<blockquote></tr>
<tr>
<blockquote><td><b>Scenari secondari:</b>
<ol>
<dl>
<dt>3.1 <b>EXTENSION</b> “Crea SIP”;</dt>
<dt>7.1 <b>EXTENSION</b> “Versamento asincrono SIP”;</dt>
</dl>
</ol>
</td>
</blockquote></tr>
<tr>
<blockquote><td><b>Postcondizione:</b> L’utente è abilitato alla navigazione è viene indirizzato alla home page.</td>
</blockquote></tr>
</table>
# Mein Lerntagebuch 

**Lukas Schmidt Matr.Nr.: 1269952**

##  Vorlesung 1 21.10.2020 

### Hallo liebes Tagebuch,

heute hatte ich meine erste Vorlesung in dem Modul **"Programmiermethoden und -werkzeuge"** bei Herrn Marius Kreis.
Vorab wurden einleitende Informationen Ã¼ber Herrn Kreis sowie Informationen Ã¼ber das Modul allgemein vorgestellt. 
AuÃŸerdem wurden die **Lernziele** dieses Moduls definiert, die da sind...
*  Was ist **aktuell** in Softwareentwicklung Standart ? 
* **warum** macht man das so ?
* **was** bringt es mir?

Des weiteren wurde das Lerntagebuch, sowie das durchzufÃ¼hrende Projekt besprochen. 
* Projekt: Spiel entwickeln, Umgang mit Vim, git (agile Entwicklung, DevOps)

#### Hauptinhalt der heutigen Vorlesung 

* EinfÃ¼hrung in Vim und die drei Modi: Command, Visual, Insert 
* verschiedene Befehle in den drei Modis erlernt
* EinfÃ¼hrung in **VCS** Systeme **(Version Control System)**
* Funktionsweise **RCS**, Struktur und Gliederung, Ablauf, Versionen 
* Vorstellung 2ter und 3ter Generation **VCS** (3te: z.B.: **git** als Dezentrale VCS)
* kurze Geschichtsstunde Ã¼ber git 
* Besonderheiten von git und spezifische Begriffe
* die drei Bereiche von git: Working Directory, Staging Area, Repository
* kurze praktische durchfÃ¼hrung (ging mir ein bisschen zu schnell, wird aber noch in der Ãœbung behandelt)
* Ende der Vorlesung 


**(Vim und git Bash hatten wir bereits in der Ãœbung auf unseren Rechnern installiert)**

##### Tschüss Lerntagebuch, bis zum nÃ¤chsten mal!

## Vorlesung 2 28.10.2020

### Hallo liebes Tagebuch, 

in der heutigen Vorlesung wurden die folgenden git Befehlsketten in Zusammenhang mit den verschiedenen Stufen (Stages) der Dateiverarbeitung besprochen. 
* Repos. klonen 
* Dateien committen
* Übersicht verschaffen (git status/ git diff)
* Staging rückgängig machen 
* Dateien umbenennen /löschen
* Commits nachträglich ändern
* Commits allgemein
* Commits Rückgängig machen

#### Des Weiteren wurden folgende Themen besprochen... 

* Liste, die von git ignoriert werden soll (.gitignore)
* Repos untersuchen 
* Branches
* Branches (Beispiele und Befehle)
* Branches und Remote Repositories
* Umsetzung von Branches. Wozu braucht man branches ? 
* git reset!--> Möglichkeiten : soft, hard

**Interessant** fande ich heute ehrlich gesagt nicht so viel, Die Befehle zu kennen ist aber trotzdem sehr wichtig. 

##### Das war mein heutiger Eintrag, bis nächste Woche..

###### Ich freue mich


## Vorlesung 04.11.2020

### Hallo liebes Tagebuch

**Das habe ich heute gelernt!**

> #### Branches
> Heute habe ich gelernt wozu Branches nützlich sind, 
> wie man sie erstellt und wie man sie löscht.
> Es wurde uns erklärt, wie man Branches zu Repos pusht, (da diese vorerst nur lokal erstellt werden)
> und wie man mehrere Branches wieder zusammenführt ( **Merge** ).


> #### Merge
> Probleme beim Mergen, Lösung: **fast-forward** Merge (es wurde nur ein branch weiterentwickelt),oder 
> der **drei Wege Merge** (Master Branch hat sich zusätzlich weiterentwickelt). 
> Bei diesem **drei Wege Merge** wird ein sog. **Merge Commit** erzeugt. 
> Dieser Commit enthält alle Änderungen, die man ,,verpasst'' hat.

> #### Merge Konflikte 
> können auftreten, wenn Dateien an den gleichen Stellen geändert wurden. 
> hier muss dann der Benutzer selbst entscheiden, welche der Beiden Dateien er löschen möchte. 
> allerdings habe ich diesen Teil praktisch noch nicht so ganz verstanden. 

> #### Aktualisierung veralteter Branches durch einen Branch Merge
> Master in den Feature Branch mergen, um auf dem neusten Stand zu sein 
> * **Vorteile** 
> > * es wird nur hinzugefügt
> > * bestehende Branches bleiben ansonsten unverändert
> * **Nachteile**
> > * bei häufigem mergen, gibt es viele commits 

> #### Aktualisierung durch einen Branch Rebase
> Abzweig eines Branches wird **umgehängt**
> * **Vorteile** 
> > * saubere Historie 
> * **Nachteile**
> > * kompletter Branch wird verschoben, sorgt für Chaos wenn mehrere daran abreiten. 

> #### Weiteres
> Des weiteren wurde uns erklärt, wie Branches umgesetzt werden können und wie mit Reset und Revert Commits Rückgängig gemacht werden 
> Die Einzelheiten hierzu habe ich aber dann leider **nicht mehr verstanden**, bzw. konnte dem Dozenten nicht mehr folgen.  
> Ansonsten war ich sehr zufrieden mit der heutigen Vorlesung 

**Besonders interessant** fande ich heute das lösen von Merge Konflikten.
##### Bis nächste Woche ! 

###### Tschüss.

## Vorlesung 11.11.2020

### Hallo liebes Tagebuch 

**das habe ich heute gelernt !**
  
 * Rebase Wiederholung 
 * Rebase Interactive 
 * **Rebase Commands**
> unter anderem prakische Auführung von Rebase commands an einem Beispiel.
> Cherry Pick: (einzelne Commits holen)
 * **Umsetzen von Branches: git reset "Commit"** 
> * git reset "commit" --soft 
> * git reset "commit" --mixed
> * git reset "commit" --hard
 * Vergelich Reset vs Revert
 * i**Arbeitsweise mit Branches in git** 
> Feature Branch Workflow : für jedes Feature wird ein Branch angelegt
> die Entwicklung von Features stört somit nicht das Gesamtprodukt 
> "master" enthält niemals unvollständigen / defekten Code 
> bevor Änderungen auf master einfließen, können Pull request( Github ), oder Merge request( Gitlab )durchgeführt werden. 
> Das ist hilfreich, um den Code gemeinsam zu diskutieren: Wissensaustausch
> **Gitflow Workflow**: Grafik Folien 
 * Andere Git Befehle
> * Tags (Markierungen im Repo/ Bsp.: Versionsstände hinzufügen) / können auch zum Branchwechsel genutzt werden 
> * Stash ( Zwischenstände Zwischenspeichern)
> * Blame ( wer hat das geändert ? : man kann sehen, welche Zeile wann und von wem committed wurde 
> * Hunks 
> * Fehlersuche mit git bisect

**Besonders Interessant** fande ich den Feature Branch Workflow, da auch relevant für unser Projekt.

##### Bis nächste Woche ! 

###### Tschüss.


## Vorlesung 18.11.2020

### Hallo liebes Tagebuch

**das habe ich heute gelernt !**

**Weitere git Befehle**

>  git **blame** "Datei"; Wer hat das geändert? mit praktischer Übung. 
>  git add **--patch**; damit können Teile von Dateien committet werden, sog. Hunks. 
>  git **bisect**; wenn sich ein Bug eingeschlichen hat.. sucht in den letzten ...Fällen ( git bisect start HEAD HEAD«10 --)

### Neues Thema: **Agile Software Entwicklung**

#### Wichtige Punkte zu einem Erfolgreichem Projekt


**Gute Kommunikation** innerhalb des Teams bedeutet: 

* Regelmässige Treffen
* lieber mehr kurze als wenig und dafür lang(weilig)
* Videotelefonie
* Teamchat
* z. B. Slack, MS Teams, Discord
* Gemeinsame Dateiablage / Wissensspeicher
* z. B. Dropbox, Google Drive/Docs, Basecamp

**Realistische Projektplanung**

* Strenge Priorisierung
* Was ist Basisversion des Spiels?
* Was ist "nice-to-have"?
* z. B. Highscore, farbige Ausgabe, Grafik, Sound, ...
* Wie kann man noch weiter reduzieren?
* In Ausbaustufen denken
* Detailplanung für die nächsten 2-4 Wochen
* dann neu überlegen, was gerade am Wichtigsten ist

**Fristen einhalten**

* Früh zu einem "abgabefähigen" Spiel kommen
* Erst danach an weiteren Features arbeiten
* Qualität ist wichtiger als Quantität

**Wesentliche Details erkennen**

* Funktioniert es wie gedacht?
* Ist die Bedienung selbsterklärend?
* Was könnte man verbessern?


**Wasserfall Modell**

**Iteratives Modell**

**Scrum**

Eine der bekanntesten Methoden der agilen Software Entwicklung

* "Scrum akzeptiert, dass der Entwicklungsprozess nicht
vorherzusehen ist. Das Produkt ist die bestmögliche Software
unter Berücksichtigung der Kosten, der Funktionalität, der Zeit
und der Qualität"

* Scrum Team 
* Scrum Rollen 
* Product Owner
* Scrum Master 

**Feedback**

Die heutige Vorlesung in Bezug auf agile Softwareentwicklung wwar sehr interessant und ich konnte einen guten ersten Einblick 
gewinnen, wie eine optimale Projektplanung und Umsetzung innerhalb eines Entwicklungsteams stattfindet, bzw. stattfinden sollte. 


##### Bis nächste Woche !

###### Tschüss.


## Vorlesung 25.11.2020

### Hallo liebes Tagebuch

**Das habe ich heute gelernt !**

#### Das Agile Manifest!
**Wichtig !**
* **Individuen und Interaktionen** stehen über Prozessen und Werkzeugen
* **Funktionierende Software** steht über einer umfassenden Dokumentation
* **Zusammenarbeit mit dem Kunden** steht über der Vertragsverhandlung
* **Reagieren auf Veränderung** steht über dem Befolgen eines Plans 

* Wann Agil nicht funktioniert und irrglauben in der agilen S.Entwicklung

#### Scrum
(Rahmenwerk der Agilen Softwareentwicklung)
> Wer agil ist, macht nicht unbedingt Scrum !
> Wer Scrum macht, ist nicht unbedingt agil !

* **Sprint** = **Iteration** (Phase, in der keine Planänderungen stattfinden)
* Sprints können abgebrochen und neu gestartet werden!
* Produkt ist danach fertig = Planung, Design, Entwicklung und Tests finden innerhalb des Sprints statt!

* **Scrum Team**
* Cross-Funktional, 5-9 Personen, flache Hierarchie
* **Scrum Rollen**
* Product Owner = Verantwortung/ Ziele festlegen, diese auch komunizieren,
nimmt die Arbeitsergebnisse ab
* Scrum Master = Sorgt dafür, dass Scrum Werte und Prozesse gelebt werden, hilft, das jeder Scrum versteht. Moderator und Coach.

* **Sprint Planning**
* Das Team formuliert gemeinsam ein Sprintziel ! 

**Besonders Interessant** fande ich heute das Agile Manifest und dessen Philosophie. 

#### Das war mein heutiger Eintrag


## Vorlesung 02.12.2020

### Hallo liebes Tagebuch

**Das habe ich heute gelernt !**

### Daily Scrum 
* Wie ist der Fortschritt zum Sprint Ziel ?
* Stichpunkte

###Sprint Review
* Informelle Abschlusspräsentation und Diskussion des Sprints
* Was haben wir erreicht, was bleibt zu tun ?

### Sprint Retrospective
* Letztes Meeting im Sprint
* Ziel: Kontinuierliche Verbesserung

### Product Backlog / Sprint Backlog
* bereits in der Übung gelernt
* in diesem Zusammenhang allgemein **Scrum Board /Sprint Board**
	* Dient zur Visualisierung der Arbeit im Sprint 
	* Spalten : **ToDo, In Progress, Done**,
	* regelmäßige Aktualisierung

### Velocity & Burndown Charts

**Feedback** Das Thema heute hat mich nicht abgeholt und ich war weniger konzentriert. Ich denke Daily Scrum ist dennoch sehr wichtig für den Arbeitsalltag in der Softwareentwicklung. 

#### Das war mein heutiger Eintrag



## Vorlesung 09.12.2020

### Hallo liebes Tagebuch

**Vorab** wurden heute einige organisatorische Informationen und weitere Rahmenbedingungen über das Spiel, die folgende Präsentation und das Projekt an sich besprochen.

### Testklausur 
* Besprechung der Testklausur und deren Benotung

**Was wurde heute behandelt** 

### Thema DefOps

* Exkurs: Wie wird Software gebaut?

* Probleme beim klassischen Rollendenken in der Softwareentwicklung.

* Philosophie DevOps; Rollendenken wird aufgebrochen; Automatisierung des Build Prozesses; 

### Linting

* Anbieter
* Funktionsweise
* Super Linter 

**Das fande ich heute besonders interessant**

* Die Besprechung von allgemeinen Informationen zum Projekt und der Präsentation
* Besprechung DefOps und die Philosophie von DefOps

### Feedback 
* Sehr interessante Vorlesung, abwechslungsreiche Themen und alles Projektorientiert!

#### Das war mein heutiger Eintrag



## Vorlesung vom 16.12.2020

### Hallo liebes Tagebuch


### Das habe ich heute gelernt:

> **debugging** in Visual Studio Code und IntelliJ; Breakpoints setzen (Beispiel Adventskalender)

> **Clean Code !** Problem: die Code Qualität sinkt, je länger an dem Projekt gearbeitet wird.(Software rott)
> Clean Code bedeutet, der Code soll lesbar, Wartbar, Testbar und Elegant sein. 
> Den **richtigen Namen** finden: Github Projekt, Klasse, Variable, Methode, Parameter,...
> gute Namen Beispiele: ...Gute Namen vermitteln den Zweck
> ...Gute Namen sind organisiert
> Variablen sollen **Leicht findbar** sein. 
> **Schreibweisen einheitlich** Schreibweisen - egal wie, aber einheitlich
> **Gute Methoden**
> nicht länger als eine Bildschirmseite = Lesbarkeit
> Ziel: Jede Methode macht genau eie Sache, und das richtig gut ! 
> **DRY** Prinzip ; Dont repeat yourself
> **Kommentare** 
> Kommentare sind kein Ersatz für guten Code; mehr ist nicht besser
> Schlechte Kommentare Beispiele.
> **Javadoc**
> **Auskommentierter Code** ; relativ zeitig löschen, wenn nicht mehr benötigt.
> **Objektorienierung und Datenstrukturen**


### Das fande ich heute besonders interessant:
> **debugging** 
> **Clean Code**


### Das ist mein Feedback für heute: 
> Sehr interessant für unser Projekt; im Bereich Clean Code können wir nun noch einiges optimieren


### Bis zum nächsten mal!





## Weihnachtspause 



## Vorlesung/ Besprechung 13.01.2021

**heute wurden hauptsächlich allgemeine Fragen besprochen.** 
* Fragen zur Klausur/ Präsentation
* Fragen zu Git Befehlen 

* heute habe ich nichts neues gelernt, es war aber sehr gut das einzelne Themen nochmals angesprochen wurden. 

## 20.01.2021

* heute stand die Klausur an und am Freitag findet unsere Projektvorstellung statt

### Das war mein letzter Eintrag 

#### Tschüss Tagebuch 



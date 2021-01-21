# Mein Lerntagebuch 

**Lukas Schmidt Matr.Nr.: 1269952**

##  Vorlesung 1 21.10.2020 

### Hallo liebes Tagebuch,

heute hatte ich meine erste Vorlesung in dem Modul **"Programmiermethoden und -werkzeuge"** bei Herrn Marius Kreis.
Vorab wurden einleitende Informationen über Herrn Kreis sowie Informationen über das Modul allgemein vorgestellt. 
Außerdem wurden die **Lernziele** dieses Moduls definiert, die da sind...
*  Was ist **aktuell** in Softwareentwicklung Standart ? 
* **warum** macht man das so ?
* **was** bringt es mir?

Des weiteren wurde das Lerntagebuch, sowie das durchzuführende Projekt besprochen. 
* Projekt: Spiel entwickeln, Umgang mit Vim, git (agile Entwicklung, DevOps)

#### Hauptinhalt der heutigen Vorlesung 

* Einführung in Vim und die drei Modi: Command, Visual, Insert 
* verschiedene Befehle in den drei Modis erlernt
* Einführung in **VCS** Systeme **(Version Control System)**
* Funktionsweise **RCS**, Struktur und Gliederung, Ablauf, Versionen 
* Vorstellung 2ter und 3ter Generation **VCS** (3te: z.B.: **git** als Dezentrale VCS)
* kurze Geschichtsstunde über git 
* Besonderheiten von git und spezifische Begriffe
* die drei Bereiche von git: Working Directory, Staging Area, Repository
* kurze praktische durchführung (ging mir ein bisschen zu schnell, wird aber noch in der Übung behandelt)
* Ende der Vorlesung 


**(Vim und git Bash hatten wir bereits in der Übung auf unseren Rechnern installiert)**

##### Tsch�ss Lerntagebuch, bis zum nächsten mal!

## Vorlesung 2 28.10.2020

### Hallo liebes Tagebuch, 

in der heutigen Vorlesung wurden die folgenden git Befehlsketten in Zusammenhang mit den verschiedenen Stufen (Stages) der Dateiverarbeitung besprochen. 
* Repos. klonen 
* Dateien committen
* �bersicht verschaffen (git status/ git diff)
* Staging r�ckg�ngig machen 
* Dateien umbenennen /l�schen
* Commits nachtr�glich �ndern
* Commits allgemein
* Commits R�ckg�ngig machen

#### Des Weiteren wurden folgende Themen besprochen... 

* Liste, die von git ignoriert werden soll (.gitignore)
* Repos untersuchen 
* Branches
* Branches (Beispiele und Befehle)
* Branches und Remote Repositories
* Umsetzung von Branches. Wozu braucht man branches ? 
* git reset!--> M�glichkeiten : soft, hard

**Interessant** fande ich heute ehrlich gesagt nicht so viel, Die Befehle zu kennen ist aber trotzdem sehr wichtig. 

##### Das war mein heutiger Eintrag, bis n�chste Woche..

###### Ich freue mich


## Vorlesung 04.11.2020

### Hallo liebes Tagebuch

**Das habe ich heute gelernt!**

> #### Branches
> Heute habe ich gelernt wozu Branches n�tzlich sind, 
> wie man sie erstellt und wie man sie l�scht.
> Es wurde uns erkl�rt, wie man Branches zu Repos pusht, (da diese vorerst nur lokal erstellt werden)
> und wie man mehrere Branches wieder zusammenf�hrt ( **Merge** ).


> #### Merge
> Probleme beim Mergen, L�sung: **fast-forward** Merge (es wurde nur ein branch weiterentwickelt),oder 
> der **drei Wege Merge** (Master Branch hat sich zus�tzlich weiterentwickelt). 
> Bei diesem **drei Wege Merge** wird ein sog. **Merge Commit** erzeugt. 
> Dieser Commit enth�lt alle �nderungen, die man ,,verpasst'' hat.

> #### Merge Konflikte 
> k�nnen auftreten, wenn Dateien an den gleichen Stellen ge�ndert wurden. 
> hier muss dann der Benutzer selbst entscheiden, welche der Beiden Dateien er l�schen m�chte. 
> allerdings habe ich diesen Teil praktisch noch nicht so ganz verstanden. 

> #### Aktualisierung veralteter Branches durch einen Branch Merge
> Master in den Feature Branch mergen, um auf dem neusten Stand zu sein 
> * **Vorteile** 
> > * es wird nur hinzugef�gt
> > * bestehende Branches bleiben ansonsten unver�ndert
> * **Nachteile**
> > * bei h�ufigem mergen, gibt es viele commits 

> #### Aktualisierung durch einen Branch Rebase
> Abzweig eines Branches wird **umgeh�ngt**
> * **Vorteile** 
> > * saubere Historie 
> * **Nachteile**
> > * kompletter Branch wird verschoben, sorgt f�r Chaos wenn mehrere daran abreiten. 

> #### Weiteres
> Des weiteren wurde uns erkl�rt, wie Branches umgesetzt werden k�nnen und wie mit Reset und Revert Commits R�ckg�ngig gemacht werden 
> Die Einzelheiten hierzu habe ich aber dann leider **nicht mehr verstanden**, bzw. konnte dem Dozenten nicht mehr folgen.  
> Ansonsten war ich sehr zufrieden mit der heutigen Vorlesung 

**Besonders interessant** fande ich heute das l�sen von Merge Konflikten.
##### Bis n�chste Woche ! 

###### Tsch�ss.

## Vorlesung 11.11.2020

### Hallo liebes Tagebuch 

**das habe ich heute gelernt !**
  
 * Rebase Wiederholung 
 * Rebase Interactive 
 * **Rebase Commands**
> unter anderem prakische Auf�hrung von Rebase commands an einem Beispiel.
> Cherry Pick: (einzelne Commits holen)
 * **Umsetzen von Branches: git reset "Commit"** 
> * git reset "commit" --soft 
> * git reset "commit" --mixed
> * git reset "commit" --hard
 * Vergelich Reset vs Revert
 * i**Arbeitsweise mit Branches in git** 
> Feature Branch Workflow : f�r jedes Feature wird ein Branch angelegt
> die Entwicklung von Features st�rt somit nicht das Gesamtprodukt 
> "master" enth�lt niemals unvollst�ndigen / defekten Code 
> bevor �nderungen auf master einflie�en, k�nnen Pull request( Github ), oder Merge request( Gitlab )durchgef�hrt werden. 
> Das ist hilfreich, um den Code gemeinsam zu diskutieren: Wissensaustausch
> **Gitflow Workflow**: Grafik Folien 
 * Andere Git Befehle
> * Tags (Markierungen im Repo/ Bsp.: Versionsst�nde hinzuf�gen) / k�nnen auch zum Branchwechsel genutzt werden 
> * Stash ( Zwischenst�nde Zwischenspeichern)
> * Blame ( wer hat das ge�ndert ? : man kann sehen, welche Zeile wann und von wem committed wurde 
> * Hunks 
> * Fehlersuche mit git bisect

**Besonders Interessant** fande ich den Feature Branch Workflow, da auch relevant f�r unser Projekt.

##### Bis n�chste Woche ! 

###### Tsch�ss.


## Vorlesung 18.11.2020

### Hallo liebes Tagebuch

**das habe ich heute gelernt !**

**Weitere git Befehle**

>  git **blame** "Datei"; Wer hat das ge�ndert? mit praktischer �bung. 
>  git add **--patch**; damit k�nnen Teile von Dateien committet werden, sog. Hunks. 
>  git **bisect**; wenn sich ein Bug eingeschlichen hat.. sucht in den letzten ...F�llen ( git bisect start HEAD HEAD�10 --)

### Neues Thema: **Agile Software Entwicklung**

#### Wichtige Punkte zu einem Erfolgreichem Projekt


**Gute Kommunikation** innerhalb des Teams bedeutet: 

* Regelm�ssige Treffen
* lieber mehr kurze als wenig und daf�r lang(weilig)
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
* Detailplanung f�r die n�chsten 2-4 Wochen
* dann neu �berlegen, was gerade am Wichtigsten ist

**Fristen einhalten**

* Fr�h zu einem "abgabef�higen" Spiel kommen
* Erst danach an weiteren Features arbeiten
* Qualit�t ist wichtiger als Quantit�t

**Wesentliche Details erkennen**

* Funktioniert es wie gedacht?
* Ist die Bedienung selbsterkl�rend?
* Was k�nnte man verbessern?


**Wasserfall Modell**

**Iteratives Modell**

**Scrum**

Eine der bekanntesten Methoden der agilen Software Entwicklung

* "Scrum akzeptiert, dass der Entwicklungsprozess nicht
vorherzusehen ist. Das Produkt ist die bestm�gliche Software
unter Ber�cksichtigung der Kosten, der Funktionalit�t, der Zeit
und der Qualit�t"

* Scrum Team 
* Scrum Rollen 
* Product Owner
* Scrum Master 

**Feedback**

Die heutige Vorlesung in Bezug auf agile Softwareentwicklung wwar sehr interessant und ich konnte einen guten ersten Einblick 
gewinnen, wie eine optimale Projektplanung und Umsetzung innerhalb eines Entwicklungsteams stattfindet, bzw. stattfinden sollte. 


##### Bis n�chste Woche !

###### Tsch�ss.


## Vorlesung 25.11.2020

### Hallo liebes Tagebuch

**Das habe ich heute gelernt !**

#### Das Agile Manifest!
**Wichtig !**
* **Individuen und Interaktionen** stehen �ber Prozessen und Werkzeugen
* **Funktionierende Software** steht �ber einer umfassenden Dokumentation
* **Zusammenarbeit mit dem Kunden** steht �ber der Vertragsverhandlung
* **Reagieren auf Ver�nderung** steht �ber dem Befolgen eines Plans 

* Wann Agil nicht funktioniert und irrglauben in der agilen S.Entwicklung

#### Scrum
(Rahmenwerk der Agilen Softwareentwicklung)
> Wer agil ist, macht nicht unbedingt Scrum !
> Wer Scrum macht, ist nicht unbedingt agil !

* **Sprint** = **Iteration** (Phase, in der keine Plan�nderungen stattfinden)
* Sprints k�nnen abgebrochen und neu gestartet werden!
* Produkt ist danach fertig = Planung, Design, Entwicklung und Tests finden innerhalb des Sprints statt!

* **Scrum Team**
* Cross-Funktional, 5-9 Personen, flache Hierarchie
* **Scrum Rollen**
* Product Owner = Verantwortung/ Ziele festlegen, diese auch komunizieren,
nimmt die Arbeitsergebnisse ab
* Scrum Master = Sorgt daf�r, dass Scrum Werte und Prozesse gelebt werden, hilft, das jeder Scrum versteht. Moderator und Coach.

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
* Informelle Abschlusspr�sentation und Diskussion des Sprints
* Was haben wir erreicht, was bleibt zu tun ?

### Sprint Retrospective
* Letztes Meeting im Sprint
* Ziel: Kontinuierliche Verbesserung

### Product Backlog / Sprint Backlog
* bereits in der �bung gelernt
* in diesem Zusammenhang allgemein **Scrum Board /Sprint Board**
	* Dient zur Visualisierung der Arbeit im Sprint 
	* Spalten : **ToDo, In Progress, Done**,
	* regelm��ige Aktualisierung

### Velocity & Burndown Charts

**Feedback** Das Thema heute hat mich nicht abgeholt und ich war weniger konzentriert. Ich denke Daily Scrum ist dennoch sehr wichtig f�r den Arbeitsalltag in der Softwareentwicklung. 

#### Das war mein heutiger Eintrag



## Vorlesung 09.12.2020

### Hallo liebes Tagebuch

**Vorab** wurden heute einige organisatorische Informationen und weitere Rahmenbedingungen �ber das Spiel, die folgende Pr�sentation und das Projekt an sich besprochen.

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

* Die Besprechung von allgemeinen Informationen zum Projekt und der Pr�sentation
* Besprechung DefOps und die Philosophie von DefOps

### Feedback 
* Sehr interessante Vorlesung, abwechslungsreiche Themen und alles Projektorientiert!

#### Das war mein heutiger Eintrag



## Vorlesung vom 16.12.2020

### Hallo liebes Tagebuch


### Das habe ich heute gelernt:

> **debugging** in Visual Studio Code und IntelliJ; Breakpoints setzen (Beispiel Adventskalender)

> **Clean Code !** Problem: die Code Qualit�t sinkt, je l�nger an dem Projekt gearbeitet wird.(Software rott)
> Clean Code bedeutet, der Code soll lesbar, Wartbar, Testbar und Elegant sein. 
> Den **richtigen Namen** finden: Github Projekt, Klasse, Variable, Methode, Parameter,...
> gute Namen Beispiele: ...Gute Namen vermitteln den Zweck
> ...Gute Namen sind organisiert
> Variablen sollen **Leicht findbar** sein. 
> **Schreibweisen einheitlich** Schreibweisen - egal wie, aber einheitlich
> **Gute Methoden**
> nicht l�nger als eine Bildschirmseite = Lesbarkeit
> Ziel: Jede Methode macht genau eie Sache, und das richtig gut ! 
> **DRY** Prinzip ; Dont repeat yourself
> **Kommentare** 
> Kommentare sind kein Ersatz f�r guten Code; mehr ist nicht besser
> Schlechte Kommentare Beispiele.
> **Javadoc**
> **Auskommentierter Code** ; relativ zeitig l�schen, wenn nicht mehr ben�tigt.
> **Objektorienierung und Datenstrukturen**


### Das fande ich heute besonders interessant:
> **debugging** 
> **Clean Code**


### Das ist mein Feedback f�r heute: 
> Sehr interessant f�r unser Projekt; im Bereich Clean Code k�nnen wir nun noch einiges optimieren


### Bis zum n�chsten mal!





## Weihnachtspause 



## Vorlesung/ Besprechung 13.01.2021

**heute wurden haupts�chlich allgemeine Fragen besprochen.** 
* Fragen zur Klausur/ Pr�sentation
* Fragen zu Git Befehlen 

* heute habe ich nichts neues gelernt, es war aber sehr gut das einzelne Themen nochmals angesprochen wurden. 

## 20.01.2021

* heute stand die Klausur an und am Freitag findet unsere Projektvorstellung statt

### Das war mein letzter Eintrag 

#### Tsch�ss Tagebuch 



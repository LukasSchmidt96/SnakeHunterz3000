# Tagebucheintrag - Vorlesung 1 am 21.10.2020 - AI 1001

## Welche Themen wurden behandelt? 
* Wie bestehe ich das Modul? -> Tagebucheinträge, Spielprogrammierung mit Präsentation, Klausur

* Einführung in den VIM-Editor: "veraltete Benutzeroberfläche/Bedienung" jedoch in GID-Bash integrierbar und funktional
* bedienbar über 3 verschiedene Modi
* GIT-Grundlagen inkl. GIT-Lab
* geeignet für Teamprojekte
* enthält 3 Bereiche
* synchronisierbar mit GIT-Lab, Dateien werden jedoch in den eigenen Workspace kopiert und erst nach Bearbeitung mit Lab synchronisiert


## Was war besonders interessant?
* Warum GIT im Arbeitsleben benutzt wird

## Was kannte ich schon?
*  In dieser Veranstaltung hatte ich keine fachlichen Vorkenntnisse

## Könnte man etwas besser machen? Wenn ja, was?
*  Insgesamt bin ich sehr zufrieden. Teilweise ist die Vorlesung zu oft gestört durch Probleme von Studierenden, wodurch der Fokus etwas verloren geht. Vielleicht könnte man individuelle Probleme eher in der Übung behandeln.
	
### Liebes Tagebuch... für mich heißt es jetzt: an die Strukturen von GIT gewöhnen und schön Vokabeln lernen.... Ich hab doch so gerne mit der Mouse gearbeitet trauriger Smiley


# Tagebucheintrag - Vorlesung2 - 28.10.2020 - AI1001

## Welche Themen wurden behandelt?
* Wiederholung der ersten Vorlesung
* Neu gelernte Befehle in GIT: git cat: Inhaltsausgabe, git diff: detailliertes Änderungsprotokoll, ... --cashed: Bezug auf Staging Area, git reset -- < Dateiname -> Staging rückgängig gemacht, git commit --amend "neuer Inhalt" -> commit-Kommentar ändern, git log: Anzeigen aller commits, git revert id aus diff, Rückgängigmachen eines Commits, git branch: Liste ausgeben aller Branches, git checkout ... -> branch wechseln
* Was macht einen guten Commit aus
* .gitignore -> Liste aller Dateien, die git ignoriert
* Branches - Markierungen an commits: master: aktueller branch

## Was war besonders interessant?
* Zusatzinformationen, wie beispielsweiße: Was macht einen guten Commit aus.

## Was kannte ich schon?
* Durch Vorarbeiten waren mir einige Befehle schon bekannt, trotzdem wurde mir die korrekte Anwendung erst durch die Vorlesung bekannt.

## Könnte man etwas besser machen? Wenn ja, was?
* Rundum zufrieden!

### Liebes Tagebuch... das war viel Input, das muss ich mir nochmal anschauen und verinnerlichen


# Tagebucheintrag - Vorlesung3 - 04.11.2020 - AI1001

## Welche Themen wurden behandelt?
* Hinweise auf korrekte Formatierung in Markdown
* Wiederholung zu Branches, das sogenannte "Power Feature" von GIT: Beispielsweise das Verhalten von Commits auf verschiedene Branches
* Branches zum Origin pushen mit: git push -u origin BranchName
* Branches zusammenführen mit: git merge BranchName, teilweise sind auch merges vom Master in den Feature Branch sinnvoll
* einfache und schwierige Probleme beim mergen, Typen von Commits: Fast Forward, Drei-Wege-Merge: führt zu Merge Commit
* Merge Konflikte bei Änderungen an den selben Stellen einer Datei
* Branch Rebase Vor-/Nachteile und mögliche Konflikte im Team

## Was kannte ich schon?
* Bis auf ein paar Befehle, groesstenteils neu

## Was war besonders interessant?
* Die hypothetischen Beispiele aus dem Arbeitsalltag von Softwareentwicklern, die zusammen an einem Projekt arbeiten
* Das Vormachen eines Konflikt-Szenarios

## Könnte man etwas besser machen? Wenn ja, was?
* Heute war ich rundum zufrieden


# Tagebucheintrag - Vorlesung4 - 11.11.2020 - AI1001

## Welche Themen wurden behandelt?
* git rebase: Zusammenführen einer Abfolge von Commits in einen neuen Basis-Commit
* git cherry-pick commitID: einzelne Commits ändern, bspw. für Bugfixes
* git reset: kompletten Branch umsetzen/ Markierung ändern
* git revert vs. reset
* Arbeitsweise mit Branches in einem Entwicklungsteam, z.B Gitflow: Pull Request, merge in den dev Branch, nicht direkt nach master

## Was kannte ich schon?
* Diesmal war alles neu!

## Was war besonders interessant?
* Gitflow Workflow mit realem Anwendungsbezug

## Könnte man etwas besser machen? Wenn ja, was?
* Zurzeit keine Verbesserungswünsche


# Tagebucheintrag - Vorlesung5 - 18.11.2020 - AI1001

## Welche Themen wurden behandelt?
* git blame: commit auf Personen zurückführen
* git add --patch: Teile von Dateinen / Hunks committen
* git bisect: binäre Fehlersuche starten

* NEUES THEMA: Agile Softwareentwicklung
* Kommunikation als häufiger Scheiterungsgrund und wie wird richtig kommuniziert
* unrealistische Projektplanung als Scheiterungsgrund
* Fristen umbedingt einhalten! Am besten früh zu einem abgabefähigen Spiel kommen. Qualität vor Quantität!
* Wesentliche Details sollten frühzeitig erkannt werden!
* Erläuterung von Softwareentwicklung definiert als Wissensarbeit: z.B. benötigt man eine flache Hierachie
* Iteratives Vorgehen vs. "wasserfallartiges" Vorgehen
* Keine Feature-Factory: Komplexität vermeiden. Funktionalität vor Komplexität. Kein "Over-Engineering"
  
## Was kannte ich schon?
* Größtenteils neu!

## Was war besonders interessant?
* Sehr schön, dass ständig Bezüge zu unserem Projekt geliefert worden sind!
* Auch Exkurs in damalige Arbeitssituationen sind interessant 

## Könnte man etwas besser machen? Wenn ja, was?
* Nichts zu bemängeln


# Tagebucheintrag - Vorlesung6 - 25.11.2020 - AI1001

## Welche Themen wurden behandelt?
* Das Agile Manifest
	* Priorisierung von Herangehensweisen der agilen Softwareentwicklung. Jedoch nicht Eliminierung konventioneller Herangehensweisen 
	* Anforderungsänderungen zu jeder Zeit Willkommen
	* Lieferung von Software in regelmäßigen, relativ kurzen, Abständen
	* Selbstorganisiertes Team, auf Augenhöhe
	* Projekterrichtung rund um motivierte Individuen, genug Spielraum lassen ......
  * Wann Agile Softwareentwicklung nicht funktioniert
	* nicht agile Organisation
	* Strenge Hierarchie
	* Budget quartalsweise/jährlich geplant
	....
* Scrum
	* Rahmenwerk zur Agilen Entwicklung, nicht nur zur Softwareentwicklung
	* Durchlauf von Iteratione/Sprint, ca 1 bis 4 Wochen
	* Schutz vor Fremdeinteilung
	* Scrum Rollen: Produkt Owner, Scrum Master, Entwicklung
	* Verschiedene Meetings, zB.: Sprint Planning, Sprint Review, Daily Standup

## Was kannte ich schon?
* Einige Prinzipien der Agilen Entwicklung

## Was war besonders interessant?
* Philosophie und Diskussion über Agile Softwareentwicklung
* Irrglauben/Vorurteile bezüglich Agile Softwareentwicklung

## Könnte man etwas besser machen? Wenn ja, was?
* Keine Verbesserungsvorschläge


# Tagebucheintrag - Vorlesung7 - 02.12.2020 - AI1001


## Welche Themen wurden behandelt?
* Fortsetzung Scrum
	* Retrospektive, lässt sich üben/testen durch retromat
	* Product backlog: Product Goals, hauptsächlich durch Product Owner verwaltet
	* Sprint Backlog, wird von Entwicklern während des Meetings idealer Weise verwaltet
	* Inkrement: Benutzbare Verbesserung, getestet
* Erweiterungen von Scrum 
	* User Stories: Anforderungen, Ziele aus Sicht des Users
	* Exception Criteria: Besprechung eines User-Story-Tests
	* Story Points: Gegenmaßnahme zum Schätzen in Stunden/Tagen: Illsusion man könne Schätzen soll genommen werden
	* Scrum Board / Sprint Board: Visualiesierung dear Arbeit im Sprint
	* Velocity und Burndown Charts: Durchschnittliche Summe an Story Points, die im Sprint geschafft werden/ Visualiesierung der schon erledigten Story Points
* Kanban: Optimierung des Durchflusses in einem Arbeitssystem / Eliminierung von Engpässen

	
## Was kannte ich schon?
* weitgehend neue Informationen!


## Was war besonders interessant?
* Die detaillierte Beschreibung eines Projektablaufs
* Vorstellung des Retromats
* Kanbanboards und die Notwendigkeit von WIP-Limits

## Könnte man etwas besser machen? Wenn ja, was?
* Keine Verbesserungsvorschläge 


# Tagebucheintrag - Vorlesung8 - 09.12.2020 - AI1001


## Welche Themen wurden behandelt?
* Klausurinhalte, Bewertung und Termine
* Dev Ops:
	* Zusammenschnüren von mehreren Submodulen zu einem Gesamtprojekt kann Bugs hervorrufen 
	* DevOps bricht klassiches Rollendenken auf: alle Funktionen an einem gemeinsamen Feature
	* Tester entwickeln automatisierte Tests
	* IT-Admins kümmern sich um die automatiserte Bereitstellung von Servern und der automatiserten Auslieferung der Software
	* DevOps ist eine Philosophie: Bsp.: Jeder Mitarbeiter kann Software zum laufen bringen
	* Linting zur Analyse der Codequalität, in den meisten IDE's enthalten
	* Git-Hub-Super-Linter 



## Was kannte ich schon?
* Grundgedanke von DevOps

## Was war besonders interessant?
* Fiktive Probeklausur
* Erläuterung von DevOps

## Könnte man etwas besser machen? Wenn ja, was?
* Keine Verbesserungsvorschläge 


# Tagebucheintrag - Vorlesung9 - 16.12.2020 - AI1001

## Welche Themen wurden behandelt?
* Besprechung allgemeiner Herangehensweisen beim Programmieren
	* Debugger: Continue,Step in,Step out, ...aktuelle Variablenwerte analysieren, Breakpoints setzen
* Clean Code - guten Code schreiben
	* Guter Code ist: lesbar, wartbar, testbar, elegant
	* Gute, eindeutige Namen nehmen, vergleichbare Namen, einheitliche Schreibweisen
	* DRY: Don't repeat yourself: Redundanz vermeiden, da häufige Fehlerquelle
	* Kommentare vs. Lesbarer Code 
	* Differenzierung schlechter und guter Kommentare
	* Variablen an richtigen Orten definieren
	* Reihenfolge ,beispielsweise Methodenreihenfolge, einhalten


	
## Was kannte ich schon?
* Bugfixtools
* Einige Code-Style-Anforderungen, jedoch nicht in der vorgetragenen Fülle

## Was war besonders interessant?
* Vorführung von dem fiktiven Bugfix
* Allgemein das Thema Clean Code

## Könnte man etwas besser machen? Wenn ja, was?
* Keine Verbersserungsvorschläge


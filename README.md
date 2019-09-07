[![Build Status](https://travis-ci.org/anirml/rest-jpa-devops-startcode.svg?branch=master)](https://travis-ci.org/anirml/rest-jpa-devops-startcode)

# WEEK 36

### Hej har været lidt syg og haft travlt de sidste dage,
### alle opgaver fra fradag med travis build links osv vil
### ligge i denne readme fil senest d.07-09-2019 kl 18:00!

## OBS kun alt afleveret nu 21:25. undkyld forsinkelsen.

# Mandag 02-09-2019
## - Getting Started with Travis and CI
### - https://docs.google.com/document/d/1yN8fiKHI5oz4TfZrH_zHla51eiQ42F8tognZ4vefcVw/edit

Først lavede vi repository på github forket fra: 
https://github.com/cphdat3sem2019spring/travisGettingStarted
herefter fjernede vi link til travis status icon i README.md.

Herefter connectede vi travis med vores github account.
Her gav vi Travis adgang til vores Travisgettingstarted repository
Travis buggede projectet og kørte testen i projectet og fejlede, som vi forventede
da testen forventer 10 men for 5.

Travis laver et status icon for repositoriet som vi kopierede link til ind i vores
README.md fil. Vi kunne se iconet med status build.failing.

Derefter ændrede vi return værdien 5 til 10, så testen skulle passe.
vi commitede og pushede ændringerne op på github.
Testen fik "build passing" efter Travis byggede projektet fra github.

## - REST,JPA, Test and CI with our start code
### - https://docs.google.com/document/d/1X3fK_9k2x4nImWI66EGrKbN0bOYXPRAepmGPEc-crHU/edit

Her fik jeg lavet en copy af prejectet fra:
https://api.travis-ci.org/v3/job/582091244/log.txt

flugte guided til at sette projectet op github og via travis deploy det på
http://lotzofweb.com/rest-jpa-devops-starter/

havde enkelte problermer når der allerede var et prject mad samme navn deployed på tomcat
måtte manuelt undeploye projektet for at travis kunne deploye det.

# Tirsdag 03-09-2019

## - Use restassured and hamcrest matchers to create integration test on restful web services
### - https://docs.google.com/document/d/1IgPreanVatXjhQm11x1kUTl6r3EunUPaKK73zJfAksM/edit

Her fortsætter vi med vores movie database vi lavede dagen før.
vi sørgede for at vores rest service kunne spøtte noget brugbart json ud
f.eks:

[
  {
    "id": 1,
    "MovYear": 1999,
    "MovTitle": "The Matrix",
    "MovDirector": "Lana og Lilly Wachowski"
  },
  {
    "id": 2,
    "MovYear": 2014,
    "MovTitle": "Interstellar",
    "MovDirector": "Christopher Nolan"
  }
]

1.
I første del af opgaven skulle man se om 
http://lotzofweb.com/rest-jpa-devops-starter/api/movie/
returner {"msg":"Hello World"}
vi skulle lave en test der tester om det er det der bliver send ud i body.
jeg valgte at returne "Hello World. Demo metode!" i stedet og teste
om det så er det der bliver sendt ud i body beskeden "msg".

2.
http://lotzofweb.com/rest-jpa-devops-starter/api/movie/count

Næste opgave skulle vi lave test for endpoint /api/movie/count for at se om antallet(count) er 2.

3.
http://lotzofweb.com/rest-jpa-devops-starter/api/movie/all

Her lavede jeg test for om endpoint api/movie/all indeholder en moviedirector
kaldet "Christopher Nolan

4.
er sprunget over pga tidmangel.

5.
http://lotzofweb.com/rest-jpa-devops-starter/api/movie/2

# Onsdag 04-09-2019

masser af mindre javascript opgaver. alt om java arrays osv.
callback funktion osv.
funktioner i js.

jeg har brugt javascript til at lave hjemmeside der kan
opbygge text til brug til et spil (Path of Diablo).
dog er jeg langt fra færdig med at lave dette script der skal kunne opbygge tekst filer.
text filerne skal kunne bruges til at vise bestemt loot i spillet.

SE HER FOR JS HTML SIDEN!
http://lotzofweb.com/rest-jpa-devops-starter/

# Torsdag 05-09-2019

Her brugte vi maps til at lave lists. mere DOM manipulation osv.
vi implementerede en calculater i en html side.

# Fredag 06-09-2019

## http://lotzofweb.com/rest-jpa-devops-starter/
















*This project is meant as start code for projects and exercises given in Flow-1+2 at http://cphbusiness.dk in the Study Program "AP degree in Computer Science"*

*Projects which are expected to use this start-code are projects that require all, or most of the following technologies:*
 - *JPA and REST*
- *Testing, including database test*
- *Testing, including tests of REST-API's*
- *CI and CONTINUOUS DELIVERY*

### Preconditions
*In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines* 
# Getting Started

This project contains two major documentation files: 
 - [First time users - getting started](README_proof_of_concept.md)
 - [How to use for future projects](README_how_to_use.md)

# TPs Génie Logiciel

Ce dépôt contient l’ensemble des travaux pratiques réalisés dans le module de Génie Logiciel (S4 - ENSA).

---

## Structure du projet

TPs-Genie-Logiciel/
├── TP1-POO/
│   ├── Code/
│   └── Rapport_TP1.pdf
├── TP2-git/
│   ├── Code/
│   └── Rapport_TP2.pdf
├── TP3-Docker/
│   ├── Code/
│   └── Rapport_TP3.pdf

---

## Description des TPs

### TP1 - Programmation Orientée Objet (POO)

Ce TP a permis de mettre en pratique les concepts fondamentaux de la POO :

* Classes et objets
* Encapsulation
* Méthodes

---

### TP2 - Git

Ce TP porte sur la gestion de version avec Git :

* Initialisation d’un dépôt
* Gestion des branches
* Commandes principales (add, commit, merge)

---

### TP3 - Docker

Ce TP consiste à déployer une application multi-conteneurs avec Docker :

* Frontend (Nginx)
* Base de données (PostgreSQL)
* Interface pgAdmin
* Utilisation de Docker Compose
* Mise en place d’un volume persistant

---

## Exécution du TP Docker

```bash
docker-compose up --build
```

Accès :

* Frontend : http://localhost:8080
* pgAdmin : http://localhost:5050

---

## Remarque

Un fichier `.env` a été utilisé pour configurer les variables d’environnement nécessaires au service PostgreSQL.

---

## Auteur

* Nom et prénom : Salma CHAHBI
* Établissement : ENSA
* Filière : TDI
* Année : 2ème année cycle ingénieur

---

## Conclusion

Ces travaux pratiques permettent de maîtriser :

* La programmation orientée objet
* La gestion de version avec Git
* La conteneurisation avec Docker

Ils constituent une base essentielle pour le développement logiciel moderne.

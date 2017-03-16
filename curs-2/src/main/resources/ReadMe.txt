Build ATM Console Application

Flow:
   * Userul este rugat sa se autentifice cu account number si pin
   * Daca am gasit contul userul poate face 4 actiuni: balanta cont, depozit, retragere sau sa iasa
   * Daca nu este gasit contul este rugat sa incerce din nou
Actiuni:
    * afisam in consola balanta
    * deposit. sa introduca cat vrea sa adauge la cont si balanta se modifica
    * retragere. Userul va selecta dintr-o lista de optiuni. Daca cash are destule bacnote ii da banii
    * exit - userul face log off

User case:
    * Are ecran unde afiseaza mesaje si o tastatura pentru interactiune
    * ATM lucraza cu un database
    * Un cont are un id si este protejat de un pin
    * Pe un cont avem o balanta pe care o creditam sau o debitam
    * Un ATM suporta 3 tipuri de tranzactii
    * Cash dispenser poate sa dea doar bacnote de 20$ si are un numar limitat.
    * Numarul de bacnote pe care le pot scoate nu se modifica
    * Putem face o tranzactie doar daca userul este autentificat cu pin si numarul contului.
    * Balanta afiseaza pe ecran balanta userului care este autentificat
    * Poate retrage in functie de niste optiuni(20,40,60,100,200)
    * Depozitul crediteaza contul. cash dispenser nu se modifica
    * Keypad-ul nu da user input (amount sau optiune)
    * Screen-ul ne afiseaza un mesaj
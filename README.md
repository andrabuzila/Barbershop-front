# Barbershop-front


Proiectul propus are ca si scop final crearea unui site pentru un barbershop. Clientii isi vor putea face programare alegand frizerul dar si serviciul pe care si-l doresc, vor putea achizitiona produsele vandute de barbershopul respectiv, dar vor putea vizualiza si cateva frizuri create de frizerii barbershopului. Pe site vor fi afisate pozele tuturor frizerilor impreuna cu datele lor de contact, produsele vandute de catre frizerie, dar si cateva informatii legate de magazin/barbershop. 


Atat clientii cat si frizerii, produsele si serviciile sunt stocate intr-o baza de date. Asupra acelei baze de date se vor putea efectua anumite operatii. In cazul clientilor, vom putea face GET, adica vom putea sa vedem toti clientii impreuna cu datele lor, putem face POST, adica sa adaugam client in baza noastra de date, dar vom putea si sa stergem client, cu DELETE. Ca si implementare: am creat o entitate Client, care contine toate campurile din baza de date, ulterior am facut repository-ul care extinde interfata predefinita CrudRepository, specifica spring-boot-ului, care are deja implementate metodele findAll(), save() si  deleteById() pe care eu le-am folosit in vizualizarea clientilor, adaugarea in DB, respective stergerea clientilor. Am creat interfata ClientService cu toate metodele in care apelam metodele predefinite, iar clasa ClientServClass implementeaza interfata respective. In ClassController am create o instanta de ClientServer de unde am apelat toate metodele enuntate mai sus. Procesul acesta l-am repetat atat pentru client cat si pentru barber, serviciu si produs. In clasa ProjectPsApplication am pornit practice aplicatia cu ajutorul comenzii run specifica spring-boot-ului.

In fisierul application.properties se face coenxiunea la baza de date. Aici am introdus URL-ul de la baza de date, username-ul si parola, dar si driverul. Am pus dependentele necesare pentru baza de date mysql dar si cele pentru spring-boot in fisierul pom.xml.

Am rulat aplicatia in linia de comanda folosind comanda mvnw “spring-boot:run”, aceasta porneste aplicatia, iar in timp ce aceasta ruleaza, in Postman am introdus path-urile create de mine. In functie de path-ul introdus vom putea vizualiza datele din baza de date sau vom putea introduce sau sterge client. 

Am realizat proiectul in asa fel incat sa existe 2 tipuri de useri care ar putea sa se conecteze la aplicatie. Am creat cate un repository pentru fiecare tip de user si de asemenea in pachetul service am creat si implementat o interfata UserService care are functii de login, de creare user si de getUser si deleteUser.

Am creat diagrama UML si diangrama bazei de date si le-am adaugat in fisierul proiectului. De asemenea se pot vizualiza si aici.

![DBDiagram](https://user-images.githubusercontent.com/72390634/171859744-dc3e11a2-4937-4a4d-a74f-3ef466800ad0.jpg)

Fig. Diagrama Bazei de Date

![UMLDiagram](https://user-images.githubusercontent.com/72390634/171859758-26948131-c6f6-473a-9fa4-ecfa8933a2aa.jpg)

Fig. Diagrama UML

Partea de frontend a fost realizata in Android Studio. Ca si limbaje folosite avem Java si Kotlin. In java am implementat Clasa Main care are un layout corespunzator: main_activity. In main activity am creat practic pagina de start.

![start_page](https://user-images.githubusercontent.com/72390634/171860826-62140f9d-9962-4667-83c6-bbda32747bf5.jpg)

Fig. Start Page

Pagina de start este pagina de log in a utilizatorului. Avem butoane care realizeaza diferite sarcini, cum ar fi: butonul de "Admin" ne directioneaza spre pagina de log in a adminului, butonul de "Sign Up" odata accesat ne trimite spre pagina de creare cont si mai avem butonul "->" care ne trimite spre pagina utilizatorului.

![userPage](https://user-images.githubusercontent.com/72390634/171861603-a1deeefc-e800-4e02-bc2a-e4c9fb05e22d.jpg)

Fig. User Page

Utilizatorul va putea sa vada lista cu frizeri, sa isi faca programare si sa faca o comanda de produse. Vom avea acces la baza de date a frizerilor de unde vom putea extrage lista cu toti frizerii, pe care utilizatorul va putea sa o vada. Am extras date din baza de date in functia "getMyData()" din clasa ViewBarbersActivity, unde, cu ajutorul unor functii predefinite din retrofit2, am reusit sa ma conectez si sa manipulez date din DB.

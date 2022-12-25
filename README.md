# incidentManagementSystem
On souhaite créer un système distribué basé sur les micro-services en utilisant une architecture pilotée par les événements respectant les deux patterns Event Sourcing et CQRS. Cette application devrait permettre de gérer les infractions concernant des véhicules suites à des dépassement de vitesses détectés par des radars automatiques. Le système se compose de trois micro-services :

- Le micro-service qui permet de gérer les radars
- Le micro-service d’immatriculation qui permet de gérer des véhicules appartenant des propriétaires
- Le micro-service qui permet de gérer les infractions.

### 1. Etablir une architecture technique du projet : 
![Screenshot from 2022-12-26 00-21-37](https://user-images.githubusercontent.com/85079548/209484390-0c1d1d0b-8d62-4d49-ae08-f51ab7ce1490.png)
### 2. Etablir un diagramme de classe global du projet : 
![Screenshot from 2022-12-26 00-22-09](https://user-images.githubusercontent.com/85079548/209484396-2f030e35-e63d-4e7f-9776-1ad3a2429b0e.png)
 
 Architecture du Projet : 
 
 ![Screenshot from 2022-12-26 00-26-41](https://user-images.githubusercontent.com/85079548/209484480-f0564055-6165-444f-b761-93b42d0f4cbb.png)

### 3. le micro-service Radar : 

![Screenshot from 2022-12-26 00-23-04](https://user-images.githubusercontent.com/85079548/209484409-91fe91fd-b6fe-49a2-9268-28257a6c875d.png)

radar-service-command-side :

![Screenshot from 2022-12-26 00-23-38](https://user-images.githubusercontent.com/85079548/209484422-f0f94e1d-d0ff-4bec-8744-177cd2018223.png)
 
 details : 
 ![Screenshot from 2022-12-26 00-33-56](https://user-images.githubusercontent.com/85079548/209484588-47ac52d6-f5d9-4115-834d-3a555fd26c74.png)

 radar-service-query-side : 


 ![Screenshot from 2022-12-26 00-24-39](https://user-images.githubusercontent.com/85079548/209484433-2dd2de45-0dec-4768-97ee-fb81222ffca0.png)

 details : 
 ![Screenshot from 2022-12-26 00-34-27](https://user-images.githubusercontent.com/85079548/209484602-270b6862-9aff-452d-a944-dafded29e9ee.png)
 idem pour les autres microservices 
 
### 4. les services techniques de l’architecture micro-service (Gateway, Eureka Discovery service)
 
 ![Screenshot from 2022-12-26 00-32-13](https://user-images.githubusercontent.com/85079548/209484551-c379fc9e-9afd-4f13-baf3-39fdca72479c.png)
![Screenshot from 2022-12-26 00-33-23](https://user-images.githubusercontent.com/85079548/209484568-47b4ffde-b5cb-4f05-b145-9200780955bb.png)

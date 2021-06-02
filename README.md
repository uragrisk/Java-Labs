# Java-Lab 10


## Task:
        Реалізувати збереження об'єкту одного з класів з лабораторної роботи №8 в таблиці в базі даних, використовуючи Spring boot та Spring data

            * Код 9ї лабораторної має бути зміненим таким чином, щоб збереження і зчитування даних відбувалось з використанням бази даних
            * Код має відповідати code convention
            * Код слід перевірити плагінами FindBugs, PMD і Checkstyle, та виправити помилки
            * Код має бути залито в репозиторій як окремий pull request (а не в окрему папку чи окремий репозиторій)
            * Код має містити окремий клас *Controller, *Service та інтерфейс *Repository
            * Налаштування доступу до бази даних має бути реалізоване через проперті файл





## How to run:
1. Open a command line
2. Download the files to the desired folder using the command: **git clone https://github.com/uragrisk/Java-Labs.git**3.
3. Create MySQL database named `ship-manager`
3. With the command in command line cd <*path to downloaded project*> go to main directory of project
4. And enter command to run application:
    * **mvnw spring-boot:run**
5. Open http://localhost:8080/swagger-ui.html in your browser

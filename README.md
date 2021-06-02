# Java-Lab9


## Task:
        Дана лабораторна робота присвячена розробці першого рест-сервісу з використанням мови Java
        1. Задачею 9 лабораторної є створити REST сервіс для одного з класів, створених у лабораторній роботі 3 
        (наприклад для класу Aligator з прикладу в лабораторній роботі 8  - AligatorController),  в котрому реалізовані 
        CRUD-операції (Get/Post/Put/Delete) над ресурсом (наприклад над ресурсом Aligator) та операція повернення всіх 
        об'єктів.
        2.Операція get має використовувати id в url-запиту: /aligator/20
        3. Операція get без id в url-запиту має повертати список всіх наявних об'єктів
        4. Для реалізації  REST сервісу базовий клас з 8-ї лабораторної слід розширити полем id (типу Integer), 
        та добавити set/get методи
        5. Також код слід перевірити з-за допомогою Findbugs/checkstyle/pmd плагінів
        6. Код слід залити окремим пул реквестом відносно коду 8-ї лабораторної
        7. Код контролера та класу RestApplication слід помістити в окремих пакетах
        8. Збереження об'єктів класу Алігатор слід виконувати в об'єкті типу  Map
        Дана лабораторна передбачає зміну існуючого pom.xml файлу шляхом додавання в `нього необхідних залежностей



## How to run:
1. Open a command line
2. Download the files to the desired folder using the command: **git clone https://github.com/uragrisk/Java-Labs.git**
3. With the command cd <*path to downloaded project*> go to main directory of project
4. And enter command to run application:
    * **mvnw spring-boot:run**


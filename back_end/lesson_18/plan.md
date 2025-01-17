<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 18 08/28/2024

## What we learned and did in the last lesson:
- Deployment - installing an application on a server on the Internet
- Docker
- HelloController
- DigitalOceanDataSourceConfiguration
- deployment

## Topic of today's lesson:
Registering a new user
Sending an email

## Practice
1. Implementing registration of new users.
2. Sending a new user a link to confirm registration by email.
3. Implementing user activation after they click on the confirmation link.

___

# План занятия №18 28.08.2024

## Что мы узнали и сделали за прошлое занятие:
- Deployment - установка приложения на сервер в Интернете
  - СУБД - хранения данных (pgAdmin)
  - Java (17) - приложение + JVM 
  - Maven - собирает проект 
- Docker - виртуализация ПО у себя внутри
- HelloController - позволяет понять, какое приложение работает (на локале или в Интернете)
- DigitalOceanDataSourceConfiguration
- deployment

## Тема сегодняшнего занятия:
Регистрация нового пользователя, процесс:
- Шаг 1: получение данных от пользователя
- Шаг 2: сохранение в БД пользователя + код + время действия кода
- Шаг 3: отправка пользователю электронного письма с кодом и ссылкой
- Шаг 4: получение ответа от пользователя, проверка и в случае успеха – изменение его статуса в БД

см. раздел Теория.

## Практика
1. Доработка структуры БД и требуемых классов.
2. Отправка новому пользователю по электронной почте ссылки на подтверждение регистрации.
3. Реализация активации пользователя после его перехода по ссылке подтверждения.

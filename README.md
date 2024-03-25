# backend-QA-practice

Команда для запуска проекта с использованием maven будет иметь следующий вид:  
_mvn spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud_  

Если же вы запускаете из Idea, то вам достаточно будет убрать mvn из начала строки, и тогда вы получите данную строку:
_spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud_


Swagger availables by link - http://**"host"**:**"port"**/swagger-ui.html  
Example: http://localhost:8083/swagger-ui.html 


Запуск и работа как с сервером ресурсов
1. Запускаем проекта с использованием maven:  
   _mvn spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud_  
2. Запускаем наш сервер авторизации auth-server
3. Сначала проходит всю цепочку получения JWTokenа на сервере авторизации согласно readme.md
4. Далее делаем вызов, например закрытого без авторизации эндпоинта сервера ресурсов /auth
    4.1. Обязательно передаем Beaver = (полученный токен от сервера ресурсов)
5. Готово, вы великолепны. 
6. Если токен протух, сделайте рефреш токена согласно readme.md сервера авторизации
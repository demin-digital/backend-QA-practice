# backend-QA-practice

Команда для запуска проекта с использованием maven будет иметь следующий вид:  
mvn spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud

Если же вы запускаете из Idea, то вам достаточно будет убрать mvn из начала строки, и тогда вы получите данную строку:
spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud

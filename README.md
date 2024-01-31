# backend-QA-practice

Команда для запуска проекта с использованием maven будет иметь следующий вид:  
_mvn spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud_  

Если же вы запускаете из Idea, то вам достаточно будет убрать mvn из начала строки, и тогда вы получите данную строку:
_spring-boot:run -Drun.arguments=--spring.profiles.active=db-cloud_

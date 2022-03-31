# kafka-pub-sub-java
# Kafka에 Pub Sub하는 코드

### Port
Port 는 8081을 씁니다. application.yml에서 바꿀 수 있습니다.


### Swagger
localhost:8081/swagger-ui.html

### post로 데이터 보내기
```
fetch("http://www.auction-price.co.kr:30180/sendMessage/", {
  method: "POST",
  mode: 'no-cors',
  body: new URLSearchParams("email=test@example.com&message=world"),
}).then((response) => console.log(response));
```

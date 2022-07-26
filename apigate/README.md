# API GATEWAY

- 일반인에게 API정보를 제공해주고자 할때, 내 공공데이터센터 KEY를 노출하기는 싫고 데이터를 내려주고 싶다. 그럴때 Web Service로 API GATEWAY 를 정의하고 요소 중 보여주고 싶은 정보만 색출,

Job을 만들어 주기적으로 송신 할 수도 있고, API GATEWAY 마다 사용자 요청 Queue를 만들어서 일정 시간마다 API를 제공할 수도 있다.

User 정보로 운영하여 유저마다 API CALL 개수를 제한하고, 모니터링 할 수 있게 제작

1. 제공 API 목록 제작 : 제공 API 목록에는 해당 API의 월당 최대call 개수와 queue당 몇초 제한을 할 것인지, Thread를 몇개를 사용할 것인지를 정의함 

2. API Send Job 제작 : 제공 API를 기준으로 Job을 실행하여 Send할 수 있도록 함

3. 

curl http://localhost:8082/api/v1/students

curl -X POST http://localhost:8082/api/v1/students -d '{"id":1,"name":"viswa"}' -H 'Content-Type: application/json'
(or)
PS C:\Windows\System32\WindowsPowerShell\v1.0> $headers = @{
>>     "Content-Type" = "application/json"
>> }
>>PS Invoke-WebRequest -Uri http://localhost:8082/api/v1/students -Method POST -Body '{"id":1,"name":"viswa"}' -Headers $headers


Invoke-WebRequest -Uri http://localhost:8082/api/v1/students/3 -Method PUT -Body '{"name":"axel"}' -Headers $headers

Invoke-WebRequest -Uri http://localhost:8082/api/v1/students/3 -Method DELETE -Headers $headers




curl -X POST http://localhost:8082/api/v1/students -d "{\"id\":3,\"name\":\"anu\"}" -H "Content-Type: application/json"

curl -X PUT http://localhost:8082/api/v1/students/3 -d "{\"name\":\"axel\"}" -H "Content-Type: application/json"

curl -X DELETE http://localhost:8082/api/v1/students/3 -H "Content-Type: application/json"                              

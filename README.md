# Person-microservice
Spring boot Rest-Full Api

You can test via PostMan/Swagger-ui

ByDefault Port
http://localhost:8080/swagger-ui/#/


Backend Api Request Method:

----------------X--------------

Person Controller


GET

​/person
getPersonStartWith

POST
​/person
save

DELETE
​/person​/{id}
delete

GET
​/person​/age
getByPersonAge

----------------X--------------
Request Body

For Get Method:
http://localhost:8080/person?name=string

Response body

[
  {
    "personId": "string",
    "firstName": "string",
    "lastName": "string",
    "age": 0,
    "hobbies": [
      "string"
    ],
    "addresses": [
      {
        "address1": "string",
        "address2": "string",
        "city": "string"
      }
    ]
  }


For Post Method:
----------------X--------------
person *
object
(body)	
person

Example Value
Model
{
  "addresses": [
    {
      "address1": "string",
      "address2": "string",
      "city": "string"
    }
  ],
  "age": 0,
  "firstName": "string",
  "hobbies": [
    "string"
  ],
  "lastName": "string",
  "personId": "string"
}





For Delete Method:
----------------X--------------
DELETE
​/person​/{id}
delete
Parameters
Try it out
Name	Description
id *
string
(path)	
id

id - id



## Spring Boot Microservices 2 - Transaction Service

### Endpoints

#### 1- Save Transaction

```
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlVXNlcm5hbWU6cmFuZG9tU2VjdXJlUGFzc3dvcmQ=
Content-Type: application/json
Authorization: Basic base64(username:password)
Content-Length: 40

{
    "userId":1,
    "productId":1
}
```

#### 2- Get Transaction Of User

```
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
```

#### 3- Delete Transaction by Id

```
DELETE /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)

```
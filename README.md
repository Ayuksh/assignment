# Java Spring Boot Assignment

creating a simple spring boot application using open JDK 11
1. In this assingment we have to create two API
> + ***Add comments*** 
>   - This API will add a comment .A comment from user A to user B.
> + ***Get comments***
>   - This API will get comment. The API will show all the comments that are available for a user using the app. Eg. User B is using the app and wants to see what comments has she/he received.

2. Create two tables in PostgreSQl:
> + Table name: ***user***
>    - columns :- 
>      1. user id (primary key, big int, unique, not null)
>      2. comment from (varchar(25),not unique, not null)
>      3. comment to(varchar(25), not unique, not null).
> + Table name - ***comment***
>    - columns :-
>      1. comment id (primary key, big int, unique, not null)
>      2. message(varchar(255), not unique, not null)
>      3. comment date time(not null), posted by user id(big int, not unique, not null).

Select name from Customer where referee_id != 2 || referee_id is null;
[
{"headers":{"Customer":["id","name","referee_id"]},"rows":{"Customer":[[1,
"Will",null],[2,"Jane",null],[3,"Alex",2],[4,"Bill",null],[5,"Zack",1],[6,
"Mark",2]]}}
| name |
| ---- |
| Will |
| Jane |
| Bill |
| Zack |
| name |
| ---- |
| Will |
| Jane |
| Bill |
| Zack |

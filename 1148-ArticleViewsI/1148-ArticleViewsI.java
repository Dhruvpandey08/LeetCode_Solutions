select distinct(author_id) as id from Views where author_id = viewer_id order 
by author_id;
[
{"headers":{"Views":["article_id","author_id","viewer_id","view_date"]},
"rows":{"Views":[[1,3,5,"2019-08-01"],[1,3,6,"2019-08-02"],[2,7,7,
"2019-08-01"],[2,7,6,"2019-08-02"],[4,7,1,"2019-07-22"],[3,4,4,
"2019-07-21"],[3,4,4,"2019-07-21"]]}}
| id |
| -- |
| 4  |
| 7  |
| id |
| -- |
| 4  |
| 7  |

Select product_id from Products where low_fats = 'Y' && recyclable = 'Y';
[
{"headers":{"Products":["product_id","low_fats","recyclable"]},"rows":
{"Products":[[0,"Y","N"],[1,"Y","Y"],[2,"N","Y"],[3,"Y","Y"],[4,"N","N"]]}}
| product_id |
| ---------- |
| 1          |
| 3          |
| product_id |
| ---------- |
| 1          |
| 3          |

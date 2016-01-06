# zip_search_engine

## specification

### input csv file

http://www.post.japanpost.jp/zipcode/dl/readme.html

### table

```sql
CREATE TABLE zip
    ( local_cd       NUMBER(5)
    , old_zip_cd     NUMBER(5)  
    , zip_cd         NUMBER(7)
    , prefecture_name     VARCHAR2(255)
    , city_name     VARCHAR2(255)
    , address_name     VARCHAR2(255)
    , prefecture_name_kana     VARCHAR2(255)
    , city_name_kana     VARCHAR2(255)
    , address_name_kana     VARCHAR2(255)
    , cd_1     NUMBER(1)
    , cd_2     NUMBER(1)
    , cd_3     NUMBER(1)
    , cd_4     NUMBER(1)
    , cd_5     NUMBER(1)
    , cd_6     NUMBER(1)
    , CONSTRAINT     zip_cd_uk UNIQUE (zip_cd)
    ) ;
```

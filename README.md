# zip_search_engine

## specification

### input csv file

http://www.post.japanpost.jp/zipcode/dl/readme.html

### table

```sql
CREATE TABLE employees_demo
    ( employee_id    NUMBER(6)
    , first_name     VARCHAR2(20)
    , last_name      VARCHAR2(25) 
         CONSTRAINT emp_last_name_nn_demo NOT NULL
    , email          VARCHAR2(25) 
         CONSTRAINT emp_email_nn_demo     NOT NULL
    , phone_number   VARCHAR2(20)
    , hire_date      DATE  DEFAULT SYSDATE 
         CONSTRAINT emp_hire_date_nn_demo  NOT NULL
    , job_id         VARCHAR2(10)
       CONSTRAINT     emp_job_nn_demo  NOT NULL
    , salary         NUMBER(8,2)
       CONSTRAINT     emp_salary_nn_demo  NOT NULL
    , commission_pct NUMBER(2,2)
    , manager_id     NUMBER(6)
    , department_id  NUMBER(4)
    , dn             VARCHAR2(300)
    , CONSTRAINT     emp_salary_min_demo
                     CHECK (salary > 0) 
    , CONSTRAINT     emp_email_uk_demo
                     UNIQUE (email)
    ) ;
```

```
全角となっている町域部分の文字数が38文字を越える場合、また半角となっているフリガナ部分の文字数が76文字を越える場合は、複数レコードに分割しています。
この郵便番号データファイルでは、以下の順に配列しています。
全国地方公共団体コード（JIS X0401、X0402）………　半角数字
（旧）郵便番号（5桁）………………………………………　半角数字
郵便番号（7桁）………………………………………　半角数字
都道府県名　…………　半角カタカナ（コード順に掲載）　（注1）
市区町村名　…………　半角カタカナ（コード順に掲載）　（注1）
町域名　………………　半角カタカナ（五十音順に掲載）　（注1）
都道府県名　…………　漢字（コード順に掲載）　（注1,2）
市区町村名　…………　漢字（コード順に掲載）　（注1,2）
町域名　………………　漢字（五十音順に掲載）　（注1,2）
一町域が二以上の郵便番号で表される場合の表示　（注3）　（「1」は該当、「0」は該当せず）
小字毎に番地が起番されている町域の表示　（注4）　（「1」は該当、「0」は該当せず）
丁目を有する町域の場合の表示　（「1」は該当、「0」は該当せず）
一つの郵便番号で二以上の町域を表す場合の表示　（注5）　（「1」は該当、「0」は該当せず）
更新の表示（注6）（「0」は変更なし、「1」は変更あり、「2」廃止（廃止データのみ使用））
変更理由　（「0」は変更なし、「1」市政・区政・町政・分区・政令指定都市施行、「2」住居表示の実施、「3」区画整理、「4」郵便区調整等、「5」訂正、「6」廃止（廃止データのみ使用））
```

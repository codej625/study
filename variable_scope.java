메소드 안에서 다음과 같이 쌩뚱맞은 중괄호 블락이 보인다면,
이는 변수의 유효 범위(scope)를 제한하기 위함이다.
ex)
1   public void methodA(){
2       {
3           int a = 0;
4       }
6       int a = 2;
7 
8       return b;
9   }

3번째 라인의 a 변수는 { } 안에서만 유효한 지역변수이며,
위와 같이 a 변수를 6번라인에서 선언해도 문제 되지 않는다.

* 변수 유효범위를 제한하여 코딩할 때 사용하나, 드물게 사용된다. 
# 항상 헷갈리는 개발 용어 정리

<br /><br />

1. 파이프라인(pipeline)
```
파이프라인은 어떤 아키텍처나 패턴, 반드시 활용해야 할 도구(Tools)를 지칭하는 것은 아니다.
- 빌드 & 배포(build & deployment automation) 자동화 -> continuous integration(CI) / continuous delivery(CD)
- 테스트 자동화(test automation)
일반적으로 위와 같은 자동화 프로세스를 지칭한다.

개념의 핵심은 어떤 단계 사이에 수동적 단계나 수동적인 변경이 필요없는 자동화(automation) 이다.
```

<br />

2. 클러스터(Cluster)
```
클러스터는 여러 대의 컴퓨터들이 연결되어 하나의 시스템처럼 동작하는 컴퓨터들의 집합을 말한다.
데이터베이스에서 사용하는 클러스터도 같은 뜻으로 사용된다.
(일반적으로 컴퓨터는 서버를 뜻한다.)

고가용성, 병렬처리, 성능향상 이러한 3가지를 만족하는 시스템의 구성 형태를 띈다.
```

<br />

3. 사이드 이펙트(Side effect)
```
일반적으로 프로그래밍에서 함수나 메서드 등의 실행 결과로 발생하는 예상치 못한 부수적인 결과를 말한다.

* 간단한 예시
함수가 특정 값을 반환하는 경우에만 생각하고 있는데,
이 함수가 실행되면서 전역 변수를 변경한다면, 그것이 사이드 이펙트이다.
이것은 함수의 주된 목적과는 관련이 없지만, 프로그램의 상태를 변경하는 것이다.
```
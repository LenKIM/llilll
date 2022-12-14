# 소수의 정의

소수 = 1과 자기 자신으로만 나누어지는 수  
    = 약수가 2개인 수  

합성수 = 1과 자기 자신을 제외한 다른 약수를 가지고 있는 수


소수 판정법

소수 = 1과 자기 자신으로만 나누어지는 수  
    = 약수가 2개인 수  
    = 2부터 N-1까지의 수로 나누어지지 않는 수  

합성 수 N에서 1을 제외한 가장 작은 약수는 ^N 이하이다.

N=18:2 <= root^18, N=25:5<= root^25, N=21:3 <= root^21

증명
합성수 N에서 1을 제외한 가장 작은 약수를 x라고 하자 N/x 또는 1이 아닌 N의 약수이기 때문에 

x <= (N/x) 이다. 우변의 분모 x를 좌변으로 옮기면 x^2 <= N 이므로 x<= root^N


---

## 소인수 분해

1. 방법의 정당성 
- 소인수 목록에 적힌 수들을 곱했을 때 N이 되는가?
- 목록에 있는 수들이 전부 소수인가?

2. 시간복잡도의 개선
- N이 1일 때 종료하는 대신 i X i > N일 때 종료


--

# 최대공약수

약수 = 어떤 수를 나누어떨어지게 하는 수

18의 약수 = 1,2,3,6,9,18
```java
List<Integer> divisor(int n) {
    List<Integer> div = new ArrayList<>;
    for(int i=1; i<=n; i++) {
        if(n % i == 0) div.add(i);
    }
    return div;
}
```

이게 가장 쉬운 방법.

그러나, 이것도 O(root^N) 에 가능하게 할 수 있다.

18

1 * 18  
2 * 9  
3 * 6 

최대공약수(Greatest Common Divisor)  
= 두 자연수의 공통된 약수 중 가장 큰 약수

20의 약수 = 1,2,4,5,10,20  
12의 약수 = 1,2,3,4,6,12

GCD(20, 12) = 4

유클리드 호제법
두 수 A,B에 대해 A를 B로 나눈 나머지를 r이라고 하면 GCD(A,B) = GCD(B,r) 이다.

GCD(20, 12) = GCD(12,8) = GCD(8,4) = GCD(4,0) = 4   

```java
int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
        }
```

```java
int lcm(int a,int b){
        return a / gcd(a, b) * b;
        }
```

## 연립합동방정식

민경 선생님은 자신의 반 학생이 몇 명인지 갑자기 기억이 나지 않는다. 다만
- 6명씩 조를 짰을 때 3명이 남았다.
- 5명씩 조를 짰을 때 2명이 남았다.
- 학생은 30명 미만이다.

이 3가지 사실은 기억하고 있다. 민경 선생님의 반 학생들은 몇 명일까?

하나씩 30명까지 올라가면서 계산.


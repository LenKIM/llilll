# 0x00 정의와 표현법

정점과 간선으로 이루어진 자료구조

![image-20230109151805519](https://p.ipic.vip/6dsur9.png)



 차수에 따른 그래프 종류가 있음.

![image-20230109151925834](https://p.ipic.vip/2q2vkp.png)



![image-20230109151949695](https://p.ipic.vip/uyt6fl.png)

![image-20230109152025463](https://p.ipic.vip/03bbcu.png)

![image-20230109152043248](https://p.ipic.vip/8mi2gw.png)



표현법은 어떻게 되어야 하는가?

![image-20230109152146506](https://p.ipic.vip/5cm6re.png)



애초에 입력을 어떻게 코드로 옮겨야 하는지 모를 수 있다.



표현법 1 - 인접 행렬

![image-20230109152314685](https://p.ipic.vip/24u23c.png)

무방향 그래프라서 좌우 대칭이 동일하다.



![image-20230109152519421](https://p.ipic.vip/bwpbl3.png)

위 그림은 무방향 그래프

만약 방향성을 가졌다면?

![image-20230109152556185](https://p.ipic.vip/y355vj.png)

![image-20230109152634471](https://p.ipic.vip/3suchq.png)



![image-20230109152842098](https://p.ipic.vip/mzfxqu.png)

![image-20230109152854964](https://p.ipic.vip/w2ysg0.png)

![image-20230109152912534](https://p.ipic.vip/5moc3p.png)



## BFS

![image-20230109153805008](https://p.ipic.vip/05nawv.png)

1. 시작하는 정점을 큐에 넣고 방문했다는 표시를 남김
2. 큐에서 정점을 꺼내어 그 정점과 연결된 모든 정점들에 대해 3번을 진행
3. 해당 정점을 이전에 방문했다면 아무 것도 하지 않고, 처음으로 방문했다면 방문했다는 표시를 남기고 해당 칸을 큐에 삽입
4. 큐가 빌 때까지 2번을 반복

모든 정점이 큐에 최대 1번씩 들어가므로 인접 리스트에서 O(V+E), 인접 행렬에서 O(V^2)의 시간 복잡도

![image-20230109154814909](https://p.ipic.vip/zlxnyq.png)

![image-20230109154830727](https://p.ipic.vip/rg1vc9.png)

![image-20230109154841157](https://p.ipic.vip/b4mspp.png)

![image-20230109154937642](https://p.ipic.vip/6exgql.png)



---

## DFS

![image-20230109155203847](https://p.ipic.vip/0r1dt0.png)

최대 함수 10만개 는 512MB은 절대 안걸린다. 그러나 1MB, 10MB 등의 작게 메모리를 가지면 재귀 대신 스택을 써서 해야 한다.



![image-20230109155505787](https://p.ipic.vip/pego0v.png)



![image-20230109155733783](https://p.ipic.vip/0hz0ii.png)


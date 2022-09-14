/**
 * 푸는데 걸린 시간(Optioanl)
 *
 * 13 Min
 * 문제 풀이(Optioanl)
 *
 *  덩어리로 생각했었는데, 다른 사람의 풀이를 보니 더 잘게 쪼개서 작업하더라.
 *  예를 들어 ' '를 만날때마다 k를 -1 한다. k가 0이 되는 시점이 바로 정답.
 *  이렇게 되면 내 코드와 같이 clone 하지 않아도 된다. *
 *
 * 회고*
 *
 * 익숙한 IDE 를 사용하지 않고, 브라우저에서 코드를 작성하다보니 어려움이 있다.
 * * method 가 기억하지 않는다. 익숙한 IDE에 와서 메소드를 찾는 내 모습을 보곤한다.
 * 조금 더 익숙하게 노력해보자.
 */
class Solution {
    public String truncateSentence(String s, int k) {


        String[] splitt = s.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i <= k-1; i++){
            list.add(splitt[i]);
        }

        return String.join(" ", list);
    }
}

# 블랙잭

### 블랙잭 규칙
- 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며,  
  예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.

- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며,  
  두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다.  
  21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.  

- 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.

- 게임을 완료한 후 각 플레이어별로 승패를 출력한다.

### 승패 규칙

- 처음에 지급받은 2장의 카드 합이 21을 만족하는 경우를 `블랙잭`이라 하며 `블랙잭`에 해당되는 플레이어는 `승리`한다.  
  단, 딜러 또한 `블랙잭`이면 해당 플레이어는 `무승부`로 인정받고 `블랙잭`이 아닌 나머지 플레이어는 모두 `패배`한다.  

- 카드 합이 21을 초과하는 경우를 `버스트`라고 하며, 해당 플레이어는 `패배`한다.

- `블랙잭`과 `버스트`가 아닌 경우
  - 플레이어의 점수가 딜러의 점수보다 크면 플레이어의 `승리`이다.
  - 플레이어의 점수가 딜러의 점수보다 작으면 플레이어의 `패배`이다.
  - 플레이어의 점수가 딜러의 점수와 같으면 `무승부`이다.


### 베팅 규칙

- 플레이어는 게임을 시작할 때 베팅 금액을 정해야 한다.

- 플레이어가 `블랙잭`으로 `승리`하면 베팅 금액의 1.5배를 얻는다.

- 게임이 종료된 시점에서
  - 플레이어가 딜러로부터 `승리`하면 베팅 금액을 돌려 받는다.
  - 플레이어가 딜러로부터 `패배`하면 베팅 금액을 모두 잃는다.
  - 플레이어가 딜러와 `무승부`이면 베팅 금액을 돌려 받는다.


## 🔧 구현할 기능 목록
1. 게임에 참가할 플레이어 입력 받는다.
- [x] 이름은 쉼표를 기준으로 분리한다.
- [x] 이름 앞뒤의 공백은 제거된다.
- [x] `예외`: 이름으로 빈 값이 입력되었을 때 예외를 발생시킨다.
- [x] `예외`: 이름에 중복이 존재하면 예외를 발생시킨다.
- [x] `예외`: 플레이어 인원이 8명을 초과하면 예외를 발생시킨다.

2. 각 플레이어의 베팅 금액을 입력 받는다.
- [x] 베팅 금액은 숫자여야 합니다.
- [x] 베팅 금액은 양수여야 합니다.
- [x] 베팅 금액은 10원 단위여야 합니다.

3. 카드 덱을 준비한다.
- [x] 각 문양마다 13개의 카드를 생성해 총 52장의 카드 덱을 구성한다.
- [x] `예외`: 중복된 카드가 존재하면 예외를 발생시킨다.

4. 카드를 배분한다.
- [x] 카드덱은 한번에 한장의 카드를 반환한다.
  - [x] `예외`: 더 이상 뽑을 수 있는 카드가 없을 때 예외를 발생시킨다.
- [x] 플레이어는 두 장의 카드를 받는다.
- [x] 딜러도 두 장의 카드를 받는다.
- [x] 플레이어와 딜러의 패를 출력한다.
  - [x] 딜러의 패는 첫 번째 카드만 공개된다.
    
5. 한명의 플레이어씩 카드 요청 여부를 입력 받는다.
- [x] 플레이어 패의 합이 21 미만이면 카드 요청 여부를 입력 받는다.
- [x] 게임 진행 여부는 y 또는 n으로 입력 받는다.
  - [x] 소/대문자 관계없이 처리된다.
  - [x] `예외`: 그 이외의 값이 입력되었을 떄 예외를 발생시킨다.
- [x] y 입력 시 해당 플레이어에게 한장의 카드를 추가한다.
  - [x] 카드 합계가 21 미만이면 요청 여부를 재입력 받는다. 
  - [x] 카드 합계가 21 이상이면 다음 플레이어의 턴으로 넘어간다.
- [x] n 입력 시 다음 플레이어의 턴으로 넘어간다.

6. 딜러의 턴을 진행한다.
- [x] 딜러의 패 합계가 17 이상이 될 때까지 카드를 추가한다.
  
7. 모든 패카드를 공개한다.
- [x] 딜러의 카드 패와 합계를 출력한다.
- [x] 각 플레이어의 카드 패와 합계를 출력한다.

8. 최종 수익을 출력한다.
- [x] 딜러의 수익을 출력한다.
- [x] 각 플레이어의 수익을 출력한다.


## 실행 결과

```
게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)
pobi,jason

pobi의 배팅 금액은?
10000

jason의 배팅 금액은?
20000

딜러와 pobi, jason에게 2장을 나누었습니다.
딜러: 3다이아몬드
pobi카드: 2하트, 8스페이드
jason카드: 7클로버, K스페이드

pobi는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
y
pobi카드: 2하트, 8스페이드, A클로버
pobi는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
n
jason은 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
n
jason카드: 7클로버, K스페이드

딜러는 16이하라 한장의 카드를 더 받았습니다.

딜러 카드: 3다이아몬드, 9클로버, 8다이아몬드 - 결과: 20
pobi카드: 2하트, 8스페이드, A클로버 - 결과: 21
jason카드: 7클로버, K스페이드 - 결과: 17

## 최종 수익
딜러: 10000
pobi: 10000 
jason: -20000
```
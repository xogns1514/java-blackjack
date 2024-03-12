## 기능목록
- [x] 사람 이름 입력받기
  - [x] 쉼표 기준 분류
  - [x] 최소 2명, 최대 8명
  - [x] 공백 제외
  - [x] 중복 제외
- [ ] 배팅
  - [ ] 게임 시작시 배팅 금액을 정한다.
    - [x] 배팅 금액은 500보다 커야한다.
  - [ ] 버스트시, 배팅 금액을 모두 잃는다.
  - [ ] 처음 두장의 카드가 블랙잭일 경우, 배팅 금액의 1.5배를 딜러에게 받는다.
  - [ ] 딜러와 플레이어 모두 블랙잭일 경우, 배팅 금액을 돌려받는다.
  - [ ] 딜러가 버스트시, 당시 남아있던 플레이어는 패에 상관없이 승리해 배팅 금액을 받는다.
- [x] 블랙잭 게임 진행
  - [x] 처음에 플레이어는 2장씩 카드를 지급받는다.
  - [x] 딜러는 2중 1장만 참여자는 2장 전체 공개한다.
  - [x] 카드 1장 드로우
  - [x] 카드 중복 없이
  - [x] 카드 추가 여부 확인
    - [x] 딜러가 16이하일 시 카드 배부
    - [x] 딜러가 17이상이면 종료
  - [x] 21 초과 시 패배
- [x] 카드 점수 계산
  - [x] ace는 1 또는 11 중 하나로 결정
  - [x] 각 사용자 별로 점수를 계산한다.
- [x] 승패 결정
- [x] 버스트면 자동으로 아웃

최근에 직장동료와 코딩 컨벤션, 패키지별 책임에 대해 논의하면서
내가 생각한 각 패키지별 역할, 네이밍 규칙등

# 패키지별 역할
## constant
- 네이밍 : *Const
- enum 등 변경가능성이 낮으나 의미부여가 필요한 숫자 등
- 여러 상태값이 1, 4, 2 등으로 나열되는 것 보다는 Status.DEFAULT.val, Status.AUTO.val, Status.DEACT.val로 표시하는 것이 더 명확함
## code
- 에러, 처리 관련 코드 및 해당 코드가 어떤 상황을 의미하는지 설명 포함
## config
- 네이밍 : *Config
- Spring Bean 설정 클래스
## controller
- 네이밍 : *Controller
- endpoint
  - 요청 전문 로그 출력(html, multipart 제외)
  - 호출 이력 저장
  - 유효성 검사
  - 비즈니스로직 호출
  - API별 공통 로직
  - 응답
## domain
  ## domain.{aggregate}.entity
    - DB 테이블 등 핵심 데이터와 매핑되는 필드
    - setter 적용 금지
  ### domain.{aggregate}.dto
    - 요청/응답  등 클래스
      - 필드
      - 유효성 검사 로직
      - dto/domain 변환
## service
- 네이밍 : *Service
- 
## utils
- 네이밍 : *Utils
- 공통 데이터 변환, 시간 관련, 문자포맷 유효성 검사 등 static class

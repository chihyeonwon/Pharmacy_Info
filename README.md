```
공개된 소스나 프로젝트라 하더라도 저작권은 소유자에게 있으니 라이선스 표시가 없을 경우 소유자에게 문의하시고 사용하셔야 합니다.
문의 : heungeob1003@gmail.com
```
모든 국민은 보건에 관하여 국가의 보호를 받을 권리가 있으며, 국가는 의료 보험, 무료 진료의 실시 등 국민의 위생은     
물론 국민이 건강한 생활을 하는 데 필요한 환경 등에 대하여 특별한 배려를 하여야 할 의무를 진다.      

## 공급실적이 있는 일반 의약품 주요정보(업체명, 제품명, 품목기준코드, 효능, 사용법, 주의사항, 상호작용, 부작용, 보관법) 등을 목록으로 조회하는 앱 서비스
## 서비스명
부동산에는 직방 약에는 <약방> YakBang

## 서비스 설명

1. 개요: 의약품 허가사항 정보 제공
2. 서비스 대상: 일반인, 관련 전문가 및 유관 기관
3. 의약품 허가사항 내용 확인과 의약품 정보 관리 업무를 더욱 효과적으로 할 수 있도록 관련 정보 정리하여 제공

## 기능 및 서비스화면

1. 통합검색 - 키워드로 검색
2. 상세검색 - 세부 항목으로 검색
3. 식별검색 - 성상 정보로 검색
4. 안전성서한 - 안전성서한 세부내용 제공
5. 최신 허가사항 변경 내용 - 변경된 허가사항 제공

![image](https://github.com/chihyeonwon/Pharmacy_Info/assets/58906858/f69f7de0-61e2-48b1-9346-0716708ceed6)
![image](https://github.com/chihyeonwon/Pharmacy_Info/assets/58906858/77ffe4f5-3160-43b0-80e7-bfb5031fc23a)

## 데이터 상세
![image](https://github.com/chihyeonwon/Pharmacy_Info/assets/58906858/34c4db35-a805-4290-8ce3-1ebfc6ff03c7)
- 의약품 Data의 경우 정말 많은 카테고리를 제공하고 있다. 다양한 기능을 효과적으로 search하기 위해 **Chip**을 추가
- 의약품의 다양한 정보를 사용자에게 편하게 보여주기 위해 **TabLayout**을 활용

```
Chip 이란 많은 검색 정보들이 있을 때 이를 구분지어 주는 역할을 함 예를 들어 약품이름, 회사, 부작용, 상호작용 이렇게
칩을 만들고 회사 칩을 클릭한 후 검색할 경우 회사에 대한 정보 제공 기능이
부작용 칩을 클릭한 후 검색할 경우에는 부작용 정보가 나오도록 한다.
```
  
[건강보험심사평가원_약가기준정보조회서비스](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15054445)    
[식품의약품안전처_의약품개요정보(e약은요)](https://www.data.go.kr/data/15075057/openapi.do#/tab_layer_prcuse_exam)        
[식품의약품안전처_의약품 낱알식별 정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15057639)     
[식품의약품안전처_의약품 제품 허가정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15095677)    
[식품의약품안전처_의약품안전성서한 정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15059182)     

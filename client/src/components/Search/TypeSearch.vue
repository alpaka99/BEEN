<template>
  <div class="TypeSearch">
    
    <h1></h1>
    <div class="block">
    <h4 class="demonstration">여행 유형별 검색하기</h4>
    <el-cascader
      :options="options"
      :props="props"
      clearable></el-cascader>
    </div>

    <!-- 검색 결과 -->
    <div class="searched">
      
    </div>
  </div>
</template>

<script>

export default {
  name: 'TypeSearch',
  data() {
    return {
      props: { multiple : true },
      options: [{ value: 1, label: '여행스타일', 
        children: [
          { value: 2, label: '휴양'},
          { value: 3, label: '액티비티'},
          { value: 4, label: '문화체험'},
          { value: 5, label: '쇼핑'},
          { value: 6, label: '가족여행'},
          { value: 7, label: '우정여행'},
          { value: 8, label: '캠핑, 글램핑'},
        ]},
      { value: 9, label: '지역', children: [
        { value: 10, label: '국내', children: [
          { value: 11, label: '서울/경기'}, 
          { value: 12, label: '강원도'}, 
          { value: 13, label: '충청도'},
          { value: 14, label: '전라도'},
          { value: 15, label: '경상도'},
          { value: 16, label: '제주도'},
          ]},
        { value: 17, label: '해외', children: [
          { value: 18, label: '일본'}, 
          { value: 19, label: '중국'}, 
          { value: 20, label: '동남아시아'},
          { value: 21, label: '중앙아시아'},
          { value: 22, label: '서유럽'},
          { value: 23, label: '동유럽'},
          { value: 24, label: '남유럽'},
          { value: 25, label: '북유럽'},
          { value: 26, label: '호주/뉴질랜드'},
          ]},
      ]},
        ]
    }
  }
}
</script>

<style>
  .TypeSearch {
    width: 375px;
    height: 812px;
    background-color: #fffaf4;
    margin: 0 auto;
  }

  .block {
    justify-content: center;
    margin-top: 20px;
  }
</style>
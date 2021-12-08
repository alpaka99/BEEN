<template>
<div class="back">
  <img src="@/assets/image-logo.png" alt="logobee" width="120">
  <el-progress class="align-vertical" :percentage="percentage" :color="customColors" :format="format"></el-progress>
  <h3 class="head"> 지역과 여행 스타일을 선택해주세요</h3>
    <div class="block">
      <el-cascader size="medium" placeholder="여행 지역"  change-on-select="false"
        :options="options1"
        :props="props1"></el-cascader>
    </div>
  <div class="block">
    <el-cascader size="medium" placeholder="여행 스타일"  change-on-select="false"
                 :options="options2"
                 :props="props2"></el-cascader>
  </div>

    <!--   버튼 wirte2로 넘어가는 버튼-->
    <button class="writebtn" @click="$router.push({name: 'Write2'})">
      <img src="@/assets/text-logo-resize.png"  width="75" height="22" alt="#">
    </button>

  </div>
</template>

<script>
export default {
  name: "FeedWrite1",
  components: {

  },
  data() {
    return {
      percentage: 20,
      customColors: [
        {color: '#5cb87a', percentage: 60},
        {color: '#1989fa', percentage: 80},
        {color: '#6f7ad3', percentage: 100}
      ],
      props1: { multiple : true },
      options1: [
                { value: 2, label: '서울/경기'},
                { value: 3, label: '강원도'},
                { value: 4, label: '충청도'},
                { value: 5, label: '전라도'},
                { value: 6, label: '경상도'},
                { value: 7, label: '제주도'},
                { value: 9, label: '일본'},
                { value: 10, label: '중국'},
                { value: 11, label: '동남아시아'},
                { value: 12, label: '중앙아시아'},
                { value: 13, label: '서유럽'},
                { value: 14, label: '동유럽'},
                { value: 15, label: '남유럽'},
                { value: 16, label: '북유럽'},
                { value: 17, label: '호주/뉴질랜드'},
              ],
      props2: { multiple : true },
      options2: [
        { value: 2, label: '휴양'},
        { value: 3, label: '액티비티'},
        { value: 4, label: '문화체험'},
        { value: 5, label: '쇼핑'},
        { value: 6, label: '가족여행'},
        { value: 7, label: '우정여행'},
        { value: 8, label: '캠핑, 글램핑'},
      ]
    };
  },
  methods: {
    format(percentage) {
      if (this.percentage<50) {
        return percentage !== 100 ? '1단계' : `${percentage}%`;
      }
      return percentage === 100 ? '비잉 완료' : `${percentage}%`;
    }
  },
}
</script>

<style scoped>
.back {
  background-color: #ffe8c4;
  width: 375px;
  height: 812px;
  text-align: center;
}
.writebtn {
  width: 27%;
  height: 40px;
  background-color: #f4dbdb;
  border: none;
  border-radius: 10px;
  float: right;
  margin-right: 20px;
  margin-top: 30px;
}
.writebtn:hover {
  box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.50);
}
.head {
  margin: 20px auto;
}
.block {
  padding: 10px;
  margin-bottom: 30px;
}
</style>

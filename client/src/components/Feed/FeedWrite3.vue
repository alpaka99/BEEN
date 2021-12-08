<template>
  <div class="back">
    <img src="@/assets/image-logo.png" alt="logobee" width="100">
    <el-progress class="align-vertical" :percentage="percentage" :color="customColors" :format="format"></el-progress>

    <p> Form 선택 들어갈 곳 </p>

    <button @click="increase">완료</button>

  </div>
</template>

<script>
export default {
  name: "FeedWrite3",
  components: {
  },
  data() {
    return {
      percentage: 80,
      customColors: [
        {color: '#5cb87a', percentage: 60},
        {color: '#1989fa', percentage: 80},
        {color: '#6f7ad3', percentage: 100}
      ]
    };
  },
  methods: {
    format(percentage) {
      if (this.percentage<100) {
        return percentage !== 100 ? '비잉 중' : `${percentage}%`;
      }
      return percentage === 100 ? '비잉 완료' : `${percentage}%`;
    },
    increase() {
      this.percentage += 40;
      if (this.percentage > 100) {
        this.percentage = 100;
      }
    },
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
</style>

<template>
  <div class="back">
    <img src="@/assets/image-logo.png" alt="logobee" width="120">
    <el-progress class="align-vertical" :percentage="percentage" :color="customColors" :format="format"></el-progress>
    <h4>사진을 업로드해주세요</h4>
    <FeedWriteImage></FeedWriteImage>
    <br>
    <h4 style="margin-top: 50px">어떤 여행을 하셨나요?</h4>
    <textarea class='textinput' placeholder="여행기록을 남겨주세요" v-model="message"></textarea>
    <button class="writebtn" @click="$router.push({name: 'Write3'})">
      <img src="@/assets/text-logo-resize.png"  width="75" height="22">
    </button>

  </div>
</template>
<script>
import FeedWriteImage from './FeedWriteImage.vue'
export default {
  name: "FeedWrite2",
  components: { FeedWriteImage
  },
  data() {
    return {
      percentage: 60,
      customColors: [
        {color: '#5cb87a', percentage: 60},
        {color: '#1989fa', percentage: 80},
        {color: '#6f7ad3', percentage: 100}
      ],
      message: this.placeholder,
    };
  },
  methods: {
    format(percentage) {
      if (this.percentage<70) {
        return percentage !== 100 ? '2단계' : `${percentage}%`;
      }
      return percentage === 100 ? '비잉 완료' : `${percentage}%`;
    },
    clickInputTag: function() {
      this.$refs['image'].click()
    }
  }
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
}
.writebtn:hover {
  box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.50);
}
.textinput {
  display: inline-flex;
  width: 80%;
  height: 80px;
  padding: 10px 10px;
  font-size: 12px;
  background-color: #FFFAF4;
  border: none;
  border-radius: 10px;
  resize: none;
  margin-bottom: 20px;
}
</style>

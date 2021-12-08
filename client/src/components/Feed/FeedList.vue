<template>

  <div class="FeedList">

<!-- 육각형 한개 -->
    <!-- v-for="post in feed" :key="post.postId" @click="toDetail(post.postId)" -->
    <div class="wrap">
      <div class="hex">
        <div class="hex-inner">
          <div class="content1">
          </div>
        </div>
      </div>

      <div class="logos-wrap">
        <div class="restaurant" v-if="restaurant"></div>
        <div class="hotel" v-if="hotel"></div>
        <div class="tour" v-if="tour"></div>
      </div>
    </div>
  <!-- 육각형 한개 끝 -->

    <!-- <div class="wrap2">
      <div class="hex">
      <div class="logos-wrap2">
      <div class="restaurant" v-if="restaurant"></div>
      <div class="hotel" v-if="hotel"></div>
      <div class="tour" v-if="tour"></div>
        <div class="hex-inner">
          <div class="content2">
          </div>
        </div>
      </div>
      </div>
    </div>


  <div class="wrap">
      <div class="hex">
        <div class="hex-inner">
          <div class="content3">
          </div>
        </div>
      </div>

      <div class="logos-wrap">
        <div class="restaurant"></div>
        <div class="hotel"></div>
        <div class="tour"></div>
      </div>
    </div>

      <div class="wrap2">
      <div class="hex">
      <div class="logos-wrap2">
      <div class="restaurant"></div>
      <div class="hotel"></div>
      <div class="tour"></div>
        <div class="hex-inner">
          <div class="content4">
          </div>
        </div>
      </div>
      </div>
    </div> -->

  </div>

</template>

<script>

export default {
  name: 'FeedList',
  data () {
    return {
      Nr: 0,
      img_src: '',
      restaurant: 1,
      hotel: 1,
      tour: 1,
      user: {
        userId: '',
        profilePicSrc: '',
        nickname: ''
      },
      feed: []
    }
  },
  methods: {
    toDetail: function () {
      this.$router.replace({
        name: 'FeedDetail',
        params: {}
      })
    }
  },
}
</script>

<style>


* {
  margin: 0%;
  padding: 0%;
}

.wrap {
  width: 120%;
  margin: 10px 0px 10px 40px;
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  position: relative;
  right: 20px;
}

.wrap2 {
  width: 120%;
  margin: 0px 170px 10px 190px;
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  position: relative;
}

.wrap:nth-child(2) {
  position: absolute;
  top: 20%;
  left: 30%;
}


.hex {
  width: 25%;
  margin-bottom: 1.8%;
  position: relative;
  visibility: hidden;
  border: 2px solid red;
  box-shadow: 5px 5px 5px 5px;
  vertical-align: middle;
}

.hex:hover {
  bottom: 3px;
}

.hex:nth-of-type(7n+5) {
  margin: 12.5%;
}

.hex::after {
  content: '';
  display: block;
  padding-bottom: 80%;
}

.hex-inner {
  position: absolute;
  width: 99%;
  padding-bottom: 114.6%;
  overflow: hidden;
  visibility: hidden;
  transform: rotate3d(0,0,1,-60deg) skewY(30deg);
  /* border: 2px solid red; */
}

.hex-inner * {
  position: absolute;
  visibility: visible; 
}

.content1 {
  /* border: 2px solid red; */
  position:absolute;
  display: flex;
  width: 100%;
  height: 100%;
  overflow: hidden;
  transform: skewY(-30deg) rotate3d(0,0,1,60deg);
  background-image: url(https://picsum.photos/200/300?grayscale);
  justify-content: center;
  align-items: center;
  background-repeat : no-repeat;
  background-size : cover;
}

.content2 {
  /* border: 2px solid red; */
  position:absolute;
  display: flex;
  width: 100%;
  height: 100%;
  overflow: hidden;
  transform: skewY(-30deg) rotate3d(0,0,1,60deg);
  background-image: url(https://picsum.photos/200/301?grayscale);
  justify-content: center;
  align-items: center;
  background-repeat : no-repeat;
  background-size : cover;
}

.content3 {
  /* border: 2px solid red; */
  position:absolute;
  display: flex;
  width: 100%;
  height: 100%;
  overflow: hidden;
  transform: skewY(-30deg) rotate3d(0,0,1,60deg);
  background-image: url(https://picsum.photos/200/302?grayscale);
  justify-content: center;
  align-items: center;
  background-repeat : no-repeat;
  background-size : cover;
}

.content4 {
  /* border: 2px solid red; */
  position:absolute;
  display: flex;
  width: 100%;
  height: 100%;
  overflow: hidden;
  transform: skewY(-30deg) rotate3d(0,0,1,60deg);
  background-image: url(https://picsum.photos/200/303?grayscale);
  justify-content: center;
  align-items: center;
  background-repeat : no-repeat;
  background-size : cover;
}

.content p {
  font-size: 3vw;
  text-align: center;
  color: #fff;
}

.logos-wrap {
  margin-left: 0px;
  display: flex column;
  justify-content: space-evenly;
  align-items: stretch;
  vertical-align: middle;
  padding: 0;
}

.logos-wrap2 {
  margin-left: 50px;
  display: flex column;
  justify-content: space-evenly;
  align-items: stretch;
}

.restaurant {
  margin-left: 20px;
  margin-top: 35px;
  margin-bottom: 5px;
  width: 10px;
  height: 10px;
  border-radius: 5px;
  background-color: green;
}

.hotel {
  margin-left: 20px;
  margin-top: 5px;
  margin-bottom: 5px;
  width: 10px;
  height: 10px;
  border-radius: 5px;
  background-color: yellowgreen;
}

.tour {
  margin-left: 20px;
  margin-top: 5px;
  margin-bottom: 5px;
  width: 10px;
  height: 10px;
  border-radius: 5px;
  background-color: coral;
}




</style>
<template>
  <div class="mainfeed">
    <div class="logo">
      <img alt="BEEN LOGO" src="@/assets/image-logo.png">
    </div>
      <FeedList />

  <el-button @click="drawer = true" type="info" icon="el-icon-search" style="margin-left: 250px;" circle>
  </el-button>
  <el-drawer
    title="BEEN 서비스"
    v-model="drawer"
    :direction="direction"
    :before-close="handleClose">
    <span>BEEN 사용법</span>
  </el-drawer>

  </div>
</template>


<script>
import FeedList from '@/components/Feed/FeedList.vue'

  export default {
    name: 'Feed',
    data () {
      return {
        count: 0,
        drawer: false,
        direction: 'btt',
      }
    },
    methods: {
      load () {
        this.count += 2
      },
    },
    components: {
      FeedList
    }
  }
</script>

<style>
  .mainfeed {
    position: relative;
    width: 375px;
    height: 812px;
    background-color: #fffaf4;
    margin: 0 auto;
  }

  .logo {
    margin: 10px;
    padding: 0;
  }

  img {
    width: 100px;
    padding: 0;
  }

  .el-button {
    position: absolute;
    bottom: 25px;
    right: 50px;
  }

</style>
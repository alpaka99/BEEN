<template>
  <div class="Search">
    <div class="logo">
      <img alt="BEEN LOGO" src="@/assets/image-logo.png">
    </div>
    <h1 class="text">찾기</h1>
    <div class="friend-search">
      <el-input @keydown="keyDowntoPeopleSearch" placeholder="꿀벌 찾기" v-model="input"></el-input>
    </div>

    <div class="type-search">
      <el-input @click="clicktoTypeSearch" placeholder="여행 정보 찾기" suffix-icon="el-icon-arrow-down" v-model="input2"></el-input>
    </div>


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
// import TypeSearch from '@/components/Search/TypeSearch.vue'
import { ref } from 'vue'



export default {
  name: 'Search',
  data() {
    return {
      input: ''
    }
  },
  components: {
  },
  methods: {
    toTypeSearch: function () {
      
    },
    keyDowntoPeopleSearch: function () {
      this.$router.replace('/Peoplesearch')
    },
    clicktoTypeSearch: function () {
      this.$router.replace('/Typesearch')
    }
  },
    setup() {
      return {
        // input: ref(''),
        input2: ref('')
      }
    },
  watch: {

  }
}
</script>

<style>
  .logo {
    display: block;
  }
  .Search {
    width: 375px;
    height: 812px;
    background-color: #fffaf4;
    margin: 0 auto;
  }
  
  .text {
    font-family: 'Nanum Pen Script', cursive;
  }

  .friend-search {
    margin: 50px;
  }

  .type-search {
    margin: 50px;
  }

  .el-button {
    position: absolute;
    bottom: 25px;
    right: 50px;
  }
</style>

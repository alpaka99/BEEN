<template>
  <div class="PeopleSearch">
    <h1>회원찾기</h1>

    <form @submit="searchSubmit" class="peoplesearchinput">
      <input
        @input="onInput" 
        v-model="search"
        placeholder="꿀벌 찾기"
        type="text">
      <button>찾기</button>
    </form>

    <div class="peoplefound" v-if="users.length">
      <p v-if="isShow">
        일치하는 꿀벌 {{ users.length }}벌
      </p>
      <ul>
        <li @click="toUserProfile" v-for="(user, userId) in users"
          :key="userId">
          <img :src="user.profilePicSrc" alt=""><p>{{ user.nickname }}</p>
          </li>
      </ul>
    </div>
  
    <!-- 일치하는 검색 결과가 없을 때 -->
    <div class="peoplenotfound" v-if="users.length==0">
      <img src="" alt="" v-if="users.length == 0">
      <p>그런 꿀벌은 없습니다</p>
    </div>

  </div>
</template>

<script>

export default ({
  name: 'PeopleSearch',
  data () {
    return {
      users : [],
      search: '',
      isSubmit: false,
      isShow: false
    }
  },
  computed: {

  },
  methods: {
    toUserProfile: function(event) {
      const user = this.users[event.target.dataset.pk]
      const userId = user.userId
      this.$router.replace({
        name: "UserProfile",
        params: { userId: userId }
      })
    },
    find: function () {
      
    },
    onInput: function(event) {
      this.search = event.target.dataset.search
      this.isSubmit = false
      if (this.search.length === 0 ) this.isShow = false
      else this.isShow = true
    },
    // searchSubmit : function (event) {

    // }
  }
})
</script>


<style scoped>

</style>

<template>
  <suspense>
    <template #default>
      <div class="background">
        <img src="@/assets/image-logo.png" alt="image-logo">
        <form @submit="onSubmit">
          <div class="login-input-box">
            <div class="login-checkbox">
              <label class="" for="prefer-region"><i class="el-icon-check icon-color-must"></i>당신의 선호 지역</label><br>
            </div>
            <el-cascader
              id="prefer-region"
              :options="options_region"
              :props="props_region"
              clearable></el-cascader>
          </div>
          
          <div class="login-input-box">
            <div class="login-checkbox">
              <label class="" for="trip-style"><i class="el-icon-check icon-color-must"></i>당신의 여행 스타일</label><br>
            </div>
            <el-cascader
              id="trip-style"
              :options="options_style"
              :props="props_style"
              clearable></el-cascader>
          </div>

          <div class="login-input-box">
            <div class="login-checkbox">
              <label class="" for="wish-region"><i class="el-icon-check icon-color-must"></i>당신이 원하는 여행 장소</label><br>
            </div>
            <el-cascader
              id="wish-region"
              :options="options_wish"
              :props="props_wish"
              clearable></el-cascader>
          </div>

          <div class="login-input-box">
            <div class="login-checkbox">
              <label class="" for="profile"><i class="el-icon-check icon-color-must"></i>프로필 소개</label><br>
            </div>
            <el-input 
              id="profile"
              v-model="wish"
              type="textarea"
              class="" 
              placeholder="프로필 소개" 
            ></el-input>
          </div>
          
          <div @click="onSubmit" class="login-button">
            <img style="max-height: 100%;" src="@/assets/text-logo-resize.png" alt="logo">
          </div>

        </form>
      </div>
    </template>

    <template #fallback>
      <div>Loading...</div>
    </template>
  </suspense>
</template>

<script>

export default {
  name: 'SignupUserFavorite',
  data: () => {
    return {
      user:{
        userName: "",
        userId: "",
        userPw: "",
        myTag:[],
      },
      region: "",
      tripstyle: "",
      wish: "",
      component: this,
      props_region: { multiple: true },
      props_style: { multiple: true },
      props_wish: { multiple: true },
      options_region: [
        {
          value: 1,
          label: '아시아',
        },
        {
          value: 2,
          label: '유럽',
        },
        {
          value: 3,
          label: '미국',
        },
        {
          value: 4,
          label: '호주',
        },
      ],      
      options_style: [
        {
          value: 1,
          label: '힐링',
        },
        {
          value: 2,
          label: '액티비티',
        },
        {
          value: 3,
          label: '가족',
        },
        {
          value: 4,
          label: '역사',
        },
      ],
      options_wish: [
        {
          value: 1,
          label: '경기',
        },
        {
          value: 2,
          label: '서울',
        },
        {
          value: 3,
          label: '강원',
        },
      ]
    }
  },
  methods: {
    onSignUp(){
      // join(
      //   this.user,
      //   (res)=>{
      //     // console.log(res.data)
      //     if(res.data===true){
      //       this.$router.push({
      //         name:"SignupSuccess",
      //         params:{
      //           ...this.user,
      //         }
      //       })
      //     }
      //     else{
      //       // console.log(res.data)
      //     }
      //   },
      //   (err)=>{
      //     console.error(err);
      //   }
      // )
    }
  }
}
</script>

<style>
  .icon-color-must {
    color: #31D89C;
  }

</style>
<template>
  <div class="background">
    <div>
      회원가입 성공!
    </div>
    <router-link to="/login" class="link-info">로그인 화면으로</router-link>
  </div>
</template>

<script>

export default {
  name: 'SignupSuccess',
}
</script>

<style>
  .background {
    width: 375px;
    height: 812px;
    text-align: center;
    background-color: #FFFAF4;
    margin:0 auto;
  }

</style>
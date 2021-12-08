<template>
  <div>
    <div>
    <h1>Profile</h1>
      <img src="집꿀벌2.png" alt="우선은 프로필 사진 들어갈 자리">
      <p>UserName</p>
      <p>User Introduction</p>
      <button>subscribe</button>
    </div>
    <a href="">프로필 수정</a>

    <p v-if = "onLine">UserName은 현재 여행중</p>

    <div class="worldmap">
      <img src="https://mblogthumb-phinf.pstatic.net/MjAyMDAyMjZfMTY3/MDAxNTgyNjk3NzQ3ODQz.hsQnNMafoTkhc-4EJ5i1R_Uk3l3hXTFLyD94a2wWLTMg.O1-giS0qb2Ft5kWWRSDORDyReHq0iuCtDox4HAc4T38g.JPEG.naverschool/GettyImages-1158860187.jpg?type=w800" alt="">
    </div>

    <div class="hexagons">
      HTML CSSResult Skip Results Iframe
EDIT ON
<div class="wrapper">
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1562048048-86d659689440?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80')no-repeat center center">
        <p>HEX 1</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1583697360036-63916ef31e71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80')no-repeat center center">
        <p>HEX 2</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1526566762798-8fac9c07aa98?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2493&q=80')no-repeat left bottom">
        <p>HEX 3</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1529245856630-f4853233d2ea?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=3150&q=80')no-repeat center center">
        <p>HEX 4</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1462823985959-022de68638a2?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2989&q=80')no-repeat center center">
        <p>HEX 5</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1525197635744-498f5dba62bd?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2000&q=80')no-repeat center center">
        <p>HEX 6</p>
      </div>
    </div>
  </div>
  <div class="hex">
    <div class="hex-inner1">
      <div class="hex-inner2" style="background: url('https://images.unsplash.com/photo-1534262576098-07b029eba549?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2939&q=80')no-repeat center center">
        <p>HEX 7</p>
      </div>
    </div>
  </div>
</div>
    </div>

  </div>
</template>

<script>
export default {
  data: function(){
    return{
      onLine: "false"
    }
  }
}
</script>

<style>
 /* *{
   margin: 0;
   padding: 0;
 }

 .wrap {
   width: 80%;
   margin: 100px auto;
   display: flex;
   flex-wrap: wrap;
 }

 .hex {
   width: 25%;
   margin-bottom: 1.8%;
   position: relative;
   visibility: hidden;
 }

 .hex::nth-of-tye(7n+5) {
   margin-left: 12.5%;
 }

.hex::after{
  content: '';
  display: block;
  padding-bottom: 80%;
}
.hex-inner {
  position: absolute;
  width:99%;
  padding-bottom: 114.6%;
  overflow: hidden;
  transform:rotate3d(0,0,1,-60deg) skewY(30deg);
}

.hex-inner * {
  position: absolute;
  visibility: visible;
}

.content {
  display: flex;
  width: 100%;
  height: 100%;
  overflow: hidden;
  transform: skewY(-30deg) rotate3d(0,0,1,60deg);
  background: #02b4cd80;
  justify-content: center;
  align-items: center;
}

.content p {
  font-size: 3vw;
  text-align: center;
  color: #fff;
} */

@font-face {
  font-family: 'TmonMonsori';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_two@1.0/TmonMonsori.woff') format('woff');
  font-weight: normal;
  font-style: normal;
}
body {
  margin: 0;
  padding: 0;
  overflow: hidden;
}
.wrapper {
  margin: 10vh auto;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
}
.hex {
  width: 20vw;
  height: calc(20vw*1.7430);
  margin: .2vw;
  position: relative;
  overflow: hidden !important;
  transform: rotate(60deg);
}
.hex-inner1 {
  width: inherit;
  height: inherit;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%) rotate(60deg);
  overflow: hidden;
}
.hex-inner2 {
  display: flex;
  width: inherit;
  height: inherit;
  background-size: cover !important;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%) rotate(-120deg);
  overflow: hidden;
  justify-content: center;
  align-items: center;
}
.hex:nth-of-type(n+5) {
  margin-top: -17.3vw;
}
p {
  color: #fff;
  padding: 10px;
  font: normal 3vw "TmonMonsori";
  text-shadow: 3px 5px 0 rgb(235, 120, 120);
}
</style>
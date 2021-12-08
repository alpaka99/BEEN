<template class="back">
 <div>
   <input style="display: none" type="file" @change="onFileSelected" ref="fileInput">
   <button class="imagebtn el-icon-camera"
           style="margin-left: 10px"
           @click="$refs.fileInput.click()">
사진 고르기
   </button> <br>
   <h4>Image </h4>
   <button class="imagebtn" style="float:right; margin-bottom: 30px;
    margin-right:10px; width:20% " @click="onUpload">OK</button>
 </div>
</template>

<script>
import axios from 'axios'
export default {
  data () {
    return {
      selectedFile: null
    }
  },
  methods: {
    onFileSelected(event) {
      this.selectedFile = event.target.files[0]
    },
    onUpload() {
      const fd = new FormData();

        fd.append('image', this.selectedFile, this.selectedFile.name)

      axios.post('#' , fd, {
        onUploadProgress: uploadEvent => {
          console.log('Upload Progress' + Math.round(uploadEvent.loaded / uploadEvent.total *100))
        }
      })
      .then(res => {
        console.log(res)
      })
    }
  }
}
</script>

<style>
.imagebtn {
  width: 30%;
  height: 30px;
  background-color: #f4dbdb;
  border: none;
  border-radius: 5px;
  float: left;
}
</style>

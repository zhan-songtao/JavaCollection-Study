<template>
  <div>
    <el-row :gutter="10">
      <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
        <el-col :span="6">
          <el-form-item label="部门" prop="mobile">
            <el-input v-model="formData.mobile" placeholder="请输入部门" :maxlength="11" show-word-limit clearable
                      prefix-icon='el-icon-mobile' :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="6">
          <el-form-item label="用户名" prop="field101">
            <el-input v-model="formData.field101" placeholder="请输入用户名" clearable :style="{width: '100%'}">
            </el-input>
          </el-form-item>
        </el-col>
        <el-col :span="6">
          <el-form-item label="邮箱" prop="field101">
            <el-input v-model="formData.field101" placeholder="请输入单行文本邮箱邮箱" clearable
                      :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="6">
          <el-form-item label="性别" prop="field102">
            <el-radio-group v-model="formData.field102" size="medium">
              <el-radio v-for="(item, index) in field102Options" :key="index" :label="item.value"
                        :disabled="item.disabled">{{item.label}}</el-radio>
            </el-radio-group>
          </el-form-item>
        </el-col>
        <el-col :span="6">
          <el-form-item label="昵称" prop="field101">
            <el-input v-model="formData.field101" placeholder="请输入昵称" clearable :style="{width: '100%'}">
            </el-input>
          </el-form-item>
        </el-col>
        <el-col :span="4">
          <el-form-item label-width="-1px" label="" prop="field101">
            <el-button type="primary" icon="el-icon-search" size="medium"> 主要按钮 </el-button>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-form-item size="large">
            <el-button type="primary" @click="submitForm">提交</el-button>
            <el-button @click="resetForm">重置</el-button>
          </el-form-item>
        </el-col>
      </el-form>
    </el-row>
  </div>
</template>
<script>
  export default {
    components: {},
    props: [],
    data() {
      return {
        formData: {
          mobile: '',
          field101: undefined,
          field101: undefined,
          field102: 1,
          field101: undefined,
          field101: undefined,
        },
        rules: {
          mobile: [{
            required: true,
            message: '请输入部门',
            trigger: 'blur'
          }, {
            pattern: /^1(3|4|5|7|8|9)\d{9}$/,
            message: '手机号格式错误',
            trigger: 'blur'
          }],
          field101: [{
            required: true,
            message: '请输入用户名',
            trigger: 'blur'
          }],
          field101: [{
            required: true,
            message: '请输入单行文本邮箱邮箱',
            trigger: 'blur'
          }],
          field102: [{
            required: true,
            message: '性别不能为空',
            trigger: 'change'
          }],
          field101: [{
            required: true,
            message: '请输入昵称',
            trigger: 'blur'
          }],
        },
        field102Options: [{
          "label": "男",
          "value": 1
        }, {
          "label": "女",
          "value": 2
        }],
      }
    },
    computed: {},
    watch: {},
    created() {},
    mounted() {},
    methods: {
      submitForm() {
        this.$refs['elForm'].validate(valid => {
          if (!valid) return
          // TODO 提交表单
        })
      },
      resetForm() {
        this.$refs['elForm'].resetFields()
      },
    }
  }

</script>
<style>
</style>

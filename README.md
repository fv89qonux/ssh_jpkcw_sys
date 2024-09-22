## 本项目实现的最终作用是基于SSH高校在线网络教学系统
## 分为4个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 公告管理
 - 学生管理
 - 师资队伍管理
 - 教学大纲管理
 - 教师管理
 - 测试题目管理
 - 管理员登录
 - 课程介绍管理
 - 课程参考文献管理
### 第2个角色为设计文稿，实现了如下功能：
 - 论文截图
### 第3个角色为教师角色，实现了如下功能：
 - 信息交流管理
 - 教学视频管理
 - 教师角色登录
 - 试题管理
 - 课件管理
### 第4个角色为学生角色，实现了如下功能：
 - 信息交流
 - 参考文献查看
 - 在线测试
 - 学生登录
 - 学生角色首页
 - 师资队伍查看
 - 教学大纲查看
 - 教学视频管理
 - 教学课件查看
 - 考试试题管理
 - 课程介绍查看
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_jpkcw_sys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [class_info](#class_info) |  |
| [dept](#dept) |  |
| [gen_table](#gen_table) | 代码生成业务表 |
| [gen_table_column](#gen_table_column) | 代码生成业务表字段 |
| [grade](#grade) |  |
| [project](#project) |  |
| [project_from](#project_from) |  |
| [student](#student) |  |
| [subject](#subject) |  |
| [sys_config](#sys_config) | 参数配置表 |
| [sys_dept](#sys_dept) | 部门表 |
| [sys_dict_data](#sys_dict_data) | 字典数据表 |
| [sys_dict_type](#sys_dict_type) | 字典类型表 |
| [sys_job](#sys_job) | 定时任务调度表 |
| [sys_job_log](#sys_job_log) | 定时任务调度日志表 |
| [sys_logininfor](#sys_logininfor) | 系统访问记录 |
| [sys_menu](#sys_menu) | 菜单权限表 |
| [sys_notice](#sys_notice) | 通知公告表 |
| [sys_oper_log](#sys_oper_log) | 操作日志记录 |
| [sys_post](#sys_post) | 岗位信息表 |
| [sys_role](#sys_role) | 角色信息表 |
| [sys_role_dept](#sys_role_dept) | 角色和部门关联表 |
| [sys_role_menu](#sys_role_menu) | 角色和菜单关联表 |
| [sys_user](#sys_user) | 用户信息表 |
| [sys_user_post](#sys_user_post) | 用户与岗位关联表 |
| [sys_user_role](#sys_user_role) | 用户和角色关联表 |
| [teacher](#teacher) |  |
| [t_admin](#t_admin) | 管理员表 |
| [t_doc](#t_doc) |  |
| [t_gonggao](#t_gonggao) |  |
| [t_liuyan](#t_liuyan) |  |
| [t_shipin](#t_shipin) |  |
| [t_shiti](#t_shiti) |  |
| [t_stu](#t_stu) |  |
| [t_tea](#t_tea) |  |
| [t_timu](#t_timu) |  |
| [t_xinxi](#t_xinxi) |  |
| [yansou_team](#yansou_team) |  |

**表名：** <a id="class_info">class_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | class_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,id  |
|  2   | class_name |   varchar   | 30 |   0    |    N     |  N   |       | 班级名  |
|  3   | grade_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,年级  |
|  4   | subject_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,专业名  |

**表名：** <a id="dept">dept</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dept_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,部门id  |
|  2   | dept_name |   varchar   | 50 |   0    |    N     |  N   |       | 部门科室名  |

**表名：** <a id="gen_table">gen_table</a>

**说明：** 代码生成业务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | table_id |   bigint   | 20 |   0    |    N     |  Y   |       | 编号  |
|  2   | table_name |   varchar   | 200 |   0    |    Y     |  N   |   ''    | 表名称  |
|  3   | table_comment |   varchar   | 500 |   0    |    Y     |  N   |   ''    | 表描述  |
|  4   | sub_table_name |   varchar   | 64 |   0    |    Y     |  N   |   NULL    | 关联子表的表名  |
|  5   | sub_table_fk_name |   varchar   | 64 |   0    |    Y     |  N   |   NULL    | 子表关联的外键名  |
|  6   | class_name |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 实体类名称  |
|  7   | tpl_category |   varchar   | 200 |   0    |    Y     |  N   |   'crud'    | 使用的模板（crud单表操作tree树表操作）  |
|  8   | tpl_web_type |   varchar   | 30 |   0    |    Y     |  N   |   ''    | 前端模板类型（element-ui模版element-plus模版）  |
|  9   | package_name |   varchar   | 100 |   0    |    Y     |  N   |   NULL    | 生成包路径  |
|  10   | module_name |   varchar   | 30 |   0    |    Y     |  N   |   NULL    | 生成模块名  |
|  11   | business_name |   varchar   | 30 |   0    |    Y     |  N   |   NULL    | 生成业务名  |
|  12   | function_name |   varchar   | 50 |   0    |    Y     |  N   |   NULL    | 生成功能名  |
|  13   | function_author |   varchar   | 50 |   0    |    Y     |  N   |   NULL    | 生成功能作者  |
|  14   | gen_type |   char   | 1 |   0    |    Y     |  N   |   '0'    | 生成代码方式（0zip压缩包1自定义路径）  |
|  15   | gen_path |   varchar   | 200 |   0    |    Y     |  N   |   '/'    | 生成路径（不填默认项目路径）  |
|  16   | options |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    | 其它生成选项  |
|  17   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  18   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  19   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  20   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  21   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="gen_table_column">gen_table_column</a>

**说明：** 代码生成业务表字段

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | column_id |   bigint   | 20 |   0    |    N     |  Y   |       | 编号  |
|  2   | table_id |   bigint   | 20 |   0    |    Y     |  N   |   NULL    | 归属表编号  |
|  3   | column_name |   varchar   | 200 |   0    |    Y     |  N   |   NULL    | 列名称  |
|  4   | column_comment |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 列描述  |
|  5   | column_type |   varchar   | 100 |   0    |    Y     |  N   |   NULL    | 列类型  |
|  6   | java_type |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | JAVA类型  |
|  7   | java_field |   varchar   | 200 |   0    |    Y     |  N   |   NULL    | JAVA字段名  |
|  8   | is_pk |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否主键（1是）  |
|  9   | is_increment |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否自增（1是）  |
|  10   | is_required |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否必填（1是）  |
|  11   | is_insert |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否为插入字段（1是）  |
|  12   | is_edit |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否编辑字段（1是）  |
|  13   | is_list |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否列表字段（1是）  |
|  14   | is_query |   char   | 1 |   0    |    Y     |  N   |   NULL    | 是否查询字段（1是）  |
|  15   | query_type |   varchar   | 200 |   0    |    Y     |  N   |   'EQ'    | 查询方式（等于、不等于、大于、小于、范围）  |
|  16   | html_type |   varchar   | 200 |   0    |    Y     |  N   |   NULL    | 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）  |
|  17   | dict_type |   varchar   | 200 |   0    |    Y     |  N   |   ''    | 字典类型  |
|  18   | sort |   int   | 10 |   0    |    Y     |  N   |   NULL    | 排序  |
|  19   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  20   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  21   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  22   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |

**表名：** <a id="grade">grade</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | grade_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,id  |
|  2   | grade_name |   varchar   | 20 |   0    |    N     |  N   |       | 年级名  |

**表名：** <a id="project">project</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | project_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,课题id  |
|  2   | project_name |   varchar   | 50 |   0    |    N     |  N   |       | 课题名  |
|  3   | project_describe |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 课题表述  |
|  4   | project_from_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,课题来源  |
|  5   | teacher_id |   char   | 32 |   0    |    Y     |  N   |   NULL    | 外键,导师id  |
|  6   | student_id |   char   | 32 |   0    |    Y     |  N   |   NULL    | 外键,学生id  |

**表名：** <a id="project_from">project_from</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | project_from_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,id  |
|  2   | project_from_name |   varchar   | 20 |   0    |    N     |  N   |       | 课题来源(教师建议学生拟定企业和社会征集科研单位提供)  |

**表名：** <a id="student">student</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | student_id |   char   | 32 |   0    |    N     |  Y   |       | 主键,学生id  |
|  2   | project_num |   int   | 10 |   0    |    Y     |  N   |   0    | 课题数,只能选择一个课题  |
|  3   | good_boy |   int   | 10 |   0    |    Y     |  N   |   NULL    | 是否免答辩(0否1是)  |
|  4   | project_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,课题  |
|  5   | teacher_id |   char   | 32 |   0    |    Y     |  N   |   NULL    | 外键,导师id  |
|  6   | user_id |   char   | 32 |   0    |    Y     |  N   |   NULL    | 外键,用户id  |
|  7   | class_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,班级id  |
|  8   | student_score |   int   | 10 |   0    |    Y     |  N   |   NULL    | 成绩  |
|  9   | teacher_evaluate |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 导师评语(成绩评价)  |
|  10   | yansou_team_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,验收小组id  |

**表名：** <a id="subject">subject</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | subject_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,id  |
|  2   | subject_name |   varchar   | 30 |   0    |    N     |  N   |       | 专业名  |

**表名：** <a id="sys_config">sys_config</a>

**说明：** 参数配置表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | config_id |   int   | 10 |   0    |    N     |  Y   |       | 参数主键  |
|  2   | config_name |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 参数名称  |
|  3   | config_key |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 参数键名  |
|  4   | config_value |   varchar   | 500 |   0    |    Y     |  N   |   ''    | 参数键值  |
|  5   | config_type |   char   | 1 |   0    |    Y     |  N   |   'N'    | 系统内置（Y是N否）  |
|  6   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  8   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  9   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  10   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_dept">sys_dept</a>

**说明：** 部门表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dept_id |   bigint   | 20 |   0    |    N     |  Y   |       | 部门id  |
|  2   | parent_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 父部门id  |
|  3   | ancestors |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 祖级列表  |
|  4   | dept_name |   varchar   | 30 |   0    |    Y     |  N   |   ''    | 部门名称  |
|  5   | order_num |   int   | 10 |   0    |    Y     |  N   |   0    | 显示顺序  |
|  6   | leader |   varchar   | 20 |   0    |    Y     |  N   |   NULL    | 负责人  |
|  7   | phone |   varchar   | 11 |   0    |    Y     |  N   |   NULL    | 联系电话  |
|  8   | email |   varchar   | 50 |   0    |    Y     |  N   |   NULL    | 邮箱  |
|  9   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 部门状态（0正常1停用）  |
|  10   | del_flag |   char   | 1 |   0    |    Y     |  N   |   '0'    | 删除标志（0代表存在2代表删除）  |
|  11   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  12   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  13   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  14   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |

**表名：** <a id="sys_dict_data">sys_dict_data</a>

**说明：** 字典数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dict_code |   bigint   | 20 |   0    |    N     |  Y   |       | 字典编码  |
|  2   | dict_sort |   int   | 10 |   0    |    Y     |  N   |   0    | 字典排序  |
|  3   | dict_label |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 字典标签  |
|  4   | dict_value |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 字典键值  |
|  5   | dict_type |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 字典类型  |
|  6   | css_class |   varchar   | 100 |   0    |    Y     |  N   |   NULL    | 样式属性（其他样式扩展）  |
|  7   | list_class |   varchar   | 100 |   0    |    Y     |  N   |   NULL    | 表格回显样式  |
|  8   | is_default |   char   | 1 |   0    |    Y     |  N   |   'N'    | 是否默认（Y是N否）  |
|  9   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 状态（0正常1停用）  |
|  10   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  12   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  13   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  14   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_dict_type">sys_dict_type</a>

**说明：** 字典类型表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dict_id |   bigint   | 20 |   0    |    N     |  Y   |       | 字典主键  |
|  2   | dict_name |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 字典名称  |
|  3   | dict_type |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 字典类型  |
|  4   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 状态（0正常1停用）  |
|  5   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  6   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  7   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  8   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  9   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_job">sys_job</a>

**说明：** 定时任务调度表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | job_id |   bigint   | 20 |   0    |    N     |  Y   |       | 任务ID  |
|  2   | job_name |   varchar   | 64 |   0    |    N     |  Y   |   ''    | 任务名称  |
|  3   | job_group |   varchar   | 64 |   0    |    N     |  Y   |   'DEFAULT'    | 任务组名  |
|  4   | invoke_target |   varchar   | 500 |   0    |    N     |  N   |       | 调用目标字符串  |
|  5   | cron_expression |   varchar   | 255 |   0    |    Y     |  N   |   ''    | cron执行表达式  |
|  6   | misfire_policy |   varchar   | 20 |   0    |    Y     |  N   |   '3'    | 计划执行错误策略（1立即执行2执行一次3放弃执行）  |
|  7   | concurrent |   char   | 1 |   0    |    Y     |  N   |   '1'    | 是否并发执行（0允许1禁止）  |
|  8   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 状态（0正常1暂停）  |
|  9   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  11   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  12   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  13   | remark |   varchar   | 500 |   0    |    Y     |  N   |   ''    | 备注信息  |

**表名：** <a id="sys_job_log">sys_job_log</a>

**说明：** 定时任务调度日志表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | job_log_id |   bigint   | 20 |   0    |    N     |  Y   |       | 任务日志ID  |
|  2   | job_name |   varchar   | 64 |   0    |    N     |  N   |       | 任务名称  |
|  3   | job_group |   varchar   | 64 |   0    |    N     |  N   |       | 任务组名  |
|  4   | invoke_target |   varchar   | 500 |   0    |    N     |  N   |       | 调用目标字符串  |
|  5   | job_message |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 日志信息  |
|  6   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 执行状态（0正常1失败）  |
|  7   | exception_info |   varchar   | 2000 |   0    |    Y     |  N   |   ''    | 异常信息  |
|  8   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |

**表名：** <a id="sys_logininfor">sys_logininfor</a>

**说明：** 系统访问记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | info_id |   bigint   | 20 |   0    |    N     |  Y   |       | 访问ID  |
|  2   | user_name |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 用户账号  |
|  3   | ipaddr |   varchar   | 128 |   0    |    Y     |  N   |   ''    | 登录IP地址  |
|  4   | login_location |   varchar   | 255 |   0    |    Y     |  N   |   ''    | 登录地点  |
|  5   | browser |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 浏览器类型  |
|  6   | os |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 操作系统  |
|  7   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 登录状态（0成功1失败）  |
|  8   | msg |   varchar   | 255 |   0    |    Y     |  N   |   ''    | 提示消息  |
|  9   | login_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 访问时间  |

**表名：** <a id="sys_menu">sys_menu</a>

**说明：** 菜单权限表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | menu_id |   bigint   | 20 |   0    |    N     |  Y   |       | 菜单ID  |
|  2   | menu_name |   varchar   | 50 |   0    |    N     |  N   |       | 菜单名称  |
|  3   | parent_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 父菜单ID  |
|  4   | order_num |   int   | 10 |   0    |    Y     |  N   |   0    | 显示顺序  |
|  5   | path |   varchar   | 200 |   0    |    Y     |  N   |   ''    | 路由地址  |
|  6   | component |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 组件路径  |
|  7   | query |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 路由参数  |
|  8   | is_frame |   int   | 10 |   0    |    Y     |  N   |   1    | 是否为外链（0是1否）  |
|  9   | is_cache |   int   | 10 |   0    |    Y     |  N   |   0    | 是否缓存（0缓存1不缓存）  |
|  10   | menu_type |   char   | 1 |   0    |    Y     |  N   |   ''    | 菜单类型（M目录C菜单F按钮）  |
|  11   | visible |   char   | 1 |   0    |    Y     |  N   |   '0'    | 菜单状态（0显示1隐藏）  |
|  12   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 菜单状态（0正常1停用）  |
|  13   | perms |   varchar   | 100 |   0    |    Y     |  N   |   NULL    | 权限标识  |
|  14   | icon |   varchar   | 100 |   0    |    Y     |  N   |   '#'    | 菜单图标  |
|  15   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  17   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  18   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  19   | remark |   varchar   | 500 |   0    |    Y     |  N   |   ''    | 备注  |

**表名：** <a id="sys_notice">sys_notice</a>

**说明：** 通知公告表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | notice_id |   int   | 10 |   0    |    N     |  Y   |       | 公告ID  |
|  2   | notice_title |   varchar   | 50 |   0    |    N     |  N   |       | 公告标题  |
|  3   | notice_type |   char   | 1 |   0    |    N     |  N   |       | 公告类型（1通知2公告）  |
|  4   | notice_content |   longblob   | 2147483647 |   0    |    Y     |  N   |   NULL    | 公告内容  |
|  5   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 公告状态（0正常1关闭）  |
|  6   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  8   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  9   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  10   | remark |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_oper_log">sys_oper_log</a>

**说明：** 操作日志记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | oper_id |   bigint   | 20 |   0    |    N     |  Y   |       | 日志主键  |
|  2   | title |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 模块标题  |
|  3   | business_type |   int   | 10 |   0    |    Y     |  N   |   0    | 业务类型（0其它1新增2修改3删除）  |
|  4   | method |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 方法名称  |
|  5   | request_method |   varchar   | 10 |   0    |    Y     |  N   |   ''    | 请求方式  |
|  6   | operator_type |   int   | 10 |   0    |    Y     |  N   |   0    | 操作类别（0其它1后台用户2手机端用户）  |
|  7   | oper_name |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 操作人员  |
|  8   | dept_name |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 部门名称  |
|  9   | oper_url |   varchar   | 255 |   0    |    Y     |  N   |   ''    | 请求URL  |
|  10   | oper_ip |   varchar   | 128 |   0    |    Y     |  N   |   ''    | 主机地址  |
|  11   | oper_location |   varchar   | 255 |   0    |    Y     |  N   |   ''    | 操作地点  |
|  12   | oper_param |   varchar   | 2000 |   0    |    Y     |  N   |   ''    | 请求参数  |
|  13   | json_result |   varchar   | 2000 |   0    |    Y     |  N   |   ''    | 返回参数  |
|  14   | status |   int   | 10 |   0    |    Y     |  N   |   0    | 操作状态（0正常1异常）  |
|  15   | error_msg |   varchar   | 2000 |   0    |    Y     |  N   |   ''    | 错误消息  |
|  16   | oper_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 操作时间  |
|  17   | cost_time |   bigint   | 20 |   0    |    Y     |  N   |   0    | 消耗时间  |

**表名：** <a id="sys_post">sys_post</a>

**说明：** 岗位信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | post_id |   bigint   | 20 |   0    |    N     |  Y   |       | 岗位ID  |
|  2   | post_code |   varchar   | 64 |   0    |    N     |  N   |       | 岗位编码  |
|  3   | post_name |   varchar   | 50 |   0    |    N     |  N   |       | 岗位名称  |
|  4   | post_sort |   int   | 10 |   0    |    N     |  N   |       | 显示顺序  |
|  5   | status |   char   | 1 |   0    |    N     |  N   |       | 状态（0正常1停用）  |
|  6   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  8   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  9   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  10   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_role">sys_role</a>

**说明：** 角色信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | role_id |   bigint   | 20 |   0    |    N     |  Y   |       | 角色ID  |
|  2   | role_name |   varchar   | 30 |   0    |    N     |  N   |       | 角色名称  |
|  3   | role_key |   varchar   | 100 |   0    |    N     |  N   |       | 角色权限字符串  |
|  4   | role_sort |   int   | 10 |   0    |    N     |  N   |       | 显示顺序  |
|  5   | data_scope |   char   | 1 |   0    |    Y     |  N   |   '1'    | 数据范围（1：全部数据权限2：自定数据权限3：本部门数据权限4：本部门及以下数据权限）  |
|  6   | menu_check_strictly |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 菜单树选择项是否关联显示  |
|  7   | dept_check_strictly |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 部门树选择项是否关联显示  |
|  8   | status |   char   | 1 |   0    |    N     |  N   |       | 角色状态（0正常1停用）  |
|  9   | del_flag |   char   | 1 |   0    |    Y     |  N   |   '0'    | 删除标志（0代表存在2代表删除）  |
|  10   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  12   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  13   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  14   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_role_dept">sys_role_dept</a>

**说明：** 角色和部门关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | role_id |   bigint   | 20 |   0    |    N     |  Y   |       | 角色ID  |
|  2   | dept_id |   bigint   | 20 |   0    |    N     |  Y   |       | 部门ID  |

**表名：** <a id="sys_role_menu">sys_role_menu</a>

**说明：** 角色和菜单关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | role_id |   bigint   | 20 |   0    |    N     |  Y   |       | 角色ID  |
|  2   | menu_id |   bigint   | 20 |   0    |    N     |  Y   |       | 菜单ID  |

**表名：** <a id="sys_user">sys_user</a>

**说明：** 用户信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | user_id |   bigint   | 20 |   0    |    N     |  Y   |       | 用户ID  |
|  2   | dept_id |   bigint   | 20 |   0    |    Y     |  N   |   NULL    | 部门ID  |
|  3   | user_name |   varchar   | 30 |   0    |    N     |  N   |       | 用户账号  |
|  4   | nick_name |   varchar   | 30 |   0    |    N     |  N   |       | 用户昵称  |
|  5   | user_type |   varchar   | 2 |   0    |    Y     |  N   |   '00'    | 用户类型（00系统用户）  |
|  6   | email |   varchar   | 50 |   0    |    Y     |  N   |   ''    | 用户邮箱  |
|  7   | phonenumber |   varchar   | 11 |   0    |    Y     |  N   |   ''    | 手机号码  |
|  8   | sex |   char   | 1 |   0    |    Y     |  N   |   '0'    | 用户性别（0男1女2未知）  |
|  9   | avatar |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 头像地址  |
|  10   | password |   varchar   | 100 |   0    |    Y     |  N   |   ''    | 密码  |
|  11   | status |   char   | 1 |   0    |    Y     |  N   |   '0'    | 帐号状态（0正常1停用）  |
|  12   | del_flag |   char   | 1 |   0    |    Y     |  N   |   '0'    | 删除标志（0代表存在2代表删除）  |
|  13   | login_ip |   varchar   | 128 |   0    |    Y     |  N   |   ''    | 最后登录IP  |
|  14   | login_date |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 最后登录时间  |
|  15   | create_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 创建者  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  17   | update_by |   varchar   | 64 |   0    |    Y     |  N   |   ''    | 更新者  |
|  18   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 更新时间  |
|  19   | remark |   varchar   | 500 |   0    |    Y     |  N   |   NULL    | 备注  |

**表名：** <a id="sys_user_post">sys_user_post</a>

**说明：** 用户与岗位关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | user_id |   bigint   | 20 |   0    |    N     |  Y   |       | 用户ID  |
|  2   | post_id |   bigint   | 20 |   0    |    N     |  Y   |       | 岗位ID  |

**表名：** <a id="sys_user_role">sys_user_role</a>

**说明：** 用户和角色关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | user_id |   bigint   | 20 |   0    |    N     |  Y   |       | 用户ID  |
|  2   | role_id |   bigint   | 20 |   0    |    N     |  Y   |       | 角色ID  |

**表名：** <a id="teacher">teacher</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | teacher_id |   char   | 32 |   0    |    N     |  Y   |       | 主键,导师id  |
|  2   | teacher_describe |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 导师描述  |
|  3   | teacher_project_num |   char   | 255 |   0    |    Y     |  N   |   NULL    | 导师出题数,限制在8个  |
|  4   | user_id |   char   | 32 |   0    |    Y     |  N   |   NULL    | 外键,用户id  |
|  5   | dept_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 外键,部门id  |
|  6   | zhicheng |   char   | 20 |   0    |    Y     |  N   |   NULL    | 职称  |

**表名：** <a id="t_admin">t_admin</a>

**说明：** 管理员表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | UserId |   int   | 10 |   0    |    N     |  Y   |       | 用户ID  |
|  2   | userName |   varchar   | 66 |   0    |    Y     |  N   |   NULL    | 用户名  |
|  3   | userPw |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 密码  |

**表名：** <a id="t_doc">t_doc</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | mingcheng |   varchar   | 66 |   0    |    Y     |  N   |   NULL    | 名称  |
|  3   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  4   | fujianYuanshiming |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件原名  |
|  5   | shijian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 时间  |
|  6   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_gonggao">t_gonggao</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | gonggao_id |   int   | 10 |   0    |    N     |  Y   |       | 公告ID  |
|  2   | gonggao_title |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 公告标题  |
|  3   | gonggao_content |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 公告内容  |
|  4   | gonggao_data |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | gonggao_del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_liuyan">t_liuyan</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | neirong |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  3   | liuyanshi |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | stu_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 学生ID  |
|  5   | huifu |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | huifushi |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_shipin">t_shipin</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | shipin_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | shipin_name |   varchar   | 66 |   0    |    Y     |  N   |   NULL    |   |
|  3   | shipin_jianjie |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    |   |
|  4   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  5   | fujianYuanshiming |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件原名  |
|  6   | shijian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 时间  |
|  7   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_shiti">t_shiti</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | mingcheng |   varchar   | 66 |   0    |    Y     |  N   |   NULL    | 名称  |
|  3   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  4   | fujianYuanshiming |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件原名  |
|  5   | shijian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 时间  |
|  6   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_stu">t_stu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | stu_id |   int   | 10 |   0    |    N     |  Y   |       | 学生id  |
|  2   | stu_xuehao |   varchar   | 66 |   0    |    Y     |  N   |   NULL    |   |
|  3   | stu_realname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | stu_sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | stu_age |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | login_pw |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | zhuangtai |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_tea">t_tea</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | tea_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | tea_bianhao |   varchar   | 66 |   0    |    Y     |  N   |   NULL    |   |
|  3   | tea_realname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | tea_sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | tea_age |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | login_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | login_pw |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_timu">t_timu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | NAME |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名字  |
|  3   | xuanxianga |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | A选项  |
|  4   | xuanxiangb |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | B选项  |
|  5   | xuanxiangc |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | C选项  |
|  6   | xuanxiangd |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | D选项  |
|  7   | daan |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 答案  |
|  8   | fenshu |   int   | 10 |   0    |    Y     |  N   |   NULL    | 分数  |
|  9   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_xinxi">t_xinxi</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | neirong |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  3   | leixing |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="yansou_team">yansou_team</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | yansou_team_id |   int   | 10 |   0    |    N     |  Y   |       | 主键,id  |
|  2   | yansou_team_name |   varchar   | 20 |   0    |    N     |  N   |       | 验收小组编号  |


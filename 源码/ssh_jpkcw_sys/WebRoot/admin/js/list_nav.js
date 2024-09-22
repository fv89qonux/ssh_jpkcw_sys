var t;

t=outlookbar.addtitle('修改密码')
outlookbar.additem('密码修改',t,'/ssh_jpkcw_sys/admin/userinfo/userPw.jsp')


t=outlookbar.addtitle('课程介绍')
outlookbar.additem('课程介绍',t,'/ssh_jpkcw_sys/kechengjieshaoMana.action')


t=outlookbar.addtitle('教师队伍')
outlookbar.additem('教师队伍',t,'/ssh_jpkcw_sys/jiaoshiduiwuMana.action')


t=outlookbar.addtitle('教学大纲')
outlookbar.additem('教学大纲',t,'/ssh_jpkcw_sys/jiaoxuedagangMana.action')


t=outlookbar.addtitle('参考文献')
outlookbar.additem('参考文献',t,'/ssh_jpkcw_sys/cankaowenxianMana.action')

t=outlookbar.addtitle('老师管理')
outlookbar.additem('老师管理',t,'/ssh_jpkcw_sys/teaMana.action')
outlookbar.additem('老师录入',t,'/ssh_jpkcw_sys/admin/tea/teaAdd.jsp')


t=outlookbar.addtitle('学生管理')
outlookbar.additem('学生管理',t,'/ssh_jpkcw_sys/stuMana.action')
outlookbar.additem('学生添加',t,'/ssh_jpkcw_sys/admin/stu/stuAdd.jsp')


t=outlookbar.addtitle('公告管理')
outlookbar.additem('公告管理',t,'/ssh_jpkcw_sys/gonggaoMana.action')


t=outlookbar.addtitle('测试题目')
outlookbar.additem('题目管理',t,'/ssh_jpkcw_sys/timuMana.action')
outlookbar.additem('题目录入',t,'/ssh_jpkcw_sys/admin/timu/timuAdd.jsp')


t=outlookbar.addtitle('退出系统') 
outlookbar.additem('安全退出',t,'/ssh_jpkcw_sys/login.jsp')
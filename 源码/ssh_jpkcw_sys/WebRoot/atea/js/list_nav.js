var t;



t=outlookbar.addtitle('个人信息')
outlookbar.additem('个人信息',t,'/ssh_jpkcw_sys/atea/userinfo/userinfo.jsp')


t=outlookbar.addtitle('课件发布')
outlookbar.additem('课件发布',t,'/ssh_jpkcw_sys/atea/doc/docAdd.jsp')
outlookbar.additem('课件管理',t,'/ssh_jpkcw_sys/docMana.action')


t=outlookbar.addtitle('教学视频')
outlookbar.additem('视频添加',t,'/ssh_jpkcw_sys/atea/shipin/shipinAdd.jsp')
outlookbar.additem('视频管理',t,'/ssh_jpkcw_sys/shipinMana.action')


t=outlookbar.addtitle('上传试题')
outlookbar.additem('试题添加',t,'/ssh_jpkcw_sys/atea/shiti/shitiAdd.jsp')
outlookbar.additem('试题管理',t,'/ssh_jpkcw_sys/shitiMana.action')



t=outlookbar.addtitle('信息交流')
outlookbar.additem('信息交流',t,'/ssh_jpkcw_sys/liuyanMana.action')


t=outlookbar.addtitle('退出系统') 
outlookbar.additem('安全退出',t,'/ssh_jpkcw_sys/login.jsp')
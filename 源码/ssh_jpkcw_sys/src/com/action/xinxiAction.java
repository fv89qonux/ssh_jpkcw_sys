package com.action;

import java.util.Date; 
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TXinxiDAO;
import com.opensymphony.xwork2.ActionSupport;

public class xinxiAction extends ActionSupport
{
	private String neirong;
	private TXinxiDAO xinxiDAO;
	
	public String kechengjieshaoMana()
	{
		String sql="from TXinxi where leixing='kechengjieshao'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("kechengjieshao", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	public String kechengjieshaoEdit()
	{
		String sql="update TXinxi set neirong=? where leixing='kechengjieshao'";
		Object[] c={neirong};
		xinxiDAO.getHibernateTemplate().bulkUpdate(sql,c);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("msg", "修改成功");
		return "msg";
	}
	
	
	public String kechengjieshaoShow()
	{
		String sql="from TXinxi where leixing='kechengjieshao'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("kechengjieshao", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String jiaoshiduiwuMana()
	{
		String sql="from TXinxi where leixing='jiaoshiduiwu'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("jiaoshiduiwu", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	public String jiaoshiduiwuEdit()
	{
		String sql="update TXinxi set neirong=? where leixing='jiaoshiduiwu'";
		Object[] c={neirong};
		xinxiDAO.getHibernateTemplate().bulkUpdate(sql,c);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("msg", "修改成功");
		return "msg";
	}
	
	
	public String jiaoshiduiwuShow()
	{
		String sql="from TXinxi where leixing='jiaoshiduiwu'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("jiaoshiduiwu", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String jiaoxuedagangMana()
	{
		String sql="from TXinxi where leixing='jiaoxuedagang'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("jiaoxuedagang", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	public String jiaoxuedagangEdit()
	{
		String sql="update TXinxi set neirong=? where leixing='jiaoxuedagang'";
		Object[] c={neirong};
		xinxiDAO.getHibernateTemplate().bulkUpdate(sql,c);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("msg", "修改成功");
		return "msg";
	}
	
	
	public String jiaoxuedagangShow()
	{
		String sql="from TXinxi where leixing='jiaoxuedagang'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("jiaoxuedagang", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String cankaowenxianMana()
	{
		String sql="from TXinxi where leixing='cankaowenxian'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("cankaowenxian", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	public String cankaowenxianEdit()
	{
		String sql="update TXinxi set neirong=? where leixing='cankaowenxian'";
		Object[] c={neirong};
		xinxiDAO.getHibernateTemplate().bulkUpdate(sql,c);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("msg", "修改成功");
		return "msg";
	}
	
	
	public String cankaowenxianShow()
	{
		String sql="from TXinxi where leixing='cankaowenxian'";
		List list=xinxiDAO.getHibernateTemplate().find(sql);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("cankaowenxian", list.get(0));
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	
	
	

	public TXinxiDAO getXinxiDAO()
	{
		return xinxiDAO;
	}


	public String getNeirong()
	{
		return neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public void setXinxiDAO(TXinxiDAO xinxiDAO)
	{
		this.xinxiDAO = xinxiDAO;
	}
	
}

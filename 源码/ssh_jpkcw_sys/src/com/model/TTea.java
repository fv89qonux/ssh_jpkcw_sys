package com.model;
 
/**
 * TTea generated by MyEclipse Persistence Tools
 */

public class TTea implements java.io.Serializable
{

	// Fields

	private Integer teaId;

	private String teaBianhao;

	private String teaRealname;

	private String teaSex;

	private String teaAge;

	private String loginName;

	private String loginPw;

	private String del;

	// Constructors

	/** default constructor */
	public TTea()
	{
	}

	/** full constructor */
	public TTea(String teaBianhao, String teaRealname, String teaSex,
			String teaAge, String loginName, String loginPw, String del)
	{
		this.teaBianhao = teaBianhao;
		this.teaRealname = teaRealname;
		this.teaSex = teaSex;
		this.teaAge = teaAge;
		this.loginName = loginName;
		this.loginPw = loginPw;
		this.del = del;
	}

	// Property accessors

	public Integer getTeaId()
	{
		return this.teaId;
	}

	public void setTeaId(Integer teaId)
	{
		this.teaId = teaId;
	}

	public String getTeaBianhao()
	{
		return this.teaBianhao;
	}

	public void setTeaBianhao(String teaBianhao)
	{
		this.teaBianhao = teaBianhao;
	}

	public String getTeaRealname()
	{
		return this.teaRealname;
	}

	public void setTeaRealname(String teaRealname)
	{
		this.teaRealname = teaRealname;
	}

	public String getTeaSex()
	{
		return this.teaSex;
	}

	public void setTeaSex(String teaSex)
	{
		this.teaSex = teaSex;
	}

	public String getTeaAge()
	{
		return this.teaAge;
	}

	public void setTeaAge(String teaAge)
	{
		this.teaAge = teaAge;
	}

	public String getLoginName()
	{
		return this.loginName;
	}

	public void setLoginName(String loginName)
	{
		this.loginName = loginName;
	}

	public String getLoginPw()
	{
		return this.loginPw;
	}

	public void setLoginPw(String loginPw)
	{
		this.loginPw = loginPw;
	}

	public String getDel()
	{
		return this.del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

}
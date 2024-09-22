package com.dao;

import java.util.List; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TXinxi;

/**
 * Data access object (DAO) for domain model class TXinxi.
 * 
 * @see com.model.TXinxi
 * @author MyEclipse Persistence Tools
 */

public class TXinxiDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TXinxiDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TXinxi transientInstance)
	{
		log.debug("saving TXinxi instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TXinxi persistentInstance)
	{
		log.debug("deleting TXinxi instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TXinxi findById(java.lang.Integer id)
	{
		log.debug("getting TXinxi instance with id: " + id);
		try
		{
			TXinxi instance = (TXinxi) getHibernateTemplate().get(
					"com.model.TXinxi", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TXinxi instance)
	{
		log.debug("finding TXinxi instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TXinxi instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TXinxi as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll()
	{
		log.debug("finding all TXinxi instances");
		try
		{
			String queryString = "from TXinxi";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TXinxi merge(TXinxi detachedInstance)
	{
		log.debug("merging TXinxi instance");
		try
		{
			TXinxi result = (TXinxi) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TXinxi instance)
	{
		log.debug("attaching dirty TXinxi instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TXinxi instance)
	{
		log.debug("attaching clean TXinxi instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TXinxiDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TXinxiDAO) ctx.getBean("TXinxiDAO");
	}
}
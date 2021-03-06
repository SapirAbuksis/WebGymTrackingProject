package com.hibernatedao.gymtracking;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Query;

public class HibernateGymDAO implements IGymDAO {
	
	private static HibernateGymDAO instance = null;
	
	private HibernateGymDAO() {
		
	}
	
	public static synchronized HibernateGymDAO getInstance() {
		if (instance == null) {
		instance = new HibernateGymDAO();
		}
	return instance;
	}

	@Override
	public void addUser(User user) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			}
		catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed adding user", JOptionPane.OK_OPTION);
		} 
		finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
	}

	@Override
	public void deleteUserById(Long id) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("delete User where Id = :id");
			query.setParameter("id", id);
			int result = query.executeUpdate();
			session.getTransaction().commit();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed deleting user", JOptionPane.OK_OPTION);
		} 
		finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
	}
	
	@Override
	public User getUserByUserId(Long id) throws SQLException {
		Session session = null;
		User user = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from User where Id= :id");
			user = (User)session.load(User.class,id);
			} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed get user by user id", JOptionPane.OK_OPTION);
	    } 
		finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return user;
	}

	@Override
	public Collection getAllUsers() throws SQLException {
		Session session = null;
		List users = new ArrayList<User>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from User");
			users =session.createCriteria(User.class).list();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed get all user", JOptionPane.OK_OPTION);
		}
		finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
		return users;
	}

	@Override
	public void addActivity(Activity activity) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(activity);
			session.getTransaction().commit();
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed adding activity", JOptionPane.OK_OPTION);
			} 
		finally {
				if (session != null && session.isOpen()) {
					session.close();
				}
			}		
	}

	@Override
	public void updateActivityByActivityId(int activityId, Activity activity) throws SQLException {
		Session session = null;
		try {
		
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query=session.createQuery("UPDATE  Activity SET name = :name, "
					+ "Sets = :set " 
					+ "Reps = :reps"
			       + " WHERE  ActivityId = :activityId ");
			query.setParameter("name", activity.getName());
			query.setParameter("set", activity.getSet());
		    query.setParameter("reps", activity.getReps());
			query.setParameter("activityId", activityId);
			int result=query.executeUpdate();		
			session.getTransaction().commit();
			} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - update Activity", JOptionPane.OK_OPTION);
		} 
		finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void deleteActivityByActivityId(int activityId) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("delete Activity where activityId = :activityid");
			query.setParameter("activityid", activityId);
			int result = query.executeUpdate();
			session.getTransaction().commit();
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed deleting activity", JOptionPane.OK_OPTION);
		} 
		finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}		
	}
	
	@Override
	public Activity getActivityByActivityId(Long activityId) throws SQLException {
		Session session = null;
		Activity activity = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			activity = (Activity)session.load(Activity.class,activityId);
			} 
		catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed get activity by activity id'", JOptionPane.OK_OPTION);
	    } 
		finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return activity;
	}

	@Override
	public Collection getAllActivitysOfUser(Long userId) throws SQLException {
		Session session = null;
		List activity = new ArrayList<Activity>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from Activity where userId = :userId");
			query.setParameter("userId", userId);
			activity=query.list();
			} 
		catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed get all activitys of user", JOptionPane.OK_OPTION);
	    } 
		finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return activity;
	}
	
	@Override
	public Collection getAllActivitys() throws SQLException {
		Session session = null;
		List activity = new ArrayList<Activity>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			activity =session.createCriteria(Activity.class).list();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error - failed get all activitys", JOptionPane.OK_OPTION);
		}
		finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
		return activity;
	}

	@Override
	public User checkUserAccount(User user) throws SQLException {
	      Session session = null;
	      User userAccount=null;
	      try { 
	         session = HibernateUtil.getSessionFactory().openSession();
			  Query query = session.createQuery
		               ("FROM User" 
		 	    +  " WHERE name = :name "
		   	   +  " AND password = :password");
		        query.setParameter("name",  user.getName());
		        query.setParameter("password",user.getPassword());
			   userAccount=(User)query.uniqueResult(); 
			   } 
	      catch (Exception ex) {
	    	  JOptionPane.showMessageDialog(null, ex.getMessage(), "Error - One of the parameters exists", JOptionPane.OK_OPTION);
	    	  } 
	      finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return userAccount;
	}
}